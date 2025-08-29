package za.ca.cput.domain;

import jakarta.persistence.*;
import za.ca.cput.domain.enums.ShuttleStatus;

@Entity
@Table(name = "shuttle")
public class Shuttle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shuttleId;
    private int capacity;

    @ManyToOne
    @JoinColumn(name = "operator_id", nullable = false)
    private ShuttleOperator shuttleOperator;

    @Column(unique = true, nullable = false)
    private String licensePlate;

    @Enumerated(EnumType.STRING)
    private ShuttleStatus shuttleStatus;

    protected Shuttle() {}

    private Shuttle(Builder builder) {
        this.shuttleId = builder.shuttleId;
        this.capacity = builder.capacity;
        this.shuttleOperator = builder.shuttleOperator;
        this.licensePlate = builder.licensePlate;
        this.shuttleStatus = builder.shuttleStatus;
    }

    // Getters
    public Long getShuttleId() { return shuttleId; }
    public int getCapacity() { return capacity; }
    public ShuttleOperator getShuttleOperator() { return shuttleOperator; }
    public String getLicensePlate() { return licensePlate; }
    public ShuttleStatus getShuttleStatus() { return shuttleStatus; }


    @Override
    public String toString() {
        return "Shuttle{" +
                "shuttleId=" + shuttleId +
                ", capacity=" + capacity +
                ", operator=" + (shuttleOperator != null ? shuttleOperator.getFirstName() + " " + shuttleOperator.getLastName() : "null") + // FIXED: shuttleOperator.getFirstName() instead of shuttleOperator.getUser()
                ", licensePlate='" + licensePlate + '\'' +
                ", shuttleStatus=" + shuttleStatus +
                '}';
    }

    public static class Builder {
        private Long shuttleId;
        private int capacity;
        private ShuttleOperator shuttleOperator;
        private String licensePlate;
        private ShuttleStatus shuttleStatus;

        public Builder setShuttleId(Long shuttleId) {
            this.shuttleId = shuttleId;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setShuttleOperator(ShuttleOperator shuttleOperator) {
            this.shuttleOperator = shuttleOperator;
            return this;
        }

        public Builder setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public Builder setShuttleStatus(ShuttleStatus shuttleStatus) {
            this.shuttleStatus = shuttleStatus;
            return this;
        }

        public Builder copy(Shuttle shuttle) {  // Fixed the copy method
            this.shuttleId = shuttle.shuttleId;
            this.capacity = shuttle.capacity;
            this.shuttleOperator = shuttle.shuttleOperator;
            this.licensePlate = shuttle.licensePlate;
            this.shuttleStatus = shuttle.shuttleStatus;
            return this;
        }

        public Shuttle build() {
            return new Shuttle(this);
        }
    }
}