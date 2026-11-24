public class Main {
    public static void main(String[] args) {

        // Create Vehicle
        Car car = new Car("TS09AB1234", "Swift", "Hyderabad", 12.5, 4, true);

        // Create Driver
        Driver driver = new Driver(1, "Ravi", "9876543210", 4.5,
                "Hyderabad", true, car);

        // Create Customer
        Customer customer = new Customer(101, 9999999999L, "Ramesh");

        // Create Ride
        Ride ride = new Ride(1001, customer, driver, car,
                "Madhapur", "Gachibowli", 10);

        // Add ride to customer history
        customer.addRide(ride);

        // Driver accepts ride
        driver.acceptRide();

        // Start ride
        ride.startRide();

        // Complete ride
        ride.completeRide();

        // Payment
        Payment payment = new Payment(5001, ride.calculateTotalFare(), "Cash", ride);
        payment.makePayment(ride.calculateTotalFare(), "UPI");

        // Rate driver
        customer.rateDriver(driver, 5);

        // Display driver info
        driver.displayDriverInfo();

        System.out.println("Ride Fare: " + ride.calculateTotalFare());
        System.out.println("Payment Status: " + payment.paymentStatus);
    }
}