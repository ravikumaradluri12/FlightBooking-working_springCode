package com.cts.flightbooking.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.flightbooking.model.Ticket;


public interface TicketRepositoryInterface extends JpaRepository<Ticket, Integer>{

}

