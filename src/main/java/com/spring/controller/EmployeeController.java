package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/")
	public String mapHome() {
		return "Welcome to World of Spring Rest !!!";
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Void> createNewEmplyee(@RequestBody Employee emp) {
		empService.saveNewEmployee(emp);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/employee/{empNo}")
	public ResponseEntity<Employee> getEmployeeByNo(@PathVariable int empNo) {
		Employee emp = empService.findEmployeeByNo(empNo);
		
		if(emp == null) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	
	@GetMapping("/employee/all")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return new ResponseEntity<List<Employee>> (empService.getAllEmployees(), HttpStatus.OK);
	}
}
