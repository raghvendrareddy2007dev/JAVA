class Canteen
{
    static void buy(Payable card, double amount)
    {
        card.pay(amount);
        card.showBalance();
    }
}