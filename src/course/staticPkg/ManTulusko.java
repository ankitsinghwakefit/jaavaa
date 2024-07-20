package course.staticPkg;

public class ManTulusko {
    static {
        System.out.println("ManTulusko static blog");
    }

    public static void main(String[] args) {
        StaticTulusko staticTulusko = new StaticTulusko();
        staticTulusko.age = 20;
        staticTulusko.gender = "Male";
        staticTulusko.printMsg();
        // staticTulusko.name = "ManTulusko"; // static vaiable is definded on class not
        // on objects

        System.out.println(StaticTulusko.name); // static vaiable can be accessed using class
        StaticTulusko.printStaticMsg(staticTulusko);
    }
}
