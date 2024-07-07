package course.myPackageA;

public class Person {
    public String personName;
    public String gender;
    public int age;

    // every class have it's constructor by default either we declear or not
    public Person(String name, String gender, int age) {
        super(); // this will be added by compalier by default > no need to add it.
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
}