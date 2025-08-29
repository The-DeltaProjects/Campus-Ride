package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.domain.ShuttleOperator;

@Repository
public interface IShuttleOperatorRepository extends JpaRepository<ShuttleOperator, Long> {
    ShuttleOperator findByEmail(String email);
}
