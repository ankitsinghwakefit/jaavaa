package course.collectionPkg.listPkg;

import java.util.ArrayList;
// Colleactions > class having utility methods
import java.util.Collections;

//  Collection > root interface for collection framework
//  collection > data structure

import course.myPackageA.Person;

public class ArrayListType {
    // ordered but unsorted
    // it is similar to (or an array only)
    // but it allows dynamic size so it will srink if we remove elements but normal
    // array have size fixed and won't srink
    // elements will be added by index position

    public static void addElementsToFirstList(ArrayList firstList) {
        firstList.add("a");
        firstList.add("b");
    }

    public static void addAndPrintMyAry(ArrayList myAry, ArrayList firstList) {
        myAry.add(1);
        myAry.add(0, 2);
        myAry.add(new Person("ankit", "male", 28));
        myAry.addAll(firstList);
        for (Object num : myAry) {
            if (num instanceof Person) {
                Person person = (Person) num;
                System.out.println("Name: " + person.personName
                        + ", Gender: " + person.gender + ", Age: " + person.age);
            } else {
                System.out.println(num);
            }
        }
    }

    public static void addAndSortTypeArray(ArrayList<String> typeArray) {
        typeArray.add("Hello");
        typeArray.add("World");
        typeArray.remove("abc"); // no error if elemrnt is not found
        typeArray.remove("Hello");
        typeArray.add("me");
        typeArray.addFirst("first");
        typeArray.add("A");
        Collections.sort(typeArray); // first caps then lower then alphabetic
        // System.out.println(typeArray.get(0));
        for (String srt : typeArray) {
            System.out.println(srt);
        }
    }

    public static void addAndSortPersons(ArrayList myPaersons) {
        myPaersons.add(new Person("ankit", "male", 28));
        myPaersons.add(new Person("atul", "male", 29));
        myPaersons.addFirst(new Person("dina", "male", 61));
        Collections.sort(myPaersons); // to sort it we have to implement comparable in Person class
        // and override that method as per our class properties
        for (Object p : myPaersons) {
            Person per = (Person) p;
            System.out.println("Name: " + per.personName
                    + ", Gender: " + per.gender + ", Age: " + per.age);
        }
    }

    public static void main(String[] args) {
        // ArrayList firstList = new ArrayList();
        // addElementsToFirstList(firstList);

        // ArrayList myAry = new ArrayList();
        // addAndPrintMyAry(myAry, firstList);

        // ArrayList<String> typeArray = new ArrayList<String>();
        // addAndSortTypeArray(typeArray);

        ArrayList<Person> myPaersons = new ArrayList<>();
        addAndSortPersons(myPaersons);
    }
}
