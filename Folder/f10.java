class Board
{
    String message=null;
    synchronized public void read()
    {
        System.out.println("Read "+message);
    }
    synchronized public void write(String m)
    {
        
    }
}
class witerB implements Runnable
{

}
class readB implements Runnable
{

}
public class f10
{
    public static void main(String[] args) {
        
    }
}
//it there be an array size 3 now the write can any index of the array,then go to wait state,read should the array after the null the passed