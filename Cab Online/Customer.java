class Customer
{
    String cname;
    int cid;
    int cnumber;
    String clocation;

    Customer(String cname, int cnumber, String clocation) {
        this.cname = cname;
        this.cnumber = cnumber;
        this.cid = (int)(Math.random()*1000);
        this.clocation=clocation;
    }
    void cancelRide()
    {
        System.out.println(cname+" has cancelled the ride");
    }
    /*void rateDriver()
    {

    }*/
    
}