package com.cts.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.fms.pojo.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
