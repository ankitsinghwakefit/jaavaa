package course.abstractPkg;

public class Index {
    public static void main(String[] args) {
        // we can create object of a abstract class also if we define anonymous inner
        // class and define abstract method implementations
        Human h = new Human() {
            // one or multiple methods
            public String getName() {
                return "Human";
            }
        };
        System.out.println(h.getName());

    }
}
