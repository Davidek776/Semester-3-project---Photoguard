﻿using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class PostsController : ControllerBase
{
    private readonly IPostLogic postLogic;

    public PostsController(IPostLogic postLogic)
    {
        this.postLogic = postLogic;
    }

    [HttpPost, Route("create")]
    public async Task<ActionResult<Post>> CreateAsync(PostCreationDto postCreationDto)
    {
	    try
        {
            int id = await postLogic.CreateAsync(postCreationDto);
            return Ok(id);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }


    [HttpGet, Route("get")]
    public async Task<ActionResult<Post>> GetAsync
    (
	    [FromQuery] int? id,
	    [FromQuery] int? userId,
	    [FromQuery] string? titleContains
	) {
	    try
	    {
		    SearchPostParameters parameters = new SearchPostParameters(id, userId, titleContains);
            IEnumerable<Post> posts = await postLogic.GetAsync(parameters);
            return Ok(posts);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }


   
    [HttpDelete("{id:int}")]
    public async Task<ActionResult> DeleteAsync([FromRoute] int id,[FromQuery] int user_id)
    {
        try
        {
            await postLogic.DeleteAsync(id, user_id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

}
