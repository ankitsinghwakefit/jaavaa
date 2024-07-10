package course.inheritancePkg;

// if we make this class final then it can't be extened by child class
public class Artist extends Human {
    public static void main(String[] args) {
        Artist ankit = new Artist();
        // Artist a1 = new Human();
        // this is not possible , we are xreating human type
        // object in artist class it won't be possible as artist is small than human
        // class
        Human h = new Artist();
        h.name = "him";
        h.eat(); // it will first search in Artist class for eat method if it not found it then
                 // go to human
        h.sleep();
        ankit.name = "Ankit";
        ankit.sleep();
        ankit.eat();

        Human h1 = new Human();
        h1.name = "human";
        h1.eat(); // see here it will search in Human class ONLY as it's an object of human class
    }

    // if we define below method as final in superClass then it can't be overridden
    // here
    public void eat() {
        System.out.println(name + " can eat");
    }
}
