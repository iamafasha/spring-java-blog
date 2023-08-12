package com.iamafasha.post.model;

import jakarta.persistence.*;

@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String link;

    @ManyToOne
    @JoinTable(
            name = "post_attachments",
            joinColumns = @JoinColumn(name = "attachment_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id")
    )
    private Post post;

    @ManyToOne
    @JoinTable(
            name = "comment_attachments",
            joinColumns = @JoinColumn(name = "attachment_id"),
            inverseJoinColumns = @JoinColumn(name = "comment_id")
    )
    private Comment comment;

}
