package com.iamafasha.post.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    @JoinColumn
    @ManyToOne
    private  User user;

    @JoinColumn
    @ManyToOne
    private Post post;

    @OneToMany(mappedBy = "comment")
    private Set<Attachment> attachments;

    @ManyToMany(mappedBy = "comments")
    private Set<Tag> tags ;
}
