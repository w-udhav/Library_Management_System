import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private Boolean isBorrowed;
    private List<Member> waitlist = new ArrayList<>();

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void addToWaitlist(Member member) {
        waitlist.add(member);
    }

    public void notifyWaitlist() {
        for (Member member : waitlist) {
            System.out.println("Notification: " + member.getName() + ", the book " + title + " is now available.");
        }
    }

    public void borrowBook() {
        this.isBorrowed = true;
    }
    public void returnBook() {
        this.isBorrowed = false;
        notifyWaitlist();
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", ISBN=" + isbn + ", Is Borrowed=" + isBorrowed + "]";
    }

}
