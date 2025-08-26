package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Feedback;

public interface IFeedbackRepository extends JpaRepository<Feedback, Long> {
}
