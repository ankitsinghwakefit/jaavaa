package course.exceptionHandlingPkg;

public class StatementErrors {
    static String abc;

    public static void main(String[] args) {
        int i = 0;
        try {
            int j = 9 / i;
        } catch (ArithmeticException a) {
            System.out.println("give number greater than zero" + a);
        }

        int ab[] = new int[4];
        try {
            ab[5] = 10;
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("give number between 0 and 4" + a);
        }

        try {
            int len = abc.length();
        } catch (NullPointerException n) {
            System.out.println("null string" + n);
        }

        try {
            int l = 0;
            if (l == 0) {
                int k = 10 / 1;
                throw new IllegalStateException("give number greater than zero");
            } else {
                int k = 10 / l;
            }
        } catch (IllegalStateException I) {
            int k = 10 / 1;
            System.out.println("I don't want to divide by zero " + k);
        }

        System.out.println("hello");
    }
}
