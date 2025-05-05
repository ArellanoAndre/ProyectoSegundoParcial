
package Frames_Admin;

/**
 *
 * @author aleja
 */
public class FrmRegistrarAdmin extends javax.swing.JFrame {

    public FrmRegistrarAdmin() {
        initComponents();
        setLocationRelativeTo(null);
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
        lblContrasena = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
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

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 108, -1));

        lblPaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblPaterno.setText("Apellido Paterno");
        jPanel2.add(lblPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 120, -1));

        lblMaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblMaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaterno.setText("Apellido Materno");
        jPanel2.add(lblMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        lblCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCelular.setText("Celular");
        jPanel2.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDireccion.setText("Dirección");
        jPanel2.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 87, -1));

        lblCorreeo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCorreeo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreeo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreeo.setText("Correo");
        jPanel2.add(lblCorreeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 73, -1));

        lblContrasena.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContrasena.setText("Contraseña");
        jPanel2.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 87, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 125, 27));
        jPanel2.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 125, 27));

        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });
        jPanel2.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 125, 27));
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 125, 27));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 125, 27));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 125, 27));
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 125, 27));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaternoActionPerformed

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        FrmMenuAdmin fma = new FrmMenuAdmin();
        fma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmRegistrarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarAdmin().setVisible(true);
            }
        });
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
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreeo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
