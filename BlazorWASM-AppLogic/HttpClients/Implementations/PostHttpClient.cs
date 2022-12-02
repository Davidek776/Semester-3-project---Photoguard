﻿using System;
using System.Collections.Generic;
using System.Net.Http;
using System;
using System.Net;
using System.Net.Http;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class PostHttpClient : IPostService
{
    private HttpClient client;

    public PostHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<int> CreateAsync(PostCreationDto postCreationDto)
    {
        string subFormAsJson = JsonSerializer.Serialize(postCreationDto);
        StringContent content = new(subFormAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync("https://localhost:7196/posts/create", content);
        string responseContent = await response.Content.ReadAsStringAsync();
		
        if (!response.IsSuccessStatusCode)
        {
	        throw new Exception(responseContent);
        }

        return Int32.Parse(responseContent);
    }

    public async Task<ICollection<Post>> GetAsync(int? id, int? userId, string? titleContains)
    {
	    string query = ConstructQuery(id, userId, titleContains);
	    HttpResponseMessage response = await client.GetAsync("https://localhost:7196/Posts/get" + query);

	    string content = await response.Content.ReadAsStringAsync();
	    if (!response.IsSuccessStatusCode)
	    {
		    throw new Exception(content);
	    }

	    ICollection<Post> posts = JsonSerializer.Deserialize<ICollection<Post>>(content, new JsonSerializerOptions
	    {
		    PropertyNameCaseInsensitive = true
	    })!;

	    return posts;
    }

    private static string ConstructQuery(int? id, int? userId, string? titleContains)
    {
	    string query = "";

	    if (id != null)
	    {
		    query += string.IsNullOrEmpty(query) ? "?" : "&";
		    query += $"id={id}";
	    }

	    if (userId != null)
	    {
		    query += string.IsNullOrEmpty(query) ? "?" : "&";
		    query += $"userid={userId}";
	    }

	    if (!string.IsNullOrEmpty(titleContains))
	    {
		    query += string.IsNullOrEmpty(query) ? "?" : "&";
		    query += $"titlecontains={titleContains}";
	    }

	    return query;
    }

    public async Task DeleteAsync(int id)
    {
	    HttpResponseMessage response = await client.DeleteAsync("https://localhost:7196/posts/{id}");
	    string content = await response.Content.ReadAsStringAsync();
	    if (!response.IsSuccessStatusCode)
	    {
		    throw new Exception(content);
	    }
    }

    /*
    public async Task<bool> IsPostLiked(int id)
    {
	    string query = "";
	    query = string.IsNullOrEmpty(query) ? "?" : "&";
	    query += $"id={id}";
	    HttpResponseMessage response = await client.IsPostLikedAsync($"https://localhost:7196/posts/{query}");
	    string content = await response.Content.ReadAsStringAsync();
	    if (!response.IsSuccessStatusCode)
	    {
		    throw new Exception(content);
	    }

	    bool isLiked = response.IsSuccessStatusCode;
	    return isLiked;
    }

    public async Task LikePostAsync(int id)
    {
	    string query = "";
	    query = string.IsNullOrEmpty(query) ? "?" : "&";
	    query += $"id={id}";
	    HttpResponseMessage response = await client.LikePostAsync($"https://localhost:7196/posts/like{query}");
	    string content = await response.Content.ReadAsStringAsync();
	    if (!response.IsSuccessStatusCode)
	    {
		    throw new Exception(content);
	    }
    }*/
}
