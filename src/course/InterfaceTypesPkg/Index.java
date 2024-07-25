package course.InterfaceTypesPkg;

public class Index {
    public static void main(String[] args) {
        // Normal inner ananomous class

        // FunctionalInterface f = new FunctionalInterface() {
        // public int add(int value) {
        // System.out.println(value + 1);
        // return value + 1;
        // }
        // };
        // f.add(2);

        // Lamda expression only works with functional interfaces

        FunctionalInterface f2 = (value) -> {
            System.out.println(value + 1);
            return value + 1;
        };
        f2.add(2);
    }
}
