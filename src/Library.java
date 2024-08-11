import java.util.ArrayList;
import java.util.List;

// Singleton Pattern
public class Library {
    private static Library instance = null;
    private LibraryFactory factory;
    private List<Book> books;
    private List<Member> members;

    private Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.factory = new LibraryFactoryImp();
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // Methods to add books and members
    public void addBook(String title, String author, String isbn) {
        Book book = factory.createBook(title, author, isbn);
        books.add(book);
    }

    public void addMember(String name, String memberId) {
        Member member = factory.createMember(name, memberId);
        members.add(member);
    }

    // Methods to manage borrowing and returning books
    public void borrowBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book != null && member != null) {
            member.borrowBook(book);
        }
    }

    public void returnBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book != null && member != null) {
            member.returnBook(book);
        }
    }

    // Helper methods to find books and members
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) return book;
        }
        System.out.println("Book not found.");
        return null;
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) return member;
        }
        System.out.println("Member not found.");
        return null;
    }

    @Override
    public String toString() {
        return "Library [Books=" + books + ", Members=" + members + "]";
    }
}
