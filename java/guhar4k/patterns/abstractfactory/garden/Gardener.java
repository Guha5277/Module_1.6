package guhar4k.patterns.abstractfactory.garden;

import guhar4k.patterns.abstractfactory.Worker;

public class Gardener implements Worker {
    @Override
    public void work() {
        System.out.println("Садовник приступил к работе");
    }
}
