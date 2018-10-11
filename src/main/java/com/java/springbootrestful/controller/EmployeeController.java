package com.java.springbootrestful.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springbootrestful.dao.EmployeeDao;
import com.java.springbootrestful.model.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController {

	
	//create DAO Object
	
	@Autowired
	EmployeeDao dao;
	
	//To save ean employee in database
	
	@PostMapping("/employee")
	public Employee saveEmployee(@Valid @RequestBody Employee emp)
	{
		return dao.saveEmployee(emp);
	}
	
	@GetMapping("/employees")
	
	public List<Employee> getAll()
	{
		return dao.getAll();
		
	}
	
	/*@DeleteMapping("/delete/{id}")
	
	public ResponseEntity<Employee> deleteById(@PathVariable(value="id") Long id)
	{
		Employee emp=dao.findOne(id);
		if(emp==null)
		{
			return ResponseEntity.notFound().build();
			
		}
		  dao.deleteById(id);
		  return ResponseEntity.ok().body(emp);
		
	} */
	
	@GetMapping("/getById/{id}")
	
	public ResponseEntity<Employee> getById(@PathVariable(value="id") Long id)
	{
		
	   Employee emp= dao.getById(id);
	   
	   if(emp==null)
	   {
		   
		   return ResponseEntity.notFound().build();
	   }
	return ResponseEntity.ok().body(emp);
	   
	   
	}
	
/*	@PutMapping("/update/{id}")
	
	public ResponseEntity<Employee> updateById(@PathVariable(value="id") Long id))
	{
		Employee emp=dao.get
		
	}
	*/
	
	
}
