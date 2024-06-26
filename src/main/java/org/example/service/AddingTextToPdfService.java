package org.example.service;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileOutputStream;
import java.io.IOException;


public class AddingTextToPdfService {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting the pdf generation process");
        String destinationFilePath = "/Users/alex/Workspace/CodeGeneratedFiles/PdfFileWithText.pdf";
        String paragraphText = "Go is a procedural programming language. It was developed in 2007 by Robert Griesemer, Rob Pike, and Ken Thompson at Google but launched in 2009 as an open-source programming language. Programs are assembled by using packages, for efficient management of dependencies. This language also supports environment adopting patterns alike to dynamic languages. For eg., type inference (y := 0 is a valid declaration of a variable y of type float).\n" +
                "\n" +
                "Go is a statically typed, concurrent, and garbage-collected programming language created at Google in 2009. It is designed to be simple, efficient, and easy to learn, making it a popular choice for building scalable network services, web applications, and command-line tools.\n" +
                "\n" +
                "Go is known for its support for concurrency, which is the ability to run multiple tasks simultaneously. Concurrency is achieved in Go through the use of Goroutines and Channels, which allow you to write code that can run multiple operations at the same time. This makes Go an ideal choice for building high-performance and scalable network services, as well as for solving complex computational problems.";

        //Initialize PdfWriter, PdfDocument, Document
        PdfWriter pdfWriter = new PdfWriter(new FileOutputStream(destinationFilePath));
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        //Set the document properties
        PdfFont pdfFont = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD); //Setting the font
        Color backgroundColour = new DeviceRgb(204, 255, 247);  //Setting the Color
        Paragraph paragraph1 = new Paragraph(paragraphText); // Populate the paragraph
        paragraph1.setFont(pdfFont);
        paragraph1.setFontSize(12f);
        paragraph1.setBackgroundColor(backgroundColour);

        document.add(paragraph1);
        document.close();

        System.out.println("PDF Generation successful");
    }
}
