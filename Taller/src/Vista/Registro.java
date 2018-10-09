package Vista;

import Controlador.Coordinador;
import Modelo.adminVo;
import Modelo.areaVo;
import Modelo.autoVo;
import Modelo.clienteVo;
import Modelo.ordenVo;
import Modelo.procesoVo;
import Modelo.servicioVo;
import java.awt.Component;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

public class Registro extends javax.swing.JInternalFrame {

    public int idadmin;
    private Coordinador miCoordinador;
    DefaultListModel modelos = new DefaultListModel();

    Vector descrip = new Vector(20);
    Vector idserv = new Vector(20);
    Vector idservselec = new Vector(20);
    Vector idauto = new Vector(20);
    Vector idcliente = new Vector(20);

    int contadordescripcion = 1;

    public Registro() {
        initComponents();
        enableComponents(panelCliente, false);
        enableComponents(panelAuto, false);
        lblIdCliente.setVisible(false);
        // enableComponents(panelAuto,false);
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
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCliente = new javax.swing.JList<>();
        txtNombreCliente = new rojerusan.RSMetroTextFullPlaceHolder();
        btnActivadorRegistro = new javax.swing.JButton();
        btnActivadorActualizar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listAuto = new javax.swing.JList<>();
        btnActivadorAuto = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        panelCliente = new javax.swing.JPanel();
        nombre = new rojerusan.RSMetroTextFullPlaceHolder();
        colonia = new rojerusan.RSMetroTextFullPlaceHolder();
        telefono = new rojerusan.RSMetroTextFullPlaceHolder();
        correo = new rojerusan.RSMetroTextFullPlaceHolder();
        calle = new rojerusan.RSMetroTextFullPlaceHolder();
        num_casa = new rojerusan.RSMetroTextFullPlaceHolder();
        btnGuardarCliente = new javax.swing.JButton();
        panelAuto = new javax.swing.JPanel();
        modelo = new rojerusan.RSMetroTextFullPlaceHolder();
        marca = new rojerusan.RSMetroTextFullPlaceHolder();
        placa = new rojerusan.RSMetroTextFullPlaceHolder();
        color = new rojerusan.RSMetroTextFullPlaceHolder();
        btnGuardarAuto = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        year = new rojerusan.RSYearDate();
        registroservicio = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        boxArea = new rojerusan.RSComboMetro();
        jPanel2 = new javax.swing.JPanel();
        txtNombreServicio = new javax.swing.JTextField();
        btnBuscarServicio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listServicios = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listServiciosaRealizar = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtverdescripcion = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        btnfinalizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        registrofinalizado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EnviarCorreo = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lblGuia = new javax.swing.JLabel();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnBuscarCliente.setBackground(new java.awt.Color(237, 31, 36));
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
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

        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreCliente.setPhColor(new java.awt.Color(102, 102, 102));
        txtNombreCliente.setPlaceholder("Nombre");

        btnActivadorRegistro.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnActivadorRegistro.setText("Registrar cliente nuevo");
        btnActivadorRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivadorRegistroActionPerformed(evt);
            }
        });

        btnActivadorActualizar.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActivadorActualizar.setText("Actualizar Cliente");
        btnActivadorActualizar.setEnabled(false);
        btnActivadorActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivadorActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarCliente)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActivadorRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActivadorActualizar)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActivadorRegistro)
                    .addComponent(btnActivadorActualizar)))
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

        btnActivadorAuto.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnActivadorAuto.setText("Registrar automovil nuevo");
        btnActivadorAuto.setEnabled(false);
        btnActivadorAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivadorAutoActionPerformed(evt);
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
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActivadorAuto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActivadorAuto))
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

        btnGuardarCliente.setBackground(new java.awt.Color(237, 31, 36));
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
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
                        .addComponent(btnGuardarCliente)
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
                .addComponent(btnGuardarCliente)
                .addGap(59, 59, 59))
        );

        panelAuto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR AUTOMOVIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        modelo.setBorderColor(new java.awt.Color(44, 44, 45));
        modelo.setBotonColor(new java.awt.Color(44, 44, 45));
        modelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modelo.setPhColor(new java.awt.Color(44, 44, 45));
        modelo.setPlaceholder("MODELO");

        marca.setBorderColor(new java.awt.Color(44, 44, 45));
        marca.setBotonColor(new java.awt.Color(44, 44, 45));
        marca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        marca.setPhColor(new java.awt.Color(44, 44, 45));
        marca.setPlaceholder("MARCA");

        placa.setBorderColor(new java.awt.Color(44, 44, 45));
        placa.setBotonColor(new java.awt.Color(44, 44, 45));
        placa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        placa.setPhColor(new java.awt.Color(44, 44, 45));
        placa.setPlaceholder("PLACA");

        color.setBorderColor(new java.awt.Color(44, 44, 45));
        color.setBotonColor(new java.awt.Color(44, 44, 45));
        color.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        color.setPhColor(new java.awt.Color(44, 44, 45));
        color.setPlaceholder("COLOR");

        btnGuardarAuto.setBackground(new java.awt.Color(237, 31, 36));
        btnGuardarAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarAuto.setText("Guardar");
        btnGuardarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAutoActionPerformed(evt);
            }
        });

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        year.setColorBackground(new java.awt.Color(44, 44, 45));
        year.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        javax.swing.GroupLayout panelAutoLayout = new javax.swing.GroupLayout(panelAuto);
        panelAuto.setLayout(panelAutoLayout);
        panelAutoLayout.setHorizontalGroup(
            panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(placa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutoLayout.createSequentialGroup()
                .addGap(0, 201, Short.MAX_VALUE)
                .addComponent(btnGuardarAuto)
                .addGap(167, 167, 167))
        );
        panelAutoLayout.setVerticalGroup(
            panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarAuto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(37, 37, 37))
        );
        registroclienteLayout.setVerticalGroup(
            registroclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroclienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsiguiente)
                .addGap(71, 71, 71))
        );

        rSPanelsSlider2.add(registrocliente, "card2");

        registroservicio.setName("registroservicio"); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        boxArea.setForeground(new java.awt.Color(0, 0, 0));
        boxArea.setAutoscrolls(true);
        boxArea.setColorArrow(new java.awt.Color(44, 44, 45));
        boxArea.setColorBorde(new java.awt.Color(44, 44, 45));
        boxArea.setColorFondo(new java.awt.Color(240, 240, 240));
        boxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SERVICIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnBuscarServicio.setBackground(new java.awt.Color(237, 31, 36));
        btnBuscarServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarServicio.setText("BUSCAR");
        btnBuscarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarServicioActionPerformed(evt);
            }
        });

        listServicios.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(listServicios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarServicio)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarServicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

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

        listServiciosaRealizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listServiciosaRealizarMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(listServiciosaRealizar);

        txtverdescripcion.setColumns(20);
        txtverdescripcion.setRows(5);
        jScrollPane6.setViewportView(txtverdescripcion);

        btnEliminar.setBackground(new java.awt.Color(237, 31, 36));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
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

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registroservicioLayout = new javax.swing.GroupLayout(registroservicio);
        registroservicio.setLayout(registroservicioLayout);
        registroservicioLayout.setHorizontalGroup(
            registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroservicioLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addComponent(btnatras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnfinalizar)
                        .addGap(21, 21, 21))
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 63, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(56, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnatras)
                    .addComponent(btnfinalizar))
                .addGap(68, 68, 68))
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

        EnviarCorreo.setBackground(new java.awt.Color(237, 31, 36));
        EnviarCorreo.setForeground(new java.awt.Color(255, 255, 255));
        EnviarCorreo.setText("Enviar");
        EnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarCorreoActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(237, 31, 36));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Enviar");

        lblGuia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGuia.setToolTipText("");

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
                    .addComponent(EnviarCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGuia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EnviarCorreo))
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
                .addContainerGap(284, Short.MAX_VALUE)
                .addGroup(registrofinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        registrofinalizadoLayout.setVerticalGroup(
            registrofinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrofinalizadoLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
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
            .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 669, Short.MAX_VALUE)
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
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed

        if (listCliente.getSelectedIndex() != -1) {
            if (listAuto.getSelectedIndex() != -1) {
                if (!this.btnsiguiente.isSelected()) {
                    rSPanelsSlider2.slidPanel(registroservicio, RSPanelsSlider.direct.Right);
                    listarArea();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un Automovil");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Cliente");
        }
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        if (!this.btnatras.isSelected()) {
            rSPanelsSlider2.slidPanel(registrocliente, RSPanelsSlider.direct.Right);
            descrip.removeAllElements();
            idserv.removeAllElements();
            idservselec.removeAllElements();
            modelos.removeAllElements();
            listServicios.setModel(modelos);
            listServiciosaRealizar.setModel(modelos);
            txtdescripcion.setText("");
        }
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed
        Date sistemaFech = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        if (!this.btnfinalizar.isSelected()) {
            ordenVo orden = new ordenVo();
            orden.setIdcliente(Integer.parseInt(lblIdCliente.getText()));
            orden.setIdauto(Integer.parseInt(String.valueOf(idauto.elementAt(listAuto.getSelectedIndex()))));
            orden.setNumorden(numerodeOrden());
            miCoordinador.agregarOrden(orden);
            if (idservselec.size() != 0) {

                for (int i = 0; i < idservselec.size(); i++) {
                    procesoVo proc = new procesoVo();
                    proc.setImagen_proceso("");
                    proc.setObservaciones(String.valueOf(descrip.elementAt(i)));
                    proc.setFecha_inicio(formato.format(sistemaFech));
                    proc.setId_servicio(Integer.parseInt(String.valueOf(idservselec.elementAt(i))));
                    proc.setId_orden(IdOrden());
                    miCoordinador.agregarProceso(proc);
                }
                rSPanelsSlider2.slidPanel(registrofinalizado, RSPanelsSlider.direct.Right);
            } else {
                JOptionPane.showMessageDialog(null, "Ningun servicio seleccionado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnfinalizarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        btnActivadorActualizar.setEnabled(false);
        btnActivadorAuto.setEnabled(false);
        DefaultListModel modeloss = new DefaultListModel();
        modeloss.removeAllElements();
        listAuto.setModel(modeloss);
        if (txtNombreCliente.getText().equals("")) {
            listarCliente();
        } else {
            listarClienteConNombre();

        }

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void listClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listClienteMouseClicked
        DefaultListModel modeloss = new DefaultListModel();
        enableComponents(panelCliente, false);
        LimpiarPanelCliente();
        idauto.removeAllElements();
        ArrayList<autoVo> auto = miCoordinador.buscarAuto(Integer.parseInt(String.valueOf(idcliente.elementAt(listCliente.getSelectedIndex()))));
        lblIdCliente.setText("" + idcliente.elementAt(listCliente.getSelectedIndex()));
        for (int i = 0; i < auto.size(); i++) {
            modeloss.addElement(auto.get(i).getPlaca() + "  " + auto.get(i).getModelo());
            idauto.addElement(auto.get(i).getIdauto());
        }
        listAuto.setModel(modeloss);
        btnActivadorAuto.setEnabled(true);
        btnActivadorActualizar.setEnabled(true);
    }//GEN-LAST:event_listClienteMouseClicked

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed

        if (btnGuardarCliente.getText().equals("Guardar")) {
            clienteVo cliente = new clienteVo();
            cliente.setNombre(nombre.getText());
            cliente.setColonia(colonia.getText());
            cliente.setCalle(calle.getText());
            cliente.setNum_casa(num_casa.getText());
            cliente.setTelefono(telefono.getText());
            cliente.setCorreo(correo.getText());
            cliente.setId_trabajador(Integer.parseInt(Inicio.lblid.getText()));

            if (nombre.getText().equals("") || colonia.getText().equals("") || calle.getText().equals("")
                    || num_casa.getText().equals("") || telefono.getText().equals("") || correo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");
            } else {
                miCoordinador.agregarCliente(cliente);
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                LimpiarPanelCliente();
                enableComponents(panelCliente, false);
                listarCliente();
            }
        } else if (btnGuardarCliente.getText().equals("Actualizar")) {
            clienteVo actualizado = new clienteVo();
            if (nombre.getText().equals("") || colonia.getText().equals("") || calle.getText().equals("")
                    || num_casa.getText().equals("") || telefono.getText().equals("") || correo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");
            } else {

                actualizado.setNombre(nombre.getText());
                actualizado.setColonia(colonia.getText());
                actualizado.setCalle(calle.getText());
                actualizado.setNum_casa(num_casa.getText());
                actualizado.setTelefono(telefono.getText());
                actualizado.setCorreo(correo.getText());
                actualizado.setId_trabajador(Integer.parseInt(String.valueOf(idcliente.elementAt(listCliente.getSelectedIndex()))));
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar el registro?", "Actualización!", JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    Coordinador.updateCliente(actualizado);
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    LimpiarPanelCliente();
                    enableComponents(panelCliente, false);
                    listarCliente();
                }

            }

        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    public void LimpiarPanelCliente() {
        nombre.setText(null);
        colonia.setText(null);
        calle.setText(null);
        num_casa.setText(null);
        telefono.setText(null);
        correo.setText(null);

    }


    private void btnActivadorRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivadorRegistroActionPerformed
        enableComponents(panelCliente, true);
        LimpiarPanelCliente();
        btnGuardarCliente.setText("Guardar");
    }//GEN-LAST:event_btnActivadorRegistroActionPerformed

    private void listAutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAutoMouseClicked
        // btnAutoNuevo.setEnabled(true);
    }//GEN-LAST:event_listAutoMouseClicked

    private void btnActivadorAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivadorAutoActionPerformed
        System.out.println(listAuto.getLeadSelectionIndex());
        enableComponents(panelAuto, true);

    }//GEN-LAST:event_btnActivadorAutoActionPerformed

    private void btnGuardarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAutoActionPerformed

        if (placa.getText().equals("") || modelo.getText().equals("") || marca.getText().equals("")
                || color.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            autoVo auto = new autoVo();
            auto.setPlaca(placa.getText());
            auto.setModelo(modelo.getText());
            auto.setMarca(marca.getText());
            auto.setAño(String.valueOf(year.getYear()));
            auto.setColor(color.getText());
            auto.setIdcliente(Integer.parseInt(lblIdCliente.getText()));
            miCoordinador.agregarAuto(auto);
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            //limpiarCampos();
            listarCliente();
        }
    }//GEN-LAST:event_btnGuardarAutoActionPerformed

    private void boxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAreaActionPerformed
        listarServicio();
    }//GEN-LAST:event_boxAreaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (boxArea.getSelectedIndex() != -1) {
            if (listServicios.getSelectedIndex() != -1) {

                modelos.addElement(boxArea.getSelectedItem() + " " + listServicios.getSelectedValue());
                descrip.addElement(txtdescripcion.getText());
                idservselec.addElement(idserv.elementAt(listServicios.getSelectedIndex()));
                listServiciosaRealizar.setModel(modelos);
                txtdescripcion.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado un servicio");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado una area");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void listServiciosaRealizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listServiciosaRealizarMouseClicked
        txtverdescripcion.setText("");
        txtverdescripcion.setText(String.valueOf(descrip.elementAt(listServiciosaRealizar.getSelectedIndex())));

    }//GEN-LAST:event_listServiciosaRealizarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        descrip.remove(listServiciosaRealizar.getSelectedIndex());
        idservselec.remove(listServiciosaRealizar.getSelectedIndex());
        modelos.remove(listServiciosaRealizar.getSelectedIndex());
        listServiciosaRealizar.setModel(modelos);


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void EnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarCorreoActionPerformed
        sendEmail();

    }//GEN-LAST:event_EnviarCorreoActionPerformed

    private void btnBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarServicioActionPerformed
        if (txtNombreServicio.getText().length() > 0) {
            listarServicioNombre();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese servicio a buscar");
        }
    }//GEN-LAST:event_btnBuscarServicioActionPerformed

    private void btnActivadorActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivadorActualizarActionPerformed
        if (listCliente.getSelectedIndex() != -1) {
            btnGuardarCliente.setText("Actualizar");
            ArrayList<clienteVo> cliente = miCoordinador.buscarCliente(Integer.parseInt(String.valueOf(idcliente.elementAt(listCliente.getSelectedIndex()))));
            for (int i = 0; i < cliente.size(); i++) {
                nombre.setText(cliente.get(i).getNombre());
                colonia.setText(cliente.get(i).getColonia());
                calle.setText(cliente.get(i).getCalle());
                num_casa.setText(cliente.get(i).getNum_casa());
                telefono.setText(cliente.get(i).getTelefono());
                correo.setText(cliente.get(i).getCorreo());
            }
            enableComponents(panelCliente, true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente");
        }
    }//GEN-LAST:event_btnActivadorActualizarActionPerformed

    public void sendEmail() {
        // ImageIcon unoL = new ImageIcon(getClass().getResource("/imagenes/imagen1.png"));
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("magm9533@gmail.com", "haystemas1");
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("magm9533@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("gomezrios.luismartin@gmail.com"));
            message.setSubject("Holis");
            message.setText("Que onda pinche putito :v");
            message.setHeader("Cosa uno", "Cosa dos");
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void listarCliente() {
        idcliente.removeAllElements();
        DefaultListModel modeloss = new DefaultListModel();
        ArrayList<clienteVo> cliente = miCoordinador.buscarClientes(idadmin);
        for (int i = 0; i < cliente.size(); i++) {
            modeloss.addElement(cliente.get(i).getNombre());
            idcliente.addElement(cliente.get(i).getIdcliente());
        }
        listCliente.setModel(modeloss);
    }

    public void listarClienteConNombre() {
        idcliente.removeAllElements();
        DefaultListModel modeloss = new DefaultListModel();
        ArrayList<clienteVo> cliente = miCoordinador.buscarUsuarioConNombre(idadmin, txtNombreCliente.getText());
        for (int i = 0; i < cliente.size(); i++) {
            modeloss.addElement(cliente.get(i).getNombre());
            idcliente.addElement(cliente.get(i).getIdcliente());
        }
        listCliente.setModel(modeloss);
    }

    public Integer IdOrden() {

        ordenVo ord = Coordinador.getIdOrden(lblGuia.getText());
        if (ord.getIdorden() != 0) {
            return ord.getIdorden();
        } else {
            JOptionPane.showMessageDialog(null, "Orden no encontrada", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    public String InicialesTaller() {

        adminVo adm = Coordinador.getAdmin(Inicio.lblid.getText());
        if (adm.getNombre_empresa() != null) {
            String inic = "", palabra;
            StringTokenizer stPalabras = new StringTokenizer(adm.getNombre_empresa());
            while (stPalabras.hasMoreTokens()) {
                palabra = stPalabras.nextToken();
                inic = inic + palabra.substring(0, 1);
            }
            return inic;
        } else {
            JOptionPane.showMessageDialog(null, "Taller no encontrado", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    public String numerodeOrden() {

        String cadena;

        cadena = InicialesTaller()
                + Inicio.fecha.getText().substring(0, 2)
                + Inicio.fecha.getText().substring(3, 5)
                + Inicio.fecha.getText().substring(6)
                + Inicio.hora.getText().substring(0, 2)
                + Inicio.hora.getText().substring(3, 5);
        lblGuia.setText(cadena);
        return cadena;
    }

    public void listarArea() {
        ArrayList<areaVo> area = miCoordinador.listarArea();
        for (int i = 0; i < area.size(); i++) {
            boxArea.addItem(area.get(i).getNombre());
        }
    }

    public void listarServicio() {
        idserv.removeAllElements();
        DefaultListModel modeloss = new DefaultListModel();
        int id = 1 + boxArea.getSelectedIndex();
        ArrayList<servicioVo> servicio = miCoordinador.buscarServicio(id);

        for (int i = 0; i < servicio.size(); i++) {
            // modelo.addElement(i);
            modeloss.addElement(servicio.get(i).getNombre());
            idserv.addElement(servicio.get(i).getIdservicio());
        }
        listServicios.setModel(modeloss);
        //btnActivadorAuto.setEnabled(true);
    }

    public void listarServicioNombre() {
        idserv.removeAllElements();
        DefaultListModel modeloss = new DefaultListModel();
        int id = 1 + boxArea.getSelectedIndex();
        ArrayList<servicioVo> servicio = miCoordinador.buscarServicioNombre(id, txtNombreServicio.getText());

        for (int i = 0; i < servicio.size(); i++) {
            // modelo.addElement(i);
            modeloss.addElement(servicio.get(i).getNombre());
            idserv.addElement(servicio.get(i).getIdservicio());
        }
        listServicios.setModel(modeloss);
        //btnActivadorAuto.setEnabled(true);
    }

    public void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarCorreo;
    private rojerusan.RSComboMetro boxArea;
    private javax.swing.JButton btnActivadorActualizar;
    private javax.swing.JButton btnActivadorAuto;
    private javax.swing.JButton btnActivadorRegistro;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarServicio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarAuto;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnfinalizar;
    private javax.swing.JButton btnsiguiente;
    private rojerusan.RSMetroTextFullPlaceHolder calle;
    private rojerusan.RSMetroTextFullPlaceHolder colonia;
    private rojerusan.RSMetroTextFullPlaceHolder color;
    private rojerusan.RSMetroTextFullPlaceHolder correo;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    public static javax.swing.JLabel lblGuia;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JList<String> listAuto;
    private javax.swing.JList<String> listCliente;
    private javax.swing.JList<String> listServicios;
    private javax.swing.JList<String> listServiciosaRealizar;
    private rojerusan.RSMetroTextFullPlaceHolder marca;
    private rojerusan.RSMetroTextFullPlaceHolder modelo;
    private rojerusan.RSMetroTextFullPlaceHolder nombre;
    private rojerusan.RSMetroTextFullPlaceHolder num_casa;
    private javax.swing.JPanel panelAuto;
    private javax.swing.JPanel panelCliente;
    private rojerusan.RSMetroTextFullPlaceHolder placa;
    private rojerusan.RSPanelsSlider rSPanelsSlider2;
    private javax.swing.JPanel registrocliente;
    private javax.swing.JPanel registrofinalizado;
    private javax.swing.JPanel registroservicio;
    private rojerusan.RSMetroTextFullPlaceHolder telefono;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombreCliente;
    private javax.swing.JTextField txtNombreServicio;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextArea txtverdescripcion;
    private rojerusan.RSYearDate year;
    // End of variables declaration//GEN-END:variables
}
