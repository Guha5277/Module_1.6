package guhar4k.patterns.sructural.bridge;

public class MacGUI implements GUI {
    @Override
    public void drawWindow() {
        System.out.println("Drawing window for Mac OS...");
    }

    @Override
    public void drawButton() {
        System.out.println("Drawing button for Mac OS...");
    }

    @Override
    public void drawTextFiled() {
        System.out.println("Drawing text field for Mac OS...");
    }
}
