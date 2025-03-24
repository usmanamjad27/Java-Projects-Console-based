public class S4_Book {
    private String bookId, title, Author;
    private boolean isborrowed;

    public S4_Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        Author = author;
        this.isborrowed = false;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public boolean isborrowed() {
        return isborrowed;
    }
    public void borrowBook(){
        isborrowed = true;
    }
    public void returnBook(){
        isborrowed =false;
    }
    public void displayBook() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + Author+
                ", Available: " + (!isborrowed? "Yes" : "No"));
    }
}
