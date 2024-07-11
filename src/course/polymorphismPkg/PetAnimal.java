package course.polymorphismPkg;

public class PetAnimal extends Animal {

    // override methods
    // the argument list must be in the same order and have the same as super class
    // method
    // the return type should also be the same as super class method
    // the access level can't be more restricted than the overriden methods in
    // subclass
    // public > protected > default > private

    // set the access level from public to default in eat overiden method and see
    // the error
    public void eat() {
        System.out.println("pet animal eat milk");
    }

    public void walk() {
        System.out.println("pet animals walk " + getWalkSpeed());
    }

    public static void main(String[] args) {
        PetAnimal p1 = new PetAnimal();
        p1.setWalkSpeed("15 km/hr");
        p1.eat();
        p1.walk();
    }
}
