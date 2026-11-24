class EVCar extends Vehicle implements Chargeable,NavigationSupported 
{
    EVcar(int id, String name) {
        super(id, name);
    }
    void display(){
        System.out.println("EV Car: " + name);
    }
    public void chargeBattery() {
        System.out.println("Charging the battery of " + name);
    }
    public void showLocation() {
        System.out.println("Showing location of " + name);
    }
}