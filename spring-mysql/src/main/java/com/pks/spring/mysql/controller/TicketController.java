package com.pks.spring.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pks.spring.mysql.dao.TicketDao;
import com.pks.spring.mysql.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	TicketDao dao;
//http://localhost:9090/ticket/bookTickets
	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		
		// check this method incase any issue
		dao.saveAll(tickets);
		System.out.println("\"Ticket Booked Successfully\";");
		return "ticket booked Successfully";
	}
	
	//http://localhost:9090/ticket/getTickets
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets(){
		
		System.out.println("All tickets retrieved successfully...");
		return (List<Ticket>) dao.findAll();
	}
}
