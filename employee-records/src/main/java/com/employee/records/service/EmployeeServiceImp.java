package com.employee.records.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.records.entity.Employee;
import com.employee.records.exception.EmployeeNotFoundException;
import com.employee.records.repository.EmployeeRepository;

public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee employeeGetById(int employeeId) throws EmployeeNotFoundException {
		return employeeRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeeNotFoundException("Invalid employee"));
	}

}
