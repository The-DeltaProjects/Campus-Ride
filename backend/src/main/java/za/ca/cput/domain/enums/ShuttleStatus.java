package za.ca.cput.domain.enums;

public enum ShuttleStatus {
    AVAILABLE("Available"),
    FULLY_BOOKED("Fully Booked"),
    CANCELLED("Cancelled"),
    MAINTENANCE("Under Maintenance");

    private final String displayName;

    ShuttleStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
