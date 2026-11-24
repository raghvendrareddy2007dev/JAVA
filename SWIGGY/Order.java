
import java.util.ArrayList;

class Order
{
    String oname;
    int oid;
    ArrayList<Item>Items=new ArrayList<>();
    Order(String oname) {
        this.oname=oname;
        this.oid=(int)(Math.random()*1000);
    }
    void add(Item I)
    {
        Items.add(I);
    }
    void remove_order(Item I)
    {
        Items.remove(I);
    }
    

}