package com.telran.realestate_comments.service;

import com.telran.realestate_comments.entity.Comment;
import com.telran.realestate_comments.repository.CommentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String id) {
        commentRepository.deleteById(id);
    }

    public Optional<Comment> getCommentById(String id) {
        return commentRepository.findById(id);
    }

//    @PostConstruct
//    public void init() {
//
//        commentRepository.deleteAll();
//
//
//        Comment comment1 = new Comment();
//        comment1.setFirstName("Ashley");
//        comment1.setLastName("Cooper");
//        comment1.setRate(5);
//        comment1.setText("They make it super easy and safe to find a room for rent, prioritizing both convenience and safety. The customer support team is exceptionally responsive and genuinely helpful, ensuring a smooth experience. I wholeheartedly endorse this platform.");
//
//        Comment comment2 = new Comment();
//        comment2.setFirstName("John");
//        comment2.setLastName("Doe");
//        comment2.setRate(4);
//        comment2.setText("Great service with a wide range of options. However, the booking process could be more intuitive.");
//
//        Comment comment3 = new Comment();
//        comment3.setFirstName("Jane");
//        comment3.setLastName("Smith");
//        comment3.setRate(5);
//        comment3.setText("An excellent platform with user-friendly features. The customer service is top-notch and the options are diverse.");
//
//        Comment comment4 = new Comment();
//        comment4.setFirstName("Michael");
//        comment4.setLastName("Johnson");
//        comment4.setRate(3);
//        comment4.setText("The platform is okay, but there were some issues with the verification process. It could be improved.");
//
//
//        commentRepository.saveAll(Arrays.asList(comment1, comment2, comment3, comment4));
//    }
}
