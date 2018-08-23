package Vista;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        this.setResizable(false);
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    public boolean estacerrado(Object obj) {
        JInternalFrame[] activos = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
                //obj.toFront();
                /*JOptionPane.showMessageDialog(this, "Otra ventana se encuentra \nya  abierta !!!", "Aviso", 0,
                        new ImageIcon(getClass().getResource("/Imagenes/adver1.png")));*/
            }
            i++;
        }
        return cerrado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnregistrar = new javax.swing.JButton();
        btnactivos = new javax.swing.JButton();
        btnusuarios = new javax.swing.JButton();
        btnhistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        escritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarn.png"))); // NOI18N
        btnregistrar.setOpaque(false);
        btnregistrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarb.png"))); // NOI18N
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnactivos.setBackground(new java.awt.Color(255, 255, 255));
        btnactivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/activosn.png"))); // NOI18N
        btnactivos.setAlignmentY(0.0F);
        btnactivos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/activosb.png"))); // NOI18N
        btnactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactivosActionPerformed(evt);
            }
        });

        btnusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuariosn.png"))); // NOI18N
        btnusuarios.setAlignmentY(0.0F);
        btnusuarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuariosb.png"))); // NOI18N
        btnusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuariosActionPerformed(evt);
            }
        });

        btnhistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historialn.png"))); // NOI18N
        btnhistorial.setAlignmentY(0.0F);
        btnhistorial.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historialb.png"))); // NOI18N
        btnhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnhistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnhistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de salir\nde la aplicación.\n¿Desea continuar?", "Cerrar", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/Imagenes/adver1.png"))) == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(0);
        }
    }//GEN-LAST:event_formWindowClosing
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
 Vista.ActRegistro are;
    private void btnactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactivosActionPerformed
        if (!this.btnactivos.isSelected()) {
            this.btnactivos.setSelected(true);
            this.btnregistrar.setSelected(false);
            this.btnusuarios.setSelected(false);

        }
       
        if (estacerrado(are)) {
            try {
                
                are = new ActRegistro();

                // us.setCoordinador(miCoordinador);
                escritorio.add(are);//.setLocation(100, 0);
                are.setMaximum(true);
                are.show();
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            // TODO add your handling code here:
        }else{
        are.toFront();
        }
    }//GEN-LAST:event_btnactivosActionPerformed
    Vista.Registro re;
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        if (!this.btnregistrar.isSelected()) {
            this.btnactivos.setSelected(false);
            this.btnregistrar.setSelected(true);
            this.btnusuarios.setSelected(false);

        }
        
        if (estacerrado(re)) {
            try {
                re = new Registro();

                // us.setCoordinador(miCoordinador);
                escritorio.add(re);//.setLocation(100, 0);
                re.setMaximum(true);
                re.show();
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            // TODO add your handling code here:
        }else{
        re.toFront();
        }
    }//GEN-LAST:event_btnregistrarActionPerformed
   Vista.Usuarios us;
    private void btnusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuariosActionPerformed
        if (!this.btnusuarios.isSelected()) {
            this.btnactivos.setSelected(false);
            this.btnregistrar.setSelected(false);
            this.btnusuarios.setSelected(true);

        }
        if (estacerrado(us)) {
            try {
                us = new Usuarios();

                // us.setCoordinador(miCoordinador);
                escritorio.add(us);//.setLocation(100, 0);
                us.setMaximum(true);
                us.show();
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            // TODO add your handling code here:
        }else{
        us.toFront();
        }
    }//GEN-LAST:event_btnusuariosActionPerformed

    private void btnhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhistorialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnactivos;
    private javax.swing.JButton btnhistorial;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnusuarios;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
