package com.keya.joblisting.controller;

import com.keya.joblisting.Repository.PostRepository;
import com.keya.joblisting.Repository.SearchRepository;
import com.keya.joblisting.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostController
{

    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository srepo;
    @GetMapping("/allposts")
    public List<Post> getAllPost()
    {

        return repo.findAll();
    }

    @PostMapping("/addpost")
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }

    @GetMapping("/search/{text}")
    public List<Post> getPost(@PathVariable String text){
        return srepo.findByText(text);
    }
}
