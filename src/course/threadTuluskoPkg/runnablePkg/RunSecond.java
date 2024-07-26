package course.threadTuluskoPkg.runnablePkg;

public class RunSecond implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running 1 -" + i);
        }
    }
}
