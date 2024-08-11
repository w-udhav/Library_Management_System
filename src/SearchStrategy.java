import java.util.ArrayList;
import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String query);
}

