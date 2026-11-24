abstract class Clothing extends Product
{
    private String manufacturedate;
    private String material;
    private String size;
    public Clothing(String productId, String productName, String brand, double retailPrice, int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer,int returnPeriod,int deliveryCharge,String manufacturedate,String material,String size)
    {
        super( productId, productName, brand, retailPrice, availableQuantity,discountPercentage,taxPercentage,festivalOffer,returnPeriod, deliveryCharge);
        this.manufacturedate=manufacturedate;
        this.material=material;
        this.size=size;
        this.setCategory("Clothing");   
    }
}