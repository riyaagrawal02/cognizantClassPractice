package model;

public class AcademicBook extends Book {

    private String subject;
    private int edition;

    public AcademicBook(int bookId, String title, String author, String subject, int edition) {
        super(bookId, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    public String getSubject() {
        return subject;
    }

    public int getEdition() {
        return edition;
    }

    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public void displayBook() {
        System.out.println("===== Academic Book =====");
        System.out.println("Book ID     : " + getBookId());
        System.out.println("Title       : " + getTitle());
        System.out.println("Author      : " + getAuthor());
        System.out.println("Subject     : " + subject);
        System.out.println("Edition     : " + edition);
        System.out.println("Available   : " + (isAvailable() ? "Yes" : "No"));
        System.out.println();
    }
}