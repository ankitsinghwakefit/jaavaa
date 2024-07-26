package course.threadTuluskoPkg.runnablePkg;

public class RunFirst implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running 1 -" + i);
        }
    }
}
