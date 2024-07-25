package course.innerClassPkg;

public class ClassWithInnerClass {
    public void show() {
        System.out.println("ClassWithInnerClass show method");
    }

    static class InnerClassStatic {
        // for non-static methods we have to create object instance to access method
        public void showInner() {
            System.out.println("InnerClass showInner static class method");
        }

        // to access static methods we don't need to create object
        public static void staticInnerMethod() {
            System.out.println("staticInnerMethod InnerClassStatic method");
        }
    }

    class InnerClass {
        public void showInner() {
            System.out.println("InnerClass showInner method");
        }

        // to access static methods we don't need to create object
        public static void staticInnerMethod() {
            System.out.println("staticInnerMethod InnerClass method");
        }
    }
}
