import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

public class Voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age :");

        try {
            int age = s.nextInt();
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible");
            } else {
                System.out.println("You are voted Successfully");
            }
        } catch (YoungerAgeException e) {

        }
        System.out.println("Voting ended");
    }
}


