package course.abstractPkg;

// if any method is defined as an abstract method then the class definition will be abstract
// abstract class are 50% class and 50% interface
// as it can define method implementations like classes and also have method declarations like interfaces

public abstract class Human {
    public abstract String getName();

    public void canWalk() {
        System.out.println("abstract HUmn can walk");
    }

    // default methods are only for interface methods not for abstract class methods
}
