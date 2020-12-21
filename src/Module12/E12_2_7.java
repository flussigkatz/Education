package Module12;

import java.util.*;

public class E12_2_7 {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        List<Integer> firstArr = new ArrayList<>();
        List<Integer> secondArr = new ArrayList<>();
        List<Integer> thirdArr = new ArrayList<>(firstArr);
        for (int x = 1; x <= 10000000; x++){
            firstArr.add(random.nextInt());
            thirdArr.add(random.nextInt());
            secondArr.add(x);
        }
        List<Integer> arrayList1 = new ArrayList<>(firstArr);
        List<Integer> arrayList2 = new ArrayList<>(secondArr);
        List<Integer> arrayList3 = new ArrayList<>(thirdArr);


        long start2 = System.currentTimeMillis();
        arrayList1.stream().max(Comparator.naturalOrder());
        Collections.sort(secondArr);
        int i = thirdArr.size() -1;
        while (i >= 0) {
            arrayList3.remove(i);
            i--;
        }
        long finish2 = System.currentTimeMillis();

        Thread firstTread = new Thread(() -> {
            firstArr.stream().max(Comparator.naturalOrder());
        });
        Thread secondTread = new Thread(() -> {
            Collections.sort(secondArr);
        });
        Thread thirdTread = new Thread(() -> {
            int iter = thirdArr.size() - 1;
            while (iter >= 0) {
                thirdArr.remove(iter);
                iter--;
            }
        });

        long start1 = System.currentTimeMillis();
        firstTread.start();
        secondTread.start();
        thirdTread.start();

        firstTread.join();
        secondTread.join();
        thirdTread.join();
        long finish1 = System.currentTimeMillis();
        System.out.println("Threads  " + (finish1 - start1));
        System.out.println("Main  " + (finish2 - start2));
    }


    private static Runnable firstMeth(List<Integer> firstArr) {
        firstArr.stream().max(Comparator.naturalOrder());
        return null;
    }

    private static Runnable secondMeth(List<Integer> secondArr) {
        secondArr.stream().distinct().sorted();
        return null;
    }

    private static Runnable thirdMeth(List<Integer> thirdArr) {
        int i = thirdArr.size() - 1;
        while (i >= 0) {
            thirdArr.remove(i);
            i--;
        }
        return null;
    }


}
