package com.newer.online.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.online.web.Tea;
import com.newer.online.web.repository.TeaRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/tea")
public class TeaController {

	@Autowired
	TeaRepository tearepository;
	
	@GetMapping("/list")
	public List<Tea> list(){
		
		return tearepository.findAll();
	}
	
	@PostMapping("/add")
	public boolean add(@RequestBody Tea t) {
		
		tearepository.insert(t);
		return true;
	}
	
	
	
	
}
