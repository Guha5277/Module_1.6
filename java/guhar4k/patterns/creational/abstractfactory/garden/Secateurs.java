package guhar4k.patterns.creational.abstractfactory.garden;

import guhar4k.patterns.creational.abstractfactory.WorkTool;

public class Secateurs implements WorkTool {
    @Override
    public void checkWorkTool() {
        System.out.println("Садовые ножницы заточены, смазаны и готовы к работе");
    }
}
