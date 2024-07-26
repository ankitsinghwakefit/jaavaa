package course.threadTuluskoPkg.runnablePkg;

public class index extends Thread {
    public static void main(String[] args) {
        RunFirst f1 = new RunFirst();
        RunSecond f2 = new RunSecond();
        f1.start();
        f2.start();
    }
}
