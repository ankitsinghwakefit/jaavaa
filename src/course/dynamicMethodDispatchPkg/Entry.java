package course.dynamicMethodDispatchPkg;

public class Entry {
    public static void main(String[] args) {
        PolymorphismOverriding p = new PolymorphismOverriding();
        p.show();
        // type is just a type but object creation is important to decide which method
        // will be called
        //

        // this is run time polymorphism or method overriding, it happens in case of
        // inheritance only
        Parent po = new PolymorphismOverriding();
        po.show();
    }
}
