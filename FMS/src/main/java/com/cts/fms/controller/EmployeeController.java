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
import com.cts.fms.service.EmployeeService;

@RestController
@RequestMapping("/cts/fms")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/* To Save an Employee */

	@PostMapping("/saveemployee")
	public Employee saveEmployee(@Valid @RequestBody Employee emp) {
		return employeeService.save(emp);
	}

	/* To Get All employees */
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployee() {
		return employeeService.findAll();
	}

	
	 /* get employee by empid */
	  
	  @GetMapping("/getemployees/{id}") public ResponseEntity<Employee>
	  getEmployeeId(@PathVariable(value = "id") Integer empid) { 
	  Employee emp=employeeService.getOne(empid);
	  if (emp == null) { return
	  ResponseEntity.notFound().build();
	  
	  } return ResponseEntity.ok().body(emp); }
	 

	/* Update an employee by empid */

	
	  @GetMapping("/employessput/{id}") 
	  public ResponseEntity<Employee>
	  updateEmployeeId(@PathVariable(value = "id") Integer empid,
	  
	  @Valid @RequestBody Employee empDetails) {
	  
	  Employee emp=employeeService.getOne(empid); if (emp == null) { return
	  ResponseEntity.notFound().build();
	  
	  } emp.setFirstName(empDetails.getFirstName());
	  emp.setLastName(empDetails.getLastName());
	  emp.setEmail(empDetails.getEmail());
	  emp.setBaseLocation(empDetails.getBaseLocation());
	  emp.setPhone(empDetails.getPhone());
	  emp.setType(empDetails.getType());
	  Employee updateEmployee =
	  employeeService.save(emp); return ResponseEntity.ok().body(updateEmployee);
	  
	  }
	 

	// Delete an employee 
	
	  
	  @DeleteMapping("/employees/{id}") public ResponseEntity<Employee>
	  deleteEmployee(@PathVariable(value="id") Integer empid) {
	  
	  Employee emp=employeeService.getOne(empid);
	  
	  if(emp==null) {
		  return
	  ResponseEntity.notFound().build();
	  
	  }
	  
	  employeeService.delete(emp); 
	  return ResponseEntity.ok().build();
	  
	  }
	 
	 
}
