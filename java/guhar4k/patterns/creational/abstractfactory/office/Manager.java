package guhar4k.patterns.creational.abstractfactory.office;

import guhar4k.patterns.creational.abstractfactory.Worker;

public class Manager implements Worker {
    @Override
    public void work() {
        System.out.println("Менеджер приступил к работе");
    }
}
