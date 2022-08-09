import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

class Book{
    String name;
    String author;
    int quantity;

    public Book(String name,String author,int quantity){
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book["+"Book Name: "+name+", Book Author :"+author+", Quantity: "+quantity+"]";
    }
}

public class Book_Order {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Book Name :");
        String name = s.nextLine();
        System.out.println("Enter Author Name :");
        String author = s.nextLine();
        System.out.println("Enter Quantity :");
        int quantity = s.nextInt();

        Book b1 = new Book(name,author,quantity);

        LinkedList <Book> obj = new LinkedList<>();
        obj.add(b1);


        obj.forEach((n)->{
            System.out.println("Book Order Detail :");
            System.out.println(n);
        });

        //        Iterator itr = obj.iterator();
        //
        //        while (itr.hasNext()) {
        //            System.out.println("Book Order Detail :");
        //            System.out.println(itr.next());
        //        }

    }
}
