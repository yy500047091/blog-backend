package com.codewithyogesh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithyogesh.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
