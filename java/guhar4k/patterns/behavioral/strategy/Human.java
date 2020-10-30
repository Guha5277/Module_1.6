package guhar4k.patterns.behavioral.strategy;

public class Human {
    private Activity activity;

    public Human(Activity activity) {
        this.activity = activity;
    }

    void doActivity() {
        activity.doIt();
    }

    void changeActivity(Activity activity){
        this.activity = activity;
    }
}
