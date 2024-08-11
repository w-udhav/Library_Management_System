public class Student extends Member {
    private static final int MAX_BORROW_LIMIT = 3;

    public Student(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowBook(Book book) {
        if (getBorrowedBooks().size() < MAX_BORROW_LIMIT) {
            super.borrowBook(book);
        } else {
            System.out.println("Student has reached the maximum limit of borrowed books.");
        }
    }
}
