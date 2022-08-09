import java.util.Scanner;

public class Palindrome_Number
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int num = n;
        int r, rev = 0;

        while (n != 0)
        {
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        if (num == rev)
        {
            System.out.println(num + " is palindrome number");
        } else
        {
            System.out.println(num + " is not palindrome number");
        }
    }
}
