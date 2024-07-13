package course.collectionPkg.setPkg;

import java.util.LinkedHashSet;

public class LinkedHashSetType {
    // it will maintain the order of the elements (ordered) everything is common
    // with hashSet
    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("apple");
        linkedSet.add("banana");
        linkedSet.add("cherry");
        System.out.println(linkedSet); // see order is maintained
        linkedSet.addFirst("banana"); // added as first element
        System.out.println(linkedSet); // duplicate is removed
    }
}
