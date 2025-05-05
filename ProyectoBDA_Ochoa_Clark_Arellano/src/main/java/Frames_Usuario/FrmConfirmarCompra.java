package Frames_Usuario;

import Control.ControlCarrito;
import Entidades.Compra;
import Entidades.ProductoCarrito;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class FrmConfirmarCompra extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private int U;

    public FrmConfirmarCompra(int U) {
        this.U = U;
        initComponents();
        setLocationRelativeTo(null);
        configurarTabla();
        cargarDatos();
    }

    private void cargarDatos() {
        try {
            // Obtener la lista de compras del usuario
            ControlCarrito cp = new ControlCarrito();
            List<ProductoCarrito> comprasUsuario = cp.verCarrito(U); // U es el ID del usuario

            // Limpiar la tabla antes de cargar los nuevos datos
            tableModel.setRowCount(0);

            if (comprasUsuario.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay compras registradas.", "Información", JOptionPane.INFORMATION_MESSAGE);
                FrmCatalogoProductos f = new FrmCatalogoProductos(U);
                this.dispose();
                return;
            }

            // Iterar sobre las compras y agregar filas a la tabla
            for (ProductoCarrito compra : comprasUsuario) {
                Object[] row = {
                    compra.getId(), // ID de la compra
                    compra.getProductoId(), // ID del producto
                    compra.getMarca(), // Cantidad
                    compra.getModelo(), // Precio unitario
                    compra.getPrecioUnitario(), // Total (calculado)
                    compra.getTotalProducto()// Fecha de la compra
                };
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar las compras: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void configurarTabla() {
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Hacer que todas las celdas no sean editables
                return false;
            }
        };

        // Configurar las coluomnas según la entidad Compra
        tableModel.addColumn("Id");
        tableModel.addColumn("Producto");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Precio Unitario");
        tableModel.addColumn("Precio Total");

        tblConfirmarCompra.setModel(tableModel);

        // Opcional: Ajustar el ancho de las columnas
        tblConfirmarCompra.getColumnModel().getColumn(5).setPreferredWidth(120); // Fecha más ancha
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConfirmarCompra = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblVolveer = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnIrAlCarrito = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(115, 147, 156));

        tblConfirmarCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Producto", "Marca", "Modelo", "Precio Unitario", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(tblConfirmarCompra);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Confirmar Compra");

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
                .addGap(263, 263, 263)
                .addComponent(jLabel1)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblVolveer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnComprar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnIrAlCarrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIrAlCarrito.setText("Ir al Carrito");
        btnIrAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrAlCarritoActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIrAlCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnComprar)
                        .addGap(18, 18, 18)
                        .addComponent(btnIrAlCarrito)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(0, 35, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents


    private void lblVolveerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolveerMouseClicked
        FrmMenuUsuario menuUsuario = new FrmMenuUsuario(U);
        menuUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolveerMouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
// 1. Verificar que hay productos en el carrito
        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this,
                    "No hay productos en el carrito para comprar",
                    "Carrito vacío",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. Confirmar con el usuario
        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea realizar la compra?",
                "Confirmar compra",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        ControlCarrito control = new ControlCarrito();
        // 3. Obtener todos los productos del carrito
        List<ProductoCarrito> productos = control.verCarrito(U);
        // 4. Registrar cada producto como compra
        for (ProductoCarrito producto : productos) {
            Compra nuevaCompra = new Compra(
                    producto.getProductoId(),
                    U, // ID del admin (ajustar según tu sistema)
                    producto.getCantidad(),
                    producto.getPrecioUnitario()
            );
            
            // Registrar en base de datos
            control.comprarCarrito(U);
        }
        
        JOptionPane.showMessageDialog(this,
                "Compra realizada con éxito",
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
        // 7. Redirigir a detalle de compra
        FrmDetalleCompra detalleCompra = new FrmDetalleCompra(U);
        detalleCompra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnIrAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrAlCarritoActionPerformed
        FrmCarrito Carrito = new FrmCarrito(U);
        Carrito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIrAlCarritoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tblConfirmarCompra.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Lógica

            JOptionPane.showMessageDialog(this, "Producto Eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIrAlCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVolveer;
    private javax.swing.JTable tblConfirmarCompra;
    // End of variables declaration//GEN-END:variables
}
