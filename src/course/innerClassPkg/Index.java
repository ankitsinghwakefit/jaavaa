package course.innerClassPkg;

public class Index {
    public static void main(String[] args) {

        ClassWithInnerClass pClass = new ClassWithInnerClass();
        pClass.show();

        // to access inner classes we need object of parent
        ClassWithInnerClass.InnerClass inner = pClass.new InnerClass();
        inner.showInner();

        // to access static inner classes we don't need object
        ClassWithInnerClass.InnerClassStatic innerStatic = new ClassWithInnerClass.InnerClassStatic();
        innerStatic.showInner();

        // if a method is static so we can access method directly without creating a new
        // object
        ClassWithInnerClass.InnerClass.staticInnerMethod();
        ClassWithInnerClass.InnerClassStatic.staticInnerMethod();
    }
}
