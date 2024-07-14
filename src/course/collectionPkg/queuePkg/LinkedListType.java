package course.collectionPkg.queuePkg;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListType {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Ankit");
        myQueue.add("bina");
        myQueue.add("narresh");
        myQueue.add("bina");
        myQueue.add("narresh");
        System.out.println(myQueue); // see order is maintained
        System.out.println(myQueue.peek());
        myQueue.remove(); // will remove head ( first element)
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println(myQueue);
        for (String queue : myQueue) {
            System.out.println(queue);
        }
    }
}
