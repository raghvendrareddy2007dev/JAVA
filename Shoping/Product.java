abstract class Product
{
    private final String productId;
    private String productName;
    private String brand;
    private double retailPrice;
    private int availableQuantity;
    final String platformName="ShopZone";
    private double discountPercentage;
    private double taxPercentage;
    private double festivalOffer;
    //constructor
    protected Product(String productId,String productName,String brand,double retailPrice,int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer) {
        this.productId = productId;
        this.productName=productName;
        this.brand=brand;
        this.retailPrice=retailPrice;
        this.availableQuantity=availableQuantity;
        this.discountPercentage=discountPercentage;
        this.taxPercentage=taxPercentage;
        this.festivalOffer=festivalOffer;
        ProductService.products.add(this);
    } 
    protected String getProductId() {
        return productId;
    }
    protected String getProductName() {
        return productName;
    }
    protected String getBrand() {
        return brand;
    }
    protected double getRetailPrice() {
        return retailPrice;
    }
    protected int getAvailableQuantity() {
        return availableQuantity;
    }
    protected void setProductName(String productName) {
        this.productName = productName;
    } 
    protected void setBrand(String brand) {
        this.brand = brand;
    }
    protected void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
    protected void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    protected void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    } 
    // abstract void displayProductDetails();
    // abstract double calculateDiscount(int discountPercentage);
    // abstract double calculateTax(int taxPercentage);
    // abstract int calculateDeliveryCharge(int charge);
    // abstract int getReturnPeriod(int returnPeriod);
    // abstract double applyFestivalOffer(int festivalOffer);
    // abstract void getDescription();
    // abstract void getPostPurchaseMessage();
}

