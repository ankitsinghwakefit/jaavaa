package course.interfacePkgTulu;

public class Index {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        // see below objects are of type Interface so that it can be used in method
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        // now dev can work on any device laptop or desktop
        dev1.work(laptop);
    }
}
