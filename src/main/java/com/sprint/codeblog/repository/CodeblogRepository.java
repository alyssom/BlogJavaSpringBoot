package com.sprint.codeblog.repository;

import com.sprint.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
