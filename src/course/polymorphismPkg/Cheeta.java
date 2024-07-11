package course.polymorphismPkg;

public class Cheeta extends WildAnimal {
    public void eat() {
        super.eat();
        System.out.println("cheeta can drink blood");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setWalkSpeed("speed 90km/hr");
        c.eat();
        c.walk();

        Cheeta che = new Cheeta();
        che.eat();
        che.walk();
    }
}
