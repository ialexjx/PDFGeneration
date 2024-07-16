package org.example.service;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;

import java.io.FileOutputStream;
import java.io.IOException;

public class PDFGenerationService {
    public static void main(String[] args) throws IOException {
        String destinationFilePath = "/Users/alex/Workspace/CodeGeneratedFiles/Test.pdf";

        Document document = new Document(new PdfDocument(new PdfWriter(new FileOutputStream(destinationFilePath))));

        PdfFont pdfFont = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        Paragraph pdfHeading  = new Paragraph("Personal Details");
        pdfHeading.setFontSize(16f)
                .setFont(pdfFont)
                .setTextAlignment(TextAlignment.CENTER)
                .setBold()
                .setPadding(5)
                .setMarginTop(15f)
                .setMarginBottom(20f);
        document.add(pdfHeading);

        Table personalDetailsTable = createPersonalDetailsTable();
        personalDetailsTable.setFontSize(12f)
                .setFont(pdfFont);

        document.add(personalDetailsTable);

        System.out.println("Process Ended");
        document.close();
    }

    public static Table createPersonalDetailsTable(){
        System.out.println("inside createPersonalDetailsTable");
        float columnWidth[] = {150f, 350f};
        Table personalDetailsTable = new Table(columnWidth);
        personalDetailsTable.setWidth(500f);
        personalDetailsTable.setAutoLayout();

        try{
            personalDetailsTable.addCell("Name");
            personalDetailsTable.addCell("Akshat Jaiswal");
            personalDetailsTable.addCell("UserId");
            personalDetailsTable.addCell("01");
            personalDetailsTable.addCell("Mobile");
            personalDetailsTable.addCell("+91 9839783219");
            personalDetailsTable.addCell("Email");
            personalDetailsTable.addCell("akshathrx6393@gmail.com");
            personalDetailsTable.addCell("Address");
            personalDetailsTable.addCell("Main Road Rampur Karkhana, Deoria 274405");

        } catch (Exception e){
            System.out.println("Error while creating personal details table with exception " + e);
        }
        System.out.println("returning from createPersonalDetailsTable");
        return personalDetailsTable;
    }


}
