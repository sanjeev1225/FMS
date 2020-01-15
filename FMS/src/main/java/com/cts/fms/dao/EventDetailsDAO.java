package com.cts.fms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.fms.pojo.Employee;
import com.cts.fms.pojo.EventDetails;

@Repository
public interface EventDetailsDAO {
	

		// Get all EventDetails
		public List<EventDetails> findAll();
		
		
			
	
		
		// Get an EventDetails by ID
		
			
			  public EventDetails getOne(Integer eventDetailID) ;

}
