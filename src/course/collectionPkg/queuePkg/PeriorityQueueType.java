package course.collectionPkg.queuePkg;

import java.util.PriorityQueue;
import java.util.Queue;

public class PeriorityQueueType {
    public static void main(String[] args) {
        Queue<String> myPerQue = new PriorityQueue<>();
        myPerQue.add("samer");
        myPerQue.add("vina");
        myPerQue.add("ankit");
        for (String myPer : myPerQue) {
            System.out.println(myPer);
        }
    }
}
