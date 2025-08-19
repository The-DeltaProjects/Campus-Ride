package za.ca.cput.domain;

public enum ShuttleOperatorStatus {
    ACTIVE,         // Currently working
    ON_LEAVE,       // Vacation/sick leave
    SUSPENDED,      // Disciplinary action
    TERMINATED;

    private final String displayName;

    ShuttleOperatorStatus() {
        this.displayName = name().replace('_', ' ').toLowerCase();
    }

    public String getDisplayName() {
        return displayName;
    }
}
