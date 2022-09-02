/*
        1) sleep() -->
        -Used to sleep the execution of current thread for particular time and wake after the time expired.
        - it throws compile time or checked exception i.e InterruptedException.(must be caught or thrown)
        - There are two sleep methods
            1) public static native sleep(long milli){}  (native) --> implementation is in another language
            2) public void sleep(long milli , int nano){}
        - we cannot provide millis,nanos in negative number otherwise it will throw runtime exception
            i.e IllegalArgumentException

class ThreadDemo implements Runnable{
    @Override
    public void run(){
        try{
            for (int i = 0; i <=5 ; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println();
        }
    }
}
public class Preventing_Thread_Execution_Methods {
    public static void main(String[] args) {

        ThreadDemo d = new ThreadDemo();

        Thread th = new Thread(d);
        th.start();
    }
}
*/

/*
     2) yield() -->
       This method stops current thread execution and provides the chance to the other thread
       to execute.

       Working -->
       In Java 5 --> it uses internally sleep() method.
       In Java 6 --> it provides hint to the thread scheduler, then it depends on thread scheduler
                    to accept or ignore the hint.
                    (hence we did not get constant output)

     Syntax --> public static native void yield();


class ThreadDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class Preventing_Thread_Execution_Methods {
    public static void main(String[] args) {

        ThreadDemo d = new ThreadDemo();

        Thread th = new Thread(d);
        th.start();
    // here we yield main thread i.e chance to execute other thread.
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
*/

/*
    3) join() -->
        - If a thread wants to wait for other thread to complete its task and then join it , then we should use
                   join() method.

        - join() are the 3 overloaded methods
            1. public final native void join() throws InterruptedException
            2. public final native void join(long millis) throws InterruptedException
            3. public final native void join(long millis,int nanos) throws InterruptedException

       - this method throws InterruptedException hence must be caught or thrown.

 Example 1: Here Thread-0 executes and main method wait for it and joins after execution.

class ThreadDemo implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Preventing_Thread_Execution_Methods {
    public static void main(String[] args) throws Exception {

        ThreadDemo d = new ThreadDemo();

        Thread th = new Thread(d);
        th.start();
        th.join(); // here main thread will wait until the thread-0 execution and join after that.

        for (int i = 1; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
Example 2: Here Main Thread executes and Thread-0 wait for its execution and joins.

 */
class ThreadDemo implements Runnable {
    // created static variable to store main thread address.
    static Thread mainThread;
    @Override
    public void run() {
        try {
            // used join method for main thread.
            mainThread.join();
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Preventing_Thread_Execution_Methods {
    public static void main(String[] args) throws InterruptedException {
        // here we store address of main thread in static variable mainThread.
        ThreadDemo.mainThread = Thread.currentThread();
        ThreadDemo d = new ThreadDemo();
        Thread th = new Thread(d);
        th.start();
        for (int i = 1; i < 6; i++) {
            Thread.sleep(1000);
            System.out.println("Main Thread :" + i);
        }
    }
}