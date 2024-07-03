package course.myPackageB.a2;

public class C {
    public void sayHi(){
        System.out.println("Hii IN C");
    }
}

class D {
    public static void main(String[] args) {
        C c = new C();
        c.sayHi();
    }
}
