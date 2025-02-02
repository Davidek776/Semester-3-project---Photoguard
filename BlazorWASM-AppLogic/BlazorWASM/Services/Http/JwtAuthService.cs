﻿using System.Security.Claims;
using System.Text;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace BlazorWasm.Services.Http;

public class JwtAuthService : IAuthService
{
    private readonly HttpClient client = new ();
    private readonly IUserService UserService;

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; } = null!;

    // this private variable for simple caching
    public static string? Jwt { get; private set; } = "";

    public JwtAuthService(IUserService userService)
    {
	    UserService = userService;
    }

    public async Task LoginAsync(string username, string password)
    {
        LoginDto userLoginDto = new()
        {
            username = username,
            password = password
        };

        string userAsJson = JsonSerializer.Serialize(userLoginDto);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");

        HttpResponseMessage response = await client.PostAsync("https://localhost:7196/auth/login", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }

        string token = responseContent;
        Jwt = token;

        ClaimsPrincipal principal = CreateClaimsPrincipal();

        OnAuthStateChanged.Invoke(principal);
    }

    public async Task LoginAdminAsync(string username, string password)
    {
	    LoginDto userLoginDto = new()
	    {
		    username = username,
		    password = password
	    };

	    string userAsJson = JsonSerializer.Serialize(userLoginDto);
	    StringContent content = new(userAsJson, Encoding.UTF8, "application/json");

	    HttpResponseMessage response = await client.PostAsync("https://localhost:7196/auth/admin-login", content);
	    string responseContent = await response.Content.ReadAsStringAsync();

	    if (!response.IsSuccessStatusCode)
	    {
		    throw new Exception(responseContent);
	    }

	    string token = responseContent;
	    Jwt = token;

	    ClaimsPrincipal principal = CreateClaimsPrincipal();

	    OnAuthStateChanged.Invoke(principal);
    }

    public Task LogoutAsync()
    {
        Jwt = null;
        ClaimsPrincipal principal = new();
        OnAuthStateChanged.Invoke(principal);
        return Task.CompletedTask;
    }

    public async Task RegisterAsync(UserCreationDto dto)
    {
        string userAsJson = JsonSerializer.Serialize(dto);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync("https://localhost:7196/auth/register", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public async Task<long> GetLoggedUserId()
    {
	    ClaimsPrincipal context = await GetAuthAsync();

	    if (context.Identity?.Name == null)
	    {
		    return 0;
	    }

	    var users = await UserService.GetUsersAsync(context.Identity.Name);

	    if (! users.Any())
	    {
		    return 0;
	    }

	    long userId = users.FirstOrDefault().Id;

	    return userId;
    }

    public Task<ClaimsPrincipal> GetAuthAsync()
    {
        ClaimsPrincipal principal = CreateClaimsPrincipal();
        return Task.FromResult(principal);
    }

    private static IEnumerable<Claim> ParseClaimsFromJwt(string jwt)
    {
        string payload = jwt.Split('.')[1];
        byte[] jsonBytes = ParseBase64WithoutPadding(payload);
        Dictionary<string, object>? keyValuePairs = JsonSerializer.Deserialize<Dictionary<string, object>>(jsonBytes);
        return keyValuePairs!.Select(kvp => new Claim(kvp.Key, kvp.Value.ToString()!));
    }

    private static byte[] ParseBase64WithoutPadding(string base64)
    {
        switch (base64.Length % 4)
        {
            case 2:
                base64 += "==";
                break;
            case 3:
                base64 += "=";
                break;
        }

        return Convert.FromBase64String(base64);
    }
    private static ClaimsPrincipal CreateClaimsPrincipal()
    {
        if (string.IsNullOrEmpty(Jwt))
        {
            return new ClaimsPrincipal();
        }

        IEnumerable<Claim> claims = ParseClaimsFromJwt(Jwt);

        ClaimsIdentity identity = new(claims, "jwt");

        ClaimsPrincipal principal = new(identity);
        return principal;
    }
}
