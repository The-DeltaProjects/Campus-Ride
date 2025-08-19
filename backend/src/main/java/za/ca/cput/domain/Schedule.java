package za.ca.cput.domain;

import java.time.LocalDateTime;

public class Schedule {
    private Long shechduleId;
    private Shuttle shuttle;
    private ShuttleOperator operator;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int availableSeats;

    protected Schedule() {
    }

    private Schedule(Builder builder) {
        this.shechduleId = builder.shechduleId;
        this.shuttle = builder.shuttle;
        this.operator = builder.operator;
        this.origin = builder.origin;
        this.destination = builder.destination;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.availableSeats = builder.availableSeats;
    }

    public Long getShechduleId() {
        return shechduleId;
    }

    public Shuttle getShuttle() {
        return shuttle;
    }

    public ShuttleOperator getOperator() {
        return operator;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public static class Builder {
        private Long shechduleId;
        private Shuttle shuttle;
        private ShuttleOperator operator;
        private String origin;
        private String destination;
        private LocalDateTime departureTime;
        private LocalDateTime arrivalTime;
        private int availableSeats;

        public Builder setShechduleId(Long shechduleId) {
            this.shechduleId = shechduleId;
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

        public Builder copy(Builder builder){
            return new Builder()
                    .setShechduleId(this.shechduleId)
                    .setShuttle(this.shuttle)
                    .setOperator(this.operator)
                    .setOrigin(this.origin)
                    .setDestination(this.destination)
                    .setDepartureTime(this.departureTime)
                    .setArrivalTime(this.arrivalTime)
                    .setAvailableSeats(this.availableSeats);
        }

        public Schedule build() {
            return new Schedule(this);
        }
    }
}
