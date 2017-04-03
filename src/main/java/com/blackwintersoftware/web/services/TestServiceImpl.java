package com.blackwintersoftware.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blackwintersoftware.web.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestRepository testRepository;
	
	public List<String> fetchData(){
		return testRepository.fetchUsers();
	}

}
