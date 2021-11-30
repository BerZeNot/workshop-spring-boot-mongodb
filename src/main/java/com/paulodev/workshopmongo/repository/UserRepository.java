package com.paulodev.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paulodev.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
