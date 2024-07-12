package course.myPackageA;

import course.myPackageB.ClassIsInhiretedOfOjectClass;

public class Person extends ClassIsInhiretedOfOjectClass implements Comparable<Person> {
    public String personName;
    public String gender;
    public int age;

    // every class have it's constructor by default either we declear or not
    // name of constructor will be same as class name
    public Person() {
        // this and super will be used to call constructor
        this("name", 10);
    }

    public Person(String name) {
        personName = name; // iniciate the instance variable
    }

    public Person(String name, int age) {
        personName = name; // iniciate the instance variable
        this.age = age;
        // this.gender = gender; // this is only required if both vars have same name
        // else no need of this.
    }

    public Person(String name, String gender, int age) {
        super(); // this will be added by compalier by default > no need to add it.
        // means parent
        // class constructor
        personName = name; // iniciate the instance variable
        this.gender = gender; // this is only required if both vars have same name else no need of this.
        this.age = age;
    }

    public void sleep() {
        if (age < 10) {
            System.out.println(personName + " will sleep more than 10 hours a day");
        } else if (age >= 10 && age <= 50) {
            System.out.println(personName + " will sleep less than 10 hours a day");
        } else {
            System.out.println(personName + " will sleep avg 10 hours a day");
        }
    }

    @Override
    public int compareTo(Person o) {
        return personName.compareTo(o.personName);
    }
}