package course.exceptionHandlingPkg;

//  custom defined exception class must extend Exception class
public class MyCustomExceptionClass extends Exception {
    String errorMessage;

    public MyCustomExceptionClass(String exceptionErrorMessage) {
        errorMessage = exceptionErrorMessage;
    }
}
