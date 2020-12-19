package Module12;

public class Deadlock implements Runnable {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Deadlock deadlock = new Deadlock();
        new Thread(deadlock).start();
        new Thread(deadlock).start();
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) + " ms"); // замеряем время выполнения
    }

    @Override
    public void run() {
        doTask1();
        doTask2();
    }
    private void doTask1() {
        synchronized (lock1) {
             {
                System.out.println("Doing task 1");
            }
        }
    }

    private void doTask2() {
        synchronized (lock2) {
             {
                System.out.println("Doing task 2");
            }
        }
    }

}