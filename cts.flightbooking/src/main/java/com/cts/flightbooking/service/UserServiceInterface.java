package com.cts.flightbooking.service;



import java.util.List;

import com.cts.flightbooking.model.User;



public interface UserServiceInterface {

	List<User> getAllUserDetails();
	
	User getUserById(Integer id);
	
	User addUser(User user);
	
	
}
