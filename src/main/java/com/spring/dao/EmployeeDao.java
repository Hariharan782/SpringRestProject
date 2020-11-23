package com.spring.dao;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();
	public Employee findEmployeeByNo(int no);
	public void saveNewEmployee(Employee p);
	public boolean deleteEmployee(int no);

}
