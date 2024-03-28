package myproject.Bookstore;

public class BookstoreCheck {
    public static boolean isDuplicate(Book book1, Book book2) {
        return book1.title.equals(book2.title) && book1.author.equals(book2.author) && book1.publisher.equals(book2.publisher) && book1.pageCount == book2.pageCount;
    }

    public static Book thickerBook(Book book1, Book book2) {
        if (book1.pageCount > book2.pageCount) {
            return book1;
        } else if (book2.pageCount > book1.pageCount) {
            return book2;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Book1";
        book1.author = "Author1";
        book1.publisher = "Publisher1";
        book1.pageCount = 200;

        Book book2 = new Book();
        book2.title = "Book2";
        book2.author = "Author1";
        book2.publisher = "Publisher1";
        book2.pageCount = 201;


        System.out.println("Cartile sunt egale ? : " + isDuplicate(book1, book2));


        Book thicker = thickerBook(book1, book2);
        if (thicker != null) {
            System.out.println(thicker.title + " este mai groasa.");
        } else {
            System.out.println("Numarul de pagini este egal.");
        }
    }
}
