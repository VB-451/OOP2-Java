package myproject.Bookstore;

import java.util.Scanner;

public class BookstoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți titlul cărții:");
        String title = scanner.nextLine();

        System.out.println("Introduceți autorul cărții:");
        String author = scanner.nextLine();

        System.out.println("Introduceți editura cărții:");
        String publisher = scanner.nextLine();

        System.out.println("Introduceți numărul de pagini al cărții:");
        int pageCount = scanner.nextInt();

        if (pageCount <= 0){
            System.out.println("Numarul de pagini este invalid");
            return;
        }

        Book book = new Book();
        book.title = title;
        book.author = author;
        book.publisher = publisher;
        book.pageCount = pageCount;

        System.out.println(book);
    }
}
