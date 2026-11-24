abstract class Electronic extends Product
{
    protected double discountPercentage;
    protected double taxPercentage;
    protected double festivalOffer;
    Electronic(String productId,String productName,String brand,double retailPrice,int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer) {
        super(productId, productName, brand, retailPrice, availableQuantity, discountPercentage, taxPercentage, festivalOffer);
           
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
    
}