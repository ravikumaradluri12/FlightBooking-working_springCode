package com.cts.flightbooking.service;



import java.util.List;

import com.cts.flightbooking.model.Ticket;



public interface TicketServiceInterface {
	
	Ticket addTicket(Ticket ticket);
	
	List<Ticket> getAllTickets();
	
	Ticket getTicketById(Integer id);
}
