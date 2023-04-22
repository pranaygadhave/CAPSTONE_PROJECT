package com.employee.records.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.records.entity.Employee;
import com.employee.records.exception.EmployeeNotFoundException;
import com.employee.records.service.EmployeeServiceImp;

@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImp employeeService;

	@GetMapping("/{employeeID}")
	public Employee getEmployeeByID(@PathVariable int EmployeeID) throws EmployeeNotFoundException {
		return employeeService.employeeGetById(EmployeeID);
	}
}
