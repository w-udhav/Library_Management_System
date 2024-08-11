import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        library.addBook("1984", "George Orwell", "9780451524935");

        library.addMember("Alice", "M001");
        library.addMember("Bob", "M002");

        // Using strategy pattern for searching
        library.setSearchStrategy(new TitleSearchStrategy());
        List<Book> searchResults = library.searchBooks("1984");
        System.out.println("Search Results: " + searchResults);

        // Adding to waitlist and returning book
        library.borrowBook("9780743273565", "M001");
        library.addToWaitlist("9780743273565", "M002");
        library.returnBook("9780743273565", "M001");

        System.out.println(library);
    }
}