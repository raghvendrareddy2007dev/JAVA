abstract class Electronic extends Product
{
    private String manufacturedate;
    private String warrentyPreiod;
    private int powerconsumption;
    public Electronic(String productId, String productName, String brand, double retailPrice, int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer,int returnPeriod,int deliveryCharge,String manufacturedate,String warrentyPreiod,int powerconsumption)
    {
        super( productId, productName, brand, retailPrice, availableQuantity,discountPercentage,taxPercentage,festivalOffer,returnPeriod, deliveryCharge);
        this.manufacturedate=manufacturedate;
        this.warrentyPreiod=warrentyPreiod;
        this.powerconsumption=powerconsumption;
        this.setCategory("Electronic");
    }
}