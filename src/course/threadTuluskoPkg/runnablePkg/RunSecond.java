package course.threadTuluskoPkg.runnablePkg;

public class RunSecond implements Runnable {
    static int count;

    public void run() {
        // chance is that both threads come simultaneously to run testRace and thus
        // count will be incremented by 1 but it should be 2
        for (int i = 0; i < 1000; i++) {
            testRace();
        }
    }

    // synchronized keyword is used to make sure that only one thread can execute
    // this
    public synchronized static void testRace() {
        count++;
    }
}
