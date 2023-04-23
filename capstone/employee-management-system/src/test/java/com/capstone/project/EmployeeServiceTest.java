package com.capstone.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeNotFound;
import com.capstone.project.service.IEmployeeService;

@SpringBootTest
public class EmployeeServiceTest {
	
	@Autowired
	private IEmployeeService service;
	
	
	@Test
    void testEmployee() throws EmployeeNotFound{
		Employee employee =service.getEmployeeById(1004);
		assertNotNull(employee);
		assertEquals(1004 , employee.getEmployeeID());

		}


	}


