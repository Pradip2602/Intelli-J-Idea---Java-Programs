import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Book {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101,"Wings of Fire","APJ Abdul Kalam"));
        books.add(new Book(102,"Game of Thrones","George Martin"));
        books.add(new Book(103,"Two states","Chetan Bhagat"));

        // sorting with comparator with respect to id :
        Collections.sort(books,(o1,o2) -> {
            return o1.getId() - o2.getId();
        });
        System.out.println(books);

        // Sorting with comparator with respect to author :
        Collections.sort(books,(o1,o2) -> {
            return o1.getAuthor().compareTo(o2.getAuthor());
        });
        System.out.println(books);

    }
}
