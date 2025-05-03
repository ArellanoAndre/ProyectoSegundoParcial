
package Frames_Admin;

import Frames_Loggin.Main;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aleja
 */
public class FrmMenuAdmin extends javax.swing.JFrame {

    public FrmMenuAdmin() {
        initComponents();
         this.setTitle("Menu Principal de Administradores");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        btnGestionMantenimiento = new javax.swing.JButton();
        btnAdministrarInstalaciones = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAdministrarInstalaciones1 = new javax.swing.JButton();
        btnGestionMantenimiento1 = new javax.swing.JButton();
        PanelHistograma1 = new javax.swing.JPanel();
        FondoAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(0, 0, 0));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lblIniciarSesion.setBackground(new java.awt.Color(102, 102, 102));
        lblIniciarSesion.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Paneles Solares");

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSalir)
                .addGap(108, 108, 108)
                .addComponent(lblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        btnGestionMantenimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGestionMantenimiento.setText("Gestión Catalogo");
        btnGestionMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionMantenimientoActionPerformed(evt);
            }
        });
        jpFondo.add(btnGestionMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 220, 40));

        btnAdministrarInstalaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdministrarInstalaciones.setText("Gestionar Administradores");
        btnAdministrarInstalaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarInstalacionesActionPerformed(evt);
            }
        });
        jpFondo.add(btnAdministrarInstalaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 220, 40));

        btnReportes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jpFondo.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 220, 40));

        btnAdministrarInstalaciones1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdministrarInstalaciones1.setText("Gestionar Clientes");
        btnAdministrarInstalaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarInstalaciones1ActionPerformed(evt);
            }
        });
        jpFondo.add(btnAdministrarInstalaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 220, 40));

        btnGestionMantenimiento1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGestionMantenimiento1.setText("Gestión Inventario");
        btnGestionMantenimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionMantenimiento1ActionPerformed(evt);
            }
        });
        jpFondo.add(btnGestionMantenimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 220, 40));

        PanelHistograma1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelHistograma1Layout = new javax.swing.GroupLayout(PanelHistograma1);
        PanelHistograma1.setLayout(PanelHistograma1Layout);
        PanelHistograma1Layout.setHorizontalGroup(
            PanelHistograma1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelHistograma1Layout.setVerticalGroup(
            PanelHistograma1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpFondo.add(PanelHistograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 250, 200));

        FondoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/FondoAdmin.jpg"))); // NOI18N
        FondoAdmin.setInheritsPopupMenu(false);
        jpFondo.add(FondoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 660, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionMantenimientoActionPerformed
       FrmAdministarCatalogoProducto frmcp = new FrmAdministarCatalogoProducto();
       frmcp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionMantenimientoActionPerformed

    private void btnAdministrarInstalacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarInstalacionesActionPerformed
        FrmAdministrarAdmin frmaa = new FrmAdministrarAdmin();
        frmaa.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnAdministrarInstalacionesActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        Main.main(null);
        this.dispose();
        
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnAdministrarInstalaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarInstalaciones1ActionPerformed
       FrmAdministrarUsuarios frmgu = new FrmAdministrarUsuarios();
       frmgu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdministrarInstalaciones1ActionPerformed

    private void btnGestionMantenimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionMantenimiento1ActionPerformed
        FrmAdministarInventarioProductos frmgi = new FrmAdministarInventarioProductos();
        frmgi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionMantenimiento1ActionPerformed


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
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoAdmin;
    private javax.swing.JPanel PanelHistograma1;
    private javax.swing.JButton btnAdministrarInstalaciones;
    private javax.swing.JButton btnAdministrarInstalaciones1;
    private javax.swing.JButton btnGestionMantenimiento;
    private javax.swing.JButton btnGestionMantenimiento1;
    private javax.swing.JButton btnReportes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblSalir;
    // End of variables declaration//GEN-END:variables
}
