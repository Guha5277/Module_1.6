package guhar4k.patterns.abstractfactory.garden;

import guhar4k.patterns.abstractfactory.Workplace;

public class Garden implements Workplace {
    @Override
    public void checkWorkplace() {
        System.out.println("Погода ясная и позволяет работать в саду с ручным и электроинструментом");
    }
}
