package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Notifications;

public interface INotificationsRepository extends JpaRepository<Notifications, Long> {
}
