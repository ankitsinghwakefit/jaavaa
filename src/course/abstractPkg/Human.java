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

// TULUSKO
// class can be abstract without any abstract method but vice versa is not
// allowed

// we can not create object of abstract class, object can only be created of
// class that extends abstract class

// NOTE > we can create anonymous Inner class and implement abstract methods