package variableSample;

public class ScopeOfVariable {
    public static void main(String[] args) {
        ScopeOfVariable ab = new ScopeOfVariable();
        System.out.println(ab.varScopeTest());
    }
    // Types of variables in java
    // 1. Static > vars will be available to all objects of that class
    // 2. Instance > vars will be created when instance obj will be created
    // 3. local > defined inside method and will be alive till method is in stack
    // 4. block >

    String varScopeTest(){
        int one = 1; // local variable
        if(one == 1){
            byte blockVar = 1; // this is block var
            System.out.println(blockVar);
        }
        System.out.println(one);
        return "ab";
    }
    // System.out.println(one); as One is local it can't be accessed outside method
}
