package com.iamafasha.post.repository;

import com.iamafasha.post.model.Post;
import com.iamafasha.post.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Integer> {
    
}
