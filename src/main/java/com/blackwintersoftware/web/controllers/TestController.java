package com.blackwintersoftware.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.blackwintersoftware.web.services.TestService;

@RestController
@EnableWebMvc
public class TestController {
	
	@Autowired
	private TestService testService;

	@RequestMapping(value = "/test")
	public List<String> test(){
		return testService.fetchData();
	}
	
}
