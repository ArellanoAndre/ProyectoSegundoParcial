/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import javax.swing.JTable;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ExportarPDF {

    public static void exportarTablaExistenciasPDF(JTable tabla, String nombreArchivo) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
            document.open();

            // Formateador de fecha (usando java.util.Date)
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            java.util.Date fechaActual = new java.util.Date(); // Fecha actual como java.util.Date

            // Título principal
            Paragraph titulo = new Paragraph("Reporte de Existencias de Productos",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            // Subtítulo
            Paragraph subTitulo = new Paragraph("Inventario actualizado",
                    FontFactory.getFont(FontFactory.HELVETICA, 12));
            subTitulo.setAlignment(Element.ALIGN_CENTER);
            document.add(subTitulo);

            document.add(Chunk.NEWLINE); // Espacio

            // Configuración de la tabla PDF
            PdfPTable pdfTable = new PdfPTable(tabla.getColumnCount());
            pdfTable.setWidthPercentage(100);
            pdfTable.setWidths(new float[]{0.8f, 2f, 1.5f, 1.5f, 3f, 1f}); // Ajustar según tus columnas

            // Estilo para encabezados
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10);
            BaseColor headerColor = new BaseColor(220, 220, 220);

            // Agregar encabezados
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                PdfPCell cell = new PdfPCell(new Phrase(tabla.getColumnName(i), headerFont));
                cell.setBackgroundColor(headerColor);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setPadding(5);
                pdfTable.addCell(cell);
            }

            // Agregar datos de la tabla
            Font dataFont = FontFactory.getFont(FontFactory.HELVETICA, 10);
            NumberFormat numberFormat = NumberFormat.getNumberInstance();

            for (int i = 0; i < tabla.getRowCount(); i++) {
                for (int j = 0; j < tabla.getColumnCount(); j++) {
                    Object valor = tabla.getValueAt(i, j);
                    String texto = (valor != null) ? valor.toString() : "";

                    // Formatear números para la columna de cantidad
                    if (j == 5 && valor instanceof Number) { // Asumiendo columna 5 es cantidad
                        texto = numberFormat.format(valor);
                    }

                    PdfPCell cell = new PdfPCell(new Phrase(texto, dataFont));
                    cell.setHorizontalAlignment((j == 5) ? Element.ALIGN_RIGHT : Element.ALIGN_LEFT);
                    cell.setPadding(5);
                    pdfTable.addCell(cell);
                }
            }

            document.add(pdfTable);

            // Total de productos
            int totalProductos = tabla.getRowCount();
            int totalExistencias = calcularTotalExistencias(tabla);

            Paragraph totales = new Paragraph();
            totales.add(new Chunk("Total de productos: ",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 11)));
            totales.add(new Chunk(String.valueOf(totalProductos),
                    FontFactory.getFont(FontFactory.HELVETICA, 11)));
            totales.add(Chunk.NEWLINE);
            totales.add(new Chunk("Total en existencia: ",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 11)));
            totales.add(new Chunk(numberFormat.format(totalExistencias),
                    FontFactory.getFont(FontFactory.HELVETICA, 11)));
            totales.setAlignment(Element.ALIGN_RIGHT);
            totales.setSpacingBefore(10f);
            document.add(totales);

            // Pie de página (usando java.util.Date)
            Paragraph footer = new Paragraph(
                    "Generado el: " + sdf.format(fechaActual) + " - Sistema de Inventario",
                    FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 9));
            footer.setAlignment(Element.ALIGN_CENTER);
            footer.setSpacingBefore(15f);
            document.add(footer);

            document.close();

            System.out.println("PDF de existencias generado: " + nombreArchivo);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al generar PDF de existencias: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

// Método auxiliar para calcular el total de existencias
    private static int calcularTotalExistencias(JTable tabla) {
        int total = 0;
        int columnaExistencia = 5; // Ajusta según la posición de la columna de existencias

        for (int i = 0; i < tabla.getRowCount(); i++) {
            try {
                Object valor = tabla.getValueAt(i, columnaExistencia);
                if (valor instanceof Number) {
                    total += ((Number) valor).intValue();
                }
            } catch (Exception e) {
                System.err.println("Error procesando fila " + i);
            }
        }
        return total;
    }

    public static void exportarTablaVentasPDF(JTable tabla, String nombreArchivo, java.util.Date fechaInicio, java.util.Date fechaFin) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
            document.open();

            // Formateador de fechas
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            // Título principal
            Paragraph titulo = new Paragraph("Reporte de Ventas por Período",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            // Subtítulo con rango de fechas
            Paragraph subTitulo = new Paragraph(
                    "Del " + sdf.format(fechaInicio) + " al " + sdf.format(fechaFin),
                    FontFactory.getFont(FontFactory.HELVETICA, 12));
            subTitulo.setAlignment(Element.ALIGN_CENTER);
            document.add(subTitulo);

            document.add(Chunk.NEWLINE); // Espacio más eficiente

            // Configuración de la tabla PDF
            PdfPTable pdfTable = new PdfPTable(tabla.getColumnCount());
            pdfTable.setWidthPercentage(100);
            pdfTable.setWidths(new float[]{1f, 1.5f, 2f, 2f, 1.5f, 1.5f, 1f, 1.5f, 1.5f});

            // Estilo para encabezados
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10);
            BaseColor headerColor = new BaseColor(200, 200, 200);

            // Agregar encabezados
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                PdfPCell cell = new PdfPCell(new Phrase(tabla.getColumnName(i), headerFont));
                cell.setBackgroundColor(headerColor);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setPadding(5);
                pdfTable.addCell(cell);
            }

            // Agregar datos de la tabla
            Font dataFont = FontFactory.getFont(FontFactory.HELVETICA, 10);
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

            for (int i = 0; i < tabla.getRowCount(); i++) {
                for (int j = 0; j < tabla.getColumnCount(); j++) {
                    Object valor = tabla.getValueAt(i, j);
                    String texto = (valor != null) ? valor.toString() : "";

                    // Formatear números para columnas monetarias
                    if (j >= 7 && valor instanceof Number) { // Columnas 7 y 8 son precios
                        texto = currencyFormat.format(valor);
                    }

                    PdfPCell cell = new PdfPCell(new Phrase(texto, dataFont));
                    cell.setHorizontalAlignment((j >= 6) ? Element.ALIGN_RIGHT : Element.ALIGN_LEFT);
                    cell.setPadding(5);
                    pdfTable.addCell(cell);
                }
            }

            document.add(pdfTable);

            // Total general con formato mejorado
            double totalVentas = calcularTotalVentas(tabla);
            Paragraph total = new Paragraph("Total General de Ventas: "
                    + currencyFormat.format(totalVentas),
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12));
            total.setAlignment(Element.ALIGN_RIGHT);
            total.setSpacingBefore(10f);
            document.add(total);

            // Pie de página con fecha de generación
            Paragraph footer = new Paragraph(
                    "Generado el: " + sdf.format(new java.util.Date()) + " - Sistema de Ventas",
                    FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 9));
            footer.setAlignment(Element.ALIGN_CENTER);
            footer.setSpacingBefore(15f);
            document.add(footer);

            document.close();

            System.out.println("PDF generado exitosamente: " + nombreArchivo);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al generar el PDF: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static double calcularTotalVentas(JTable tabla) {
        double total = 0;
        int columnaTotal = 8; // Asumiendo que la columna 8 es "Total Venta"

        for (int i = 0; i < tabla.getRowCount(); i++) {
            try {
                Object valor = tabla.getValueAt(i, columnaTotal);
                if (valor instanceof Number) {
                    total += ((Number) valor).doubleValue();
                }
            } catch (Exception e) {
                System.err.println("Error procesando total de venta en fila " + i);
            }
        }
        return total;
    }
}
