public class LibraryFactoryImp implements LibraryFactory{
    @Override
    public Book createBook(String title, String author, String isbn) {
        return new Book(title, author, isbn);
    }

    @Override
    public Member createMember(String name, String memberId) {
        return new Member(name, memberId);
    }
}
