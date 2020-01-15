package com.cts.fms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cts.fms.pojo.Employee;
import com.cts.fms.repository.EmployeeRepository;

@Repository
public interface EmployeeDAO {
	
	
	// Save an Employee
	public Employee save(Employee emp);
	
	
	// Get all Employess
	public List<Employee> findAll();
	;
	
	// Get an Employee by ID
	
	/*
	 * public Employee findOne(Integer idEmployee) { return
	 * employeeRepository.findOne(idEmployee);
	 * 
	 * }
	 */
	
	//Delete a Employee
	
	public void delete(Employee emp);
	
	// Get an Employee by ID
	
		
		  public Employee getOne(Integer idEmployee) ;
		 
}
