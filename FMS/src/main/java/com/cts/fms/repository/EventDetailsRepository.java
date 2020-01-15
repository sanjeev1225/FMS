package com.cts.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.fms.pojo.Employee;
import com.cts.fms.pojo.EventDetails;

public interface EventDetailsRepository extends JpaRepository<EventDetails, Integer>{
	

}
