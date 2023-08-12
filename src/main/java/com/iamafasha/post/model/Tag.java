package com.iamafasha.post.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany
    private  Set<Post> posts ;
    @ManyToMany
    private  Set<Comment> comments ;
}
