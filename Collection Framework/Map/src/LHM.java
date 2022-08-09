import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LHM {
    public static void main(String[] args) {

        LinkedHashMap <String,String> books = new LinkedHashMap<>();

        books.put("Game of Thrones","George RR Martin");
        books.put("Wings of Fire","APJ kalam") ;
        books.put("Antman","Stanley");

//        System.out.println(books);

        // getting keys and values by Iterator.
        Iterator<Map.Entry<String,String>> itr = books.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<String,String> entry = itr.next();
            System.out.println("Book = "+entry.getKey()+"\n"+
                                "Author = "+entry.getValue()+"\n********************************");
        }

//         Getting keys and Values by For each loop.
//        for (String name: books.keySet()) {
//            System.out.println("Book name :"+name);
//        }
//        for (String author:books.values()) {
//            System.out.println("Author name :"+author);
//        }
    }
}
