package com.capstone.project.entity;



import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
    private long employeeID;

    @Column(name = "EmployeeName")
    private String employeeName;

    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;

	public long getEmployeeID() {
		return employeeID;
	}
	
}