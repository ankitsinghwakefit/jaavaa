package course.threadTuluskoPkg;

public class Index {
    public static void main(String[] args) {
        Threads t1 = new Threads();
        Threads2 t2 = new Threads2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
