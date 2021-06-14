package com.cts.flightbooking.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.cts.flightbooking.model.Admin;


@Component
public interface AdminRepositoryInterface extends JpaRepository<Admin, String>{

}

