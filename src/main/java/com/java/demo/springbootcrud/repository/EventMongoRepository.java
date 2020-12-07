package com.java.demo.springbootcrud.repository;

import com.java.demo.springbootcrud.model.EventMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventMongoRepository extends MongoRepository<EventMongo, String> {

}

