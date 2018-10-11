package com.java.springbootrestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springbootrestful.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
