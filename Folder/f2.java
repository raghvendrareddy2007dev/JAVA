class King implements Runnable{

    @Override
    public void run() {
            m1();
        
    }
    void m1()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
class Queen implements Runnable
{
    @Override
    public void run() {
        m2();
        
    }
    void m2()
    {
    for (int i = 0; i < 10; i++) {
        if(i%3 == 0)
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

public class f2 {
    public static void main(String[] args) {
King k = new King();
Queen q = new Queen();


Thread t1 = new Thread(k);
Thread t2 = new Thread(k);
Thread t3 = new Thread(q);
Thread t4 = new Thread(q);
Thread t5 = new Thread(q);

t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
    System.out.println("Existing the main");
    }
}