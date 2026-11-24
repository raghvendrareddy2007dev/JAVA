class Main
    {
    public static void main(String[] args){
        BankAccount savingsAccount = new SavingAccount("SA123", "John Doe", 1000.0, 0.04);
        savingsAccount.deposite(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.displayAccountDetails();
        savingsAccount.calculateInterest(); 
    }
    }