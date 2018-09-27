package Vista;

import Controlador.Coordinador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Inicio extends javax.swing.JFrame {

    private Coordinador miCoordinador;

    public Inicio() {
        this.setResizable(false);
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        //this.getUsuario(1);
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
        lblusuario = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
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

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario.setText("USUARIO");

        lblid.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N

        hora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("HORA");
        hora.setToolTipText("");

        fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("FECHA");

        escritorio.setLayer(lblusuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(hora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(fecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(hora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(lblid)
                .addGap(87, 87, 87)
                .addComponent(lblusuario)
                .addGap(138, 138, 138)
                .addComponent(hora)
                .addGap(18, 18, 18)
                .addComponent(fecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(44, 44, 45));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        btnregistrar.setBackground(new java.awt.Color(44, 44, 45));
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarn.png"))); // NOI18N
        btnregistrar.setBorder(null);
        btnregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregistrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        btnactivos.setBorder(null);
        btnactivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactivos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/activosb.png"))); // NOI18N
        btnactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactivosActionPerformed(evt);
            }
        });

        btnusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuariosn.png"))); // NOI18N
        btnusuarios.setAlignmentY(0.0F);
        btnusuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(44, 44, 45), new java.awt.Color(44, 44, 45)));
        btnusuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnusuarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuariosb.png"))); // NOI18N
        btnusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuariosActionPerformed(evt);
            }
        });

        btnhistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historialn.png"))); // NOI18N
        btnhistorial.setAlignmentY(0.0F);
        btnhistorial.setBorder(null);
        btnhistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        //Fehca del sistema01
        Date sistemaFech = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
        fecha.setText(formato.format(sistemaFech));
        Timer tiempo = new Timer(100, new Inicio.horas());
        tiempo.start();
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
                are.idusuario = Integer.parseInt(lblid.getText());
                are.setMaximum(true);
                are.show();
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            // TODO add your handling code here:
        } else {
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
        } else {
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
        } else {
            us.toFront();
        }
    }//GEN-LAST:event_btnusuariosActionPerformed

    public static void boton(String nombre, int id) {
        btnusuarios.setEnabled(false);
        lblusuario.setText(nombre);
        lblid.setText("" + id);
    }
<<<<<<< HEAD


=======
    
    public static void botonadmin(String nombre,int id){
    btnusuarios.setEnabled(true);
    lblusuario.setText(nombre);
    lblid.setText(""+id);
    }
    
    
    
>>>>>>> 5d60d4a1d8b30a362871f0327277c10f5bd14825
    private void btnhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhistorialActionPerformed
    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sistemaHora = new Date();
            String pmAm = "HH:mm:ss";
            SimpleDateFormat formato = new SimpleDateFormat(pmAm);
            Calendar now = Calendar.getInstance();
            hora.setText(String.format(formato.format(sistemaHora), now));
        }
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnactivos;
    private javax.swing.JButton btnhistorial;
    private javax.swing.JButton btnregistrar;
    public static javax.swing.JButton btnusuarios;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblid;
    private static javax.swing.JLabel lblusuario;
    // End of variables declaration//GEN-END:variables

}
