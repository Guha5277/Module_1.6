package guhar4k.patterns.behavioral.command;

public class ProjectRunner {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorUI textEditorUI = new TextEditorUI(
                new Cut(textEditor),
                new Copy(textEditor),
                new Paste(textEditor),
                new Delete(textEditor)
        );

        textEditorUI.buttonCut();
        textEditorUI.buttonCopy();
        textEditorUI.buttonPaste();
        textEditorUI.buttonDelete();
    }
}
