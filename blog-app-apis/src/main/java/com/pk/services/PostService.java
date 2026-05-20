package com.pk.services;

import java.util.List;

import com.pk.entities.Post;
import com.pk.payloads.PostDto;
import com.pk.payloads.PostResponse;

public interface PostService {
//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
//Update
	PostDto updatePost(PostDto postDto,Integer postId);
	
//Delete
	void deletePost(Integer postId);
	
	//get all post
	
 PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
 
 //get Single Post
 
 PostDto getPostById(Integer postId);
 
 //get all post by category
 List<PostDto> getPostsByCategory(Integer categoryId);
 
 //get all post by user
 List<PostDto> getPostsByUser(Integer userId);
 
 //search posts
 
 List<PostDto> searchPosts(String keyword);
 
}
