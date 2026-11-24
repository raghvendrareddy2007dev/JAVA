
class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new EVCar(101, "Tesla"),
            new Pcar(102, "Honda")
        };
    
    for(Vehicle v:vehicles)
    {
        v.display();
        if(v instanceof Chargeable)
        {
            Chargeable a=(Chargeable)v;
            a.chargeBattery();
        }
        if(v instanceof NavigationSupported)
        {
            NavigationSupported a=(NavigationSupported)v;
            a.showLocation();
        }
    }
}}
