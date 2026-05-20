package com.pk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pk.payloads.ApiResponse;
import com.pk.payloads.CommentDto;
import com.pk.services.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	
 @PostMapping("/post/{postId}/comments")
 public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment,@PathVariable Integer postid)
 {
	CommentDto createComment= this.commentService.createComment(comment, postid);
	return new ResponseEntity<CommentDto>(createComment, HttpStatus.OK);
 }
 
 @DeleteMapping("/comments/{commentId}")
 public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId)
 {
	 this.commentService.deleteCommenet(commentId);
	return new ResponseEntity<ApiResponse>(new ApiResponse("Comment Deleted Successfully",true), HttpStatus.OK);
 }
}
