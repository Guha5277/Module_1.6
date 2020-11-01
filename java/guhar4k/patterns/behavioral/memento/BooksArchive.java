package guhar4k.patterns.behavioral.memento;

public class BooksArchive {
    private BookWriter.BookSnapshot savedSnapshot;

    public BookWriter.BookSnapshot loadSnapshot() {
        return savedSnapshot;
    }

    public void saveSnapshot(BookWriter.BookSnapshot snapshot) {
        this.savedSnapshot = snapshot;
    }
}
