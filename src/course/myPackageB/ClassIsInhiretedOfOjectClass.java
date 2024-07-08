package course.myPackageB;

public class ClassIsInhiretedOfOjectClass {
    // always remember constructor will be only called if object is created from
    // that class
    public ClassIsInhiretedOfOjectClass() {
        System.out.println("ClassIsInhiretedOfOjectClass");
    }

    public static void main(String[] args) {
        // see constructor will be called
        ClassIsInhiretedOfOjectClass ob = new ClassIsInhiretedOfOjectClass();
    }
}