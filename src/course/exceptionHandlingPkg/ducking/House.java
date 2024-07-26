package course.exceptionHandlingPkg.ducking;

public class House extends Exception {
    
    catch(Exception e) {
        System.out.println("caught in house");
    }
}
