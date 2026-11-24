
class Pro1 {
    int productId;
    String name;

    Pro1(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    // Write equals() here
    boolean equals(Product p)
    {
        if(this.productId==p.productId)
        {
            return false;
        }
    }

    // Write hashCode() here

}
