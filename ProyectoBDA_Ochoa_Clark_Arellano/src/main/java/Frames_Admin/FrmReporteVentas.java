package Frames_Admin;

import Control.ControlReporte;
import Control.ExportarPDF;
import Entidades.VentaReporte;
import com.toedter.calendar.JCalendar;
import java.awt.Desktop;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FrmReporteVentas extends JFrame {

    private JCalendar calendarInicio;
    private JCalendar calendarFin;
    private JTextField fechaInicioField;
    private JTextField fechaFinField;
    private int U;

    public FrmReporteVentas(int U) {
        initComponents();
        setLocationRelativeTo(null);
        this.U = U;
        setPreferredSize(new Dimension(1000, 700)); // Establecer tamaño preferido

        // Configuración del panel principal con layout nulo para posicionamiento absoluto
        jpPrincipal.setLayout(null);

        // Calcular posiciones centrales
        int panelWidth = 1000;
        int calendarWidth = 220;
        int gap = 30; // Espacio entre calendarios
        int startX = (panelWidth - (2 * calendarWidth + gap)) / 2; // Posición inicial para centrar

        // Crear e inicializar los JCalendar
        calendarInicio = new JCalendar();
        calendarInicio.setBounds(startX, 40, calendarWidth, 180);  // Calendario de fecha inicio
        jpPrincipal.add(calendarInicio);

        calendarFin = new JCalendar();
        calendarFin.setBounds(startX + calendarWidth + gap, 40, calendarWidth, 180); // Calendario de fecha fin
        jpPrincipal.add(calendarFin);

        // Crear e inicializar los JTextField para mostrar las fechas
        fechaInicioField = new JTextField(10);
        fechaInicioField.setBounds(startX, 230, calendarWidth, 25);
        fechaInicioField.setEditable(false);
        jpPrincipal.add(fechaInicioField);

        fechaFinField = new JTextField(10);
        fechaFinField.setBounds(startX + calendarWidth + gap, 230, calendarWidth, 25);
        fechaFinField.setEditable(false);
        jpPrincipal.add(fechaFinField);

        // Etiquetas para los campos
        JLabel lblInicio = new JLabel("Fecha Inicio:");
        lblInicio.setBounds(startX, 10, 100, 20);
        jpPrincipal.add(lblInicio);

        JLabel lblFin = new JLabel("Fecha Fin:");
        lblFin.setBounds(startX + calendarWidth + gap, 10, 100, 20);
        jpPrincipal.add(lblFin);

        // Posicionar el botón Filtrar al lado del segundo calendario
        jButton1.setBounds(startX + 2 * calendarWidth + gap + 10, 40, 80, 30);
        jpPrincipal.add(jButton1);

        // Ajustar la tabla para que aparezca debajo de los controles de filtrado
        jScrollPane1.setBounds(50, 270, 900, 350);
        jpPrincipal.add(jScrollPane1);

        // Agregar acción al botón Filtrar
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnFiltrarActionPerformed(e);
            }
        });

        // Actualizar campos de texto cuando se seleccionan fechas
        calendarInicio.addPropertyChangeListener(evt -> {
            if ("calendar".equals(evt.getPropertyName())) {
                fechaInicioField.setText(calendarInicio.getDate().toString());
            }
        });

        calendarFin.addPropertyChangeListener(evt -> {
            if ("calendar".equals(evt.getPropertyName())) {
                fechaFinField.setText(calendarFin.getDate().toString());
            }
        });

        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSalir = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteVentas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnGenerarPDF = new javax.swing.JButton();
        lblVolver1 = new javax.swing.JLabel();

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        tblReporteVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Venta", "Fecha", "Cliente", "Producto", "Marca", "Modelo", "Cantidad Vendida", "Precio Unitario", "Total Venta"
            }
        ));
        jScrollPane1.setViewportView(tblReporteVentas);

        jButton1.setText("Filtrar");

        btnGenerarPDF.setText("PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        lblVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        lblVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolver1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVolver1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarPDF)
                .addGap(18, 18, 18))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVolver1)
                .addGap(2, 2, 2)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGenerarPDF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // Obtener las fechas seleccionadas
        java.util.Date fechaInicioUtil = calendarInicio.getDate();
        java.util.Date fechaFinUtil = calendarFin.getDate();

        // Validar que las fechas sean correctas
        if (fechaInicioUtil == null || fechaFinUtil == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar ambas fechas", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (fechaInicioUtil.after(fechaFinUtil)) {
            JOptionPane.showMessageDialog(this, "La fecha de inicio debe ser anterior a la fecha fin", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convertir java.util.Date a java.sql.Date
        java.sql.Date fechaInicio = new java.sql.Date(fechaInicioUtil.getTime());
        java.sql.Date fechaFin = new java.sql.Date(fechaFinUtil.getTime());

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = (DefaultTableModel) tblReporteVentas.getModel();
        model.setRowCount(0);

        try {
            // Obtener las ventas en el periodo seleccionado
            List<VentaReporte> ventas = new ControlReporte().obtenerReporteVentasPeriodo(fechaInicio, fechaFin);

            // Llenar la tabla con los datos obtenidos
            for (VentaReporte venta : ventas) {
                model.addRow(new Object[]{
                    venta.getIdVenta(),
                    venta.getFecha(),
                    venta.getCliente(),
                    venta.getProducto(),
                    venta.getMarca(),
                    venta.getModelo(),
                    venta.getCantidadVendida(),
                    venta.getPrecioUnitario(),
                    venta.getTotalVenta()
                });
            }

            // Mostrar mensaje si no hay resultados
            if (ventas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron ventas en el periodo seleccionado", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener el reporte de ventas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
     }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        // Verificar que hay fechas seleccionadas
        if (calendarInicio.getDate() == null || calendarFin.getDate() == null) {
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar ambas fechas para generar el reporte",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener y convertir fechas
        java.util.Date fechaInicioUtil = calendarInicio.getDate();
        java.util.Date fechaFinUtil = calendarFin.getDate();
        java.sql.Date fechaInicio = new java.sql.Date(fechaInicioUtil.getTime());
        java.sql.Date fechaFin = new java.sql.Date(fechaFinUtil.getTime());

        // Resto del método permanece igual...
        String nombreArchivo = String.format("ReporteVentas_%s_a_%s.pdf",
                new SimpleDateFormat("yyyyMMdd").format(fechaInicioUtil),
                new SimpleDateFormat("yyyyMMdd").format(fechaFinUtil));

        ExportarPDF.exportarTablaVentasPDF(tblReporteVentas, nombreArchivo, fechaInicio, fechaFin);

        // Abrir el PDF generado
        try {
            File pdfFile = new File(nombreArchivo);
            if (pdfFile.exists()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                JOptionPane.showMessageDialog(this,
                        "El archivo PDF no se generó correctamente",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al abrir el PDF: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        FrmMenuAdmin fma = new FrmMenuAdmin(U);
        fma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblVolver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolver1MouseClicked
         FrmMenuAdmin fma = new FrmMenuAdmin(U);
        fma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolver1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JLabel lblVolver1;
    private javax.swing.JTable tblReporteVentas;
    // End of variables declaration//GEN-END:variables
}
