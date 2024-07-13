package course.collectionPkg.setPkg;

import java.util.TreeSet;

import course.myPackageA.Person;

public class TreeSetType {
    // this is sorted type of set in asending order
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(20);
        System.out.println(nums); // will be printed in ascending order

        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("John", "male", 20));
        persons.add(new Person("Bob", "male", 20));
        persons.add(new Person("Bob", "male", 22));
        // compareTo overriden method is comparing if with name if person is already
        // present or not
        for (Person p : persons) {
            Person person = (Person) p;
            System.out.println("Name: " + person.personName
                    + ", Gender: " + person.gender + ", Age: " + person.age);
        }
    }
}
