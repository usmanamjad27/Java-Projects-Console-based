import java.util.ArrayList;

public class S4_library {

    private ArrayList<S4_Book> books; // Collection of books in the library

    // Constructor to initialize the library
    public S4_library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(S4_Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle() + " by " + book.getAuthor());
    }

    // Find a book by its ID
    public S4_Book findBookById(String bookId) {
        for (S4_Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            System.out.println("Library Books:");
            for (S4_Book book : books) {
                book.displayBook();
            }
        }
    }
}


