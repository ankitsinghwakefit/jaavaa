package course.methods;

public class TestMethods {
    int age = 20;
    // age var will be in heap memory
    public static void main(String[] args) {
        TestMethods tm = new TestMethods();
        String greeting = "madam".equalsIgnoreCase("Male") ? "Hi Sir" : "Hi Madam";
        System.out.println(tm.sayHi());
        System.out.println(greeting);
    }
    // methods have same modifers public/private/default/protected
    String sayHi(){
        // localAge will be stored in stack memory
        int localAge = 50;
//        this ^ will only return first true and only if it is only one true is in condition
        if(age == 10 ^ true){
            if("ab".equals("ab")){
//                to compare strings we can not compare them directly we must use equals method
                if("male".equalsIgnoreCase("Male")){
      // to compare 2 strings without case sensitive
                    return "Hii"+age;
                }
            }
        }
        return "none";
    }
    // final method cannot be overriden in its child (sub) classes
    final void cantBeOverRiddenInChild(){

    }
    // static methods belongs to class and it does not required to create an object
    // to access static method or variable
    static void createdOnClassAccessedWithoutCreatingObj(){

    }
    //abstract void itsDefinationWillBeInChildClass(String name);
    synchronized void onlyOneThreadCanAccessThisAtATimeInMultithreadingEnv(){

    }
    strictfp void toEnsureSameFloatingPointCalcInDifferentPlatform(){

    }
    // native void JNEjavaNativeEnterfacePredefinedMethodsOfCandC++(){

    //}
}
