import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    // Initiating
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            borrowedBooks.add(book);
            book.borrowBook();
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (book.isBorrowed()) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.println("This book was not borrowed by this member.");
        }
    }


    @Override
    public String toString() {
        return "Member [Name=" + name + ", Member ID=" + memberId + ", Borrowed Books=" + borrowedBooks + "]";
    }
}
