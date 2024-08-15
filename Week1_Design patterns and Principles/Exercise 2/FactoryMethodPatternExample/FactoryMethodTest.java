// src/FactoryMethodTest.java

public class FactoryMethodTest {
    public static void main(String[] args) {
        // Creates factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        
        // Creates documents using factories
        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();
        
        // Opens documents
        wordDoc.open();
        pdfDoc.open();
        excelDoc.open();
    }
}
