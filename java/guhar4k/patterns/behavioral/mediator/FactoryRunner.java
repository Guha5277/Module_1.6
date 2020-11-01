package guhar4k.patterns.behavioral.mediator;

public class FactoryRunner {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Director director = new Director();
        Worker worker = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        factory.setDirector(director);
        factory.addWorker(worker);
        factory.addWorker(worker2);
        factory.addWorker(worker3);
        factory.makeProduct();
    }
}
