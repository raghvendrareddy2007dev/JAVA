class User
{
    String name;
    int uid;
    Order1 cart = new Order1();
    User(String name)
    {
        this.name=name;
        this.uid=(int)(Math.random()*1000);
    }
    void displayuserdetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Userid:"+uid);
    }
    void addToCart(Product p) {
        cart.add(p);
    }

    void showCart() {
        System.out.println("User: " + name);
        
    }
}