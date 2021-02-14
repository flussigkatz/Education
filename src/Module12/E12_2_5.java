package Module12;

public class E12_2_5 extends Thread {

    /*@Override
    public void run() {
        try {
            System.out.println("Thread started");
        } catch (InterruptedException exception) {
            System.out.println("Thread interrupted");
        }
    }
*/    public static void main(String[] args) {
        Thread thread = new E12_2_5();
        thread.start();
        thread.interrupt();
    }
}
