//A library wants to develop a Library Management System that allows users to borrow and return books
//while ensuring proper access control.
//         A LibraryUser class with attributes userId, userName, and a list of borrowed books.
//         A Book class with attributes bookId, title, and author.
//         A Library class that maintains a collection of books and manages borrowing and returning (use
//        Composition).
//Problem Statement:
//         Implement the LibraryUser, Book, and Library classes using OOP principles.
//         Ensure proper encapsulation to prevent unauthorized modification of book data.
//         Demonstrate object creation, book borrowing, and returning operations.
public class S4_Library_Management_System {
    public static void main(String[] args) {
        // Create a library
        S4_library library = new S4_library();

        // Add books to the library
        S4_Book book1 = new S4_Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        S4_Book book2 = new S4_Book("B002", "1984", "George Orwell");
        S4_Book book3 = new S4_Book("B003", "To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("---------------------------");

        // Display available books
        library.displayBooks();

        System.out.println("---------------------------");

        // Create a library user
        S4_libraryUser user = new S4_libraryUser("Usman Amjad", "sp24_bcs_067");

        // Borrow books
        user.borrow(book1);
        user.borrow(book2);

        System.out.println("---------------------------");

        // Display borrowed books
        user.display();

        System.out.println("---------------------------");

        // Try borrowing an already borrowed book
        user.borrow(book1); // Should show an error

        System.out.println("---------------------------");

        // Return a book
        user.Return(book1);

        System.out.println("---------------------------");

        // Display updated library books
        library.displayBooks();

    }
}
