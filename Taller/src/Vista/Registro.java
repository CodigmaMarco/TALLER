package Vista;

import Controlador.Coordinador;
import Modelo.Conectarse;
import Modelo.autoVo;
import Modelo.clienteVo;
import java.awt.Component;
import java.awt.Container;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

public class Registro extends javax.swing.JInternalFrame {

    private Coordinador miCoordinador;

    public Registro() {
        initComponents();
    enableComponents(panelCliente,false);
    enableComponents(panelAuto,false);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        //this.getUsuario(1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rSPanelsSlider2 = new rojerusan.RSPanelsSlider();
        registrocliente = new javax.swing.JPanel();
        btnsiguiente = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCliente = new javax.swing.JList<>();
        rSMetroTextFullPlaceHolder1 = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listAuto = new javax.swing.JList<>();
        btnAutoNuevo = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        panelCliente = new javax.swing.JPanel();
        nombre = new rojerusan.RSMetroTextFullPlaceHolder();
        colonia = new rojerusan.RSMetroTextFullPlaceHolder();
        telefono = new rojerusan.RSMetroTextFullPlaceHolder();
        correo = new rojerusan.RSMetroTextFullPlaceHolder();
        calle = new rojerusan.RSMetroTextFullPlaceHolder();
        num_casa = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton8 = new javax.swing.JButton();
        panelAuto = new javax.swing.JPanel();
        rSMetroTextFullPlaceHolder5 = new rojerusan.RSMetroTextFullPlaceHolder();
        rSMetroTextFullPlaceHolder6 = new rojerusan.RSMetroTextFullPlaceHolder();
        rSMetroTextFullPlaceHolder7 = new rojerusan.RSMetroTextFullPlaceHolder();
        rSMetroTextFullPlaceHolder8 = new rojerusan.RSMetroTextFullPlaceHolder();
        rSMetroTextFullPlaceHolder9 = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton5 = new javax.swing.JButton();
        registroservicio = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        rSComboMetro1 = new rojerusan.RSComboMetro();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        btnfinalizar = new javax.swing.JButton();
        registrofinalizado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(721, 535));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 44, 45));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROCESO DE REGISTRO");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        registrocliente.setName("registrocliente"); // NOI18N

        btnsiguiente.setBackground(new java.awt.Color(237, 31, 36));
        btnsiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnsiguiente.setText("SIGUIENTE");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jButton2.setBackground(new java.awt.Color(237, 31, 36));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);

        listCliente.setBackground(new java.awt.Color(240, 240, 240));
        listCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listCliente.setSelectionBackground(new java.awt.Color(204, 204, 204));
        listCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listCliente);

        rSMetroTextFullPlaceHolder1.setForeground(new java.awt.Color(0, 0, 0));
        rSMetroTextFullPlaceHolder1.setBorderColor(new java.awt.Color(0, 0, 0));
        rSMetroTextFullPlaceHolder1.setBotonColor(new java.awt.Color(0, 0, 0));
        rSMetroTextFullPlaceHolder1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSMetroTextFullPlaceHolder1.setPhColor(new java.awt.Color(102, 102, 102));
        rSMetroTextFullPlaceHolder1.setPlaceholder("Nombre");

        jButton9.setBackground(new java.awt.Color(237, 31, 36));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Registrar cliente nuevo");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(rSMetroTextFullPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSMetroTextFullPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton9))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUTOMOVIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jScrollPane7.setBorder(null);

        listAuto.setBackground(new java.awt.Color(240, 240, 240));
        listAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listAuto.setSelectionBackground(new java.awt.Color(204, 204, 204));
        listAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAutoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(listAuto);

        btnAutoNuevo.setBackground(new java.awt.Color(237, 31, 36));
        btnAutoNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnAutoNuevo.setText("Registrar automovil nuevo");
        btnAutoNuevo.setEnabled(false);
        btnAutoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAutoNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAutoNuevo))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUEVO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        nombre.setForeground(new java.awt.Color(44, 44, 45));
        nombre.setBorderColor(new java.awt.Color(44, 44, 45));
        nombre.setBotonColor(new java.awt.Color(44, 44, 45));
        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setPhColor(new java.awt.Color(44, 44, 45));
        nombre.setPlaceholder("NOMBRE");
        nombre.setSelectionColor(new java.awt.Color(237, 31, 36));

        colonia.setForeground(new java.awt.Color(44, 44, 45));
        colonia.setBorderColor(new java.awt.Color(44, 44, 45));
        colonia.setBotonColor(new java.awt.Color(44, 44, 45));
        colonia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        colonia.setPhColor(new java.awt.Color(44, 44, 45));
        colonia.setPlaceholder("COLONIA");

        telefono.setForeground(new java.awt.Color(44, 44, 45));
        telefono.setBorderColor(new java.awt.Color(44, 44, 45));
        telefono.setBotonColor(new java.awt.Color(44, 44, 45));
        telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono.setPhColor(new java.awt.Color(44, 44, 45));
        telefono.setPlaceholder("TELEFONO");

        correo.setForeground(new java.awt.Color(44, 44, 45));
        correo.setBorderColor(new java.awt.Color(44, 44, 45));
        correo.setBotonColor(new java.awt.Color(44, 44, 45));
        correo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        correo.setPhColor(new java.awt.Color(44, 44, 45));
        correo.setPlaceholder("CORREO");

        calle.setForeground(new java.awt.Color(44, 44, 45));
        calle.setBorderColor(new java.awt.Color(44, 44, 45));
        calle.setBotonColor(new java.awt.Color(44, 44, 45));
        calle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calle.setPhColor(new java.awt.Color(44, 44, 45));
        calle.setPlaceholder("CALLE");

        num_casa.setForeground(new java.awt.Color(44, 44, 45));
        num_casa.setBorderColor(new java.awt.Color(44, 44, 45));
        num_casa.setBotonColor(new java.awt.Color(44, 44, 45));
        num_casa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num_casa.setPhColor(new java.awt.Color(44, 44, 45));
        num_casa.setPlaceholder("NUMERO CASA");

        jButton8.setBackground(new java.awt.Color(237, 31, 36));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Guardar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(num_casa, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colonia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(num_casa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(59, 59, 59))
        );

        panelAuto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR AUTOMOVIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        rSMetroTextFullPlaceHolder5.setBorderColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder5.setBotonColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSMetroTextFullPlaceHolder5.setPhColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder5.setPlaceholder("MODELO");

        rSMetroTextFullPlaceHolder6.setBorderColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder6.setBotonColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSMetroTextFullPlaceHolder6.setPhColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder6.setPlaceholder("AÑO");

        rSMetroTextFullPlaceHolder7.setBorderColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder7.setBotonColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSMetroTextFullPlaceHolder7.setPhColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder7.setPlaceholder("MARCA");

        rSMetroTextFullPlaceHolder8.setBorderColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder8.setBotonColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSMetroTextFullPlaceHolder8.setPhColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder8.setPlaceholder("PLACA");

        rSMetroTextFullPlaceHolder9.setBorderColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder9.setBotonColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSMetroTextFullPlaceHolder9.setPhColor(new java.awt.Color(44, 44, 45));
        rSMetroTextFullPlaceHolder9.setPlaceholder("COLOR");

        jButton5.setBackground(new java.awt.Color(237, 31, 36));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Guardar");

        javax.swing.GroupLayout panelAutoLayout = new javax.swing.GroupLayout(panelAuto);
        panelAuto.setLayout(panelAutoLayout);
        panelAutoLayout.setHorizontalGroup(
            panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutoLayout.createSequentialGroup()
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rSMetroTextFullPlaceHolder5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(rSMetroTextFullPlaceHolder8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSMetroTextFullPlaceHolder7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSMetroTextFullPlaceHolder6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSMetroTextFullPlaceHolder9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutoLayout.createSequentialGroup()
                .addGap(0, 201, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(167, 167, 167))
        );
        panelAutoLayout.setVerticalGroup(
            panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSMetroTextFullPlaceHolder8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(rSMetroTextFullPlaceHolder7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMetroTextFullPlaceHolder5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMetroTextFullPlaceHolder6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rSMetroTextFullPlaceHolder9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(panelAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registroclienteLayout = new javax.swing.GroupLayout(registrocliente);
        registrocliente.setLayout(registroclienteLayout);
        registroclienteLayout.setHorizontalGroup(
            registroclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroclienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsiguiente)
                .addGap(30, 30, 30))
        );
        registroclienteLayout.setVerticalGroup(
            registroclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroclienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsiguiente)
                .addGap(28, 28, 28))
        );

        rSPanelsSlider2.add(registrocliente, "card2");

        registroservicio.setName("registroservicio"); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        rSComboMetro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hi", "ho", "hu" }));
        rSComboMetro1.setAutoscrolls(true);
        rSComboMetro1.setColorArrow(new java.awt.Color(44, 44, 45));
        rSComboMetro1.setColorBorde(new java.awt.Color(44, 44, 45));
        rSComboMetro1.setColorFondo(new java.awt.Color(44, 44, 45));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSComboMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rSComboMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SERVICIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jButton1.setBackground(new java.awt.Color(237, 31, 36));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(44, 44, 45));
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicios a Realizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList4);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        jButton3.setBackground(new java.awt.Color(237, 31, 36));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ACTUALIZAR");

        jButton4.setBackground(new java.awt.Color(237, 31, 36));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(33, 33, 33)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );

        btnatras.setBackground(new java.awt.Color(237, 31, 36));
        btnatras.setForeground(new java.awt.Color(255, 255, 255));
        btnatras.setText("ATRAS");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        btnfinalizar.setBackground(new java.awt.Color(237, 31, 36));
        btnfinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnfinalizar.setText("FINALIZAR");
        btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registroservicioLayout = new javax.swing.GroupLayout(registroservicio);
        registroservicio.setLayout(registroservicioLayout);
        registroservicioLayout.setHorizontalGroup(
            registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroservicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addComponent(btnatras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnfinalizar)))
                .addContainerGap())
        );
        registroservicioLayout.setVerticalGroup(
            registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroservicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnatras)
                    .addComponent(btnfinalizar))
                .addContainerGap())
        );

        rSPanelsSlider2.add(registroservicio, "card3");

        registrofinalizado.setName("registrofinalizado"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRO REALIZADO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Numero de Guia:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Enviar por Correo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Enviar por Telefono");

        jButton6.setBackground(new java.awt.Color(237, 31, 36));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Enviar");

        jButton7.setBackground(new java.awt.Color(237, 31, 36));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Enviar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton6))
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton7))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registrofinalizadoLayout = new javax.swing.GroupLayout(registrofinalizado);
        registrofinalizado.setLayout(registrofinalizadoLayout);
        registrofinalizadoLayout.setHorizontalGroup(
            registrofinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrofinalizadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registrofinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registrofinalizadoLayout.setVerticalGroup(
            registrofinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrofinalizadoLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        rSPanelsSlider2.add(registrofinalizado, "card4");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        if (!this.btnsiguiente.isSelected()) {
            rSPanelsSlider2.slidPanel(registroservicio, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        if (!this.btnatras.isSelected()) {
            rSPanelsSlider2.slidPanel(registrocliente, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed
        if (!this.btnfinalizar.isSelected()) {
            rSPanelsSlider2.slidPanel(registrofinalizado, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnfinalizarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listarCliente();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listClienteMouseClicked
        DefaultListModel modelo = new DefaultListModel();

        int con = 0;
        char[] arreglo = listCliente.getSelectedValue().toCharArray();
        for (char caracter : arreglo) {
            if (Character.isDigit(caracter)) {
                con++;
            }
        }
        String id = listCliente.getSelectedValue().substring(0, con);

        ArrayList<autoVo> auto = miCoordinador.buscarAuto(Integer.parseInt(id));
        for (int i = 0; i < auto.size(); i++) {
            // modelo.addElement(i);
            modelo.addElement(auto.get(i).getPlaca() + "  " + auto.get(i).getModelo());
        }
        listAuto.setModel(modelo);
    }//GEN-LAST:event_listClienteMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        clienteVo cliente = new clienteVo();
        cliente.setNombre(nombre.getText());
        cliente.setColonia(colonia.getText());
        cliente.setCalle(calle.getText());
        cliente.setNum_casa(num_casa.getText());
        cliente.setTelefono(telefono.getText());
        cliente.setCorreo(correo.getText());
        cliente.setId_trabajador(Integer.parseInt(Inicio.lblid.getText()));

        if (nombre.getText().equals("") || colonia.getText().equals("") || calle.getText().equals("")
                || num_casa.getText().equals("") || telefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            miCoordinador.agregarCliente(cliente);
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            //limpiarCampos();
            listarCliente();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        enableComponents(panelCliente,true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void listAutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAutoMouseClicked
        btnAutoNuevo.setEnabled(true);
    }//GEN-LAST:event_listAutoMouseClicked

    private void btnAutoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoNuevoActionPerformed
        enableComponents(panelAuto,true);
    }//GEN-LAST:event_btnAutoNuevoActionPerformed

    public void listarCliente() {
        DefaultListModel modelo = new DefaultListModel();
        ArrayList<clienteVo> cliente = miCoordinador.buscarUsuario();
        for (int i = 0; i < cliente.size(); i++) {
            // modelo.addElement(i);
            modelo.addElement(cliente.get(i).getIdcliente() + "  " + cliente.get(i).getNombre());
        }
        listCliente.setModel(modelo);
    }
    
    public void enableComponents(Container container, boolean enable) {
    Component[] components = container.getComponents();
    for (Component component : components) {
        component.setEnabled(enable);
        if (component instanceof Container) {
            enableComponents((Container)component, enable);
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoNuevo;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnfinalizar;
    private javax.swing.JButton btnsiguiente;
    private rojerusan.RSMetroTextFullPlaceHolder calle;
    private rojerusan.RSMetroTextFullPlaceHolder colonia;
    private rojerusan.RSMetroTextFullPlaceHolder correo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> listAuto;
    private javax.swing.JList<String> listCliente;
    private rojerusan.RSMetroTextFullPlaceHolder nombre;
    private rojerusan.RSMetroTextFullPlaceHolder num_casa;
    private javax.swing.JPanel panelAuto;
    private javax.swing.JPanel panelCliente;
    private rojerusan.RSComboMetro rSComboMetro1;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder1;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder5;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder6;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder7;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder8;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder9;
    private rojerusan.RSPanelsSlider rSPanelsSlider2;
    private javax.swing.JPanel registrocliente;
    private javax.swing.JPanel registrofinalizado;
    private javax.swing.JPanel registroservicio;
    private rojerusan.RSMetroTextFullPlaceHolder telefono;
    // End of variables declaration//GEN-END:variables
}
