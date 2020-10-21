package guhar4k.patterns.creational.abstractfactory.office;

import guhar4k.patterns.creational.abstractfactory.Workplace;

public class Office implements Workplace {
    @Override
    public void checkWorkplace() {
        System.out.println("Рабочий кабинет готов к работе");
    }
}
