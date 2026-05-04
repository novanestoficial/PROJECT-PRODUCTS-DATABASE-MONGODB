package com.davidNest.mongoDbProject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.davidNest.mongoDbProject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
