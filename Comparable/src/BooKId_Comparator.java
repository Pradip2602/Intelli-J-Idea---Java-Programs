import java.util.Comparator;

public class BooKId_Comparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getId() - o2.getId();
    }
}
