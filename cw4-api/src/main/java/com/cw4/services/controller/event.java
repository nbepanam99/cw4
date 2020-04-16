package com.cw4.services.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cw4.model.Event;

import java.util.ArrayList;
import java.util.List;

@RestController
public class event {
	
	List<Event> events;

	@GetMapping("/events")
	public List<Event> getEvents() {
		
		events=new ArrayList<>();
		
		events.add(new Event("first", "cool"));
		events.add(new Event("second", "awsome"));
		events.add(new Event("third", "nice"));
		
		return events;
		
		
	}
	
}
