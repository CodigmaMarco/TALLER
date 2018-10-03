package Vista;

import Controlador.Coordinador;
import Modelo.TablaProcesos;
import Modelo.ordenVo;
import Modelo.procesoVo;
import static Vista.Inicio.escritorio;
import static Vista.Inicio.lblid;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.CheckBox;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class ActRegistro extends javax.swing.JInternalFrame {

    private Coordinador miCoordinador;
    private File src1File;
    public int idusuario;
    ActRegistro act;

    TablaProcesos t = new TablaProcesos();
    int rown = -1;
    int fila;

    public ActRegistro() {
        initComponents();
        TableColumn agregarColumn;
        agregarColumn = tbProcesos.getColumnModel().getColumn(3);
        agregarColumn.setCellEditor(new myeditor(tbProcesos));
        agregarColumn.setCellRenderer(new myrenderer(true));
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProcesos = new rojerusan.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        comentarios = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnChat = new javax.swing.JButton();

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
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Orden No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Cliente:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Auto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
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
        lbOrden.setText("1001");

        lbCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCliente.setForeground(new java.awt.Color(102, 102, 102));
        lbCliente.setText("Jonathan Oswaldo Bautista Valencia");

        lbAuto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAuto.setForeground(new java.awt.Color(102, 102, 102));
        lbAuto.setText("Camaro");

        lbPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPlaca.setForeground(new java.awt.Color(102, 102, 102));
        lbPlaca.setText("XLR8");

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbOrden))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbCliente)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbAuto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbPlaca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbProcesos.setForeground(new java.awt.Color(44, 44, 45));
        tbProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Area", "Proceso", "Estado", "Imagen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChat)
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
                        .addComponent(btnChat)))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ordenVo ord = Coordinador.getOrden(Integer.parseInt(txtOrden.getText().trim()));
        if (ord.getNumorden() != null) {
           // lbOrden.setText(Integer.toString(ord.getNumorden()));
            lbCliente.setText(ord.getNomcliente());
            lbAuto.setText(ord.getModelo());
            lbPlaca.setText(ord.getPlaca());

            t.visualizar(tbProcesos, Integer.parseInt(txtOrden.getText().trim()));
            btnChat.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Codigo no encontrado", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

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

                if (boton.getName().equals("v")) {
                    try {

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

    }//GEN-LAST:event_comentariosKeyTyped
    Chat ch;
    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        if (estacerrado(ch)) {
            ch = new Chat(); // TODO add your handling code here:

            escritorio.add(ch);//.setLocation(100, 0);
            ch.orden = Integer.parseInt(lbOrden.getText());
            ch.id = idusuario;
            ch.setCoordinador(miCoordinador);

            ch.show();

        } else {
            ch.toFront();
        }


    }//GEN-LAST:event_btnChatActionPerformed

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

            t.visualizar(tbProcesos, Integer.parseInt(txtOrden.getText().trim()));
        }

    }//GEN-LAST:event_tbProcesosMouseReleased

    private void comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comentariosKeyReleased
        tbProcesos.setValueAt("" + comentarios.getText(), fila, 3);
    }//GEN-LAST:event_comentariosKeyReleased

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
    private javax.swing.JLabel lbAuto;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbOrden;
    private javax.swing.JLabel lbPlaca;
    private rojerusan.RSTableMetro tbProcesos;
    private rojerusan.RSMetroTextFullPlaceHolder txtOrden;
    // End of variables declaration//GEN-END:variables
}

class myrenderer extends JLabel implements TableCellRenderer {

    boolean isBordered = true;

    public myrenderer(boolean isBordered) {
        this.isBordered = isBordered;
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) {
        // if (row == table.getModel().getRowCount() - 1) {
        return new JButton("Subir Imagen");
        // } else {
        //    setBackground(new Color(0xffffff));
        //  return this;
        //  }
    }
}

class myeditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

    private File src1File;
    private String src1Name;

    Boolean currentValue;
    JButton button;
    protected static final String EDIT = "edit";
    private JTable jTable1;

    public myeditor(JTable jTable1) {
        button = new JButton("SUBIR IMAGEN");
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);
        this.jTable1 = jTable1;
    }

    public void actionPerformed(ActionEvent e) {

        JFileChooser dir = new JFileChooser();
        int option = dir.showOpenDialog(ActRegistro.jPanel2);
        if (option == JFileChooser.APPROVE_OPTION) {
            src1File = dir.getSelectedFile();
            String fileName = dir.getName(dir.getSelectedFile());

            src1Name = fileName;
            System.out.println(src1Name + "  " + src1File);
            // checkSrc1.setSelected(true);
            // cargarImagenes(1);
        } else {
            // checkSrc1.setSelected(false);
        }

        /*
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int resultado = selectorArchivos.showOpenDialog(ActRegistro.jPanel2);*/
    }

    public Object getCellEditorValue() {
        return currentValue;
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        // if (row == table.getModel().getRowCount() - 1) {
        currentValue = (Boolean) value;
        return button;
        //   }
        //  return new JLabel();
    }
}
