package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Schedule;

public interface IScheduleRepository extends JpaRepository<Schedule, Long> {
}
