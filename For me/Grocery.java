abstract class Grocery extends Product
{
    private String manufacturedate;
    private String expirydate;
    private String storagecondition;
    public Grocery(String productId, String productName, String brand, double retailPrice, int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer,int returnPeriod,int deliveryCharge,String manufacturedate,String expirydate,String storagecondition)
    {
        super( productId, productName, brand, retailPrice, availableQuantity,discountPercentage,taxPercentage,festivalOffer,returnPeriod, deliveryCharge);
        this.manufacturedate=manufacturedate;
        this.expirydate=expirydate;
        this.storagecondition=storagecondition;
        this.setCategory("Grocery");
    }
}