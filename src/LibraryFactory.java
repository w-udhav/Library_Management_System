public interface LibraryFactory {
    Book createBook(String title, String author, String isbn);
    Member createMember(String name, String memberId);
}
