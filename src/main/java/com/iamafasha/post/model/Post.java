package com.iamafasha.post.model;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String content;

    @JoinColumn
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post" )
    private Set<Comment> comments = new HashSet<>();

    @OneToMany(mappedBy = "post")
    private  Set<Attachment> attachments;

    @ManyToMany(mappedBy = "posts")
    private Set<Tag> tags ;

}
