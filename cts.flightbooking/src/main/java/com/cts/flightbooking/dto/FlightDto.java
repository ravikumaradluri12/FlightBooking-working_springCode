package com.cts.flightbooking.dto;



import java.util.List;

import com.cts.flightbooking.model.Flight;

public class FlightDto {

	private List<Flight> flightList;

	public FlightDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightDto(List<Flight> flightList) {
		super();
		this.flightList = flightList;
	}

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}
	
	
}
