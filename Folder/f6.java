/*
import java.io.*;
class MyTask implements Runnable {
    File file;
    String Message;
       MyTask(File file,String Message) {
        this.file = file;
        this.Message=Message;
    }

    void m2() {
         for (int i = 0; i < 100; i++) {
               System.out.println(i);
        }
        synchronized (this.file) {
            try {
                FileWriter writer = new FileWriter(file, true);

                for (int i = 1; i <= 5; i++) {
                    writer.write(Message + " - " + i + "\n");
                    writer.flush();
                    Thread.sleep(100);
                }

                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
          for (int i = 2000; i < 3000; i++) {
            if(i%4 == 0)
                System.out.println(i);
        }

    }

    public void run() {
        m2();
    }
}

public class hh {
    public static void main(String[] args) {
        File file = new File("output.txt");

        MyTask task1 = new MyTask(file,"File1");
       
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);

        t1.start();
        t2.start();
    }
}
*******************************
 class email extends Thread{
    String to; 
    email(String emailid,String name)
    {
        to = emailid;
        this.setName(name);
    }
    
    
    @Override
    public void run() {
        //100 lines of code to set up an email 
        
        System.out.println(Thread.currentThread().getName()+"  Send mail to "+this.to);
    }
}
public class hhhh
{
    public static void main(String[] args) {
        email e = new email("Zoya@gmail.com","Zoya");
        email e1 = new email("Koya@gmail.com","koya");
        
       e.start();
        e1.start();
    }
}



*/