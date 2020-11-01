package guhar4k.patterns.behavioral.memento;

import java.time.LocalDateTime;

public class BookWriter {
    private int pages;
    private String text = "";
    private LocalDateTime dateTime;

    public void addPage(String text) {
        this.text += text;
        pages++;
        dateTime = LocalDateTime.now();
    }

    public BookSnapshot save() {
        return new BookSnapshot(text, pages);
    }

    public void load(BookSnapshot bookSnapshot){
        this.pages = bookSnapshot.pages;
        this.text = bookSnapshot.text;
        this.dateTime = bookSnapshot.dateTime;
    }

    @Override
    public String toString() {
        return dateTime + "\n" + "pages: " + pages
                + "\ntext: " + text;
    }

    public class BookSnapshot {
        private final int pages;
        private final String text;
        private final LocalDateTime dateTime;

        public BookSnapshot(String text, int pages) {
            this.text = text;
            this.pages = pages;
            dateTime = LocalDateTime.now();
        }
    }
}
