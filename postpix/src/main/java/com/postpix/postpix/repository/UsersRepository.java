package com.postpix.postpix.repository;

import com.postpix.postpix.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, String > {

}
