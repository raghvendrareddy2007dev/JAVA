
import java.util.*;

class Customer {

    int customerId;
    String customerName;
    ArrayList<Order> orders;

    Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        orders = new ArrayList<>();
    }

    void addOrder(Order o) {
        orders.add(o);
    }

    void displayOrders() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
    }
}

class Main {

    public static void main(String[] args) {
        Customer c = new Customer(101, "Ravi");

        c.addOrder(new Order(1, "Laptop", 55000));
        c.addOrder(new Order(2, "Mouse", 800));
        c.addOrder(new Order(3, "Keyboard", 1500));

        c.displayOrders();
    }
}
