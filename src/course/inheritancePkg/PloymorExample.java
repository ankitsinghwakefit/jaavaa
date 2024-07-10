package course.inheritancePkg;

import course.myPackageA.TestPrint;

public class PloymorExample {
    public static void letsTryMorphism(TestPrint t) {
        t.testPoly();
        System.out.println(t.printName("ankit"));
        // System.out.println(t.age);
    }

    public static void main(String[] args) {
        TestPrint t = new TestPrint();
        letsTryMorphism(t);
    }
}
