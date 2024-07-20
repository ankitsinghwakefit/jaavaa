package course.staticPkg;

public class StaticTulusko {
    static String name = "StaticTulusko";
    public int age;
    public String gender;

    public void printMsg() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old");
    }

    public static void printStaticMsg(StaticTulusko obj) {
        System.out.println("Hello, my name is static " + name + " and I am " + obj.age);
    }

    // static block is called when class is loaded for the first time so it will be
    // called before the
    // constructor is called as the constructor is called when we create objects

    // static block is used to instantiate static variables
    static {
        name = "StaticTulusko2";
        System.out.println("StaticTulusko static blog");
    }
}
