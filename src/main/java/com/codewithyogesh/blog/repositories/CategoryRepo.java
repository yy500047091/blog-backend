package com.codewithyogesh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithyogesh.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
