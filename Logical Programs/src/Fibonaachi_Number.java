
public class Fibonaachi_Number
{
    public static void main(String[] args)
    {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int c;
        for (int i = 0; i < 10; i++)
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
