
package Frames_Usuario;

import Control.ControlCarrito;
import Entidades.ProductoCarrito;
import Frames_Loggin.Main;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class FrmDetalleCompra extends javax.swing.JFrame {
private DefaultTableModel tableModel;

    private int U;
    public FrmDetalleCompra(int U) {
        this.U=U;
        initComponents();
        setLocationRelativeTo(null);
        configurarTabla();
        cargarDatos();
    }

    private void configurarTabla() {
    tableModel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    tableModel.addColumn("ID Detalle");
    tableModel.addColumn("ID Producto");
    tableModel.addColumn("Marca");
    tableModel.addColumn("Modelo");
    tableModel.addColumn("Cantidad");
    tableModel.addColumn("Precio Unitario");
    tableModel.addColumn("Total");

    tblDetalleCompra.setModel(tableModel);

    tblDetalleCompra.getColumnModel().getColumn(0).setPreferredWidth(80);
    tblDetalleCompra.getColumnModel().getColumn(1).setPreferredWidth(80);
    tblDetalleCompra.getColumnModel().getColumn(4).setPreferredWidth(60);
    tblDetalleCompra.getColumnModel().getColumn(5).setPreferredWidth(100);
    tblDetalleCompra.getColumnModel().getColumn(6).setPreferredWidth(100);
}

private void cargarDatos() {
    try {
        ControlCarrito cp = new ControlCarrito();
        List<ProductoCarrito> comprasUsuario = cp.obtenerUltimaCompra(U);

        tableModel.setRowCount(0);

        if (comprasUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron detalles de compra.", "Información", JOptionPane.INFORMATION_MESSAGE);
            FrmCatalogoProductos f = new FrmCatalogoProductos(U);
            this.dispose();
            return;
        }

        for (ProductoCarrito compra : comprasUsuario) {
            Object[] row = {
                compra.getId(),
                compra.getProductoId(),
                compra.getMarca(),
                compra.getModelo(),
                compra.getCantidad(),
                compra.getPrecioUnitario(),
                compra.getTotalProducto()
            };
            tableModel.addRow(row);
        }

        double totalGeneral = comprasUsuario.stream()
                .mapToDouble(ProductoCarrito::getTotalProducto)
                .sum();
        lblTotal.setText(String.format("Total: $%.2f", totalGeneral));

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los detalles de compra: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleCompra = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblVolveer = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(115, 147, 156));

        tblDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "venta_id", "producto_id", "cantidad", "precio_unitario"
            }
        ));
        jScrollPane1.setViewportView(tblDetalleCompra);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detalle Compra");

        lblVolveer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        lblVolveer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolveerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVolveer)
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVolveer)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSiguiente.setBackground(new java.awt.Color(153, 255, 153));
        btnSiguiente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Total :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(btnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiguiente)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolveerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolveerMouseClicked
        FrmMenuUsuario menuUsuario = new FrmMenuUsuario(U);
        menuUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolveerMouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        FrmCatalogoProductos menuP = new FrmCatalogoProductos(U);
        menuP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVolveer;
    private javax.swing.JTable tblDetalleCompra;
    // End of variables declaration//GEN-END:variables
}
