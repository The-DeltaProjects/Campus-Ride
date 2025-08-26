package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Long> {
}
