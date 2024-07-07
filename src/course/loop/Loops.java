package course.loop;

import java.util.Arrays;

public class Loops {
    Loops l = new Loops();
    static int year = 2000;

    public static void main(String[] args) {
        System.out.println(getAvg(1, 2, 3, 4, 5, 6));
        System.out.println(isLeapYear(year));
    }

    static float getAvg(int... args) {
        System.out.println(Arrays.stream(args).sum());
        int length = args.length;
        int i;
        int total = 0;
        for (i = 0; i < length; i++) {
            total += args[i];
        }
        return total / length;
    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
