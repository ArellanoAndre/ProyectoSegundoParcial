
package Frames_Admin;

import Control.Control_Productos;
import Entidades.Producto;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class FrmRegistrarProducto extends javax.swing.JFrame {

    private int U;
    public FrmRegistrarProducto(int U) {
        this.U=U;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        FondoAdmin1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblAgregarUsuario = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPaterno = new javax.swing.JLabel();
        lblMaterno = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreeo = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        FondoAdmin2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        FondoAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/FondoAdmin.jpg"))); // NOI18N
        FondoAdmin1.setInheritsPopupMenu(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(131, 174, 216));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAgregarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarUsuario.setText("Agregar Producto");
        jPanel1.add(lblAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 205, 48));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        jPanel1.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 19, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Producto");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 80, -1));

        lblPaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblPaterno.setText("Marca");
        jPanel2.add(lblPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, -1));

        lblMaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblMaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaterno.setText("Modelo");
        jPanel2.add(lblMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        lblCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCelular.setText("Descripción");
        jPanel2.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDireccion.setText("Precio Compra");
        jPanel2.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 110, 20));

        lblCorreeo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCorreeo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreeo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreeo.setText("Precio Venta");
        jPanel2.add(lblCorreeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 110, -1));
        jPanel2.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 125, 27));

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 125, 27));

        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 125, 27));
        jPanel2.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 125, 27));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 125, 27));
        jPanel2.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 125, 27));

        btnSiguiente.setBackground(new java.awt.Color(153, 255, 153));
        btnSiguiente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        FondoAdmin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/FondoAdmin.jpg"))); // NOI18N
        FondoAdmin2.setInheritsPopupMenu(false);
        jPanel2.add(FondoAdmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       // Obtener valores de los campos de texto
    String producto = txtProducto.getText().trim();
    String marca = txtMarca.getText().trim();
    String modelo = txtModelo.getText().trim();
    String descripcion = txtDescripcion.getText().trim();
    String precioVentaStr = txtPrecioVenta.getText().trim();
    String precioCompraStr = txtPrecioCompra.getText().trim();

    // Validaciones
    if (producto.isEmpty() || marca.isEmpty() || modelo.isEmpty() || descripcion.isEmpty() ||
        precioVentaStr.isEmpty() || precioCompraStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que los precios sean números no negativos
    double precioVenta, precioCompra;
    try {
        precioVenta = Double.parseDouble(precioVentaStr);
        precioCompra = Double.parseDouble(precioCompraStr);
        if (precioVenta < 0 || precioCompra < 0) {
            JOptionPane.showMessageDialog(this, "Los precios no pueden ser negativos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Los precios deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Si las validaciones pasan, crear objeto Producto y proceder
    Producto productoObj = new Producto(
        0, // ID se genera automáticamente
        producto,
        marca,
        modelo,
        descripcion,
        precioCompra,
        precioVenta
    );

    // Aquí puedes agregar la lógica para guardar el producto (usando ProductoDAO)
    try {
        Control_Productos productoDAO = new Control_Productos(); // Ajusta según tu clase de conexión
        productoDAO.insertarProducto(productoObj);
        JOptionPane.showMessageDialog(this, "Producto registrado exitosamente.");
        limpiarCampos();
        // Opcional: Abrir la siguiente pantalla si la tienes
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al registrar el producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }


FrmAdministarCatalogoProducto frmcp = new FrmAdministarCatalogoProducto(U);
       frmcp.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraActionPerformed

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        FrmAdministarCatalogoProducto frmcp = new FrmAdministarCatalogoProducto(U);
       frmcp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed
// Método para limpiar los campos después de un registro exitoso
private void limpiarCampos() {
    txtProducto.setText("");
    txtMarca.setText("");
    txtModelo.setText("");
    txtDescripcion.setText("");
    txtPrecioVenta.setText("");
    txtPrecioCompra.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoAdmin1;
    private javax.swing.JLabel FondoAdmin2;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAgregarUsuario;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreeo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
