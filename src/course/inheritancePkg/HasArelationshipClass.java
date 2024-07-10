package course.inheritancePkg;

public class HasArelationshipClass extends Human {
    // see this is has-a relationship as java do not support multiple inhertance so
    // to
    // inherit more than
    // 2 class properties we can use has-a like this.
    Dancer d = new Dancer();

    public static void main(String[] args) {
        HasArelationshipClass bina = new HasArelationshipClass();
        bina.name = "Bina";
        // see this class can access Human related method
        bina.eat();
        // see this class can access Dancer related method
        bina.d.dance();
    }
}
