package com.spring.service;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee findEmployeeByNo(int no);
	public void saveNewEmployee(Employee p);
	public boolean deleteEmployee(int no);

}
