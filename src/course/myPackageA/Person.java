package course.myPackageA;

public class Person {
    public String name;
    public String gender;
    public int age;
    public void sleep(){
        if(age<10){
            System.out.println(name + " will sleep more than 10 hours a day");
        } else if ( age >= 10  && age<= 50) {
            System.out.println(name + " will sleep less than 10 hours a day");
        } else {
            System.out.println(name + " will sleep avg 10 hours a day");
        }
    }
}