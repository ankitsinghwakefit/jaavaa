package course.interfacePkgTulu;

public class Developer {
    // see in method it's taking object of type interface so that this method do not
    // depend on class
    public void work(Computer device) {
        device.code();
    }
}
