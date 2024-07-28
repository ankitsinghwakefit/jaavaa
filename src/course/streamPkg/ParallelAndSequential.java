package course.streamPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelAndSequential {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> numbers = new ArrayList<Integer>(size);
        Random ran = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(ran.nextInt(size));
        }

        long s1 = System.currentTimeMillis();
        int sum = numbers.stream().map(n -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
            return n * 2;
        }).reduce(0, (a, b) -> a + b);
        long s2 = System.currentTimeMillis();

        long s3 = System.currentTimeMillis();
        int sum2 = numbers.parallelStream().map(n -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
            return n * 2;
        }).reduce(0, (a, b) -> a + b);
        long s4 = System.currentTimeMillis();

        System.out.println("sum1 " + sum + " time " + (s2 - s1));
        System.out.println("sum2 " + sum2 + " time " + (s4 - s3));
    }
}
