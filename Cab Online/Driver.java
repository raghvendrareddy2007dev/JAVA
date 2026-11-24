class Driver
{
    String dname;
    int dnumber;
    double rating;
    String dlocation;
    boolean davailability;

    Driver(String dname, int dnumber, double rating, String dlocation, boolean davailability) {
        this.dname = dname;
        this.dnumber = dnumber;
        this.rating = rating;
        this.dlocation = dlocation;
        this.davailability=davailability;
    }
    
    void updateAvailability(boolean newAvailability) {
        this.davailability = newAvailability;
    }
    void updateLocation(String newLocation) {
        this.dlocation = newLocation;
    }
    void rideStarted()
    {
        this.davailability=false;
    }
    void rideCompleted() {
        this.davailability = true;
    }         
    void rideaccept()
    {
        if(davailability==true)
        {
            System.out.println("Ride Accepted");
            this.davailability=false;
        }
        else
        {
            System.out.println("Driver is not available");
        }
    }
    void rideReject()
    {
        System.out.println(dname+"has rejected the ride");
    }
    void displayDetails()
    {
        System.out.println("Driver Name: "+dname);
        System.out.println("Driver Number: "+dnumber);
        System.out.println("Driver Rating: "+rating);
        System.out.println("Driver Location: "+dlocation);
        System.out.println("Driver Availability: "+davailability);
    }
}