package com.java.springbootrestful.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springbootrestful.model.Employee;
import com.java.springbootrestful.repository.EmployeeRepository;

@Service
public class EmployeeDao {

	//create object of EmployeeRepository and Autowire this
	
	@Autowired
	EmployeeRepository rep;
	
	public Employee saveEmployee(Employee emp)
	{
		
		return rep.save(emp);
		
	}
	
	public List<Employee> getAll()
	{
		
		return rep.findAll();
	}
	
	//get an employee by id
	
	public Employee getById(Long id)
	{
		
		return rep.findOne(id);
		
	}
	
	//delete employee
		
/*	public void deleteById(Long id)
	{
	    rep.delete(id);
		
	} */
	
	
	//update employee by id
	
/*	public Employee updateById(Long id)
	{
		rep.up
		
	} */
			
	
	
	
}
