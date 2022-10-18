package com.sony.task2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sony.task2.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
