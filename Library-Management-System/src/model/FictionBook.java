package model;

public class FictionBook extends Book {

    private String genre;

    public FictionBook(int bookId, String title, String author, String genre) {
        super(bookId, title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayBook() {
        System.out.println("===== Fiction Book =====");
        System.out.println("Book ID     : " + getBookId());
        System.out.println("Title       : " + getTitle());
        System.out.println("Author      : " + getAuthor());
        System.out.println("Genre       : " + genre);
        System.out.println("Available   : " + (isAvailable() ? "Yes" : "No"));
        System.out.println();
    }
}