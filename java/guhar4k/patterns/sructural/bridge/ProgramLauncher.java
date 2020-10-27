package guhar4k.patterns.sructural.bridge;

public class ProgramLauncher {
    public static void main(String[] args) {
        UIManager uiManager = new UIManager(new WindowsGUI());
        uiManager.drawWindow();
        uiManager.drawButton();
        uiManager.drawTextField();
    }
}
