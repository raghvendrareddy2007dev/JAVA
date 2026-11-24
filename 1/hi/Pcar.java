class Pcar extends Vehicle implements NavigationSupported{
    Pcar(int id, String name) {
        super(id, name);
    }
    void display(){
        System.out.println("Petrol Car: " + name);
        System.out.println("Petrol Car ID: " + id);
    }
    public void showLocation() {
        System.out.println("Showing location of " + name);
    }
}