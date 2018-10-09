package Vista;

import Controlador.Coordinador;
import Modelo.FTPUploader;
import Modelo.TablaProcesos;
import Modelo.autoVo;
import Modelo.chatVo;
import Modelo.ordenVo;
import Modelo.procesoVo;
import static Vista.Inicio.escritorio;
import static Vista.Inicio.lblid;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyVetoException;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.CheckBox;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.util.Timer;
import java.util.TimerTask;

public class ActRegistro extends javax.swing.JInternalFrame {

    private Coordinador miCoordinador;

    private File src1File;
    public int idusuario;
    public ActRegistro act;
    TablaProcesos t = new TablaProcesos();
    private String src1Name;
    Timer timer  = new Timer();
    
    DefaultListModel listModel = new DefaultListModel();
    ArrayList<autoVo> autos;

    int rown = -1;
    int fila;
    Icon icono;
    public ActRegistro() {
        initComponents();
        TableColumn agregarColumn;
        agregarColumn = tbProcesos.getColumnModel().getColumn(3);
        this.llenarLista();
        lbLeido.setVisible(false);
           
        
        
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        timer.scheduleAtFixedRate(task, 0, 600000);  
        //this.getUsuario(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtOrden = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lbOrden = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        lbAuto = new javax.swing.JLabel();
        lbPlaca = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProcesos = new rojerusan.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        comentarios = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnChat = new javax.swing.JButton();
        notificacion = new javax.swing.JPanel();
        lbLeido = new javax.swing.JLabel();
        lbIcono = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(44, 44, 45));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACTUALIZAR REGISTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        txtOrden.setForeground(new java.awt.Color(51, 51, 51));
        txtOrden.setBorderColor(new java.awt.Color(51, 51, 51));
        txtOrden.setBotonColor(new java.awt.Color(102, 102, 102));
        txtOrden.setPhColor(new java.awt.Color(102, 102, 102));
        txtOrden.setPlaceholder("Ingrese numero de orden");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Orden No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cliente:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Auto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Placa:");

        btnBuscar.setBackground(new java.awt.Color(204, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lbOrden.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbOrden.setForeground(new java.awt.Color(102, 102, 102));

        lbCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCliente.setForeground(new java.awt.Color(102, 102, 102));

        lbAuto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAuto.setForeground(new java.awt.Color(102, 102, 102));

        lbPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPlaca.setForeground(new java.awt.Color(102, 102, 102));

        list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        list.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(list);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(lbPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbProcesos.setForeground(new java.awt.Color(44, 44, 45));
        tbProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Area", "Proceso", "Estado", "Imagen", "Subir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProcesos.setColorBackgoundHead(new java.awt.Color(44, 44, 45));
        tbProcesos.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbProcesos.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tbProcesos.setColorFilasForeground1(new java.awt.Color(237, 31, 36));
        tbProcesos.setColorFilasForeground2(new java.awt.Color(237, 31, 36));
        tbProcesos.setColorSelBackgound(new java.awt.Color(237, 31, 36));
        tbProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProcesosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbProcesosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbProcesos);
        if (tbProcesos.getColumnModel().getColumnCount() > 0) {
            tbProcesos.getColumnModel().getColumn(2).setMinWidth(70);
            tbProcesos.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        comentarios.setColumns(20);
        comentarios.setLineWrap(true);
        comentarios.setRows(5);
        comentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comentariosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comentariosKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(comentarios);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Observaciones:");

        btnChat.setBackground(new java.awt.Color(153, 255, 153));
        btnChat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChat.setForeground(new java.awt.Color(255, 255, 255));
        btnChat.setText("COMENTARIOS");
        btnChat.setEnabled(false);
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });

        lbLeido.setBackground(new java.awt.Color(0, 0, 0));
        lbLeido.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        lbLeido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLeido.setText("0");
        lbLeido.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/notofi_off.png"))); // NOI18N

        javax.swing.GroupLayout notificacionLayout = new javax.swing.GroupLayout(notificacion);
        notificacion.setLayout(notificacionLayout);
        notificacionLayout.setHorizontalGroup(
            notificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificacionLayout.createSequentialGroup()
                .addComponent(lbIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbLeido)
                .addContainerGap())
        );
        notificacionLayout.setVerticalGroup(
            notificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(notificacionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbLeido))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarLista() {
        autos = Coordinador.getPendientes();

        for (int i = 0; i < autos.size(); i++) {
            //Añadir cada elemento del ArrayList en el modelo de la lista
            listModel.addElement(autos.get(i).getMarca() + " " + autos.get(i).getPlaca() + " " + autos.get(i).getModelo());
        }
//Asociar el modelo de lista al JList
        list.setModel(listModel);
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                
        ordenVo ord = Coordinador.getOrden((txtOrden.getText().trim()));
        chatVo chat = new chatVo();
        if (ord.getNumorden() != null) {
            lbOrden.setText((ord.getNumorden()));
            lbCliente.setText(ord.getNomcliente());
            lbAuto.setText(ord.getModelo());
            lbPlaca.setText(ord.getPlaca());
            System.out.println(ord.getIdorden());
            chat.setId_orden(ord.getIdorden());
            int noleido = Coordinador.mensajesLeidos(chat);
            lbLeido.setText(Integer.toString(noleido));

            t.visualizar(tbProcesos, (txtOrden.getText().trim()));
            btnChat.setEnabled(true);
            notificacion(lbLeido.getText());
             
        } else {
            JOptionPane.showMessageDialog(null, "Codigo no encontrado", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    public void comprobarNotificacion(){
        
        if(!lbOrden.getText().isEmpty()){
    ordenVo ord = Coordinador.getOrden((lbOrden.getText().trim()));
    if(ord.getIdorden()>0) 
    {
    chatVo chat = new chatVo();
     chat.setId_orden(ord.getIdorden());
            int noleido = Coordinador.mensajesLeidos(chat);
            lbLeido.setText(Integer.toString(noleido));
            notificacion(lbLeido.getText());
    }}
    
    }
    
    TimerTask task = new TimerTask(){
       
       public void run(){
       comprobarNotificacion();    
      }
    };
    private void tbProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProcesosMouseClicked
        fila = tbProcesos.getSelectedRow();

        if (fila >= 0) {
            String obser = (String) tbProcesos.getValueAt(fila, 3);
            this.comentarios.setText("");
            this.comentarios.append(obser);
        }

        rown = tbProcesos.rowAtPoint(evt.getPoint());

        int column = tbProcesos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbProcesos.getRowHeight();

        if (row < tbProcesos.getRowCount() && row >= 0 && column < tbProcesos.getColumnCount() && column >= 0) {
            Object value = tbProcesos.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                int valor = (int) tbProcesos.getValueAt(rown, 0);

                procesoVo pro = new procesoVo();

                String proceso = (String) tbProcesos.getValueAt(rown, 2);
                System.out.println(proceso);
                String orden = lbOrden.getText();

                if (boton.getName().equals("v")) {
                    JButton bot = boton;
                    try {
                        JFileChooser dir = new JFileChooser();
                        int option = dir.showOpenDialog(this);
                        if (option == JFileChooser.APPROVE_OPTION) {
                            src1File = dir.getSelectedFile();
                            String fileName = dir.getName(dir.getSelectedFile());
                            src1Name = fileName;

                            this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

                            FTPUploader ftpUploader = new FTPUploader("www.verifycar.com.mx", "talleres@verifycar.com.mx", "pruebataller", src1File.getPath(), proceso + orden + ".jpg", "/img/procesos/");
                            pro.setIdproceso(valor);
                            pro.setImagen_proceso(proceso + orden + ".jpg");
                            Coordinador.updateImagenProceso(pro);

                            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                            t.visualizar(tbProcesos, (lbOrden.getText().trim()));
                        }

                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                }
            }

            if (value instanceof JCheckBox) {
                ((JCheckBox) value).doClick();
                JCheckBox checkbox = (JCheckBox) value;

                int valor = (int) tbProcesos.getValueAt(rown, 0);

                if (checkbox.getName().equals("seleccion")) {
                    try {
                        System.out.println("prueba");

                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                }
            }
        }


    }//GEN-LAST:event_tbProcesosMouseClicked

    private void comentariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comentariosKeyTyped
//
    }//GEN-LAST:event_comentariosKeyTyped
    Chat ch;
    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        if (estacerrado(ch)) {
            ch = new Chat(); // TODO add your handling code here:

            escritorio.add(ch);//.setLocation(100, 0);
            ch.orden = (lbOrden.getText());
            ch.id = idusuario;
            ch.act = act;
            ch.setCoordinador(miCoordinador);

            ch.show();
            lbLeido.setText("0");
            notificacion(lbLeido.getText());
        } else {
            ch.toFront();
        }


    }//GEN-LAST:event_btnChatActionPerformed

    public void notificacion(String label) {
        //String num = lbLeido.getText();
        int valor = Integer.parseInt(label);
        
        
        if (valor > 0) {
            icono = new ImageIcon(getClass().getResource("/Imagenes/notifi_on.png"));
            lbIcono.setIcon(icono);
            lbLeido.setVisible(true);            
                        
        } else if(valor == 0) {            
            icono = new ImageIcon(getClass().getResource("/Imagenes/notofi_off.png"));
            lbIcono.setIcon(icono);                      
            lbLeido.setVisible(false);            
                        
        }
    }

    private void tbProcesosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProcesosMouseReleased

        int columna = tbProcesos.columnAtPoint(evt.getPoint());
        int fila = tbProcesos.getSelectedRow();

        if (columna == 4) {

            procesoVo pro = new procesoVo();
            String status;
            pro.setIdproceso((int) tbProcesos.getValueAt(fila, 0));

            if ((boolean) tbProcesos.getValueAt(fila, 4) == true) {
                status = "terminado";
            } else {
                status = "procesando";
            }
            pro.setStatus(status);
            pro.setObservaciones((String) tbProcesos.getValueAt(fila, 3));

            Coordinador.updateProceso(pro);

            t.visualizar(tbProcesos, (lbOrden.getText().trim()));

        }

    }//GEN-LAST:event_tbProcesosMouseReleased

    private void comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comentariosKeyReleased
        tbProcesos.setValueAt("" + comentarios.getText(), fila, 3);
    }//GEN-LAST:event_comentariosKeyReleased


    private void listMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseReleased
        String ord = autos.get(list.getSelectedIndex()).getMarca();
        txtOrden.setText((""));
        txtOrden.setText((ord));

    }//GEN-LAST:event_listMouseReleased

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
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnChat;
    private javax.swing.JTextArea comentarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbAuto;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbIcono;
    private javax.swing.JLabel lbLeido;
    private javax.swing.JLabel lbOrden;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JList<String> list;
    private javax.swing.JPanel notificacion;
    private rojerusan.RSTableMetro tbProcesos;
    private rojerusan.RSMetroTextFullPlaceHolder txtOrden;
    // End of variables declaration//GEN-END:variables
}





