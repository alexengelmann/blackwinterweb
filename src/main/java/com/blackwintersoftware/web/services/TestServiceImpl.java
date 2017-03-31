package com.blackwintersoftware.web.services;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
	
	public String fetchData(){
		return "hello misterz";
	}

}
