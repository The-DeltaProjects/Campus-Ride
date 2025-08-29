package za.ca.cput.service;

import za.ca.cput.domain.Ticket;

import java.util.List;

public interface ITicketService extends IService<Ticket, Long>{
    List<Ticket> getAllTickets();
}

