package variableSample;

public class AccessTypeOfVariables {
    static int empId = 102;
    static void check(){
        System.out.println(empId);
    }
    public static void main(String[] args) {
        AccessTypeOfVariables a = new AccessTypeOfVariables();
        a.empId = 50;
        check();
        System.out.println(a.empId);
        // a.empId = 50; Final are constant values
    }
}
