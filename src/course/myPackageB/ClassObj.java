package course.myPackageB;

import course.myPackageA.*;

public class ClassObj {
        public static void main(String[] args) {
            Person ankit = new Person();
            ankit.name = "Ankit";
            ankit.age = 68;
            ankit.gender = "Male";
            ankit.sleep();
            String name = "Ankit";
            TestPrint myPrint = new TestPrint();
            System.out.println(myPrint.printName(name));
        }
}
