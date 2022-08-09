
/*
    MultiThreading :
        Thread --> Threads are the smallest unit n process which share same memory space between each other.
        - each process consist of multiple threads which are running simultaneously.
        - multiprocessing and multithreading are used to achieve multitasking in java.
        - Threads are the lightweight because its shares same memory space.
        - context switching is very fast in multithreading.

      ** States of Thread -->
      New,Active, Runnable, Running, Blocked/Waiting, Timed Waiting, Terminated.

       ** Two ways to create Threads in java
           1) by extending Thread class
           2) by implementing Runnable interface.

 */
class Test extends Thread{
    public void run(){
        System.out.println("Thread is created by Thread class");
    }
}
class Test1 implements Runnable{
    public void run(){
        System.out.println("Thread is created by Runnable Interface");
    }
}
public class Multi_Threading {
    public static void main(String[] args) {

        // by using Thread Class
        Test t1 = new Test();
        t1.start();

       // using Runnable interface
       Thread th1 = new Thread(t1);
       th1.start();

    }
}
