package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.QRCode;

public interface IQRCodeRepository extends JpaRepository<QRCode, Long> {
}
