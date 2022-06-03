package com.nikita160.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, announce, fullText;
    private int views;

    public Post() {
    }

    public Post(String title, String fullText) {
        this.title = title;
        this.fullText = fullText;
    }
}
