package org.example.service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestPdfGeneration {-
    public static void main(String[] args) throws FileNotFoundException {
        String pdfDestination = "/Users/alex/Workspace/CodeGeneratedFiles/TestPdfGeneration.pdf";
        Document document = new Document(new PdfDocument(new PdfWriter(new FileOutputStream(pdfDestination))));

        Paragraph paragraph = new Paragraph("Helllo World");

        document.add(paragraph);
        document.close(); // Always close the document after the completion of the generation process otherwise it will give errors
    }
}
