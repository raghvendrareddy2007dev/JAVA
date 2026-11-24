class Laptop extends Electronic implements Bluetooth
{
    protected Laptop(String productId, String productName, String brand, double retailPrice, int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer,int returnPeriod,int deliveryCharge,String manufacturedate,String warrentyPreiod,int powerconsumption)
    {
        super( productId, productName, brand, retailPrice, availableQuantity,discountPercentage,taxPercentage,festivalOffer,returnPeriod, deliveryCharge,manufacturedate,warrentyPreiod,powerconsumption);
        this.setCategory("Laptop");
    }
    @Override
    public void connect() {
        // Implementation for connecting to Bluetooth
    }

    @Override
    public void disconnect() {
        // Implementation for disconnecting from Bluetooth
    }

    @Override
    public boolean isConnected() {
        // Implementation for checking if Bluetooth is connected
        return false;
    }
    public String postpurchaseService() {
        // Implementation for getting laptop details
        return "make sure you have checked the laptop details";
    }
}