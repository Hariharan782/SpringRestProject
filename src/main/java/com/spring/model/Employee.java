package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeTable")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empNo;

	private String empName;
	private String empPassword;
	private String city;

	public Employee() {
	}

	public Employee(int empNo, String empName, String empPassword, String city) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empPassword = empPassword;
		this.city = city;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empPassword=" + empPassword + ", city=" + city
				+ "]";
	}
}
