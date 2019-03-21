package com.newer.online.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newer.online.web.Access;


public interface AccessRepository extends MongoRepository<Access, String> {
	
}
