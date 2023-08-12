package com.iamafasha.post.model;

import jakarta.persistence.*;

@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
