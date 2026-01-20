public class RunnableCustom implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable Thread "+Thread.currentThread().getName());
    }
}
