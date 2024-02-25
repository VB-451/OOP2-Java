package myproject.Bookstore;

public class Book {
    String title;
    String author;
    String publisher;
    int pageCount;

    @Override
    public String toString() {
        return "BOOK_TITLE: " + title.toUpperCase() + "\n" +
                "BOOK_AUTHOR: " + author + "\n" +
                "BOOK_PUBLISHER: " + publisher.toLowerCase();
    }
}
