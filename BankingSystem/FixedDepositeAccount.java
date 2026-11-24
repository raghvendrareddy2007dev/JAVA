class FixedDepositAccount extends BankAccount {
     private int tenureInMonths;
     private double interestRate;

     FixedDepositAccount(String accountNumber, String accountHolderName, double balance, int tenureInMonths, double interestRate) {
         super(accountNumber, accountHolderName, balance);
         this.tenureInMonths = tenureInMonths;
         this.interestRate = interestRate;
     }

     @Override
     void calculateInterest() {
         double interest = (balance * interestRate * tenureInMonths / 12);
         balance += interest;
         System.out.println("Periodic interest deposited: " + interest);
     }
 }