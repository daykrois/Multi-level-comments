package com.example.demo02comments.controller;

import com.example.demo02comments.entity.Post;
import com.example.demo02comments.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("create")
    public Post createPost(@RequestBody Post post){
        return postService.addPost(post);
    }

}
