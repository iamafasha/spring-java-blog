package com.iamafasha.post.repository;

import com.iamafasha.post.model.Attachment;
import com.iamafasha.post.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
    
}
