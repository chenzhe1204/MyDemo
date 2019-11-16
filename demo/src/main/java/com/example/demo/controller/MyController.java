package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SpringUserServices;
import com.example.demo.vo.SpringUser;

@RestController
public class MyController {
	
	@Autowired
	private SpringUserServices  springUserServices;

	@RequestMapping("/hello1")
	public String hello1() {
		return "Hello World";
	}

 
	
	@RequestMapping("/hello2")
	public String hello3(@RequestBody SpringUser jsonObject) {
		springUserServices.verify(jsonObject);
		return "Hello World";
	}
	
	@RequestMapping("/insert")
	public String hello4(@RequestBody SpringUser jsonObject) {
		springUserServices.insert(jsonObject);
		return "Hello World";
	}
	

}
