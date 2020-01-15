package com.cts.fms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.fms.pojo.Employee;
import com.cts.fms.pojo.EventDetails;
import com.cts.fms.repository.EmployeeRepository;
import com.cts.fms.repository.EventDetailsRepository;

@Repository
public class EventDetailsDAOImpl implements EventDetailsDAO {

	
	@Autowired
	EventDetailsRepository eventDetailsRepository;
	
	
	// Get all EventDetails
	public List<EventDetails> findAll()
	{
		return eventDetailsRepository.findAll();
	}
	
	
	
	
	
	// Get an EventDetails by ID
	
		
		  public EventDetails getOne(Integer eventDetailsID) { return
				  eventDetailsRepository.getOne(eventDetailsID);
		  
		  }

}
