package guhar4k.patterns.sructural.bridge;

public class WindowsGUI implements GUI {
    @Override
    public void drawWindow() {
        System.out.println("Drawing window for Windows OS...");
    }

    @Override
    public void drawButton() {
        System.out.println("Drawing button for Windows OS...");
    }

    @Override
    public void drawTextFiled() {
        System.out.println("Drawing text field for Windows OS...");
    }
}
