package com.cts.fms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.fms.dao.EmployeeDAO;
import com.cts.fms.dao.EventDetailsDAO;
import com.cts.fms.pojo.Employee;
import com.cts.fms.pojo.EventDetails;
import com.cts.fms.service.EventDetailsService;

@Service
public class EventDetailsServiceImpl implements EventDetailsService {
	@Autowired
	EventDetailsDAO eventDetailsDAO;
	

	// Get all EventDetails
	public List<EventDetails> findAll()
	{
		return eventDetailsDAO.findAll();
	}
	

	
	
	// Get an EventDetails by ID
	
		
		  public EventDetails getOne(Integer idEmployee) { return
				  eventDetailsDAO.getOne(idEmployee);
		  
		  }

}
