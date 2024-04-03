package com.example.demo02comments.controller;

import com.example.demo02comments.entity.Comments;
import com.example.demo02comments.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @PostMapping("create")
    public Comments create(@RequestBody Comments comments){
        return commentsService.saveComment(comments);
    }

}
