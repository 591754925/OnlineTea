package com.newer.online.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newer.online.web.Order;


public interface OrderRepository extends MongoRepository<Order, String> {
	
}
