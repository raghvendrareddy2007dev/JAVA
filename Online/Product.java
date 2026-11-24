import java.util.ArrayList;


class Product
{
    String productname;
    int pid;
    int price;
    ArrayList<Order1> cart;

    Product(String productname,int price) {
        this.productname=productname;
        this.price=price;
        this.pid=(int)(Math.random()*1000);
        cart=new ArrayList<Order1>();
    }

    
    


}