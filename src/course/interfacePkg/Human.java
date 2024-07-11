package course.interfacePkg;

public interface Human {
    // interface notes
    // interface is a blueprint of class that implements the interface
    // interface methods must not be static
    // interface methods CANNOT be marked as final, strictfp, and native
    // interface cannot contain constructor
    // interface can extend multiple interfaces

    // interface variables are public final and static
    public int EYES_COUNT = 2;
    public int LEGS_COUNT = 2;

    void eat();

    // interface methods are automatically public and abstract
    void sleep();

    void walk();

    // interface is a collection of public abstract methods except the default
    // methods
    default public void play() {
        System.out.println("Human interface can play");
    };
}
