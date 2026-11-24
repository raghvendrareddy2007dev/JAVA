abstract class Medicine extends Product implements Expiry
{
    private String manufacturedate;
    private String expirydate;
    private String storagecondition;
    public Medicine(String productId, String productName, String brand, double retailPrice, int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer,int returnPeriod,int deliveryCharge,String manufacturedate,String expirydate,String storagecondition)
    {
        super( productId, productName, brand, retailPrice, availableQuantity,discountPercentage,taxPercentage,festivalOffer,returnPeriod, deliveryCharge);
        this.manufacturedate=manufacturedate;
        this.expirydate=expirydate;
        this.storagecondition=storagecondition;
        this.setCategory("Medicine");           
    }
    @Override
    public boolean isExpired() {
        // Implement the logic to check if the medicine is expired based on the expiry date
        // For example, you can compare the current date with the expiry date
        // Return true if expired, false otherwise
        return false; // Placeholder implementation
    }
}