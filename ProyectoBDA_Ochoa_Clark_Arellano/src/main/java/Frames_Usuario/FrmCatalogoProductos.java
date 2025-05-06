package Frames_Usuario;

import Control.ControlCarrito;
import Control.Control_Productos;
import Entidades.Producto;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class FrmCatalogoProductos extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private int U;

    public FrmCatalogoProductos(int U) {
        this.U = U;
        initComponents();
        setLocationRelativeTo(null);
        configurarTabla();
        cargarDatos();

        System.out.println(U);
    }

    public int obtenerClienteSeleccionado() {
        int filaSeleccionada = tblProductos.getSelectedRow(); // tu JTable con clientes

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente.");
            return -1; // o puedes lanzar una excepción si lo prefieres
        }

        // Supongamos que la columna 0 contiene el ID del cliente
        return (int) tblProductos.getValueAt(filaSeleccionada, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblVolveer = new javax.swing.JLabel();
        btnIrAlCarrito = new javax.swing.JButton();
        btnAnadirCarrito1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(115, 147, 156));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Marca", "Modelo", "Descripción", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Catálogo Productos");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnIrAlCarrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIrAlCarrito.setText("Ir al Carrito");
        btnIrAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrAlCarritoActionPerformed(evt);
            }
        });

        btnAnadirCarrito1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAnadirCarrito1.setText("Añadir al Carrito");
        btnAnadirCarrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirCarrito1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad :");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnadirCarrito1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIrAlCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCantidad))
                .addContainerGap())
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
                        .addGap(63, 63, 63)
                        .addComponent(btnAnadirCarrito1)
                        .addGap(18, 18, 18)
                        .addComponent(btnIrAlCarrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 31, Short.MAX_VALUE))
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

    // Este no sirve pa nada, nomás el de abajo
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void lblVolveerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolveerMouseClicked
        FrmMenuUsuario menuUsuario = new FrmMenuUsuario(U);
        menuUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolveerMouseClicked

    private void btnIrAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrAlCarritoActionPerformed
        FrmCarrito Carrito = new FrmCarrito(U);
        Carrito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIrAlCarritoActionPerformed

    private void btnAnadirCarrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirCarrito1ActionPerformed
     // 1. Validar selección de producto
    int row = tblProductos.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(this, "Selecciona un producto", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // 2. Validar cantidad
    if (!validarCantidad()) {
        return;
    }
    // Después de validar la cantidad pero antes de agregar al carrito:
int cantidad = Integer.parseInt(txtCantidad.getText().trim());
if (!validarStockCarrito(cantidad)) {
    return;
}
    
    // 3. Obtener datos
    int idProducto = (int) tableModel.getValueAt(row, 0);
    
    // 4. Confirmar con el usuario
    int confirm = JOptionPane.showConfirmDialog(this, 
        "¿Agregar " + cantidad + " unidades al carrito?", 
        "Confirmar", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }
    
    try {
        // 5. Agregar al carrito
        ControlCarrito cc = new ControlCarrito();
        boolean agregado = cc.agregarProductoCarrito(U, idProducto, cantidad);
        
        if (agregado) {
            JOptionPane.showMessageDialog(this, "Producto agregado al carrito");
            txtCantidad.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar al carrito", 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al agregar al carrito: " + e.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAnadirCarrito1ActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private boolean validarCantidad() {
        String cantidadStr = txtCantidad.getText().trim();

        if (cantidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La cantidad no puede estar vacía", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validación adicional para asegurar que el valor es un número entero
        if (!cantidadStr.matches("\\d+")) { // Solo números positivos
            JOptionPane.showMessageDialog(this, "La cantidad solo puede contener números positivos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            int cantidad = Integer.parseInt(cantidadStr);

            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (cantidad > 1000000) {
                JOptionPane.showMessageDialog(this, "La cantidad no puede ser mayor a 1,000,000", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true;

        } catch (NumberFormatException e) {
            // Esto solo ocurriría si el número es demasiado grande para un int
            JOptionPane.showMessageDialog(this, "La cantidad excede el límite permitido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void cargarDatos() {
        try {
            java.util.List<Producto> productos = new java.util.ArrayList<>();
            Control_Productos cp = new Control_Productos();
            productos = cp.listarProductosCliente();
            tableModel.setRowCount(0); // Limpiar tabla
            for (Producto p : productos) {
                Object[] row = {
                    p.getId(),
                    p.getProducto(),
                    p.getMarca(),
                    p.getModelo(),
                    p.getDescripcion(),
                    p.getPrecioVenta(),
                    p.getCantidadStock()
                };
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
        }
    }

    private void configurarTabla() {
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Todas las celdas no son editables
            }
        };
        tableModel.addColumn("ID");
        tableModel.addColumn("Producto");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Descripcion");
        tableModel.addColumn("Precio");
        tableModel.addColumn("Cantidad");
        tblProductos.setModel(tableModel);
    }
    private boolean validarStockCarrito(int cantidadDeseada) {
    int filaSeleccionada = tblProductos.getSelectedRow();
    if (filaSeleccionada < 0) return false;
    
    // Obtener stock disponible (columna 5 según tu tabla)
    int stockDisponible = (int) tblProductos.getValueAt(filaSeleccionada, 6);
    
    if (cantidadDeseada > stockDisponible) {
        String nombreProducto = (String) tblProductos.getValueAt(filaSeleccionada, 1);
        JOptionPane.showMessageDialog(this, 
            "Stock insuficiente de " + nombreProducto + "\nDisponible: " + stockDisponible, 
            "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirCarrito1;
    private javax.swing.JButton btnIrAlCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVolveer;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
