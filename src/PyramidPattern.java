public class PyramidPattern {
    public static void main(String[] args) throws InterruptedException {
        int n = 5;



        class MyTask implements Runnable {
            @Override
            public void run() {
                System.out.println("Running");
            }
        }
        Thread t = new Thread(() -> {
            System.out.println("Task running");
        });

        t.start();
        Thread.sleep(10000);
        System.out.println("Main running");
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("Running");
            }
        }

        MyThread t1 = new MyThread();
        t1.start();


        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
