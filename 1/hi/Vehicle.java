
abstract class Vehicle {
    int id;
    String name;

    Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void display();
}

interface Chargeable {
    void chargeBattery();
}

interface NavigationSupported {
    void showLocation();
}
