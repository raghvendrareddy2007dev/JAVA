class Milk extends Grocery implements Expiry
{
    Milk(String productId, String productName, String brand, double retailPrice, int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer,int returnPeriod,int deliveryCharge,String manufacturedate,String expirydate,String storagecondition)
    {
        super( productId, productName, brand, retailPrice, availableQuantity,discountPercentage,taxPercentage,festivalOffer,returnPeriod, deliveryCharge,manufacturedate,expirydate,storagecondition);
        this.setCategory("Milk");
    }
    @Override
    public boolean isExpired() {
        // Implement the logic to check if the milk is expired based on the expiry date
        // For example, you can compare the current date with the expiry date
        // Return true if expired, false otherwise
        return false; // Placeholder implementation
    }

    @Override
    public String postpurchaseService() {
        // Implementation for getting milk details
        return "make sure you have checked the milk details";
    }
}