package course.myPackageB.a1;

import course.myPackageB.a2.C;

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.sayHi();
        C c = new C();
        c.sayHi();
    }
}

class B {
    public void sayHi(){
        System.out.println("Hii in A");
    }
}
