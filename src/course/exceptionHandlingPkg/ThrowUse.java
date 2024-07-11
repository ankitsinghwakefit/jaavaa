package course.exceptionHandlingPkg;

public class ThrowUse {
    public static void main(String[] args) {
        try {
            giveFruites();
            throw new MyCustomExceptionClass("my error message");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("please enter between 1-4");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("please enter number");
        } catch (MyCustomExceptionClass e) {
            System.out.println("my error");
        } catch (Exception e) {
            System.out.println("last default error");
        }
    }

    public static void giveFruites() throws ArrayIndexOutOfBoundsException, NumberFormatException {
        int userInput = Integer.parseInt("8av");
        String[] fruits = { "apple", "banana", "graphs", "sitafal" };
        System.out.println("here is your fruit" + fruits[userInput]);
    }
}
