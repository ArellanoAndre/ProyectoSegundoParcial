package Frames_Admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableCellRenderer;

public class FrmReporteVentas extends JFrame {

    private JTable tblVentas;
    private DefaultTableModel modeloTabla;

    public FrmReporteVentas() {
        // Configuración de la ventana principal
        setTitle("Reporte de Ventas Perronas de los Paneles");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear el modelo de la tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID_Venta");
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Cliente");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Cantidad_Vendida");
        modeloTabla.addColumn("Precio_Unitario");
        modeloTabla.addColumn("Subtotal");
        modeloTabla.addColumn("Total_Venta");

        // Crear la tabla
        tblVentas = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tblVentas);

        // Agregar la tabla al panel principal
        add(scrollPane, BorderLayout.CENTER);

        // Cargar los datos de la base de datos
        cargarDatos();
        // Aparecer en el centro
        setLocationRelativeTo(null);
        // Hacer visible la ventana
        setVisible(true);
        
        personalizarTabla();
        
    }
    // CAMBIAR LOS DATOS PARA INGRESAR A LA BASE DE DATOS PERSONAL

    private void cargarDatos() {
        String url = "jdbc:mysql://localhost:3306/paneles";
        String user = "root";
        String password = "123";

        String query = "SELECT "
                + "v.id AS id_venta, "
                + "v.fecha AS fecha_venta, "
                + "u.NOMBRE_COMPLETO AS cliente, "
                + "p.producto AS producto, "
                + "p.marca AS marca, "
                + "p.modelo AS modelo, "
                + "dv.cantidad AS cantidad_vendida, "
                + "dv.precio_unitario AS precio_unitario, "
                + "(dv.cantidad * dv.precio_unitario) AS subtotal, "
                + "v.total AS total_venta "
                + "FROM ventas v "
                + "JOIN usuario u ON v.usuario_id = u.ID "
                + "JOIN detalle_venta dv ON v.id = dv.venta_id "
                + "JOIN productos p ON dv.producto_id = p.id "
                + "ORDER BY v.fecha DESC";

        try (Connection conn = DriverManager.getConnection(url, user, password); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                fila.add(rs.getInt("id_venta"));
                fila.add(rs.getTimestamp("fecha_venta"));
                fila.add(rs.getString("cliente"));
                fila.add(rs.getString("producto"));
                fila.add(rs.getString("marca"));
                fila.add(rs.getString("modelo"));
                fila.add(rs.getInt("cantidad_vendida"));
                fila.add(rs.getBigDecimal("precio_unitario"));
                fila.add(rs.getBigDecimal("subtotal"));
                fila.add(rs.getBigDecimal("total_venta"));
                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void personalizarTabla() {
    // Personalización del encabezado
    tblVentas.getTableHeader().setBackground(Color.BLUE);
    tblVentas.getTableHeader().setForeground(Color.WHITE);
    tblVentas.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

    // Personalización de las filas
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (row % 2 == 0) {
                c.setBackground(Color.LIGHT_GRAY);
            } else {
                c.setBackground(Color.WHITE);
            }

            if (isSelected) {
                c.setBackground(Color.YELLOW);
                c.setForeground(Color.BLACK);
            } else {
                c.setForeground(Color.BLACK);
            }

            return c;
        }
    };

    for (int i = 0; i < tblVentas.getColumnCount(); i++) {
        tblVentas.getColumnModel().getColumn(i).setCellRenderer(renderer);
    }

    // Personalización del fondo y texto de la tabla
    tblVentas.setBackground(Color.GRAY);
    tblVentas.setForeground(Color.WHITE);
    tblVentas.setFont(new Font("Arial", Font.PLAIN, 14));

    // Ajustar el ancho de las columnas
    tblVentas.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID Venta
    tblVentas.getColumnModel().getColumn(1).setPreferredWidth(150); // Fecha
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        tblReporteVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Venta", "Fecha", "Cliente", "Producto", "Marca", "Modelo", "Cantidad_Vendida", "Precio_Unitario", "Subtotal", "Total_Venta"
            }
        ));
        jScrollPane1.setViewportView(tblReporteVentas);

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 187, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SwingUtilities.invokeLater(() -> new FrmReporteVentas());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTable tblReporteVentas;
    // End of variables declaration//GEN-END:variables
}
