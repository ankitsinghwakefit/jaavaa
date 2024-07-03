import java.awt.*;
import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String name = "hii";
        int age = 10;
        boolean isChild = true;
        double money = 10.55;
        Date now = new Date();
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 3;
        int[] ages = {1,2,7,3,4,5};
        Arrays.sort(ages);
     //   byte > short > int > long > float > double
        System.out.println(Arrays.toString(ages));
        System.out.println(ages.length);
        final double PI = 123;
        String one = "1";
        double sum = PI+Integer.parseInt(one);
        System.out.println(age+(int)money);
        System.out.println(sum);
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

