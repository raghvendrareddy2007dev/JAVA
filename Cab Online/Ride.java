class Ride {
    int rideId;
    Customer customer;
    Driver driver;
    Vehicle vehicle;
    String pickupLocation;
    String destination;
    double distance;
    double fare;
    String rideStatus;
    Payment payment;

    Ride(int rideId, Customer customer, Driver driver, Vehicle vehicle,
         String pickupLocation, String destination, double distance) {

        this.rideId = rideId;
        this.customer = customer;
        this.driver = driver;
        this.vehicle = vehicle;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.distance = distance;
        this.fare = vehicle.calculateFare(distance);
        this.rideStatus = "Booked";
    }

    public boolean assignDriver(Driver driver) {
        if (driver.isAvailable) {
            this.driver = driver;
            return true;
        }
        return false;
    }

    public boolean startRide() {
        if (rideStatus.equals("Booked")) {
            rideStatus = "In Progress";
            driver.startRide();
            return true;
        }
        return false;
    }

    public boolean completeRide() {
        if (rideStatus.equals("In Progress")) {
            rideStatus = "Completed";
            driver.completeRide();
            return true;
        }
        return false;
    }

    public boolean cancelRide() {
        if (rideStatus.equals("Booked")) {
            rideStatus = "Cancelled";
            driver.isAvailable = true;
            vehicle.markAvailable();
            return true;
        }
        return false;
    }

    public double calculateTotalFare() {
        return vehicle.calculateFare(distance);
    }
}
