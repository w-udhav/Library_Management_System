import java.util.ArrayList;
import java.util.List;
public class TitleSearchStrategy implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results;
    }
}
