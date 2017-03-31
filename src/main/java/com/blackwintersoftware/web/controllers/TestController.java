package com.blackwintersoftware.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blackwintersoftware.web.services.TestService;

@RestController
@RequestMapping("/")
public class TestController {
	
	@Autowired
	private TestService testService;

	@RequestMapping("/test")
	public String test(){
		return testService.fetchData();
	}
	
}
