package Module12;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            public void run(){
                for (int i = 0; i < 500; i++) {
                    CheckResults.counter++;
                }
            }
        }.start();
        while (CheckResults.counter < 500) {
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 секунда
        }
        System.out.println("Reached");
    }

}
