package com.cts.fms.service;

import java.util.List;

import com.cts.fms.pojo.Employee;

public interface EmployeeService {

	public Employee save(Employee emp);
	public List<Employee> findAll();
	public void delete(Employee emp);
	public Employee getOne(Integer idEmployee);

}
