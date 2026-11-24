
import java.util.ArrayList;

class ProductService
{
    static ArrayList<Product> products = new ArrayList<>();
    protected List<Product> ElectronicProducts = new ArrayList<>();
    
        //displpay all displayProductDetails()
    public void displayProductDetails(Product p) {
        System.out.println("-------------------------------------------All product details-----------------------------------");
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Product Brand: " + p.getBrand());
        System.out.println("Product Retail Price: " + p.getRetailPrice());
        System.out.println("Available Quantity: " + p.getAvailableQuantity());
        System.out.println("-------------------------------------------------End---------------------------------------------");
        }
    }



    // void displayProductDetails()
    // {
    //     System.out.println("product name:"+productName+" "+"retail price"+retailPrice);
    // }
    // double calculateDiscount(int discountPercentage)
    // {
    //     retailPrice=retailPrice*discountPercentage/100;
    //     return retailPrice;
    // }
    // double calculateTax(int taxPercentage)
    // {
    //     retailPrice=retailPrice*taxPercentage/100; 
    //     return retailPrice;
    // }
    // int calculateDeliveryCharge(int charge)
    // {
    //     return charge;
    // }
    // int getReturnPeriod(int returnPeriod)
    // {
    //     return returnPeriod;
    // }
    // double applyFestivalOffer(int festivalOffer)
    // {
    //     retailPrice=retailPrice*festivalOffer/100;
    //     return retailPrice;
    // }
    // void getDescription()
    // {
    //     System.out.println("Product Description: " + productName);
    //     System.out.println("Product Brand: " + brand);
    //     System.out.println("Product Retail Price: " + retailPrice);
    //     System.out.println("Available Quantity: " + availableQuantity);
    // }
    // void getPostPurchasemessage()
    // {
    //     System.out.println("Thank you for purchasing " + productName + " from " + platformName + ". We hope you enjoy your new product!");
    // }
