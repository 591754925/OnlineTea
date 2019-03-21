package com.newer.online.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newer.online.web.Tea;


public interface TeaRepository extends MongoRepository<Tea, String> {
	
}
