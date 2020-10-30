package guhar4k.patterns.behavioral.strategy;

public class ActivityRunner {
    public static void main(String[] args) {
        Human slave = new Human(new Working());
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.changeActivity(new Eating());
        slave.doActivity();
        slave.changeActivity(new Working());
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.changeActivity(new Sleeping());
        slave.doActivity();
        slave.changeActivity(new Working());
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
        slave.doActivity();
    }
}
