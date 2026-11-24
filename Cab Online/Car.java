class Car extends Vehicle
{
    int no_of_seats;
    Car(String vnumber, String vmodel, String currentlocation, boolean availability, int fareperkm,int noofseats) {
        super(vnumber, vmodel, currentlocation, availability, fareperkm);
        this.no_of_seats=noofseats;
    }

}