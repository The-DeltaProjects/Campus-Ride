package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.domain.Booking;

@Repository
public interface IBookingRepository extends JpaRepository <Booking, Long>{
}
