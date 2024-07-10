package course.inheritancePkg;

// Inhertance is used for 2 purpose
// 1. to reuse code (all vars and methods are available in chid class)
// 2. for polymorphism ( to make copies )
public class Human {
    String name;
    int age;

    public void sleep() {
        System.out.println(name + " human can sleep");
    }

    // if we define below method as final then it can't be overridden in child
    // classes
    public void eat() {
        System.out.println(name + " human can eat");
    }

    // public Human(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }
}
