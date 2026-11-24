class BankPolicy {
    private int minKYCAge;
    private double minDailywithdrawal;
    private int BankCode;
    BankPolicy(int minKYCAge, double minDailywithdrawal, int BankCode)
    {
        this.minKYCAge = minKYCAge;
        this.minDailywithdrawal = minDailywithdrawal;
        this.BankCode = BankCode;
    }
}