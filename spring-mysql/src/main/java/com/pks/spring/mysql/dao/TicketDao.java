package com.pks.spring.mysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.pks.spring.mysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
