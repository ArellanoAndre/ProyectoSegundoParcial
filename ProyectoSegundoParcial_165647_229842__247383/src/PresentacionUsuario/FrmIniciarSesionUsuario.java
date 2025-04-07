
package PresentacionUsuario;

/**
 *
 * @author aleja
 */
public class FrmIniciarSesionUsuario extends javax.swing.JFrame {

    public FrmIniciarSesionUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JTextField();
        txtpswContrasena = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        bntContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(115, 147, 156));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lblIniciarSesion.setBackground(new java.awt.Color(102, 102, 102));
        lblIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Iniciar Sesión");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        lblUsuario.setBackground(new java.awt.Color(153, 153, 153));
        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblUsuario.setText("Usuario");

        lblContrasena.setBackground(new java.awt.Color(153, 153, 153));
        lblContrasena.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblContrasena.setText("Contraseña");
        lblContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblContrasenaActionPerformed(evt);
            }
        });

        bntContinuar.setBackground(new java.awt.Color(153, 255, 153));
        bntContinuar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bntContinuar.setForeground(new java.awt.Color(0, 0, 0));
        bntContinuar.setText("Continuar");
        bntContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContrasena)
                            .addComponent(lblUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtpswContrasena)))
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(bntContinuar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpswContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bntContinuar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblContrasenaActionPerformed

    private void bntContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntContinuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIniciarSesionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIniciarSesionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntContinuar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField lblContrasena;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JTextField lblUsuario;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpswContrasena;
    // End of variables declaration//GEN-END:variables
}
