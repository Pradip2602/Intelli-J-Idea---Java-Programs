
/*
      Daemon Thread :
       - Daemon thread are the thread which runs in the background of another thread and provides service to that thread.
       - EX. garbage collector,finalizers,Attach Listeners, signal dispatchers.
       - The life of daemon thread is depends on the parent thread.
       - Daemon thread inherits the nature/properties of the parent thread.
       - most of the time, daemon thread has low priority, but we can change it according to  our needs.
       - JVM does not depends on daemon thread. if all thread gets executed but only daemon thread is running then
         JVM will kill that thread and shutdown the work.

     Notes -->
     1) we have to create daemon thread before starting the thread. otherwise it will throw runtime exception
        i.e IllegalThreadStateException.
    2)  we cannot set main thread as a daemon thread.

 */
class Demo implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("This is Daemon Thread");
    }
}
public class Daemon_Thread {
    public static void main(String[] args) {
        System.out.println("This is Main Thread");
        Demo d = new Demo();

        Thread th = new Thread(d);
     // we must create daemon thread before the start().
        th.setDaemon(true);
        th.start();
    }
}
