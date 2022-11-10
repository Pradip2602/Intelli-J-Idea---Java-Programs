import java.util.Scanner;

public class Prime_Number {
   static void prime(int n){
        int temp = 0;
        if(n!=0){
            for (int i = 2; i <=n-1 ; i++) {
                if (n%i==0){
                    temp++;
                }
            }
            if(temp==0){
                System.out.println(n+" is prime");
//                System.out.println(n);
            }else{
                System.out.println(n+" is not prime");
            }
        }
    }
    public static void main(String[] args) {
        // write code here......
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        prime(n);

//        for (int i = 2; i <200 ; i++) {
//            prime(i);
//        }

    }
}
