package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Shuttle;

public interface IShutteRepository extends JpaRepository <Shuttle, Long>{
}
