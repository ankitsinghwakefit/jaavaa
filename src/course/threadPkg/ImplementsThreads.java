package course.threadPkg;

public class ImplementsThreads implements Runnable {

    @Override
    public void run() {
        String[] words = { "a", "b", "c", "d" };
        for (String word : words) {
            System.out.println("Thread is  " + Thread.currentThread().getName() + "  " + word);
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
