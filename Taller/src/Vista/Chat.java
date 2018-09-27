/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Coordinador;
import Modelo.chatVo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Chat extends javax.swing.JFrame {
    
private Coordinador miCoordinador;
    private List <JLabel> labels;
    public int orden;
    public int id;
     public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        cargarConversacion(orden);    
        //this.getUsuario(1);
    }
     
    public Chat() {   
        initComponents();
                    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JScrollPane();
        panel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comentario = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        fondo.setViewportView(panel2);

        comentario.setColumns(20);
        comentario.setLineWrap(true);
        comentario.setRows(5);
        jScrollPane2.setViewportView(comentario);

        btnEnviar.setBackground(new java.awt.Color(204, 0, 51));
        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondo)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
String mensaje = comentario.getText().trim();

if(mensaje.equals("")){
System.out.println("Ingresa un mensaje");
}
else{
    panel2.removeAll();
cargarConversacion(orden);
panel2.updateUI();

}
        /*
        String hola = "prueba";
        JTextArea label = new JTextArea(hola);
        
        label.setLineWrap(true);        
        label.setEditable(false);
         LineBorder line = new LineBorder(Color.WHITE, 4, true); // color, thickness, rounded
    label.setBorder(line);
    add(label, BorderLayout.CENTER);
    
        panel2.add(label);
                  panel2.updateUI();
        */

    }//GEN-LAST:event_btnEnviarActionPerformed
    
    public void cargarConversacion(int orden){
     ArrayList <chatVo> mensajes = Coordinador.getConversacion(orden);
     contarFilas(mensajes.size());
     
     
     for(int i = 0; i<mensajes.size(); i++){
         String usuario="";
         
         if(mensajes.get(i).getId_cliente() > 0){
         usuario = Coordinador.getNomCliente(mensajes.get(i).getId_cliente()).getNombre();
         }
         else if(mensajes.get(i).getId_trabajador() > 0){
         usuario = Coordinador.getTrabajadorID(mensajes.get(i).getId_trabajador()).getNombre();
         }
         
         cargarMensaje(usuario,mensajes.get(i).getComentario(),mensajes.get(i).getFechacomentario());
     }
     
    }
    
    public void cargarMensaje(String usuario, String texto, String fecha){
    
        JTextArea label = new JTextArea(fecha+" "+usuario+":"+" "+texto);
        
        label.setLineWrap(true);        
        label.setEditable(false);
         LineBorder line = new LineBorder(Color.WHITE, 4, true); // color, thickness, rounded
    label.setBorder(line);
    add(label, BorderLayout.CENTER);
    
        panel2.add(label);
        
        panel2.updateUI();
    }
    
    public void contarFilas(int filas){
        if(filas>10){
    panel2.setLayout(
            new GridLayout(filas, 1,0,10));}
        else{
        panel2.setLayout(
            new GridLayout(10, 1,0,10));
        }
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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JTextArea comentario;
    private javax.swing.JScrollPane fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
