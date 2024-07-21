package com.telran.realestate_comments.entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "comments")

public class Comment {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int rate;
    private String text;
}