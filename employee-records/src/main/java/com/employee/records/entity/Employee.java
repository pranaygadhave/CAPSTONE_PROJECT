package com.employee.records.entity;
import java.time.LocalDate;

import org.hibernate.annotations.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@EntityScan
@Entity
@Table(appliesTo = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeID")
	private int EmployeeID;

	@Column(name = "EmployeeName")
	private String EmployeeName;

	@Column(name = "DateOfBirth")
	private LocalDate DateOfBirth;

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}
}
