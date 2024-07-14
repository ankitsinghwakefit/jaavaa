package course.collectionPkg.mapPkg;

import java.util.Map;
import java.util.TreeMap;

import course.myPackageA.Person;

public class TreeMapType {
    // it will be sorted (for sorting it will use comparable method from object
    // class like TreeSet)
    // It is similar to HashMap
    public static void main(String[] args) {
        TreeMap<String, Person> myTree = new TreeMap<>();
        myTree.put("ankit", new Person("Ankit", "male", 28));
        myTree.put("Bina", new Person("bina", "female", 34));
        myTree.put("Nisha", new Person("nisha", "female", 34));
        for (Map.Entry<String, Person> person : myTree.entrySet()) {
            Person myPer = (Person) person.getValue();
            System.out.println(person.getKey() + ":" + myPer.personName);
        }
    }
}
