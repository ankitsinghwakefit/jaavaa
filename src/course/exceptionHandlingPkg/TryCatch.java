package course.exceptionHandlingPkg;

public class TryCatch {
    static String[] fruits = { "apple", "orange", "bnana", "sitafal" };

    public static void main(String[] args) {
        try {
            int userInput = Integer.parseInt("8");
            System.out.println("your fruit is " + fruits[userInput - 1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter a number between 1 and " + fruits.length);
        } catch (Exception e) {
            System.out.println("some error occured.");
        } finally {
            // this block will always always always run
            System.out.println("I'm final I will run always either no error or error");
        }
        // don' confuse finally with final
        // if a class is final, it can't be extended
        // if a method is final, it can't be overrideen
        // if a variable is final, it is constant
    }
}
