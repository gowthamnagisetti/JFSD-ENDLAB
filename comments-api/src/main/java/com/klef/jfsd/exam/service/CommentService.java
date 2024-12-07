package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {

    private final String COMMENTS_API_URL = "https://jsonplaceholder.typicode.com/comments";

    public List<Comment> fetchAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        // Send GET request to fetch comments from the API
        Comment[] commentsArray = restTemplate.getForObject(COMMENTS_API_URL, Comment[].class);
        return Arrays.asList(commentsArray);
    }
}
