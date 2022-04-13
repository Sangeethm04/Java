package Chapt9;
public class Book

{
    private String title;
    private String author;
    public Book(String t, String a)

    {
        title = t;
        author = a;
    }

    public void printBookInfo() {
        System.out.print(title + ", written by " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        book1.printBookInfo();
    }
}