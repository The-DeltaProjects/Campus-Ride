package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.domain.Notifications;

@Repository
public interface INotificationsRepository extends JpaRepository<Notifications, Long> {
}
