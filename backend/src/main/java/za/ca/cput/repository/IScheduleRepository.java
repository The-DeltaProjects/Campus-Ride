package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.domain.Schedule;

@Repository
public interface IScheduleRepository extends JpaRepository<Schedule, Long> {
}
