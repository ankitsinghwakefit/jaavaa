package course.threadPkg;

public class ThreadMethods implements Runnable {
    @Override
    public void run() {
        // threads have periority from 1 to 10
        // The default priority is set to 5 as excepted. NORM_PRIORITY
        // Minimum priority is set to 1. MIN_PRIORITY
        // Maximum priority is set to 10. MAX_PRIORITY

        try {
            System.out.println(Thread.currentThread().getName() + "thread entered in run method");
            Thread.sleep(10000);
            synchronized (this) {
                System.out.println("notify all threads");
                this.notifyAll();// after this waiting thread will start running
            }
            // String[] words = { "a", "b", "c", "d", "e" };
            // for (String word : words) {
            // System.out.println(Thread.currentThread().getName() + " " + word);
            // }
        } catch (InterruptedException e) {
            System.out.println("Error captured");
        }

    }

    public void letsWait() {
        System.out.println(Thread.currentThread().getName() + "thread entered in letswait method");
        synchronized (this) {
            try {
                wait(); // it will pause the thread until the thread will be notified to start again
                System.out.println(Thread.currentThread().getName() + "thread wakeup in letsrun method");
            } catch (InterruptedException e) {
                System.out.println("Error captured");
            }
        }
    }

    public static void main(String[] args) {
        ThreadMethods obj = new ThreadMethods();
        Thread t1 = new Thread(obj);
        // Thread t2 = new Thread(obj);
        // Thread t3 = new Thread(obj);
        t1.setName("Thread 1");
        // t2.setName("Thread 2");
        // t3.setName("Thread 3");
        t1.start();
        // t2.start();
        // t3.start();
        obj.letsWait(); // we are making main thread wait
    }
}
