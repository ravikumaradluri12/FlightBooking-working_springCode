package com.cts.flightbooking.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.flightbooking.model.UserBooking;


public interface UserBookingRepositoryInterface extends JpaRepository<UserBooking, Integer>{

}
