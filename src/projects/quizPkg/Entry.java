package projects.quizPkg;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        String answers[] = new String[2];
        Questions firstQuestion = new Questions("which is even number", "2", "1/2/3/5");
        Questions SecondQuestion = new Questions("which is odd number", "1", "1/2/4/6");
        Scanner response1 = new Scanner(System.in); // Create a Scanner object
        System.out.println(firstQuestion.getQuestion() + " your options are " + firstQuestion.getOptions());
        String ans1 = response1.nextLine(); // Read user input
        System.out.println("ans1 is: " + ans1); // Output user input
        answers[0] = ans1;
        if (ans1.equals(firstQuestion.getAnswer())) {
            System.out.println("corrcet answer ");
        } else {
            System.out.println("corrcet answer is: " + firstQuestion.getAnswer());
        }

        Scanner response2 = new Scanner(System.in); // Create a Scanner object
        System.out.println(SecondQuestion.getQuestion() + " your options are " + SecondQuestion.getOptions());
        String ans2 = response2.nextLine(); // Read user input
        System.out.println("ans2 is: " + ans2); // Output user input
        answers[1] = ans2;
        if (ans2.equals(SecondQuestion.getAnswer())) {
            System.out.println("corrcet answer ");
        } else {
            System.out.println("corrcet answer is: " + SecondQuestion.getAnswer());
        }
        for (String ans : answers) {
            System.out.println(ans);
        }
    }
}
