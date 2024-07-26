package course.threadTuluskoPkg;

public class Threads extends Thread {
    public void run() {
        System.out.println("Thread 1 started");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: " + i);
        }
    }
}
