package com.pk.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.pk.entities.Category;
import com.pk.entities.Comment;
import com.pk.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
//create
	private Integer postid;
	private String title;
	private String content;
	//private String imageName="default.png";
	private String imageName;
	
	private Date addedDate;
	
	private CategoryDto category;
	
	private UserDto user;
	private Set<Comment> comments=new HashSet<>();
	
}
