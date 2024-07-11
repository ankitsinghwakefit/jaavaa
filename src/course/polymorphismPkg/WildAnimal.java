package course.polymorphismPkg;

public class WildAnimal extends Animal {
    public void eat() {
        System.out.println("wild animal eat meat");
    }

    public void walk() {
        System.out.println("wild animals walk " + getWalkSpeed());
    }

    public static void main(String[] args) {
        WildAnimal w1 = new WildAnimal();
        w1.setWalkSpeed("20 km/hr");
        w1.eat();
        w1.walk();
    }
}
