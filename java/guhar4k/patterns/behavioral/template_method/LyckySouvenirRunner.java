package guhar4k.patterns.behavioral.template_method;

public class LyckySouvenirRunner {
    public static void main(String[] args) {
        LuckySouvenir luckyCat = new LuckyCat();
        LuckySouvenir luckyDog = new LuckyDog();

        luckyCat.play();
        System.out.println();
        luckyDog.play();
    }
}
