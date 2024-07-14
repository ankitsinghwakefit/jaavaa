package course.threadPkg;

public class ExtendingThdread extends Thread {
    @Override
    public void run() {
        Integer[] nums = { 1, 2, 3, 4, 5 };
        for (Integer num : nums) {
            System.out.println(Thread.currentThread().getName() + num);
        }
    }

    public static void main(String[] args) {
        ExtendingThdread myThread = new ExtendingThdread();
        myThread.setName("thread one");
        myThread.start();
    }
}
