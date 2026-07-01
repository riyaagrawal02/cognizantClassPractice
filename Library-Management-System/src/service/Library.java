package service;

import java.util.ArrayList;
import model.Book;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added successfully.\n");
    }


    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.\n");
            return;
        }

        System.out.println("========= Library Books =========");

        for (Book book : books) {
            book.displayBook();     
        }
    }

    public void issueBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println(book.getTitle() + " issued successfully.\n");
                } else {
                    System.out.println("Book is already issued.\n");
                }

                return;
            }
        }

        System.out.println("Book not found.\n");
    }

    public void returnBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println(book.getTitle() + " returned successfully.\n");
                } else {
                    System.out.println("Book was not issued.\n");
                }

                return;
            }
        }

        System.out.println("Book not found.\n");
    }
}