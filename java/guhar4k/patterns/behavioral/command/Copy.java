package guhar4k.patterns.behavioral.command;

public class Copy implements Command {
    private TextEditor textEditor;

    public Copy(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.copy();
    }
}
