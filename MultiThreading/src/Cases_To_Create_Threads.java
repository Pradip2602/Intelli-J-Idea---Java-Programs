
/* 1. perform single task from single thread.

class Cases implements Runnable {
    @Override
    public void run() {
        System.out.println("this is single task");
    }
}
public class Cases_To_Create_Threads{
    public static void main(String[] args) {
        Cases c = new Cases();

        Thread th = new Thread(c); // single thread
        th.start();

    }
}  */

/* 2. perform single task from multiple thread.

class Cases implements Runnable {
    @Override
    public void run() {
        System.out.println("this is single task");
    }
}
public class Cases_To_Create_Threads{
    public static void main(String[] args)      // main Thread
    {
        Cases c = new Cases();

        Thread th = new Thread(c); // thread 1
        th.start();
        Thread th1 = new Thread(c); // thread2
        th.start();

    }
}
*/


/*
       3. perform multiple task from single thread -->
        Thread are the sub-part of process or task . for multiple task we have to create multiple thread ,
        hence we cannot perform multiple task from single thread.

 */


// 4. perform multiple task from multiple thread.

class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println("First task");
    }
}
class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Second task");
    }
}
class Task3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Third task");
    }
}
public class Cases_To_Create_Threads{
    public static void main(String[] args)      // main Thread
    {
       // creating Multiple Task
        Task1 task1 =new Task1();
        Task2 task2 =new Task2();
        Task3 task3 =new Task3();

       // creating multiple Threads
        Thread th1 = new Thread(task1);
        th1.start();

        Thread th2 = new Thread(task2);
        th2.start();

        Thread th3 = new Thread(task3);
        th3.start();
    }
}
