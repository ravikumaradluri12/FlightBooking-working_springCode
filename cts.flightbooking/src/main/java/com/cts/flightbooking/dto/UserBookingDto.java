package com.cts.flightbooking.dto;



import java.util.List;

import com.cts.flightbooking.model.UserBooking;

public class UserBookingDto {

	private List<UserBooking> userBooking;

	public UserBookingDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBookingDto(List<UserBooking> userBooking) {
		super();
		this.userBooking = userBooking;
	}

	public List<UserBooking> getUserBooking() {
		return userBooking;
	}

	public void setUserBooking(List<UserBooking> userBooking) {
		this.userBooking = userBooking;
	}
	
	
}
