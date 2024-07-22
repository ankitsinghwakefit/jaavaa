package course.constructorPkg;

public class Bag {
    String color;
    int capacity;
    // constructor is similar to a method and have same name as of class and do not
    // return anything
    // constructor is a block of code that initialize the state and value during
    // object creation

    // parameterized constructor
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    // default constructor
    public Bag() {
        color = "Black";
        capacity = 10;
    }
}
