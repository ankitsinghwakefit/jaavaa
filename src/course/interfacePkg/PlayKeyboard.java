package course.interfacePkg;

public interface PlayKeyboard {
    default public void play() {
        System.out.println("PlayKeyboard interface can play");
    };
}
