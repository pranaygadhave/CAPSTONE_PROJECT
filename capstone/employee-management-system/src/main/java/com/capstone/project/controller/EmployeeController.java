package com.capstone.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeNotFound;
import com.capstone.project.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	
	@Autowired
	IEmployeeService service;
	
	@GetMapping("/getById/{employeeId}")
	public Employee getById(@PathVariable long employeeId) throws EmployeeNotFound {
		
		logger.info("Record of employeeId("+employeeId+")is called");
		
		return service.getEmployeeById(employeeId);
	}	

}
