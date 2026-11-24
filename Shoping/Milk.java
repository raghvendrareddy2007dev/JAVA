class Milk 
{

    Milk(String productId,String productName,String brand,double retailPrice,int availableQuantity,double discountPercentage,double taxPercentage,double festivalOffer)
    {
        super(productId,productName,brand,retailPrice,availableQuantity);
        this.discountPercentage = discountPercentage;
        this.taxPercentage = taxPercentage;
        this.festivalOffer = festivalOffer;
    }
}