package course.upAndDownCastingPkg;

public class Index {
    public static void main(String[] args) {
        SteelBottle s = new SteelBottle();
        s.show1();
        s.show2();
        Bottle b = new SteelBottle();
        b.show1(); // will call show1 from Bottle class
        // b.show2(); // this is error as how it can be possible that parent will have
        // the method of child as child will come after the parent

        SteelBottle d = (SteelBottle) b; // downCasting as we are converting parent reference to child reference
        d.show2(); // now it can access to show2
    }
}
