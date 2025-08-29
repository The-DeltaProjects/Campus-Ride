package za.ca.cput.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId; // Fixed spelling: shechduleId → scheduleId

    @ManyToOne
    @JoinColumn(name = "shuttle_id")
    private Shuttle shuttle;

    @ManyToOne
    @JoinColumn(name = "operator_id")
    private ShuttleOperator operator;

    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int availableSeats;

    protected Schedule() {}

    private Schedule(Builder builder) {
        this.scheduleId = builder.scheduleId;
        this.shuttle = builder.shuttle;
        this.operator = builder.operator;
        this.origin = builder.origin;
        this.destination = builder.destination;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.availableSeats = builder.availableSeats;
    }

    // Getters
    public Long getScheduleId() { return scheduleId; }
    public Shuttle getShuttle() { return shuttle; }
    public ShuttleOperator getOperator() { return operator; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public int getAvailableSeats() { return availableSeats; }


    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", shuttle=" + (shuttle != null ? "Shuttle ID:" + shuttle.getShuttleId() + ", Capacity:" + shuttle.getCapacity() : "null") +
                ", operator=" + (operator != null ? operator.getFirstName() + " " + operator.getLastName() + " (ID:" + operator.getOperatorId() + ")" : "null") + // FIXED: operator.getFirstName() instead of operator.getUser().getFirstName()
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", availableSeats=" + availableSeats +
                '}';
    }

    public static class Builder {
        private Long scheduleId; // Fixed spelling: shechduleId → scheduleId
        private Shuttle shuttle;
        private ShuttleOperator operator;
        private String origin;
        private String destination;
        private LocalDateTime departureTime;
        private LocalDateTime arrivalTime;
        private int availableSeats;

        public Builder setScheduleId(Long scheduleId) { // Fixed spelling: setShechduleId → setScheduleId
            this.scheduleId = scheduleId;
            return this;
        }

        public Builder setShuttle(Shuttle shuttle) {
            this.shuttle = shuttle;
            return this;
        }

        public Builder setOperator(ShuttleOperator operator) {
            this.operator = operator;
            return this;
        }

        public Builder setOrigin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDepartureTime(LocalDateTime departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        public Builder setArrivalTime(LocalDateTime arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }

        public Builder setAvailableSeats(int availableSeats) {
            this.availableSeats = availableSeats;
            return this;
        }

        public Builder copy(Schedule schedule) {
            this.scheduleId = schedule.scheduleId; // Fixed spelling: shechduleId → scheduleId
            this.shuttle = schedule.shuttle;
            this.operator = schedule.operator;
            this.origin = schedule.origin;
            this.destination = schedule.destination;
            this.departureTime = schedule.departureTime;
            this.arrivalTime = schedule.arrivalTime;
            this.availableSeats = schedule.availableSeats;
            return this;
        }

        public Schedule build() {
            return new Schedule(this);
        }
    }
}
