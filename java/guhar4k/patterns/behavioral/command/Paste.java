package guhar4k.patterns.behavioral.command;

public class Paste implements Command {
    private TextEditor textEditor;

    public Paste(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.paste();
    }
}
