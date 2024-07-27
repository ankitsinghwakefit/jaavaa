package course.threadTuluskoPkg.runnablePkg;

public class index {
    public static void main(String[] args) throws InterruptedException {

        Runnable f1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Running 1 " + i);
            }
        };
        Runnable f2 = new RunSecond();
        Thread t1 = new Thread(f2);
        Thread t2 = new Thread(f2);
        t1.start();
        t2.start();
        // asking main thread to first join other threads
        t1.join();
        t2.join();
        System.out.println(RunSecond.count);
        // sleep(miliseconds) > will pause the thread until (sleep) time is reached
        // (it will be in runnable state) but
        // the scheduler have to schedule this thread to (running state)

        // wait() can also be used to pause the thread but to resume the thread we have
        // to call notify() to move it to runnable state and then scheduler will take
        // care
    }
}
