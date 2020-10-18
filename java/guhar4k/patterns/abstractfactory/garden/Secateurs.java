package guhar4k.patterns.abstractfactory.garden;

import guhar4k.patterns.abstractfactory.WorkTool;

public class Secateurs implements WorkTool {
    @Override
    public void checkWorkTool() {
        System.out.println("Садовые ножницы заточены, смазаны и готовы к работе");
    }
}
