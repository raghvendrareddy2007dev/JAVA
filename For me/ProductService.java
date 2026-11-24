import java.util.*;
class ProductService {
    // Class implementation goes here
    static List<Product> products = new ArrayList<>();
    ProductService() {
        // Constructor implementation goes here
    
    }
    // static void addtoklists(Product product) {
    //     if(product.category.equals("Electronics")) {
    //         Electronic.products.add(product);
    //     } else if(product.category.equals("Clothing")) {
    //         Clothing.products.add(product);
    //     } else if(product.category.equals("HomeAppliances")) {
    //         HomeAppliances.products.add(product);
    //     }
    // }

    public void getDetails(Product p)
    {
        System.out.println("------------------detaials of object----------------------");
        System.out.println("Product name is :"+p.getName());
        System.out.println("Product brand:"+p.getbrand());
    }
    public void calculateDiscount(Product p) {
        // Implementation for calculating discount
        System.out.println("*********Discount Calculation*********");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Discounted Price: " + product.getDiscountPercentage());
            
        }
        System.out.println("*********Discount Calculation*********");
    }
}