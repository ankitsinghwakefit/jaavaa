package course.interfacePkg;

// we can extends one interface to another 
public interface PlayKeyboard extends Human {
    default public void play() {
        System.out.println("PlayKeyboard interface can play");
    };
}

// class > class extends
// class > interface implements
// interface > interface implements