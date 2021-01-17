package Module12;

public class E12_2_3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(500);
                Thread.currentThread().start(); // 1
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start(); // 2
        t1.join();
    }

}
