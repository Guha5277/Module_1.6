package guhar4k.patterns.behavioral.state;

public class Human {
    private int food;
    private int energy;
    private int triedness;

    private Activity activity;

    public Human() {
        this.activity = new Working();
        food = 100;
        energy = 100;
        triedness = 0;
    }

    void doActivity() {
        if (food <= 0) activity = new Eating();
        if (energy <= 0) activity = new Relaxing();
        if (triedness >= 100) activity = new Sleeping();
        if (triedness <= 0 && energy >= 100 || food >= 100) activity = new Working();

        activity.doIt();

        if (activity instanceof Working) {
            energy -= 20;
            food -= 20;
            triedness += 15;
        } else if (activity instanceof Relaxing) {
            triedness -= 15;
            energy += 15;
        } else if (activity instanceof Sleeping){
            triedness -=20;
            energy +=20;
        } else if (activity instanceof Eating){
            food += 50;
        }
    }
}
