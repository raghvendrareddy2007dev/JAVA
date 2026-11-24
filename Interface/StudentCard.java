class StudentCard implements Payable,EntryPass
{
    private String rollNo;
    private double balance;
    private int attendance;
    //private double amount;
    StudentCard(String rollNo,double balance) {
        this.balance=balance;
        this.rollNo=rollNo;
    }
    public boolean pay(double amount)
    {
        Payable.isValidAmount(amount);
        if(balance-amount>0&&amount>0)
        {
            balance=balance-amount;
            System.out.println("paid:"+amount);
            System.out.println("balance left:"+getbalance());
            return true;
        }
        else
        {
            System.out.println("payment failed");
            System.out.println("balance left:"+getbalance());
            return false;}
    }
    public double getbalance()
    {
        return balance;
    }

    public boolean canEnter(String place)
    {
        if( place=="LIBRARY" || place=="LAB")
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void markPresent()
    {
        attendance=attendance+1;
    }
    int getAttendance()
    {
        System.out.println("Attendance:");
        return attendance;
    }
    
    
    
}