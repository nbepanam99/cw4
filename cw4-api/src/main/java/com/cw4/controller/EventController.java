package com.cw4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cw4.model.Event;
import com.cw4.model.Place;
import com.cw4.repository.EventRepository;

@RestController
@RequestMapping("/api/v1")
public class EventController {
	
	List<Event> events;
	
    @Autowired
    private EventRepository eventRepository;

	@GetMapping("/events")
	public List<Event> getEvents() {
		
		events=new ArrayList<>();
		
		events.add(new Event("first", "cool"));
		events.add(new Event("second", "awsome"));
		events.add(new Event("third", "nice"));
		
		events =eventRepository.findAll();
		
		return events;
	}
	
	@PutMapping("/{eventId}")
	public String putEvents(@PathVariable String eventId) {

		System.out.println("hello on trace eventsId : " +eventId);
		
		return eventId;
	}
	
	
	@GetMapping("/places")
	public List<Place> getPlaces() {
		List<Place> places;
		places=new ArrayList<>();
		places.add(new Place("Espace B", "Paris", "France"));
		return places;
	}
	
}