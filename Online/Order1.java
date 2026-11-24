import java.util.ArrayList;

class Order1{
    int orderid;
    ArrayList<Product> cart;
    Order1()
    {
        this.orderid=(int)(Math.random()*1000);
        cart=new ArrayList<Product>();
    }
    void add(Product product)
    {
        if(cart!=null)
        {cart.add(product);}
    }
    void remove(Product product)
    {
        cart.remove(product);
    }
    int total=0;
    void totalbill()
    {
        for(int i=0;i<cart.size();i++)
        {
            
        }
    }
}