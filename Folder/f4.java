class task1 implements Runnable
{
    @Override
    public void run(){
        m1();
    }
    void m1(){
        for(int i =1;i<11;i++) {
            try{
            Thread.sleep(2000);
            System.out.println(i);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class task2 implements Runnable
{
    @Override
    public void run(){
        m2();
    }
    void m2(){
        for(int i =10;i>0;i--) {
            try{
            Thread.sleep(2000);
            System.out.println(i);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class f4
{
    public static void main(String[] args) {
        task1 t1=new task1();
        task2 t2=new task2();
        Thread a=new Thread(t1);
        Thread b=new Thread(t2);
        a.start();
        b.start();
    }
}