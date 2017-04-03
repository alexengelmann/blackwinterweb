package com.blackwintersoftware.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository {
	
	public List<String> fetchUsers(){
		List<String> dummyList = new ArrayList<String>();
		
		dummyList.add("Test");
		dummyList.add("Mr Tester");
		
		return dummyList;
	}

}
