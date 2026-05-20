package com.pk.services;

import com.pk.payloads.CommentDto;

public interface CommentService {
CommentDto createComment(CommentDto commentDto,Integer postId);

void deleteCommenet(Integer commentId);
}
