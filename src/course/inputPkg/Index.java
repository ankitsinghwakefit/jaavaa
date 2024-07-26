package course.inputPkg;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter your age");
        int age = s1.nextInt();
        System.out.println("your age is " + age);
        s1.close();
    }
}
