package Frames_Admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableCellRenderer;

public class FrmReporteExistencias extends JFrame {

    private JTable tblExistencias;
    private DefaultTableModel modeloTabla;

    public FrmReporteExistencias() {
        // Configuración de la ventana principal
        setTitle("Reporte de Existencias");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear el modelo de la tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Precio Compra");
        modeloTabla.addColumn("Precio Venta");
        modeloTabla.addColumn("Cantidad Stock");

        // Crear la tabla
        tblExistencias = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tblExistencias);

        // Agregar la tabla al panel principal
        add(scrollPane, BorderLayout.CENTER);

        // Cargar los datos de la base de datos
        cargarDatos();

        // Personalizar la tabla
        personalizarTabla();

        // Aparecer en el centro
        setLocationRelativeTo(null);

        // Hacer visible la ventana
        setVisible(true);
    }

    private void cargarDatos() {
        String url = "jdbc:mysql://localhost:3306/paneles";
        String user = "root";
        String password = "123";

        String query = "SELECT id, producto, marca, modelo, descripcion, precioCompra, precioVenta, Cantidad_Stock FROM productos";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                fila.add(rs.getInt("id"));
                fila.add(rs.getString("producto"));
                fila.add(rs.getString("marca"));
                fila.add(rs.getString("modelo"));
                fila.add(rs.getString("descripcion"));
                fila.add(rs.getBigDecimal("precioCompra"));
                fila.add(rs.getBigDecimal("precioVenta"));
                fila.add(rs.getInt("Cantidad_Stock"));
                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void personalizarTabla() {
        // Personalización del encabezado
        tblExistencias.getTableHeader().setBackground(Color.BLUE);
        tblExistencias.getTableHeader().setForeground(Color.WHITE);
        tblExistencias.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

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

        for (int i = 0; i < tblExistencias.getColumnCount(); i++) {
            tblExistencias.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Personalización del fondo y texto de la tabla
        tblExistencias.setBackground(Color.GRAY);
        tblExistencias.setForeground(Color.WHITE);
        tblExistencias.setFont(new Font("Arial", Font.PLAIN, 14));

        // Ajustar el ancho de las columnas
        tblExistencias.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
        tblExistencias.getColumnModel().getColumn(1).setPreferredWidth(150); // Producto
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteExistencia = new javax.swing.JTable();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
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

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SwingUtilities.invokeLater(() -> new FrmReporteExistencias());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReporteExistencia;
    // End of variables declaration//GEN-END:variables
}
