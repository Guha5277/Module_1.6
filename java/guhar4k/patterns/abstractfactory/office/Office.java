package guhar4k.patterns.abstractfactory.office;

import guhar4k.patterns.abstractfactory.Workplace;

public class Office implements Workplace {
    @Override
    public void checkWorkplace() {
        System.out.println("Рабочий кабинет готов к работе");
    }
}
