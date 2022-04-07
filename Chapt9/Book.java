package Chapt9;
import java.util.*;

public class Book

{
    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public void printBookInfo() {
        System.out.print(title + ", written by " + author);
    }

    public static void main(String[] args) {
   
        ArrayList < Book > myLibrary = new ArrayList < Book > ();

        /* missing code */
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum",
            "W.W. Denslow");
            BookListing listing1 = new BookListing(book1, 10.99);
listing1.printDescription();
BookListing listing2 = new BookListing(book2, 12.99);
listing2.printDescription();

        myLibrary.add(book1);

        myLibrary.add(book2);
    }
}