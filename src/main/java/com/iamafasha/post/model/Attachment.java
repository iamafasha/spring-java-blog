package com.iamafasha.post.model;

import jakarta.persistence.*;

@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    public String username;

    @Column(unique = true)
    public String email;

    public String name;

    public String password;


}
