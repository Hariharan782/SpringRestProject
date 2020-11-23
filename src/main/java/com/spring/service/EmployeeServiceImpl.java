package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeDao;
import com.spring.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public Employee findEmployeeByNo(int no) {
		return employeeDao.findEmployeeByNo(no);
	}

	public void saveNewEmployee(Employee emp) {
		employeeDao.saveNewEmployee(emp);
	}

	public boolean deleteEmployee(int no) {
		return employeeDao.deleteEmployee(no);
	}
}
