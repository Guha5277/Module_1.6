package guhar4k.patterns.abstractfactory.office;

import guhar4k.patterns.abstractfactory.WorkTool;

public class PersonalComputer implements WorkTool {
    @Override
    public void checkWorkTool() {
        System.out.println("Компьютер исправен и готов к работе");
    }
}
