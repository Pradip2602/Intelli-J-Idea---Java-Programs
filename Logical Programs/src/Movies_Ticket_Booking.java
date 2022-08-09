import java.util.ArrayList;
import java.util.Scanner;

class Movie{
    String name;
    static int no_Of_Tickets;
    static int price;

    public Movie(String name,int no_Of_Tickets,int price){
        this.name = name;
        this.no_Of_Tickets = no_Of_Tickets;
        this.price = price;
    }
    static void getPrice(){
        double total_Amount = no_Of_Tickets * price;
        double gst = total_Amount*0.18;
        double total_Amount_With_GSt = total_Amount+gst;
        System.out.println("The total ticket price with GST is: \n"+total_Amount_With_GSt);
    }

    @Override
    public String toString() {
        return "["+"Movie Name: "+name+",No of Tickets: "+no_Of_Tickets+"]";
    }
}
public class Movies_Ticket_Booking {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Movie Name :");
        String name = s.nextLine();
        System.out.println("No of Tickets :");
        int no_Of_Tickets = s.nextInt();
        System.out.println("Price of Tickets :");
        int price = s.nextInt();

        Movie m1 = new Movie(name,no_Of_Tickets,price);

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(m1);
        movies.forEach((n)->{
            System.out.println("Ticket Booked Deatails");
            System.out.println(n+"\n");
        });
        Movie.getPrice();
    }
}
