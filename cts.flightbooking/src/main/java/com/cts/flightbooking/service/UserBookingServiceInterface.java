package com.cts.flightbooking.service;


import java.util.List;

import com.cts.flightbooking.model.UserBooking;


public interface UserBookingServiceInterface {

	List<UserBooking> getAllUserBookingtDetails();
	
	UserBooking getUserBookingById(Integer id);
	
	UserBooking addUserBooking(UserBooking userBooking);
}

