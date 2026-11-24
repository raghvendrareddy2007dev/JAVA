 abstract class Product
 {
    private String productId;
    private String productName;
    private String brand;
    private double retailPrice;
    private String category;
    private int availableQuantity;
    private final String platformName = "Shoping";
    private double discountPercentage;
    private double taxPercentage;
    private double festivalOffer;
    private int returnPeriod;
    private int deliveryCharge;

    protected Product(String productId, String productName, String brand, double retailPrice, int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer,int returnPeriod,int deliveryCharge) {
        this.productId =(int)(Math.random() * 1000) + "-" + productId;
        this.productName = productName;
        this.brand = brand;
        this.retailPrice = retailPrice;
        this.availableQuantity = availableQuantity;
        this.discountPercentage = discountPercentage;
        this.taxPercentage = taxPercentage;
        this.festivalOffer = festivalOffer;
        this.returnPeriod = returnPeriod;
        this.deliveryCharge = deliveryCharge;
        //this.category = category;
        ProductService.products.add(this);
       
    }
    protected void setCategory(String category)
    {
        this.category=category;
    }
    protected double  getRetailPrice()
    {
        return this.retailPrice;
    }
    protected String getName()
    {
        return this.productName;
    }
    protected String getId()
    {
        return this.productId;
    }
    protected int getAvailableQuantity()
    {
        return this.availableQuantity;
    }
    protected void setAvailableQuantity(int availableQuantity)
    {
        this.availableQuantity=availableQuantity;
    }
    protected double getDiscountPercentage()
    {
        return this.discountPercentage;
    }
    protected String getbrand()
    {
        return this.brand;
    }
    abstract String postpurchaseService();

 }
