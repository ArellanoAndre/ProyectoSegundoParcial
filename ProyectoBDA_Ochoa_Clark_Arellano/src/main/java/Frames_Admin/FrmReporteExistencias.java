package Frames_Admin;

import Control.ControlReporte;
import Control.ExportarPDF;
import Entidades.Producto;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableCellRenderer;

public class FrmReporteExistencias extends JFrame {

    private DefaultTableModel tableModel;
    private int U;

    public FrmReporteExistencias(int U) {
        initComponents();
        configurarTabla();
        setLocationRelativeTo(null);
        this.U = U;
        setVisible(true);
    }

    private void configurarTabla() {
        tableModel = new DefaultTableModel();

        // Configurar columnas según los datos que queremos mostrar
        tableModel.addColumn("ID");                // Columna para el ID
        tableModel.addColumn("Producto");
        tableModel.addColumn("Marca");             // Columna para la marca
        tableModel.addColumn("Modelo");            // Columna para el modelo
        tableModel.addColumn("Descripción");      // Columna para la descripción
        tableModel.addColumn("Existencia");       // Nueva columna para existencia

        // Asignar el modelo de la tabla
        tblReporteExistencia.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteExistencia = new javax.swing.JTable();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        lblVolver = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblReporteExistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Producto", "Marca", "Modelo", "Descripcion", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblReporteExistencia);

        jLabel1.setText("Filtrar Producto:");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });

        btnGenerarPDF.setText("PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVolver)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnFiltrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnGenerarPDF)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltrar))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarPDF)))
                .addGap(20, 20, 20))
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

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        FrmMenuAdmin fma = new FrmMenuAdmin(U);
        fma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
// Obtenemos el texto del filtro desde txtFiltro
        String filtro = txtFiltro.getText().trim();

        // Limpiar la tabla antes de agregar nuevos datos
        tableModel.setRowCount(0);

        if (filtro.isEmpty()) {
            // Si el filtro está vacío, obtener todos los productos
            List<Producto> productos = new ControlReporte().verExistenciaProductoTodos();
            for (Producto producto : productos) {
                // Agregar los datos del producto a la tabla
                tableModel.addRow(new Object[]{
                    producto.getId(),
                    producto.getProducto(),
                    producto.getMarca(),
                    producto.getModelo(),
                    producto.getDescripcion(),
                    producto.getCantidadStock()
                });
            }
        } else {
            // Si hay un filtro, obtener los productos filtrados por nombre
            List<Producto> productosFiltrados = new ControlReporte().verProductosConFiltroPorNombre(filtro);
            for (Producto producto : productosFiltrados) {
                // Agregar los datos del producto a la tabla
                tableModel.addRow(new Object[]{
                    producto.getId(),
                    producto.getProducto(),
                    producto.getMarca(),
                    producto.getModelo(),
                    producto.getDescripcion(),
                    producto.getCantidadStock()
                });
            }
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        String nombreArchivo = "ReporteExistencias.pdf";
    ExportarPDF.exportarTablaPDF(tblReporteExistencia, nombreArchivo);

    try {
        java.awt.Desktop.getDesktop().open(new java.io.File(nombreArchivo));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTable tblReporteExistencia;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
