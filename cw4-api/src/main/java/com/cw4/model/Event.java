package com.cw4.model;

import lombok.Data;

@Data
public class Event {
	
	public String name;
	public String type;
	
	public Event(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	

}
