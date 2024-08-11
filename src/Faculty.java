public class Faculty extends Member{
    private static final int MAX_BORROWED_BOOKS = 10;

    public Faculty(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowBook(Book book) {
        if (getBorrowedBooks().size() < MAX_BORROWED_BOOKS) {
            super.borrowBook(book);
        } else {
            System.out.println("Faculty has reached the maximum limit of borrowed books.");
        }
    }
}
