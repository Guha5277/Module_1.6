package guhar4k.patterns.creational.abstractfactory.garden;

import guhar4k.patterns.creational.abstractfactory.Worker;

public class Gardener implements Worker {
    @Override
    public void work() {
        System.out.println("Садовник приступил к работе");
    }
}
