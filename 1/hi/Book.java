import java.util.*;
class Book
{
    int bookId;
    String title;
    double price;

    public Book(int bookId,String title,double price) {
        this.bookId=bookId;
        this.title=title;
        this.price=price;
    }
    // public String toString()
    // {
    //     return "BookID: "+bookId+"Title: "+title+"price: "+price;
    // }
    void display()
    {
        System.out.println("BookID: "+bookId);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }
    
}
// class Main
// {
//     public static void main(String[] args) {
//         Book s1=new Book(101,"Java", 500);
//         Book s2=new Book(102,"Python", 600);
//         System.out.println(s1);
//         System.out.println(s2);
//     }
// }
class Library
{
    ArrayList<Book> books;

    public Library() {
        books=new ArrayList<>();
    }
    void addBook(Book b)
    {
        books.add(b);
    }
    void searchBook(int id)
    {
        for(Book b:books)
        {
            if(b.bookId==id)
            {
                b.display();
                return;
            }
        }
        System.out.println("Id not found: "+id);
    }
    double getTotalPrice()
    {
        double total=0;
        for(Book b:books)
        {
             total+=b.price;
        }
        return total;
    }
}
class Main
{
    public static void main(String[] args) {
        Library a = new Library();
        a.addBook(new Book(101, "Java", 500));
        a.addBook(new Book(102, "Python", 900));
        a.addBook(new Book(103, "C++", 400));
        a.searchBook(102);
        System.out.println("Total: "+a.getTotalPrice());

    }

}
