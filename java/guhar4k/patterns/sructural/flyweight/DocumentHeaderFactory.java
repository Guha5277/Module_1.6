package guhar4k.patterns.sructural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DocumentHeaderFactory {
    private Map<String, DocumentHeader> documentHeaderMap = new HashMap<>();

    DocumentHeader getDocumentHeader(String headerType) {
        DocumentHeader documentHeader = documentHeaderMap.get(headerType);
        if (documentHeader == null) {
            switch (headerType) {
                case "financial report":
                    System.out.println("Creating header...");
                    documentHeader = new DocumentHeader("The Financial Report. The SomeName Company. ");
                    break;
                case "progress report":
                    System.out.println("Creating header...");
                    documentHeader = new DocumentHeader("The Progress Report. The SomeName Company. ");
            }
            documentHeaderMap.put(headerType, documentHeader);
        }
        return documentHeader;
    }
}
