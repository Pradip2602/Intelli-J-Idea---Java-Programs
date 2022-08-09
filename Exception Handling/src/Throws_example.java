public class Throws_example {

    public void m1() throws NullPointerException{
        throw new NullPointerException("Cannot divide by zero");
    }
    public void m2() throws NullPointerException{
        m1();
    }

    public static void main(String[] args) {
        Throws_example th = new Throws_example();
        try{
            th.m2();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Normal flow");
    }
}
