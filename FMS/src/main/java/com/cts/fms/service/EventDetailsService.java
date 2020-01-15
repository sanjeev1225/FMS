package com.cts.fms.service;

import java.util.List;

import com.cts.fms.pojo.Employee;
import com.cts.fms.pojo.EventDetails;

public interface EventDetailsService {

	
	public List<EventDetails> findAll();
	public EventDetails getOne(Integer eventDetailsID);
	
}
