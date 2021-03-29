package com.sprint.codeblog.service;

import com.sprint.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
