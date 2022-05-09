package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController
@RequestMapping("json")
public class MyController {
	
	@GetMapping("sayHello")
	public String SayHello()
	{
		return "Hi.. This is My first API Called";
	}

	@PostMapping("postM")
	public Person show(@RequestBody Person body)
	{
		System.out.println(body.toString());
		return body;
	}
	
	
	@PutMapping("updateM")
	public Map<String, String> UpdateM(@RequestBody Map<String, String> body)
	{
		System.out.println(body.toString());
		body.put("city", "Dahod");
		return body;
	}
	
	
	@PutMapping("deleteM")
	public Map<String, String> deleteM(@RequestBody Map<String, String> body)
	{
		System.out.println(body.toString());
		body.remove("city");
		return body;
	}
}
