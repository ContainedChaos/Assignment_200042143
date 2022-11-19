package Assignment2.ContentCoupling;

import java.util.ArrayList;
import java.util.List;

public class BookStore
{
    public List<Book> bookList = new ArrayList<>();

    public void PriceInflation (Book book) //this method accesses  and changes book object without getters/setters resulting in inappropriate intimacy, no encapsulation
    {
        book.price *= 3;
    }
}
