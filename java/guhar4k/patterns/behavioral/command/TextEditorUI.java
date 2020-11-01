package guhar4k.patterns.behavioral.command;

public class TextEditorUI {
    private Command cut;
    private Command copy;
    private Command paste;
    private Command delete;

    public TextEditorUI(Command cut, Command copy, Command paste, Command delete) {
        this.cut = cut;
        this.copy = copy;
        this.paste = paste;
        this.delete = delete;
    }

    public void buttonCut(){
        cut.execute();
    }

    public void buttonCopy(){
        copy.execute();
    }

    public void buttonPaste(){
        paste.execute();
    }

    public void buttonDelete(){
        delete.execute();
    }
}
