package guhar4k.patterns.sructural.flyweight;

public class DocumentCreator {
    public static void main(String[] args) {
        DocumentHeaderFactory docHeaderFactory = new DocumentHeaderFactory();
        DocumentBody[] financialReportDocBody = {
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report"),
                new DocumentBody("Some simple text for financial report")
        };

        DocumentBody[] progressReportDocBody = {
                new DocumentBody("Some simple text for progress report"),
                new DocumentBody("Some simple text for progress report"),
                new DocumentBody("Some simple text for progress report"),
                new DocumentBody("Some simple text for progress report"),
                new DocumentBody("Some simple text for progress report"),
                new DocumentBody("Some simple text for progress report"),
                new DocumentBody("Some simple text for progress report"),
                new DocumentBody("Some simple text for progress report"),
                new DocumentBody("Some simple text for progress report"),
        };


        Document[] financialReports = new Document[financialReportDocBody.length];
        for (int i = 0; i < financialReports.length; i++) {
            financialReports[i] = new Document(docHeaderFactory.getDocumentHeader("financial report"), financialReportDocBody[i]);
        }

        Document[] progressReports = new Document[progressReportDocBody.length];
        for (int i = 0; i < progressReports.length; i++) {
            progressReports[i] = new Document(docHeaderFactory.getDocumentHeader("progress report"), progressReportDocBody[i]);
        }

        for (Document financialReport : financialReports) {
            financialReport.print();
        }

        for (Document progressReport : progressReports) {
            progressReport.print();
        }

    }
}
