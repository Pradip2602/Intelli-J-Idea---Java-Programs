import java.util.Scanner;

public class Reverse_Number
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int r, rev = 0;

        while (num != 0)
        {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        System.out.println("The reverse of number is :" + rev);
    }
}
