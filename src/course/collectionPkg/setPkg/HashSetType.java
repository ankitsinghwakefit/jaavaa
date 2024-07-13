package course.collectionPkg.setPkg;

import java.util.HashSet;

import course.myPackageA.Person;
// if 2 objects are equal then hash code of those objects also must be equal
//  so if we have to compare 2 objects then 
//  we have to override equals method from object class AND
//  we must override he hashcode method also from object class

public class HashSetType {
    // it will not maintain order of elements (unordered) else everything is common
    // with LinkedHashSet
    public static void addAnotherSet(HashSet<String> mySet) {
        HashSet<String> mySetNew = new HashSet<>();
        mySetNew.add("date");
        mySetNew.addAll(mySet);
        System.out.println(mySetNew);
    }

    public static void addPersonObjectsAndComparision() {
        HashSet<Person> personsSet = new HashSet<>();
        personsSet.add(new Person("ankit", "male", 28));
        personsSet.add(new Person("bihari", "male", 20));
        personsSet.add(new Person("mitali", "male", 32));
        personsSet.add(new Person("ankit", "male", 28)); // see as it's object so we have to override method to check
                                                         // equality

        for (Person p : personsSet) {
            Person person = (Person) p;
            System.out.println("Name: " + person.personName
                    + ", Gender: " + person.gender + ", Age: " + person.age);
        }
    }

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("cherry");
        // System.out.println(mySet); // order will not be maintained

        // it is using equals method from object class to check duplicate string values
        // and string
        // class already override equals method from object class and provide
        // implementation for checking
        // string values thus we don't need to write method to check different string
        // values

        mySet.add("banana"); // will not add duplicate values
        mySet.add("cherry"); // will not add duplicate values
        // System.out.println(mySet);

        // addAnotherSet(mySet);
        addPersonObjectsAndComparision();
    }
}
