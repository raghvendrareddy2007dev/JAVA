class Order {
    int orderId;
    String productName;
    double price;

    Order(int orderId, String productName, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println(orderId + " " + productName + " " + price);
    }
}