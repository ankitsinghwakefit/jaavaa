package course.threadPkg;

public class ImplementsThreads implements Runnable {
    // synchronized run method will only allow one thread to run at a time in a
    // method but if we want to make some code block synchronous then use
    // synchronized block {}

    @Override
    public void run() {
        // below is synchronized block and we have to pass which object we have to block
        synchronized (this) {
            // in this case we are synchronizing only this block of code
            String[] words = { "a", "b", "c", "d" };
            try {
                // current thread will go for sleep for milliseconds
                Thread.sleep(2000); // it will delay execution for milliseconds and also throw InterruptedException
            } catch (InterruptedException e) {
                System.out.println("error handeled");
            }
            for (String word : words) {
                System.out.println("Thread is  " + Thread.currentThread().getName() + "  " + word);
            }
        }
    }

    public static void main(String[] args) {
        ImplementsThreads obj = new ImplementsThreads(); // create an object of class
        Thread t = new Thread(obj); // pass class obj to Thread constructor
        t.setName("thread one");
        Thread t2 = new Thread(obj);
        t2.setName("thread 2");
        Thread t3 = new Thread(obj);
        t3.setName("Thread 3");
        t.start();
        t2.start();
        t3.start();
    }
}
