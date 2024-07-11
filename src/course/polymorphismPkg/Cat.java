package course.polymorphismPkg;

public class Cat extends PetAnimal {

    // method override happen at run time so its run time polymorphism

    // method overloading happen at compile time so its compile time polymorphism

    // rules for methos overloading
    // overloaded methods MUST change the argument list
    // overloaded methods CAN change the return type
    // overloaded methods CAN change the access modifier

    // below is override
    // public void eat() {
    // super.eat();
    // System.out.println("cat can drink milk");
    // }

    // below is overloading
    public String eat(String food) {
        System.out.println("cat eats " + food);
        return "overloaded";
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setWalkSpeed("speed 10km/hr");
        c.eat();
        c.walk();
    }
}
