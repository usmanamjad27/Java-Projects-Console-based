
import java.util.ArrayList;

public class S4_libraryUser {
    private String userName,userId;
    private ArrayList<S4_Book>borrowedBooks;

    public S4_libraryUser(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public ArrayList<S4_Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrow(S4_Book Book) {
        if (!Book.isborrowed()) {
            Book.borrowBook();
            borrowedBooks.add(Book);
            System.out.println("You borrowed a book from library is " + Book);
        } else {
            System.out.println("Sorry the book is already borrowed");
        }}
    public void Return (S4_Book Book){
        if(borrowedBooks.contains(Book)){
            Book.returnBook();
            borrowedBooks.remove(Book);
            System.out.println(Book + ", Successfully is removed from your list ");
        }}
    public void display () {
        for (S4_Book a : borrowedBooks) {
            System.out.println("- " + a.getTitle() + " (" + a.getBookId() + a.getAuthor() + " )");
        }
    }

}
