package com.myblog.myblog3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;
}
