package com.davidNest.mongoDbProject.repository;

import com.davidNest.mongoDbProject.domain.Post;
import com.davidNest.mongoDbProject.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


    List<Post> findByTitleContainingIgnoreCase(String title);

}
