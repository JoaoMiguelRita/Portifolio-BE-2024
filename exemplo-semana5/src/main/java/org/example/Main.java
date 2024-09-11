package org.example;

import org.apache.pdfbox.contentstream.PDContentStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = scanner.nextLine();

        PDDocument documento = new PDDocument();

        PDPage pagina = new PDPage();
        documento.addPage(pagina);

        PDPageContentStream lapis = new PDPageContentStream(documento, pagina);
        PDType1Font fonte = new PDType1Font(Standard14Fonts.FontName.HELVETICA_BOLD);

        lapis.setFont(fonte, 18.5f);
        lapis.beginText();
        lapis.newLineAtOffset(25, 500);
        lapis.showText("Salve garotada");
        lapis.newLineAtOffset(0, -68);
        lapis.showText("Suave " + nome + " cachorro?");
        lapis.endText();
        lapis.close();
        documento.save("Teste PDF");
    }
}