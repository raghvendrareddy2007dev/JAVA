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
public class f3{
    public static void main(String[] args) {
King k1 = new King();
King k2 = new King();
King k3 = new King();
Queen q1 = new Queen();
Queen q2 = new Queen();

Thread t1 = new Thread(k1);
Thread t2 = new Thread(k2);
Thread t3 = new Thread(k3);
Thread t4 = new Thread(q1);
Thread t5 = new Thread(q2);

t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
      
    }
}