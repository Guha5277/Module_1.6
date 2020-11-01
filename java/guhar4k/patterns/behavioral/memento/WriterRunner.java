package guhar4k.patterns.behavioral.memento;

public class WriterRunner {
    public static void main(String[] args) {
        BookWriter writer = new BookWriter();
        BooksArchive archive = new BooksArchive();

        writer.addPage("page 1 ");
        writer.addPage("page 2 ");
        writer.addPage("page 3 ");
        archive.saveSnapshot(writer.save());
        System.out.println(writer);
        System.out.println("\n=========================\n");

        writer.addPage("page 4");
        writer.addPage("page 5");
        System.out.println(writer);
        System.out.println("\n=========================\n");


        writer.load(archive.loadSnapshot());
        System.out.println(writer);
        System.out.println("\n=========================\n");

    }
}
