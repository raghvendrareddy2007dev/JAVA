//types of bankaccount
//common properties of bankaccount 
abstract class BankAccount {
    final String bankName="SecureBank";
    final String accountNumber;
    private String accountHolderName;
    protected double balance;
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposite(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Amount deposited: "+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn: "+amount);
        }
        else{
            System.out.println("Invalid amount or insufficient balance");
        }
    }
    void displayAccountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
    void calculateInterest(){
        //default implementation, can be overridden by subclasses
        System.out.println("Interest calculation not applicable for base account");
    }
    final void KYCVerification(){
        System.out.println("KYC verification completed for account: "+accountNumber);
    }

}
//operations on bankaccount inheritences for Savings Account, Current Account, or Fixed Deposit
//deposite,withdraw,displayacc details,calculate interest
