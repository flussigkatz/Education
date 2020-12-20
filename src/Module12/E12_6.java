package Module12;

import java.util.concurrent.*;

public class E12_6 {
    public static void main(String[] args) {
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
    }
}
