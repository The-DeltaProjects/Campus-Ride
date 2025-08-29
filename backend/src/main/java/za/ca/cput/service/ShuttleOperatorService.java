package za.ca.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.repository.IShuttleOperatorRepository;
import za.ca.cput.util.dto.SignupDTO;

import java.util.List;

@Service
public class ShuttleOperatorService implements IShuttleOperatorService {

    @Autowired
    private IShuttleOperatorRepository shuttleOperatorRepository;



    @Override
    public ShuttleOperator create(ShuttleOperator shuttleOperator) {
        return shuttleOperatorRepository.save(shuttleOperator);
    }

    @Override
    public ShuttleOperator read(Long aLong) {
        return shuttleOperatorRepository.findById(aLong).orElse(null);
    }

    @Override
    public ShuttleOperator update(ShuttleOperator shuttleOperator) {
        return shuttleOperatorRepository.save(shuttleOperator);
    }

    public boolean delete(Long id) {
        if (shuttleOperatorRepository.existsById(id)) {
            shuttleOperatorRepository.deleteById(id);
            return true;
        }
        return false;
    }


    @Override
    public List<ShuttleOperator> getAll() {
        return shuttleOperatorRepository.findAll();
    }

    public ResponseEntity<String> signup(SignupDTO dto) {

        String licenseNumber = "CA" + System.currentTimeMillis();

        if (!"driver".equalsIgnoreCase(dto.getRole())) {
            return ResponseEntity.badRequest().body("Invalid role for shuttle operator");
        }

        if (dto.getEmail() == null || !dto.getEmail().trim().toLowerCase().endsWith("@operator.com")) {
            return ResponseEntity.badRequest().body("Invalid shuttle operator email");
        }

        ShuttleOperator operator = new ShuttleOperator.Builder()
                .setFirstName(dto.getFirstName())
                .setLastName(dto.getLastName())
                .setEmail(dto.getEmail())
                .setPassword(dto.getPassword())
                .setLicenseNumber(licenseNumber)
                .setAssignedShuttle(null) // initially no shuttle assigned
                .build();

        shuttleOperatorRepository.save(operator);
        return ResponseEntity.ok("Shuttle operator registered successfully");
    }


    public boolean validateCredentials(String email, String password) {
        ShuttleOperator operator = shuttleOperatorRepository.findByEmail(email);
        return operator != null && operator.getPassword().equals(password);
    }

}
