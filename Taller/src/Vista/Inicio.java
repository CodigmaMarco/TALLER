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
        /* aqui toy
        yo tambien
        escritorio.setBorder(new ImagenFondo());
        
         */
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
                JOptionPane.showMessageDialog(this, "Otra ventana se encuentra \nya  abierta !!!", "Aviso", 0,
                        new ImageIcon(getClass().getResource("/Imagenes/adver1.png")));
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
        jButton1 = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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
            .addGap(0, 667, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon-01.png"))); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setAlignmentY(0.0F);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        jButton2.setAlignmentY(0.0F);

        jButton3.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
    Vista.Usuarios us;
    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed

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
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed
Vista.Registro re;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
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
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    public static javax.swing.JButton btnUsuarios;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
