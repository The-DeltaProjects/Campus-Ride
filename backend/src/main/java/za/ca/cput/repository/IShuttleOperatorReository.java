package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.ShuttleOperator;

public interface IShuttleOperatorReository extends JpaRepository<ShuttleOperator, String> {
}
