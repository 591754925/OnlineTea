package com.newer.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.online.web.Access;
import com.newer.online.web.repository.AccessRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/access")
public class AccessController {

	@Autowired
	AccessRepository accpository;
	
	@GetMapping("/list")
	public List<Access> list(){
		
		return accpository.findAll();
	}
	
	@GetMapping("/add")
	public boolean add() {
		Access a = new Access("西米露");
		accpository.insert(a);
		return true;
	}
	
	
	
	
}
