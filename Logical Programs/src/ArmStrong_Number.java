import java.util.Scanner;

public class ArmStrong_Number
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int num = n;
        int len = 0;
//  checking the length of number
        while (num != 0)
        {
            len = len + 1;
            num = num / 10;
        }
//  checking the is armstrong or not
        int num2 = n;
        int r, arm = 0;

        while (num2 != 0)
        {
            int mult = 1;
            r = num2 % 10;
            for (int i = 1; i <= len; i++)
            {
                mult = mult * r;
            }
            arm = arm + mult;
            num2 = num2 / 10;
        }
        if (arm == n)
        {
            System.out.println(n + " is arm strong number");
        } else
        {
            System.out.println(n + " is not arm strong number");
        }
    }
}
