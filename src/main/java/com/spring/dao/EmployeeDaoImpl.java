package com.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory () {
		return sessionFactory;
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public List<Employee> getAllEmployees() {
		Query query = getCurrentSession().createQuery("from Employee");
		return query.list();
	}

	public Employee findEmployeeByNo(int no) {
		return getCurrentSession().get(Employee.class, no);
	}
	
	public void saveNewEmployee(Employee emp) {
		getCurrentSession().save(emp);
	}

	public boolean deleteEmployee(int no) {
		Query query = getCurrentSession().createSQLQuery("delete from Employee where employeeNo = :empNo");
		query.setInteger("empNo", no);
		query.executeUpdate();
		return true;
	}
}
