package guhar4k.patterns.behavioral.command;

public class Delete implements Command {
    private TextEditor textEditor;

    public Delete(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.delete();
    }
}
