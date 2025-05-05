package Frames_Admin;

import Control.Control_Usuario;
import Entidades.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class FrmRegistrarAdmin extends javax.swing.JFrame {

    public FrmRegistrarAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombreCompleto.setText("");
        txtNombreUsuario.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtContraseña.setText("");
        txtConfirmarContraseña.setText("");
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
        lblNombreCompleto = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreeo = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        lblContrasena1 = new javax.swing.JLabel();
        lblContrasena2 = new javax.swing.JLabel();
        txtConfirmarContraseña = new javax.swing.JPasswordField();
        txtContraseña = new javax.swing.JPasswordField();
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
        lblAgregarUsuario.setText("Agregar Admin");
        jPanel1.add(lblAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 205, 48));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        jPanel1.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 19, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        lblNombreCompleto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCompleto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreCompleto.setText("Nombre Completo");
        jPanel2.add(lblNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, -1));

        lblNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("Nombre Usuario");
        jPanel2.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 120, -1));

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDireccion.setText("Direccion");
        jPanel2.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        lblCorreeo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCorreeo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreeo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreeo.setText("Correo");
        jPanel2.add(lblCorreeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 73, -1));

        lblContrasena.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContrasena.setText("Contraseña");
        jPanel2.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 87, -1));
        jPanel2.add(txtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 125, 27));
        jPanel2.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 125, 27));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 125, 27));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 125, 27));

        btnSiguiente.setBackground(new java.awt.Color(153, 255, 153));
        btnSiguiente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        lblContrasena1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContrasena1.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContrasena1.setText("Contraseña");
        jPanel2.add(lblContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 87, -1));

        lblContrasena2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContrasena2.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContrasena2.setText("Confirmar Contraseña");
        jPanel2.add(lblContrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 310, 170, -1));
        jPanel2.add(txtConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 120, -1));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 120, -1));

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
        String nombreCompleto = txtNombreCompleto.getText().trim();
        String nombreUsuario = txtNombreUsuario.getText().trim(); // Asegúrate de tener un campo para esto
        String direccion = txtDireccion.getText().trim();
        String correo = txtCorreo.getText().trim();
        String contraseña = txtContraseña.getText().trim();
        String confirmarContraseña = txtConfirmarContraseña.getText().trim();

        // Validación de campos vacíos
        if (nombreCompleto.isEmpty() || nombreUsuario.isEmpty() || direccion.isEmpty()
                || correo.isEmpty() || contraseña.isEmpty() || confirmarContraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validación de nombre completo (solo letras y espacios)
        if (!nombreCompleto.matches("^[a-zA-ZÁÉÍÓÚáéíóúÑñ\\s]+$")) {
            JOptionPane.showMessageDialog(this, "El nombre completo solo debe contener letras y espacios.", "Nombre inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validación de formato de correo
        if (!correo.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un correo electrónico válido.", "Correo inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validación de contraseña segura
        if (!contraseña.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$")) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres, una letra mayúscula, una minúscula y un número.", "Contraseña insegura", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validación de coincidencia de contraseñas
        if (!contraseña.equals(confirmarContraseña)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error de contraseña", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear usuario y enviarlo al controlador
        Usuario usuario = new Usuario();
        usuario.setNombreCompleto(nombreCompleto);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setDireccion(direccion);
        usuario.setCorreo(correo);
        usuario.setContraseña(contraseña); // Se encripta dentro de crearUsuario()

        Control_Usuario cu = new Control_Usuario();
        cu.crearAdmin(usuario);
        limpiarCampos();
        FrmMenuAdmin fma = new FrmMenuAdmin();
        fma.setVisible(true);
        this.dispose();    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        FrmMenuAdmin fma = new FrmMenuAdmin();
        fma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoAdmin1;
    private javax.swing.JLabel FondoAdmin2;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAgregarUsuario;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblContrasena1;
    private javax.swing.JLabel lblContrasena2;
    private javax.swing.JLabel lblCorreeo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPasswordField txtConfirmarContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
