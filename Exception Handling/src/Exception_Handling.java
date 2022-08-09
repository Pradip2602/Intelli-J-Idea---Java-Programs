import java.io.FileInputStream;

public class Exception_Handling {
    public static void main(String[] args) {
        // Checked Exception :
        try {
            FileInputStream fis = new FileInputStream("d:/abc.text");
        }
        catch (Exception e){
            System.out.println(e);
        }

        // UnChecked Exception:
        try{
            int a = 100 , b = 0, c;
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e ){
            System.out.println(e);
        }
        System.out.println("Program ended");
    }
}
