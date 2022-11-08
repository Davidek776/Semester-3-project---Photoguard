﻿using Application.DAOsInterfaces;
using Domain.DTOs;
using Grpc.Net.Client;
using GrpcClient;
using Post = Domain.Models.Post;

namespace Application.GrpcClients;

public class PostGrpcClient : IPostDao
{
    public async Task<Post> CreateAsync(Post post)
    {
	    using var channel = GrpcChannel.ForAddress("http://localhost:6565");
	    var client = new GrpcClient.Post.PostClient(channel);
	    var reply = await client.CreatePostAsync(
		    new RequestCreatePost
		    {
			    Title = post.title,
			    Description = post.description
		    });

	    TimeSpan time = TimeSpan.FromMilliseconds(reply.PostedOnMilliseconds);
	    DateTime postedOn = new DateTime(time.Ticks);

	    Post replyPost = new Post(reply.Id, reply.Likes, reply.Title, reply.Description, postedOn);

	    return await Task.FromResult(replyPost);

    }

    public async Task<IEnumerable<Post>> GetAsync(SearchPostParameters parameters)
    {
	    throw new NotImplementedException();
    }
}
