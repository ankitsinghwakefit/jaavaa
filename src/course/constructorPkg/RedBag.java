package course.constructorPkg;

public class RedBag {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Bag bag1 = new Bag("red", 20);
        System.out.println(bag.color);
        System.out.println(bag1.color);
    }
}
