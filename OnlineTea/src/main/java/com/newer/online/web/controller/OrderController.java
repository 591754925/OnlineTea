package com.newer.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.online.web.Order;
import com.newer.online.web.repository.OrderRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class OrderController {

	@Autowired
	OrderRepository orderrepository;
	
	@GetMapping("/list")
	public List<Order> list(){
		
		return orderrepository.findAll();
	}
	
	@PostMapping("/add")
	public boolean add(@RequestBody Order o) {
		
		orderrepository.insert(o);
		return true;
	}
	
	@PostMapping("/save")
	public boolean update(Order o) {
		if(orderrepository.findById(o.getId()) == null) {
			return false;
		}
		orderrepository.save(o);
		return true;
	}
	
	
}
