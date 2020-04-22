package com.cw4.model;

import lombok.Data;

@Data
public class Place {

	public String name;
	public String city;
	public String country;
	
	
	public Place(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}
	
}
