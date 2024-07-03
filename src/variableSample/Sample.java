package variableSample;

public class Sample {
    // vaiables defined outside of any method is called instance variable and if
    // any value is not assigned then it will take default value
    byte one; // 0 > 1 byte
    short two; // 0 > 2 byte
    int three; // 0 > 4 byte
    long four; // 0 > 8 byte
    float five; // 0.0 > 4 byte
    double six; // 0.0 > 8 byte
    boolean seven; // false
    char eight; // \u0000
    // all above defined vars are premitive type

    static String name = "Ankit";
//     above is called refrence type variable

    static long tooLongNumber = 12345678901123l; // ends with L ( small or caps)

    public static void main(String[] args) {
        // variable defined inside method is call local variable and
        // they must be iniciated with some value else it will give error
        boolean localVar = false;
        char singleQuote = 'm';
        float decimalNum = 12.12f; // ends with F ( caps or small )
                // because this is static method thus we need to create one instance of this class
        // to access instance variables
        Sample s = new Sample();

        System.out.println(s.one);
        System.out.println(s.two);
        System.out.println(s.three);
        System.out.println(s.four);
        System.out.println(s.five);System.out.println(s.six);
        System.out.println(s.seven);System.out.println(s.eight);
        System.out.println(localVar);
        System.out.println(singleQuote);
        System.out.println(name);
        System.out.println(tooLongNumber);
    }
}
