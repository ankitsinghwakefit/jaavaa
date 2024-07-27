package course.interfacePkg;

public class Artist implements Human, PlayKeyboard {
    public void eat() {
        System.out.println("artist can eat");
    }

    // since play method is default and also defined in both inerface so we must
    // inform JVM which interface method to invoke
    public void play() {
        // Human play method is invoked
        // Human.super.play();
        // PlayKeyboard play method is invoked
        PlayKeyboard.super.play();
    }

    public void walk() {
        System.out.println("artist can walk");
    }

    public void sleep() {
        System.out.println("artist can sleep");
    }

    public static void main(String[] args) {
        Artist a = new Artist();
        a.eat();
        a.play();
        Human h = new Artist();
        h.play();
        // we can utitlize final vars from intterfaces
        // System.out.println(h.EYES_COUNT);
        PlayKeyboard p = new Artist();
        p.play();
    }
}
