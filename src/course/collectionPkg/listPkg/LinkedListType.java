package course.collectionPkg.listPkg;

import java.util.Collections;
import java.util.LinkedList;

import course.myPackageA.Person;

public class LinkedListType {
    // linked list are in form of nodes, first node is called as head of list and
    // second node
    // as tail of list
    // 2 types of linked lists
    // 1. singly linked list
    // 2. doubly linked list

    // singly linked list ( can travel in forward direction)
    // head -> 1 -> 2 -> 3 -> null

    // doubly linked list ( can travel in both directions)
    // head -> 1 <-> 2 <-> 3 <-> null

    public static void addAndSortPersons(LinkedList<Person> persons) {
        persons.add(new Person("John", "male", 20));
        persons.add(new Person("Alice", "female", 25));
        persons.add(new Person("Bob", "male", 22));
        Collections.sort(persons);
        System.out.println(persons.size());
        for (Person person : persons) {
            Person p = (Person) person;
            System.out.println(p.age + " " + p.personName + " " + p.gender);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("apple");
        list.addFirst("meow");
        list.addFirst("banana");
        list.add("cherry");
        for (String node : list) {
            System.out.println(node);
        }
        list.remove("apple");
        list.remove(); // will remove first node
        System.out.println("After deleting apple node: " + list);
        System.out.println("first node: " + list.get(0));
        Collections.sort(list);
        LinkedList<Person> persons = new LinkedList();
        addAndSortPersons(persons);
    }

    // operations
    // 1. insert node at the beginning
    // 2. insert node at the end
    // 3. insert node at a specific position
    // 4. delete node from the beginning
    // 5. delete node from the end
    // 6. delete node from a specific position
    // 7. reverse the list
    // 8. find the length of the list
    // 9. search for a node in the list
    // 10. merge two sorted linked lists
    // 11. delete a node with duplicate values
    // 12. reverse the list in groups of k nodes
    // 13. check if a linked list is a palindrome
    // 14. find the intersection of two linked lists
    // 15. find the union of two linked lists
    // 16. find the nth node from the end of the list
    // 17. find the middle node of the list
    // 18. find the sum of the nodes in the list
    // 19. find the product of the nodes in the list
    // 20. find the maximum value in the list
    // 21. find the minimum value in the list
    // 22. find the average value in the list
    // 23. find the median value in the list
    // 24. find the mode value in the list
    // 25. find the standard deviation value in the list
    // 26. find the variance value in the list
    // 27. find the range value in the list
    // 28. find the geometric mean value in the list
    // 29. find the harmonic mean value in the list
    // 30. find the nth Fibonacci number in the list
    // 31. find the nth prime number in the list
    // 32. find the nth perfect number in the list
    // 33. find the nth palindromic number in the list
    // 34. find the nth Armstrong number in the list
    // 35. find the nth Lucas number in the list
    // 36. find the nth Catalan number in the list
    // 37. find the nth Stirling number of the first kind in the list
    // 38. find the nth Stirling number of the second kind in the list
    // 39. find the nth Bell number in the list
    // 40. find the nth Bernoulli number in the list
    // 41. find the nth Euler number in the list
    // 42. find the nth factorial in the list
    // 43. find the nth prime factorization in the list
    // 44. find the nth factorial of the sum of the first n natural numbers
    // 45. find the nth factorial of the product of the first n natural numbers
    // 46. find the nth Fibonacci number modulo m in the list
    // 47. find the nth Lucas number modulo m in the list
    // 48. find the nth Catalan number modulo m in the list
    // 49. find the nth Stirling number of the first kind modulo m in the list
    // 50. find the nth Stirling number of the second kind modulo m in the list
    // 51. find the nth Bell number modulo m in the list
    // 52. find the nth Bernoulli number modulo m in the list
    // 53. find the nth Euler number modulo m in the list
    // 54. find the nth factorial modulo m in the list

}
