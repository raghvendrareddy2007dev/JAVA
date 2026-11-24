class Item{
    String iname;
    int iid;
    int price;

    Item(String iname,int price) {
        this.iname=iname;
        this.iid=(int)Math.random();
        this.price=price;
    }
    
}