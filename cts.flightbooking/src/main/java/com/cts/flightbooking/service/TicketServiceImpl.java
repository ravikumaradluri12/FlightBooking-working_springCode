package com.cts.flightbooking.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.flightbooking.model.Ticket;
import com.cts.flightbooking.repository.TicketRepositoryInterface;


@Component
public class TicketServiceImpl implements TicketServiceInterface{
	
	@Autowired
	private TicketRepositoryInterface ticketService;
	
	@Override
	public Ticket addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return this.ticketService.save(ticket);
	}

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return this.ticketService.findAll();
	}

	@Override
	public Ticket getTicketById(Integer id) {
		// TODO Auto-generated method stub
		return this.ticketService.getById(id);
	}

}
