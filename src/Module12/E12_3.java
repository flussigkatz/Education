package Module12;

public class E12_3 extends Thread {
    int i;

    public E12_3(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.print(i);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new E12_3(i).start();
        }
    }
}
