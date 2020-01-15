package com.cts.fms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.fms.pojo.Employee;
import com.cts.fms.repository.EmployeeRepository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	EmployeeRepository employeeRepository;
	
	// Save an Employee
	public Employee save(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	// Get all Employess
	public List<Employee> findAll()
	{
		return employeeRepository.findAll();
	}
	
	// Get an Employee by ID
	
	/*
	 * public Employee findOne(Integer idEmployee) { return
	 * employeeRepository.findOne(idEmployee);
	 * 
	 * }
	 */
	
	//Delete a Employee
	
	public void delete(Employee emp)
	{
		employeeRepository.delete(emp);
	}
	
	// Get an Employee by ID
	
		
		  public Employee getOne(Integer idEmployee) { return
		  employeeRepository.getOne(idEmployee);
		  
		  }

}
