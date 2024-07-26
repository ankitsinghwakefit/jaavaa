package course.threadTuluskoPkg;

public class Threads2 extends Thread {
    public void run() {
        System.out.println("Thread 2 started");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}
