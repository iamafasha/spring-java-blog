package com.iamafasha.post.model;


import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    public String username;

    @Column(unique = true)
    public String email;

    public String name;

    public String password;

    @OneToMany(mappedBy = "user")
    public List<Post> posts;

}
