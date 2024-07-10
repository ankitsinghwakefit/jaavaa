package course.inheritancePkg;

public class PolymorphismExample {
    // see how we are using below methods by passing parameter of classes and we
    // have access to all methods and vars defined
    public static void letsWalk(Human h) {
        h.eat();
        System.out.println(h.name);
    }

    public static void letsTryArtist(Artist a) {
        a.eat();
    }

    public static void main(String[] args) {
        Artist me = new Artist();
        me.name = "Ankit";
        letsWalk(me); // see as it's artist object it is first checking method in artist class then in
                      // human class because of inhertance
        letsTryArtist(me);

        Human he = new Human();
        he.name = "human";
        letsWalk(he); // it's a human object so checking in human only
        letsTryArtist(me);
    }
}
