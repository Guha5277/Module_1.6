package guhar4k.patterns.creational.abstractfactory.office;

import guhar4k.patterns.creational.abstractfactory.WorkTool;

public class PersonalComputer implements WorkTool {
    @Override
    public void checkWorkTool() {
        System.out.println("Компьютер исправен и готов к работе");
    }
}
