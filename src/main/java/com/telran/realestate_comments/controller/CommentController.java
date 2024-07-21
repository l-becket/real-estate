package com.telran.realestate_comments.controller;

import com.telran.realestate_comments.dto.CommentDTO;
import com.telran.realestate_comments.entity.Comment;
import com.telran.realestate_comments.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @PostMapping
    public ResponseEntity<String> addComment(@Validated @RequestBody CommentDTO commentDTO) {
        Comment comment = new Comment();
        comment.setFirstName(commentDTO.getFirstName());
        comment.setLastName(commentDTO.getLastName());
        comment.setText(commentDTO.getText());
        comment.setRate(commentDTO.getRate());
        commentService.addComment(comment);
        return new ResponseEntity<>("Comment added successfully", HttpStatus.CREATED);
    }
}
