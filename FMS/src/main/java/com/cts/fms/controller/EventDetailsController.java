package com.cts.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.fms.pojo.Employee;
import com.cts.fms.pojo.EventDetails;
import com.cts.fms.service.EventDetailsService;

@RestController
@RequestMapping("/cts/fms")
public class EventDetailsController {
	
	@Autowired
	EventDetailsService eventDetailsService;

	
	/* To Get All employees */
	@GetMapping("/getAllEventDetails")
	public List<EventDetails> getAllEmployee() {
		return eventDetailsService.findAll();
	}

	
	 /* get employee by empid */
	  
	  @GetMapping("/getAllEventDetails/{id}") public ResponseEntity<EventDetails>
	  getEmployeeId(@PathVariable(value = "id") Integer empid) { 
		  EventDetails emp=eventDetailsService.getOne(empid);
	  if (emp == null) { return
	  ResponseEntity.notFound().build();
	  
	  } return ResponseEntity.ok().body(emp); }
	 
}
