﻿using System;
using System.Collections.Generic;

namespace Domain.Models;

public class Post
{
    public int Id{ get; set; }
    public User Owner { get; set; }
    public int Likes { get; set; } = 0;
    public string Title { get; set; }
    public string Description { get; set; }
    public string ImgUrl { get; set; }
    public DateTime PostedOn { get; set; }
    public Coordinate Coordinate { get; set; }

    public Post() { }

    public Post(int id, User owner, int likes, string title, string description, string imgUrl, DateTime postedOn, Coordinate? coordinate)
    {
	    Id = id;
	    Owner = owner;
	    Likes = likes;
	    Title = title;
	    ImgUrl = imgUrl;
	    Description = description;
	    PostedOn = postedOn;
	    Coordinate = coordinate;
    }

    public Post(int id, User owner, int likes, string title, string imgUrl ,string description, DateTime postedOn)
    {
	    Id = id;
	    Likes = likes;
	    Title = title;
	    Description = description;
	    PostedOn = postedOn;
	    Owner = owner;
	    ImgUrl = imgUrl;
    }


}
