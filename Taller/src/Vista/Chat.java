/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Coordinador;
import Modelo.chatVo;
import com.sun.awt.AWTUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Chat extends javax.swing.JInternalFrame {
    
private Coordinador miCoordinador;
    private List <JLabel> labels;
    public String orden;
    public int id;
    JScrollPane scroll;
       public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        cargarConversacion(orden);            
        //this.getUsuario(1);
    }
     
    public Chat() {           
        initComponents();
        this.setClosable(true);
       // setLocationRelativeTo(null);
       
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

        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
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
                    .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
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
chatVo chat = new chatVo();
chat.setId_trabajador(id);
chat.setId_orden(Coordinador.getOrden(orden).getIdorden());
if(mensaje.equals("")){
System.out.println("Ingresa un mensaje");
}
else{
    chat.setComentario(mensaje);
    Coordinador.insertMensaje(chat);
    panel2.removeAll();
cargarConversacion(orden);
panel2.updateUI();
comentario.setText("");

}
    }//GEN-LAST:event_btnEnviarActionPerformed
    
    public void cargarConversacion(String orden){
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
    //add(label, BorderLayout.CENTER);
        
    scroll = new JScrollPane();        
    
    scroll.getVerticalScrollBar().setValue(scroll.getVerticalScrollBar().getMaximum());
        
        panel2.add(label);
        fondo.add(scroll);
        //panel2.add(label);
        
        panel2.updateUI();
    }
    
    public void contarFilas(int filas){
        if(filas>5){
    panel2.setLayout(
            new GridLayout(filas, 1,0,10));}
        else{
        panel2.setLayout(
            new GridLayout(5, 1,0,10));
        }
        
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
