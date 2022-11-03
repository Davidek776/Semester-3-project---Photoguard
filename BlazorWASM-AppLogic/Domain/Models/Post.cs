﻿namespace Domain.Models;

public class Post
{
    public int Id{ get; set; }
    public int likes { get; set; }
    public string title { get; set; }
    public string description { get; set; }
    public DateTime postedOn { get; set; }
    public Location location { get; set; }
    public ICollection<Tag> tags { get; set; }

    public Post()
    {
        likes = 0;
    }

    public Post(int likes, string title, string description, DateTime postedOn,Location location, Tag tag, int Id)
    {
        this.likes = likes;
        this.title = title;
        this.description = description;
        this.postedOn = postedOn;
        this.location = location;
        this.tags = tags;
        this.Id = Id;
    }
    
    
}