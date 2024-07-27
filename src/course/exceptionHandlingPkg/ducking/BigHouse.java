package course.exceptionHandlingPkg.ducking;

public class BigHouse {
    public void arryException() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        System.out.println(arr[9]);
    }
}
