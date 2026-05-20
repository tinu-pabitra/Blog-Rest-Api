package com.pk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
