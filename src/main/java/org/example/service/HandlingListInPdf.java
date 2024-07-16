package org.example.service;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HandlingListInPdf {
    public static void main(String[] args) throws IOException {
        System.out.println("Pdf Generation Started");
        String destinationFilePath = "/Users/alex/Workspace/CodeGeneratedFiles/HandlingListInPdf.pdf";

        Document document = new Document(new PdfDocument(new PdfWriter(new FileOutputStream(destinationFilePath))));
        PdfFont pdfFont = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);

        List stringList = new List();
        stringList.add("Name : Akshat Jaiswal");
        stringList.add("Age : 24");
        stringList.add("Add : Rampur Karkhana, Deoria");
        stringList.add("Company : Digitap.AI");
        stringList.add("Designation : Software Engineer");
        stringList.setFont(pdfFont);

        document.add(stringList);

        //Add spacing to the pdf
        CommonUtilityService.getInstance().addSpacer(document, 20f);

        String paragraph = " I'm a Software Engineer passionate about building scalable and reliable software solutions. Proven expertise in Java, Spring Boot, Spring Data JPA, Spring JDBC, RESTful Web Services, REST APIs, JUnit, Mockito, Microservices, Speedment, and AWS. Currently working at a fintech company as a software engineer, developing and maintaining innovative and cutting-edge solutions for E-Nach, Video-PD, KYC/OKYC, VKYC projects";

        Paragraph para = new Paragraph(paragraph);
        para.setFont(pdfFont).setFontSize(10);

        document.add(para);

        document.close();

        System.out.println("Pdf generation successful");
    }
}
