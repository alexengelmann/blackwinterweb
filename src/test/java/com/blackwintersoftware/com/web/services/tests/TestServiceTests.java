package com.blackwintersoftware.com.web.services.tests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;
import com.blackwintersoftware.web.repository.TestRepository;
import com.blackwintersoftware.web.services.TestService;
import com.blackwintersoftware.web.services.TestServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceTests{
	
	@Mock
	TestRepository mockTestRepository;
	
	@InjectMocks
	TestService testService = new TestServiceImpl();
	
	@Test
	public void TestFetchUsers(){
		List<String> mockData = new ArrayList<String>();
		mockData.add("Howdy Test");
		mockData.add("Second One");
	    when(mockTestRepository.fetchUsers()).thenReturn(mockData);
	    
	    List<String> returnData = testService.fetchData();
	    
	    assertEquals(mockData, returnData);
	}

}
