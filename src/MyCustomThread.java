public class MyCustomThread extends Thread{
   public void run(){
       System.out.println("this is my new thread "+Thread.currentThread().getName());
    }
}

class ThreadMain{
    public static void main(String[] args) {
        MyCustomThread t1 = new MyCustomThread();
        t1.start(); //spawn a new thread or say create a new thread
        MyCustomThread t2 = new MyCustomThread();
        t2.start(); // in thread call everytime i have to create new object

        RunnableCustom r1 = new RunnableCustom();
        Thread thread = new Thread(r1);// we have to create class object only once then we can create multiple threads after that
        thread.start();
        Thread thread1 = new Thread(r1);
        thread1.start();
        Thread thread2 = new Thread(r1);
        thread2.start();
    }
}
