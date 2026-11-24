class test1 implements Runnable
{
    String mail="";
    test1(String mail)
    {
        this.mail=mail;
    }
    public void run()
    {
        m1();
    }
    void m1()
    {
        System.out.println("Email "+this.mail);
    }
}
class test2 implements Runnable
{
    String mail="";
    test2(String mail)
    {
        this.mail=mail;
    }
    public void run()
    {
        m1(mail);
    }
    void m1(String mail)
    {
        System.out.println("Email "+this.mail);
    }
}
class f5
{
    public static void main(String[] args) {
        test1 a=new test1("as@gmail");
        test2 b=new test2("as@gmal");
        Thread n=new
    }
}