class SavingAccount extends BankAccount{
    private double interestRate;
    private double minBalance;
    SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }
    @Override
    void calculateInterest(){
        double interest = (super.balance * interestRate) / 100;
        System.out.println("Interest for Savings Account: "+interest);
    }
    void minbalancetowithdraw(double minBalance){
        if (super.balance<minBalance){
            System.out.println("Insufficient balance to withdraw. Minimum balance required: "+minBalance);
        }
        else{
            System.out.println("You can withdraw. Current balance: "+super.balance);
        }
    }
}