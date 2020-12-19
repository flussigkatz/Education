package Module12;


public class E12_2_2  extends Thread{
    @Override
    public void run() {
        System.out.println("extends");
    }

    public static void main(String[] args) {
        E12_2_2_second_part impl = new E12_2_2_second_part();
        Thread implThread = new Thread(impl);
        new E12_2_2().start();
        implThread.start();
        new Thread(() -> System.out.println("lambda")).start();
    }
}
