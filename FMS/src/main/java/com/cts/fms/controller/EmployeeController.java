package com.cts.fms.controller;

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

import com.cts.fms.dao.EmployeeDAO;
import com.cts.fms.pojo.Employee;

@RestController
@RequestMapping("/cts/fms")
public class EmployeeController {

	@Autowired
	EmployeeDAO employeeDAO;

	/* To Save an Employee */

	@PostMapping("/saveemployee")
	public Employee saveEmployee(@Valid @RequestBody Employee emp) {
		return employeeDAO.save(emp);
	}

	/* To Get All employees */
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployee() {
		return employeeDAO.findAll();
	}

	
	 /* get employee by empid */
	  
	  @GetMapping("/employees/{id}") public ResponseEntity<Employee>
	  getEmployeeId(@PathVariable(value = "id") Integer empid) { 
	  Employee emp=employeeDAO.getOne(empid);
	  if (emp == null) { return
	  ResponseEntity.notFound().build();
	  
	  } return ResponseEntity.ok().body(emp); }
	 

	/* Update an employee by empid */

	
	  @GetMapping("/employessput/{id}") 
	  public ResponseEntity<Employee>
	  updateEmployeeId(@PathVariable(value = "id") Integer empid,
	  
	  @Valid @RequestBody Employee empDetails) {
	  
	  Employee emp=employeeDAO.getOne(empid); if (emp == null) { return
	  ResponseEntity.notFound().build();
	  
	  } emp.setFirstName(empDetails.getFirstName());
	  emp.setLastName(empDetails.getLastName());
	  emp.setEmail(empDetails.getEmail());
	  emp.setBaseLocation(empDetails.getBaseLocation());
	  emp.setPhone(empDetails.getPhone()); Employee updateEmployee =
	  employeeDAO.save(emp); return ResponseEntity.ok().body(updateEmployee);
	  
	  }
	 

	// Delete an employee 
	
	  
	  @DeleteMapping("/employees/{id}") public ResponseEntity<Employee>
	  deleteEmployee(@PathVariable(value="id") Integer empid) {
	  
	  Employee emp=employeeDAO.getOne(empid);
	  
	  if(emp==null) {
		  return
	  ResponseEntity.notFound().build();
	  
	  }
	  
	   employeeDAO.delete(emp); 
	  return ResponseEntity.ok().build();
	  
	  }
	 
	 
}
