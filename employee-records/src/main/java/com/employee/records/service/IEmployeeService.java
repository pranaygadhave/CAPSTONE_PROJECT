package com.employee.records.service;

import org.springframework.stereotype.Service;

import com.employee.records.entity.Employee;
import com.employee.records.exception.EmployeeNotFoundException;

@Service
public interface IEmployeeService {

    public Employee employeeGetById(int employeeId) throws EmployeeNotFoundException;

}

