package course.collectionPkg.listPkg;

import java.util.Vector;

public class VectorListType {
    // ArrayList and Vector are same only difference is
    // Vector is synchronized thus slow but ArrayList is not synchronized
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);
    }
}
