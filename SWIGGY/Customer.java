class Customer
{
    String Name;
    int CID;
    Customer(String Name) {
        this.Name=Name;
        this.CID=(int)Math.random();
    }
    void display_customer_details()
    {
        System.out.println("Name:"+Name+"CID"+CID);
        System.out.println("----------------------------------------------------");
    }


    
    
}