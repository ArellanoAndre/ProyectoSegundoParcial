
package Frames_Usuario;

import Control.Control_Usuario;
import Entidades.Rol;
import Entidades.Usuario;
import Frames_Loggin.Loggin;
import Frames_Loggin.Main;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Clark
 */
public class FrmRegistarUsuario extends javax.swing.JFrame {

    public FrmRegistarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblAgregarUsuario = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblPaterno = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreeo = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        lblCorreeo1 = new javax.swing.JLabel();
        txtConfirmaContra = new javax.swing.JPasswordField();
        txtContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(115, 147, 156));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAgregarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAgregarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarUsuario.setText("Agregar Usuario");

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVolver)
                .addGap(72, 72, 72)
                .addComponent(lblAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lblAgregarUsuario))
                .addContainerGap())
        );

        lblNombreCompleto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombreCompleto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreCompleto.setText("Nombre Completo");

        lblPaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPaterno.setText("Nombre Usuario");

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDireccion.setText("Dirección");

        lblCorreeo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCorreeo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreeo.setText("Correo");

        lblContrasena.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContrasena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContrasena.setText("Confirmar contra");

        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(153, 255, 153));
        btnSiguiente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        lblCorreeo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCorreeo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreeo1.setText("Contraseña");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombreCompleto, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblCorreeo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCorreeo1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtConfirmaContra)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(txtNombreUsuario))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblContrasena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSiguiente)
                            .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCompleto)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreeo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCorreeo1)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(txtConfirmaContra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasena)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnSiguiente)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       // Verificar que no haya campos vacíos
    if (txtNombreCompleto.getText().isEmpty() || txtNombreUsuario.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCorreo.getText().isEmpty() ||
        txtConfirmaContra.getText().isEmpty() || txtContra.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);
        return; // Salir del método si hay campos vacíos
    }


    // Validar Nombre Completo
    if (!isValidName(txtNombreCompleto.getText())) {
        JOptionPane.showMessageDialog(this, "El apellido paterno solo puede contener letras y espacios.", "Error", JOptionPane.WARNING_MESSAGE);
        txtNombreUsuario.setText(""); // Limpiar el campo del apellido paterno
        return; // Salir del método si no es válido
    }
    // Validar Nombre Usuario
    if (!isValidNombreUsuario(txtNombreUsuario.getText())) {
        JOptionPane.showMessageDialog(this, "El apellido paterno solo puede contener letras y espacios.", "Error", JOptionPane.WARNING_MESSAGE);
        txtNombreUsuario.setText(""); // Limpiar el campo del apellido paterno
        return; // Salir del método si no es válido
    }

    // Validar correo
    if (!isValidEmail(txtCorreo.getText())) {
        JOptionPane.showMessageDialog(this, "El correo electrónico no es válido.", "Error", JOptionPane.WARNING_MESSAGE);
        txtCorreo.setText(""); // Limpiar el campo del correo
        return; // Salir del método si no es válido
    }

    // Comprobar que las contraseñas NO ESTEN VACIAS 
    if (txtConfirmaContra.getText().isEmpty() || txtContra.getText().isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Las contraseñas no pueden estar Vacias.", "Error", JOptionPane.WARNING_MESSAGE);
        txtContra.setText(""); // Limpiar la confirmación de contraseña
        return; // Salir del método si las contraseñas no coinciden
    }
     // Comprobar que las contraseñas coincidan
    if (!txtContra.getText().equals(txtConfirmaContra.getText() )) {
        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error", JOptionPane.WARNING_MESSAGE);
        txtContra.setText(""); // Limpiar la confirmación de contraseña
        return; // Salir del método si las contraseñas no coinciden
    }

        
    // Crear usuario y proceder
    Control_Usuario back = new Control_Usuario();
Usuario usuario = new Usuario(
    txtNombreCompleto.getText(),
    txtNombreUsuario.getText(),
    txtDireccion.getText(),
    txtCorreo.getText(),
    txtContra.getText(),
    Rol.CLIENTE  // Rol fijo
);    back.crearUsuario(usuario);
    // Redirigir a la pantalla de login
    Main.main(null);
    this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        Loggin loggin = new Loggin(); 
        loggin.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_lblVolverMouseClicked

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

private boolean isValidEmail(String email) {
    // Expresión regular para validar correos electrónicos
    String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    return email != null && email.matches(emailRegex);
}

// Validar nombre
private boolean isValidName(String name) {
    String nameRegex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$";
    return name != null && name.matches(nameRegex);
}

// Validar contraseña
private boolean isValidPassword(String password) {
    String passwordRegex = "^[a-zA-Z0-9]{6,}$";
    return password != null && password.matches(passwordRegex);
}

// Validar contraseña
private boolean isValidNombreUsuario(String password) {
    String passwordRegex = "^[a-zA-Z0-9]+$";
    return password != null && password.matches(passwordRegex);
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAgregarUsuario;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreeo;
    private javax.swing.JLabel lblCorreeo1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPasswordField txtConfirmaContra;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
