package guhar4k.patterns.behavioral.template_method;

public abstract class LuckySouvenir {
    public void play(){
        System.out.println("Paw swing");
        playSound();
    }

    abstract void playSound();
}
