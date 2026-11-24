import java.util.*;
class Vehicle
{
    String vnumber;
    String vmodel;
    String currentlocation;
    boolean availability=false;
    int fareperkm;
    ArrayList<Driver> drivers;
    Vehicle(String vnumber, String vmodel, String currentlocation, boolean availability, int fareperkm) {
        this.vnumber = vnumber;
        this.vmodel = vmodel;
        this.currentlocation = currentlocation;
        this.availability = true;
        this.fareperkm = fareperkm;
        drivers=new ArrayList<Driver>();
    }


    
    
}