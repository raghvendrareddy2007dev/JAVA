import java.util.*;
class PriceComparator implements Comparator
{
    @Override
    public int compare(Object arg0, Object arg1) {
       Product p = (Product) arg0;
       Product p1 = (Product)arg1;
        return (int)(p.price - p1.price);
    }
}
class NameComparator implements Comparator
{
    public int compare(Object arg2,Object arg3)
    {
        Product p=(Product)arg2;
        Product p1=(Product)arg3;
        return (int)(p.name.length()-p1.name.length());

    }
}
class Product implements Comparable
{
    int pid;static int counter=0;
    String name ; float price ; String category ; int stock;
    Product(String name , float price , String category , int stock)
    {
        this.name = name; 
        this.category = category;
        this.stock = stock;
        this.price = price;
        this.pid = counter++;
    }
    public String toString()
    {
        return pid+" "+name+" "+price;
    }
@Override
public int compareTo(Object arg0) {
    Product p = (Product)arg0;

    return this.pid - p.pid;
}





}
public class ProductList {
    public static void main(String[] args) {
        Product p = new Product("ring", 23000.0f, "jewellery", 1000);
        Product p1 = new Product("necklace", 33000.0f, "jewellery", 100);
        Product p2 = new Product("colgate", 230.0f, "home essentials", 2000);
        Product p3 = new Product("hammer", 23000.0f, "home essentials", 10);
        Product p4 = new Product("phone", 43000.0f, "electronics", 1300);
        Product p5=p1;
        Product p6=p2;
        Product p11=new Product("ring", 23000.0f, "jewellery", 1000);
        List cart = new ArrayList();
        cart.add(p4);cart.add(p3);cart.add(p2);cart.add(p1);cart.add(p);cart.add(p5);cart.add(p6);cart.add(p11);
        System.out.println(cart);
        // Collections.sort(cart,new PriceComparator());
        Collections.sort(cart,new NameComparator());
        Set<Object> set=new TreeSet<>(cart);
    System.out.println(cart);
    System.out.println(set);
    
    
    
    }
}

