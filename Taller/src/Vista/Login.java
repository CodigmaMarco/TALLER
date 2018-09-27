package Vista;

//import com.placeholder.PlaceHolder;
import Controlador.Coordinador;
import Modelo.LoginVo;
import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import rojerusan.RSPanelsSlider;

public class Login extends javax.swing.JFrame {

    private boolean esadministrador;
    private boolean estrabajador;

    private Coordinador miCoordinador;
    
    //  PlaceHolder hol;
    public Login() {
        Shape forma;
        initComponents();
        forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getHeight(),60,60);
        AWTUtilities.setWindowShape(this, forma);
        setLocationRelativeTo(null);
        esadministrador = false;
        estrabajador = false;
        ImageIcon logo = new ImageIcon(getClass().getResource("/imagenes/logosistema.png"));
        Icon fondo = new ImageIcon(logo.getImage().getScaledInstance(lbllogo.getWidth(), lbllogo.getHeight(), Image.SCALE_SMOOTH));
        lbllogo.setIcon(fondo);
        this.repaint();
        //   hol = new PlaceHolder(txtUser,"Ingresa tu Usuario");
        //   hol = new PlaceHolder(txtPass,"Password");

    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        //this.getUsuario(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDelantero = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        BtnMinimize = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        select = new javax.swing.JPanel();
        btnadministrador = new rojerusan.RSButtonHover();
        btntrabajador = new rojerusan.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        btnGo = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(BtnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMinimize)
                    .addComponent(BtnSalir))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        select.setBackground(new java.awt.Color(255, 255, 255));
        select.setName("select"); // NOI18N

        btnadministrador.setText("Administrador");
        btnadministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadministradorActionPerformed(evt);
            }
        });

        btntrabajador.setText("Trabajador");
        btntrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntrabajadorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona el puesto perteneciente");

        javax.swing.GroupLayout selectLayout = new javax.swing.GroupLayout(select);
        select.setLayout(selectLayout);
        selectLayout.setHorizontalGroup(
            selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectLayout.createSequentialGroup()
                .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnadministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btntrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        selectLayout.setVerticalGroup(
            selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        rSPanelsSlider1.add(select, "card3");

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setName("panel"); // NOI18N

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

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rSPanelsSlider1.add(panel, "card2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpDelanteroLayout = new javax.swing.GroupLayout(jpDelantero);
        jpDelantero.setLayout(jpDelanteroLayout);
        jpDelanteroLayout.setHorizontalGroup(
            jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDelanteroLayout.createSequentialGroup()
                .addGroup(jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpDelanteroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDelanteroLayout.setVerticalGroup(
            jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDelanteroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpDelantero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed

        String pass = new String(txtPass.getPassword());
        String nom = txtUser.getText();
        System.out.println(nom + " " + pass);
        Inicio ini;
        if (esadministrador) {
            LoginVo miPersona = miCoordinador.buscarAdministrador(nom, pass);

            if (miPersona.getNombre() == null && miPersona.getPassword() == null) {
                JOptionPane.showMessageDialog(null, "El usuario no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                ini = new Inicio();
                ini.setCoordinador(miCoordinador);
                ini.show();
                ini.botonadmin(miPersona.getNombre(),miPersona.getId_user());
                dispose();
            }
        }
        if (estrabajador) {
            LoginVo miPersona = miCoordinador.buscarTrabajador("Alan","123456");

            if (miPersona.getNombre() == null && miPersona.getPassword() == null) {
                JOptionPane.showMessageDialog(null, "El usuario no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                
                ini = new Inicio();
                ini.setCoordinador(miCoordinador);
                ini.show();
                ini.boton(miPersona.getNombre()+" "+miPersona.getApellidop()+" "+miPersona.getApellidom(),miPersona.getId_user());
                dispose();
            }
        }
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

    private void btnadministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadministradorActionPerformed
        if (!this.btnadministrador.isSelected()) {
            rSPanelsSlider1.slidPanel(panel, RSPanelsSlider.direct.Right);
            esadministrador = true;
            estrabajador = false;
        }
    }//GEN-LAST:event_btnadministradorActionPerformed

    private void btntrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntrabajadorActionPerformed
        if (!this.btntrabajador.isSelected()) {
            rSPanelsSlider1.slidPanel(panel, RSPanelsSlider.direct.Right);
            esadministrador = false;
            estrabajador = true;
        }
    }//GEN-LAST:event_btntrabajadorActionPerformed
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
                new Login().setVisible(true);
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
    private rojerusan.RSButtonHover btnadministrador;
    private rojerusan.RSButtonHover btntrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpDelantero;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panel;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JPanel select;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
