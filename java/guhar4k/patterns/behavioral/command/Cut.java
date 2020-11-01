package guhar4k.patterns.behavioral.command;

public class Cut implements Command {
    private TextEditor textEditor;

    public Cut(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.cut();
    }
}
