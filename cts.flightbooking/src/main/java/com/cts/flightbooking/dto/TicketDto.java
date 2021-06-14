package com.cts.flightbooking.dto;



import java.util.List;

import com.cts.flightbooking.model.Ticket;

public class TicketDto {

	private List<Ticket> ticketList;

	public TicketDto(List<Ticket> ticketList) {
		super();
		this.ticketList = ticketList;
	}

	public TicketDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}
	
	
}

