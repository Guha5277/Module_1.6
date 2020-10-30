package guhar4k.patterns.behavioral.state;

public class ActivityRunner {
    public static void main(String[] args) {
        Human human = new Human();

        for (int i = 0; i < 30; i++) {
            human.doActivity();
        }
    }
}
