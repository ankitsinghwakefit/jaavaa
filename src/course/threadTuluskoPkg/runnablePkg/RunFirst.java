package course.threadTuluskoPkg.runnablePkg;

public class RunFirst implements Runnable {
    // Runnable is a functional interface
    // It has only one abstract method (run())
    // this is implementing functional interface and have only 1 method so using
    // ananomous class we can avoid defining this class
    @Override // required by Runnable interface to declare the method signature. // This
              // method will be called when the thread runs. // The run() method is the entry
              // point for a thread of execution. // Inside the run() method, you can put the
              // code that needs to be executed by the thread. // The run() method is called
              // by the start() method of the Thread class. // The run() method is executed in
              // the context of the thread that calls it.
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running 1 -" + i);
        }
    }
}
