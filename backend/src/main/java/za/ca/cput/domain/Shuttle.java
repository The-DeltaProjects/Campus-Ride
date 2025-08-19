package za.ca.cput.domain;

public class Shuttle {
    private Long shuttleId;
    private int capacity;
    private ShuttleOperator shuttleOperator;
    private String licensePlate;
    private ShuttleStatus shuttleStatus;

    protected Shuttle(){

    }

    private Shuttle(Builder builder) {
        this.shuttleId = builder.shuttleId;
        this.capacity = builder.capacity;
        this.shuttleOperator = builder.shuttleOperator;
        this.licensePlate = builder.licensePlate;
        this.shuttleStatus = builder.shuttleStatus;
    }

    public Long getShuttleId() {
        return shuttleId;
    }

    public int getCapacity() {
        return capacity;
    }

    public ShuttleOperator getShuttleOperator() {
        return shuttleOperator;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public ShuttleStatus getShuttleStatus() {
        return shuttleStatus;
    }

    @Override
    public String toString() {
        return "Shuttle{" +
                "shuttleId=" + shuttleId +
                ", capacity=" + capacity +
                ", shuttleOperator=" + shuttleOperator +
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

        public Builder copy(Builder builder){
            return new Builder()
                    .setShuttleId(this.shuttleId)
                    .setCapacity(this.capacity)
                    .setShuttleOperator(this.shuttleOperator)
                    .setLicensePlate(this.licensePlate)
                    .setShuttleStatus(this.shuttleStatus);
        }

        public Shuttle build() {
            return new Shuttle(this);
        }
    }
}
