package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.domain.Ticket;

@Repository
public interface ITicketRepository extends JpaRepository<Ticket, Long> {
}
