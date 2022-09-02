/*
    1) By using Thread Class -->
        step 1: extend Thread class.
        step 2: override run method.
        step 3: create object of that class.
        step 4: Invoke start() method.
        Thread is successfully created.

class DemoThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is created successfully");
    }
}
public class Ways_To_Create_Thread {
    public static void main(String[] args) {
        DemoThread d = new DemoThread();
        d.start();
    }
}
 */

/*
     2) By using Runnable Interface -->
        step 1: implement Runnable interface.
        step 2: override run method.
        step 3: create object of that class.
        step 4: create object of Thread class and pass the reference of previous class in the parenthesis.
        step 5: Invoke start() method by thread class reference.
        Thread is successfully created.



class DemoThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is created successfully");
    }
}
public class Ways_To_Create_Thread {
    public static void main(String[] args) {
        DemoThread d = new DemoThread();
        Thread th = new Thread(d);
        th.start();
    }
}
 */

/*
     3) By using lambda Expression
 */
public class Ways_To_Create_Thread {
    public static void main(String[] args) {
        Runnable ref = () -> {
            System.out.println(Thread.currentThread().getName()+
                    ": is created successfully");
        };

        Thread th1 = new Thread(ref);
        Thread th2 = new Thread(ref);

        th1.start();
        th2.start();
    }
}
