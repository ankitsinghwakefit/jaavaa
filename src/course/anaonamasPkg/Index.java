package course.anaonamasPkg;

public class Index {
    public static void main(String[] args) {
        // if we are making a child class just to override a parent class method then no
        // need to create a new child class , see below method
        Parent p = new Child() {
            public void parentShow() {
                System.out.println("overrideen anonymous show");
            }
        };
        p.parentShow();

        // to override a parent class method without creating a new child class
        Parent p2 = new Parent() {
            public void parentShow() {
                System.out.println("anonymous show");
            }
        };
        p2.parentShow();
    }
}
