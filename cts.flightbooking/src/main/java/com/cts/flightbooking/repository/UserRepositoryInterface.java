package com.cts.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.flightbooking.model.User;


public interface UserRepositoryInterface extends JpaRepository<User, Integer>{

}
