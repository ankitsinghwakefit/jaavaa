package course.abstractPkg;

// this class is inherited human abstract class so it must provide abstract methods implementation or itself defined as abstract class
// and next chile class that will inherit it will implement all abstract methods or again defined abstract
public class Artist extends Human {
    public String getName() {
        return "Artist";
    }

    public static void main(String[] args) {
        Artist artist = new Artist();
        System.out.println(artist.getName());
        artist.canWalk(); // since canWalk is default method it will be inherited from human abstract
                          // class

    }
}
