package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.domain.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long> {
    Admin findByEmail(String email);
}
