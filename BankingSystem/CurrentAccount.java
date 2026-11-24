class CurrentAccount extends BankAccount{
    private double interestRate;
    private double overdraftLimit;
    CurrentAccount(String accountNumber, String accountHolderName, double balance, double interestRate, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    void calculateInterest(){
        double interest = (super.balance * interestRate) / 100;
        System.out.println("Interest for Current Account: "+interest);
    }
    void checkOverdraftLimit(){
        if (super.balance<0 && Math.abs(super.balance)>overdraftLimit){
            System.out.println("Overdraft limit exceeded. Current balance: "+super.balance);
        }
        else{
            System.out.println("Within overdraft limit. Current balance: "+super.balance);
        }
    }
}