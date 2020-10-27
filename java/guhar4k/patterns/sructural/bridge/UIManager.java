package guhar4k.patterns.sructural.bridge;

public class UIManager {
    private GUI gui;

    public UIManager(GUI gui) {
        this.gui = gui;
    }

    public void drawWindow(){
        gui.drawWindow();
    }

    public void drawButton(){
        gui.drawButton();
    }

    public void drawTextField(){
        gui.drawTextFiled();
    }
}
