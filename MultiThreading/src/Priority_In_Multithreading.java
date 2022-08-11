/*
 Priorities in Multithreading -->
   - priorities are given to the thread which decides that which thread will get allocate to the processor first.
   - According to these priorities JVM will allocate the processor.
   - Priorities are given in the form of Integer value from 1 to 10
            ** Some constant also given by default in java
            1 --> MIN_PRIORITY
            5 --> NORM_PRIORITY
           10 --> MAX_PRIORITY

   - we cannot set priority below 0 and greater than 10.otherwise it will throw run-time exception i.e IllegalArgumentException.
   - Nature of Priorities --> Child thread priority is inherited by default from parent thread but we can change it
                                 according to our needs.
   - Priorities are depends on the platform(operating systems) Windows does not support priorities.
   - windows does not support priority hence might get inaccurate output.

 */
class Demo1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Child Thread Priority :"+Thread.currentThread().getPriority());
        System.out.println("Child Thread");
    }
}
public class Priority_In_Multithreading {
    public static void main(String[] args) {
        System.out.println("Main thread old Priority :"+Thread.currentThread().getPriority());
        Demo1 d = new Demo1();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main thread new Priority :"+Thread.currentThread().getPriority());
        Thread th = new Thread(d);
        th.start();

    }
}
