package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Booking;

public interface IBookingRepository extends JpaRepository<Booking, Long> {
}
