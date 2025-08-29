package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.domain.Feedback;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Long> {
}
