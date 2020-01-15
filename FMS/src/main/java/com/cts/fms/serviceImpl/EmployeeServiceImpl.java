package com.cts.fms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.fms.dao.EmployeeDAO;
import com.cts.fms.pojo.Employee;
import com.cts.fms.repository.EmployeeRepository;
import com.cts.fms.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	// Save an Employee
	public Employee save(Employee emp)
	{
		return employeeDAO.save(emp);
	}
	
	// Get all Employess
	public List<Employee> findAll()
	{
		return employeeDAO.findAll();
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
		employeeDAO.delete(emp);
	}
	
	// Get an Employee by ID
	
		
		  public Employee getOne(Integer idEmployee) { return
				  employeeDAO.getOne(idEmployee);
		  
		  }

}
