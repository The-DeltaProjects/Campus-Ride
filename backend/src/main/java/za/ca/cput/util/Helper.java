package za.ca.cput.util;

import java.time.LocalDateTime;

public class Helper {
    public static String generateId() {
        return java.util.UUID.randomUUID().toString();
    }

    public static String validateString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        return str;
    }

    public static int validateCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        return capacity;
    }

    // Shuttle capacity validation
    public static boolean isValidCapacity(int capacity) {
        return capacity > 0 && capacity <= 100; // Reasonable shuttle capacity
    }

    // Email validation
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    // Student number validation (CPUT format)
    public static boolean isValidStudentNumber(String studentNumber) {
        return studentNumber != null && studentNumber.matches("^CPUT-\\d{4}-\\d{5}$");
    }
    // License number validation
    public static boolean isValidLicenseNumber(String licenseNumber) {
        return licenseNumber != null && licenseNumber.matches("^[A-Z]{2}-[A-Z]{2}-\\d{4}$");
    }

    // Booking time validation (cannot be in past)
    public static boolean isValidBookingTime(LocalDateTime bookingTime) {
        return bookingTime != null && bookingTime.isAfter(LocalDateTime.now());
    }

    // Rating validation (1-5 stars)
    public static boolean isValidRating(int rating) {
        return rating >= 1 && rating <= 5;
    }


}
