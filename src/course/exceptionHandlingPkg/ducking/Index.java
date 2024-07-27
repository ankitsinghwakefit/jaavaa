package course.exceptionHandlingPkg.ducking;

public class Index {
    public static void main(String[] args) {
        try {
            Class.forName("undefinedClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught");
        }
        System.out.println("hiiiii");
    }
}
