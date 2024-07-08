package course.myPackageB;

import course.myPackageA.*;

public class ClassObj extends ClassIsInhiretedOfOjectClass {
    public static void main(String[] args) {
        ClassIsInhiretedOfOjectClass ob = new ClassIsInhiretedOfOjectClass();
        // below is example of constructor overloading check person class for more info
        Person ankit = new Person("Ankit", "Male", 68);
        // Person ankit = new Person("Ankit", 68);
        // ankit.name = "Ankit";
        // ankit.age = 68;
        // ankit.gender = "Male";
        ankit.sleep();
        // String name = "Ankit";
        // TestPrint myPrint = new TestPrint();
        // System.out.println(myPrint.printName(name));
        System.out.println("done");
    }
}
