import model.*;
import service.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Librarian librarian = new Librarian(
                1,
                "Ramesh Sharma",
                "LIB101",
                "Morning"
        );


        Student student = new Student(
                101,
                "Rahul Verma",
                "Computer Science",
                3
        );
        librarian.displayDetails();
        System.out.println();

        student.displayDetails();
        System.out.println();

        Book book1 = new FictionBook(
                1001,
                "Harry Potter",
                "J.K. Rowling",
                "Fantasy"
        );

        Book book2 = new AcademicBook(
                1002,
                "Data Structures",
                "Mark Allen Weiss",
                "Computer Science",
                5
        );

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
        library.issueBook(1001);

        library.displayBooks();

        library.returnBook(1001);

        library.displayBooks();
    }
}