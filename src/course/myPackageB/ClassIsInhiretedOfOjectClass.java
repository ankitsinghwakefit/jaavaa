package course.myPackageB;

public class ClassIsInhiretedOfOjectClass {
    // always remember constructor will be only called if object is created from
    // that class
    public ClassIsInhiretedOfOjectClass() {
        System.out.println("ClassIsInhiretedOfOjectClass");
    }
    // Rules of constructor
    // 1. constructor can use any access modifier
    // 2. constructor name should be same as class name
    // 3. constructor doesn't have return type ( if there is return type its a
    // method)
    // 4. constructor is called automatically when object is created
    // 5. constructor can have parameters
    // 6. constructor is not inherited by subclasses
    // 7. constructor can be overloaded
    // 8. if no constructor is defined then default constructor will be added by
    // 9. the only way to call a constructor from another constructor is using
    // this() or super()
    // 10. all the classes will have constructor
    // 11. you can not make a call to an instance methods or access an instance
    // variable until after the super constructor runs

    // Singleton class is a class that allows only 1 instance of itself to be
    // created and provides a global
    // point of access to that instance. this can be acheived by make constructor
    // PRIVATE

    public static void main(String[] args) {
        // see constructor will be called
        ClassIsInhiretedOfOjectClass ob = new ClassIsInhiretedOfOjectClass();
    }
}