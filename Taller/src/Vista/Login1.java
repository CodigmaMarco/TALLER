package Vista;


//import com.placeholder.PlaceHolder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class Login1 extends javax.swing.JFrame {



  //  PlaceHolder hol;

    public Login1() {
        initComponents();
        setLocationRelativeTo(null);
        //   hol = new PlaceHolder(txtUser,"Ingresa tu Usuario");
        //   hol = new PlaceHolder(txtPass,"Password");

    }





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDelantero = new javax.swing.JPanel();
        BtnMinimize = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        btnGo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Administrador Login");
        setBackground(new java.awt.Color(51, 51, 51));
        setName("login"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDelantero.setBackground(new java.awt.Color(255, 255, 255));
        jpDelantero.setForeground(new java.awt.Color(133, 144, 162));
        jpDelantero.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N

        BtnMinimize.setBackground(new java.awt.Color(33, 44, 62));
        BtnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_W_32.png"))); // NOI18N
        BtnMinimize.setBorder(null);
        BtnMinimize.setBorderPainted(false);
        BtnMinimize.setContentAreaFilled(false);
        BtnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMinimize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinimizeActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(33, 44, 62));
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_32.png"))); // NOI18N
        BtnSalir.setBorder(null);
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setFocusPainted(false);
        BtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("USUARIO:");

        txtUser.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 15)); // NOI18N
        txtUser.setToolTipText("");
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255)));
        txtUser.setCaretColor(new java.awt.Color(51, 51, 51));
        txtUser.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jSeparator1.setBackground(new java.awt.Color(121, 121, 125));
        jSeparator1.setFont(new java.awt.Font("Broadway", 0, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CONTRASEÑA:");

        jSeparator2.setBackground(new java.awt.Color(121, 121, 125));
        jSeparator2.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N

        txtPass.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        txtPass.setBorder(null);
        txtPass.setCaretColor(new java.awt.Color(51, 51, 51));
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPass.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        btnGo.setBackground(new java.awt.Color(255, 255, 255));
        btnGo.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnGo.setForeground(new java.awt.Color(77, 83, 100));
        btnGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_Ios_32.png"))); // NOI18N
        btnGo.setText("Aceptar");
        btnGo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 68, 96)));
        btnGo.setContentAreaFilled(false);
        btnGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGo.setFocusPainted(false);
        btnGo.setMaximumSize(new java.awt.Dimension(104, 32));
        btnGo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Simple_Color_32.png"))); // NOI18N
        btnGo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Simple_Color_32.png"))); // NOI18N
        btnGo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_Simple_Color_32.png"))); // NOI18N
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpDelanteroLayout = new javax.swing.GroupLayout(jpDelantero);
        jpDelantero.setLayout(jpDelanteroLayout);
        jpDelanteroLayout.setHorizontalGroup(
            jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDelanteroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDelanteroLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMinimize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir))
                    .addGroup(jpDelanteroLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDelanteroLayout.setVerticalGroup(
            jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDelanteroLayout.createSequentialGroup()
                .addGroup(jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDelanteroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMinimize)
                            .addComponent(BtnSalir)))
                    .addGroup(jpDelanteroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jpDelantero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        /*
        String myPass = new String(txtPass.getPassword());
        String usuario = txtUser.getText();
        System.out.println(usuario + " " + myPass);
        Inicio ini ;
        SystemVo miPersona = miCoordinador.buscarUser(usuario, myPass);

        if (miPersona.getUser() == null && miPersona.getPassword() == null) {
            JOptionPane.showMessageDialog(null, "El usuario no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            //ini.txtUsuario.setText(miPersona.getNombre() + " " + miPersona.getApellidos());
            //miCoordinador.mostrarPrincipal();
            ini = new Inicio();
            ini.setCoordinador(miCoordinador);
            ini.txtUsuario.setText(miPersona.getNombre() + " " + miPersona.getApellidos());
            ini.lbId.setText(miPersona.getId_user().toString());
            ini.show();
            dispose();
        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinimizeActionPerformed
        this.setExtendedState(ICONIFIED);

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMinimizeActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMinimize;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpDelantero;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
