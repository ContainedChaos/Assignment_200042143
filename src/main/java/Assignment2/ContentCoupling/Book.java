package Assignment2.ContentCoupling;

public class Book
{
    public String id;
    public String name;
    public double price;
    public int no_of_copies;

    public Book (String id, String name, double price, int no_of_copies)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.no_of_copies = no_of_copies;
    }
}
