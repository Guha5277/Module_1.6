package guhar4k.patterns.sructural.flyweight;

public class Document {
    private DocumentHeader documentHeader;
    private DocumentBody documentBody;

    public Document(DocumentHeader documentHeader, DocumentBody documentBody) {
        this.documentHeader = documentHeader;
        this.documentBody = documentBody;
    }

    public void print(){
        System.out.println(documentHeader.getHeader() + documentBody.getBody());
    }
}
