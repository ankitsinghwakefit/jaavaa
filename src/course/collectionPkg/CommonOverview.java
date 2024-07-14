package course.collectionPkg;

public class CommonOverview {
    // 4 types of collections

    // interface
    // classes that implements above interface

    // List - ordered collection of elements, allows duplicate values, maintains
    // insertion order
    // ArrayList, LinkedList, Vector

    // Set - unordered collection of elements, does not allow duplicate values
    // HashSet (no order) (else no diff ) LinkedHashSet (insetion order will be
    // maintained), TreeSet (sorted)

    // Map does not implement collection interface but Map Interface
    // Map - key-value pair collection, allows duplicate keys, maintains insertion
    // order
    // HashMap (un-ordered and un-sorted) > LinkedHashMap (ordered but slow and
    // similar to HashMap), Hashtable (similar to HashMap only diff is it is sync),
    // TreeMap (sorted)

    // Hashing is a process of converting key into another value called hash code
    // In Hashing hash functions are used to link the key and value in HashMap
    // HashMap will save all keys and values in a data structure called bucket (its
    // an array)

    // while saving kay value pair in hashMap first key will be passed to hash
    // function and generated
    // hashcode will be used as index of bucket and key-value pair will be saved at
    // that index as linkedList

    // Queue - ordered collection of elements, supports insertion and removal at
    // both ends it follows FIFO
    // LinkedList (ordered), PriorityQueue (sorted thus unordered)
}
