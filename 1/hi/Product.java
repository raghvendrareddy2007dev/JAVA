
import java.util.*;

class Product {

    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println(productId + " " + productName + " " + price);
    }
}

class ProductManager {

    ArrayList<Product> products;

    ProductManager() {
        // 1. Initialize ArrayList
        products = new ArrayList<>();
    }

    void addProduct(Product p) {
        // 2. Add product
        products.add(p);
    }

    void searchProduct(int id) {
        // 3. Search product by ID
        for (Product p : products) {
            if (p.productId == id) {
                System.out.println("Id found: " + id);
                return;
            }
        }
        System.out.println("ID not found: " + id);
    }

    void removeProduct(int id) {
        // 4. Remove product by ID
        
    for (int i = 0; i < products.size(); i++) {
        Product p = products.get(i);

        if (p.productId == id) {
            products.remove(i);
            System.out.println("Product removed");
            return;
        }
    }

    System.out.println("Product not found");
}

    void displayAll() {
        // 5. Display all products
        for (Product p : products) {
            p.display();
        }
    }
    }


class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct(new Product(101, "Laptop", 55000));
        manager.addProduct(new Product(102, "Mouse", 800));
        manager.addProduct(new Product(103, "Keyboard", 1500));

        manager.searchProduct(102);

        manager.removeProduct(102);

        manager.displayAll();

        manager.searchProduct(102);
    }
}
