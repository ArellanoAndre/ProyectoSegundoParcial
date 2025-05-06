/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import javax.swing.JTable;
import java.io.FileOutputStream;

public class ExportarPDF {

    public static void exportarTablaPDF(JTable tabla, String nombreArchivo) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
            document.open();

            Paragraph titulo = new Paragraph("Reporte de Existencias", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            document.add(new Paragraph(" "));

            PdfPTable pdfTable = new PdfPTable(tabla.getColumnCount());
            pdfTable.setWidthPercentage(100);

            // Encabezados
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                pdfTable.addCell(new PdfPCell(new Phrase(tabla.getColumnName(i))));
            }

            // Datos
            for (int i = 0; i < tabla.getRowCount(); i++) {
                for (int j = 0; j < tabla.getColumnCount(); j++) {
                    Object valor = tabla.getValueAt(i, j);
                    pdfTable.addCell(valor != null ? valor.toString() : "");
                }
            }

            document.add(pdfTable);
            document.close();

            System.out.println("PDF generado exitosamente: " + nombreArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
