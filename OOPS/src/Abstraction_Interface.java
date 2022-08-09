/*  Abstract class -->
    1) abstract class can contain static , concrete ,abstract methods,static varibless, instance variables and also
       can contain constructor.
    2) we cannot instantiate the abstract class(cannot create object of the class).
    3) if the class contain abstract method then we must the declare class as the abstract class.
    4) if any class extends abstract class then it must have implementation of abstract methods.
    5) we can achieve abstarction from(0-100% )

     Interface -->
     1) By interface we can achieve abstraction of 100%
     2) interface does not contain constructor hence cannot be instantiate.
     3) interface contains static concrete and abstract methods and public static final variables only.
     4) we can inherit the interface with "implements" keyword.
     5) if any class implements  interface then it must contain body of all abstract methods.
     6) we can achieve multiple inheritance in interface.
 */
abstract class MyClass {
    abstract void run();
    public MyClass() {
        System.out.println("abstract class constructor");
    }
    void display() {
        System.out.println("concrete method of absract class");
    }
    public static void m1(){

    }
}

interface I1 {
    abstract void show();

    public static void m1() {
        System.out.println("This is static method");
    }
}

class Demo implements I1 {
    public void show() {
        System.out.println("This is implemented method");
    }
}

class DemoClass extends MyClass {
    public void run() {
        System.out.println("body of abstract method");
    }
}


public class Abstraction_Interface {

    public static void main(String[] args) {
      // Abstraction
        DemoClass dc = new DemoClass();
        dc.run();
        dc.display();

      // Interface

      Demo d = new Demo();

      d.show();
      I1.m1();


    }
}
