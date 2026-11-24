
import java.awt.event.ItemEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Restaurent
{
    String RName;
    int RID;
    ArrayList<Item>RMenu;
    //product cart=new product[] similar

    Restaurent(String RName) {
        this.RName=RName;
        this.RID=(int)Math.random();
        RMenu=new ArrayList<Item>();
    }
    
    void R_Add_Menu(Item I)
    {
        RMenu.add(I);
    }
    void R_Remove_Item(Item I)
    {
        RMenu.remove(I);
    }
    

    
}