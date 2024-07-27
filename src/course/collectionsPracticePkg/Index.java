package course.collectionsPracticePkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<Integer>();
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10)
                    return 1;
                return -1;
            }
        };
        ages.add(25);
        ages.add(30);
        ages.add(28);
        ages.add(36);
        // System.out.println(ages);
        // Collections.sort(ages, com);
        // System.out.println(ages);

        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        Comparator<String> str = new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                return -1;
            }
        };
        // System.out.println(names);
        // Collections.sort(names, str);
        // System.out.println(names);

        Students stu1 = new Students(21, "ankit");
        Students stu2 = new Students(18, "ramesh");
        Students stu3 = new Students(23, "suresh");
        List<Students> studentList = new ArrayList<Students>();
        Comparator<Students> stuCom = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if (o1.age > o2.age)
                    return 1;
                return -1;
            }
        };
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);
        System.out.println(studentList);
        Collections.sort(studentList, stuCom);
        for (Students stu : studentList) {
            System.out.println(stu);
        }

    }
}
