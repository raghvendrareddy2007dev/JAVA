interface Payable{
    boolean pay(double amount);
    double getbalance();

    static boolean isValidAmount(double amount)
    {
        if(amount>=0 && amount<2000){
            return true;}
        else
            return false;
        
    }
    default double showBalance()
    {
        return getbalance();
    }

}