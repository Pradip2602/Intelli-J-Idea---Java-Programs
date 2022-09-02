/*
        1) interrupt() -->
        - This method is used to interrupt the thread execution.
        - interrupt() method will only work if thread is in sleeping or waiting state.(sleep() & wait())
        -  if thread is not in sleeping or waiting state then the thread will not get interrupted , it will
            execute normally (no use of interrupt()).
        - this method throws InterruptedException hence should be caught or thrown.

class InterruptDemo implements Runnable{
    @Override
    public void run() {
        try{
            for (int i = 1; i <6 ; i++) {
                System.out.println("Thread - 0 : "+i);
                // for interrupt method thread should be in sleep or wait state
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("Thread interrupted : "+e);
        }
    }
}
public class Interrupting_Thread_Methods {
    public static void main(String[] args) {
        InterruptDemo d = new InterruptDemo();

        Thread th = new Thread(d);
        th.start();
        th.interrupt();
    }
}
*/

/*
        2) interrupted()  & is Interrupted() -->
        - both methods are used to check whether the thread is interrupted or not
        - but In interrupted() -->
                                  if thread gets interrupted it will return true but then change the status to false
                                  (true -> false) hence thread gets executed normally.

        - but In isInterrupted() -->
                                  if thread gets interrupted it will return true and will not change its status
                                  thread gets interrupted and throw exception.

     2) interrupted() -->

     class InterruptDemo implements Runnable{
    @Override
    public void run() {
                System.out.println("First status : "+Thread.interrupted());
        try{
            System.out.println("Second status :"+Thread.interrupted());
            for (int i = 1; i <6 ; i++) {
                System.out.println("Thread-0 :"+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Interrupting_Thread_Methods {
    public static void main(String[] args) {
        InterruptDemo d = new InterruptDemo();
        Thread th = new Thread(d);
        th.start();
        th.interrupt();
    }
}
 */
    /*
            3) is Interrupted() -->
     */

class InterruptDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("First status : "+Thread.currentThread().isInterrupted());
        try{
            System.out.println("second status : "+Thread.currentThread().isInterrupted());
            for (int i = 1; i <6 ; i++) {
                System.out.println("Thread-0 :"+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Interrupting_Thread_Methods {
    public static void main(String[] args) {
        InterruptDemo d = new InterruptDemo();
        Thread th = new Thread(d);
        th.start();
        th.interrupt();
    }
}