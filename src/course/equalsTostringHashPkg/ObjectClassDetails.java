package course.equalsTostringHashPkg;

// System we have not imported its by default importing Lang Java package
public class ObjectClassDetails {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ParentClass parent2 = new ParentClass();
        parent.name = "me";
        parent2.name = "me";
        // see both the below lines are printing same details because by default
        // toString is called from parent Object class
        System.out.println(parent);
        System.out.println(parent.toString());
        // I have overridden toString in ParentClass not see it's returning different
        System.out.println(parent == parent2);
        // see here we have overridden equals in ParentClass to check if both are equal
        System.out.println(parent.equals(parent2));
    }

}
