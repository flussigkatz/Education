package Module12;

import java.util.concurrent.*;

public class E12_6_2 {
    /*public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // 1

            System.out.println("Begin");
            service.execute(() -> System.out.println("Printing zoo inventory")); // 2
            service.execute(() -> { // 3
                for (int i = 0; i < 3; i++) {
                    System.out.println("Printing record: " + i);
                }
            });
            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() -> System.out.println("End_Exe"));
            System.out.println("End_Main");
        } finally {
            if (service != null) {
                service.shutdown(); // 4
            }
        }
    }*/


    public static void main(String[] args) {
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();

            Future<Integer> result = service.submit(() -> { // строка 1
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(100); // строка 2
                }
                return 10; // строка 3
            });
            int intResult = result.get(200, TimeUnit.MILLISECONDS);
            System.out.println("Result is: " + intResult);
        } catch (InterruptedException exception) {
            System.out.println("Thread interrupted");
        } catch (ExecutionException e) {
            System.out.println("Exception occurred while doing the task");
        } catch (TimeoutException e) {
            System.out.println("Time expired");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }

}
