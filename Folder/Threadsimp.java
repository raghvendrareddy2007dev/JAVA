
import java.util.LinkedList;
import java.util.List;

/*
class Board
{
    String message = null;
    public synchronized void read()
    { 
        
    while(message == null)
    {
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
    }
        System.out.println(Thread.currentThread().getName()+" "+message);
        message = null;
     notifyAll();
}
    
    

    public synchronized void write(String m)
    {
        
        while(message != null)
        {
                try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
        }
        
        this.message = m ; 
        System.out.println(message +" written"+ Thread.currentThread().getName());
        notifyAll();
        
        
    }
}
class WriterB implements  Runnable
{
    Board b ;
    WriterB(Board b )
    {
        this.b = b;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            b.write(i+"");
            }

    }
}
class ReaderB implements Runnable
{
    Board b ; 
    ReaderB(Board b)
    {
        this.b = b ; 
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            b.read();
        }
    }
}







public class PCTest {
    public static void main(String[] args) {
        Board b = new Board();
        WriterB w = new WriterB(b);
        ReaderB r = new ReaderB(b);
        Thread t = new Thread(w,"writer");
        Thread t2 = new Thread(r,"reader");
        t.start();
        t2.start();

    }
}


*/
class Board
{
    List<Integer> a =new LinkedList();
    public synchronized void read()
    { 
        
    while(!a.isEmpty())
    {
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
    }
        System.out.println(Thread.currentThread().getName()+" "+message);
        a = null;
     notifyAll();
}
    
    

    public synchronized void write(String m)
    {
        
        while(message != null)
        {
                try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
        }
        
        this.message = m ; 
        System.out.println(message +" written"+ Thread.currentThread().getName());
        notifyAll();
        
        
    }
}
class WriterB implements  Runnable
{
    Board b ;
    WriterB(Board b )
    {
        this.b = b;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            b.write(i+"");
            }

    }
}
class ReaderB implements Runnable
{
    Board b ; 
    ReaderB(Board b)
    {
        this.b = b ; 
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            b.read();
        }
    }
}







public class PCTest {
    public static void main(String[] args) {
        Board b = new Board();
        WriterB w = new WriterB(b);
        ReaderB r = new ReaderB(b);
        Thread t = new Thread(w,"writer");
        Thread t2 = new Thread(r,"reader");
        t.start();
        t2.start();

    }
}