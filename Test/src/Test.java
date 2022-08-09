class Multi implements Runnable{
    public void run(){
        System.out.println("New Thread is Created");
    }
}
class Test {
    public static void main(String[] args) {
     Multi m = new Multi();

     Thread th = new Thread(m);
     th.start();
     Thread th1 = new Thread(m);
     th1.start();

    }
}
