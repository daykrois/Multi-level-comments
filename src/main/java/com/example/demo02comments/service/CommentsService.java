package com.example.demo02comments.service;

import com.example.demo02comments.entity.Comments;
import com.example.demo02comments.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentsService {

    @Autowired
    private CommentsRepository commentsRepository;


    public Comments saveComment(Comments comments){
        return commentsRepository.save(comments);
    }
}
