package Vista;

import Controlador.Coordinador;
import Modelo.trabajadorVo;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author MAGM
 */
public  class Usuarios extends javax.swing.JInternalFrame {
    
    int id_empleado;
    private Coordinador miCoordinador;
DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;       }   };
    
    String[] columnas = {"ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Tipo de trabajo"};
    public Usuarios() {
        initComponents();
        this.llenarTablaTrabajadores();
        this.llenarTablaTrabajo();
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        
        //this.getUsuario(1);
    }

    public void limpiarCampos(){
    txtNombre3.setText("");
    txtPaterno.setText("");
    txtMaterno.setText("");
    txtEdad.setText("");
    txtTrabajo.setText("");
    txtPass.setText("");
    }
    
    public void llenarTablaTrabajadores(){
    modelo.setColumnIdentifiers(columnas);
        ArrayList<trabajadorVo> p = Coordinador.getTrabajadores();
        //Ciclo para llenar tabla de productos
        for (int i = 0; i < p.size(); i++) {

            modelo.addRow(new Object[]{p.get(i).getIdtrabajador(), p.get(i).getNombre(), p.get(i).getApaterno(),p.get(i).getAmaterno(),
                p.get(i).getEdad(), p.get(i).getTipo_trabajo()});
        }
        //Asignamos los datos del Modelo a la tabla
        tbTraba.setModel(modelo);
    }
    
    public void llenarTablaTrabajo(){
    modelo2.setColumnIdentifiers(columnas);
        ArrayList<trabajadorVo> p = Coordinador.getTrabajadores();
        //Ciclo para llenar tabla de productos
        for (int i = 0; i < p.size(); i++) {

            modelo2.addRow(new Object[]{p.get(i).getIdtrabajador(), p.get(i).getNombre(), p.get(i).getApaterno(),p.get(i).getAmaterno(),
                p.get(i).getEdad(), p.get(i).getTipo_trabajo()});
        }
        //Asignamos los datos del Modelo a la tabla
        tbTrabajo.setModel(modelo2);
    }
    
    public void llenarCamposTrabajador(int id){
    
        trabajadorVo t = Coordinador.getTrabajadorID(id);
        
        txtNombre2.setText(t.getNombre());
        txtPaterno2.setText(t.getApaterno());
        txtMaterno2.setText(t.getAmaterno());
        txtEdad2.setText(Integer.toString(t.getEdad()));
        txtTrabajo2.setText(t.getTipo_trabajo());
        txtPass2.setText(t.getPassword());
        
    }
    
    private void limpiarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    private void limpiarTabla2() {
        while (modelo2.getRowCount() > 0) {
            modelo2.removeRow(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        agregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtTrabajo = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPaterno = new rojerusan.RSMetroTextFullPlaceHolder();
        txtMaterno = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNombre3 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEdad = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPass = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton1 = new javax.swing.JButton();
        editar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTraba = new rojerusan.RSTableMetro();
        jPanel10 = new javax.swing.JPanel();
        txtTrabajo2 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPaterno2 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtMaterno2 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNombre2 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEdad2 = new rojerusan.RSMetroTextFullPlaceHolder();
        btnActualizar = new javax.swing.JButton();
        txtPass2 = new rojerusan.RSPasswordTextPlaceHolder();
        borrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTrabajo = new rojerusan.RSTableMetro();
        btnBorrar = new javax.swing.JButton();
        btnActua = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(44, 44, 45));

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/useradd2-01.png"))); // NOI18N
        btnagregar.setBorderPainted(false);
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnborrar.setBackground(new java.awt.Color(0, 0, 0));
        btnborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete-01.png"))); // NOI18N
        btnborrar.setBorderPainted(false);
        btnborrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit2-01.png"))); // NOI18N
        btneditar.setBorderPainted(false);
        btneditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        agregar.setName("agregar"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrar Usuario:");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRABAJADOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTrabajo.setForeground(new java.awt.Color(0, 0, 0));
        txtTrabajo.setBorderColor(new java.awt.Color(0, 0, 0));
        txtTrabajo.setBotonColor(new java.awt.Color(0, 0, 0));
        txtTrabajo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTrabajo.setPhColor(new java.awt.Color(102, 102, 102));
        txtTrabajo.setPlaceholder("TIPO TRABAJO");
        txtTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrabajoKeyTyped(evt);
            }
        });

        txtPaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtPaterno.setBorderColor(new java.awt.Color(0, 0, 0));
        txtPaterno.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPaterno.setPhColor(new java.awt.Color(102, 102, 102));
        txtPaterno.setPlaceholder("APELLIDO PATERNO");
        txtPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaternoKeyTyped(evt);
            }
        });

        txtMaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtMaterno.setBorderColor(new java.awt.Color(0, 0, 0));
        txtMaterno.setBotonColor(new java.awt.Color(0, 0, 0));
        txtMaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMaterno.setPhColor(new java.awt.Color(102, 102, 102));
        txtMaterno.setPlaceholder("APELLIDO MATERNO");
        txtMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaternoKeyTyped(evt);
            }
        });

        txtNombre3.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre3.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNombre3.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre3.setPhColor(new java.awt.Color(102, 102, 102));
        txtNombre3.setPlaceholder("NOMBRE(S)");
        txtNombre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre3KeyTyped(evt);
            }
        });

        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setBorderColor(new java.awt.Color(0, 0, 0));
        txtEdad.setBotonColor(new java.awt.Color(0, 0, 0));
        txtEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEdad.setPhColor(new java.awt.Color(102, 102, 102));
        txtEdad.setPlaceholder("EDAD");
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setBorderColor(new java.awt.Color(0, 0, 0));
        txtPass.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPass.setPhColor(new java.awt.Color(102, 102, 102));
        txtPass.setPlaceholder("CONTRASEÑA");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(237, 31, 36));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout agregarLayout = new javax.swing.GroupLayout(agregar);
        agregar.setLayout(agregarLayout);
        agregarLayout.setHorizontalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addContainerGap(440, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(440, Short.MAX_VALUE))
            .addGroup(agregarLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        agregarLayout.setVerticalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(agregar, "card2");

        editar.setName("editar"); // NOI18N
        editar.setPreferredSize(new java.awt.Dimension(1044, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Editar Usuario:");

        tbTraba.setForeground(new java.awt.Color(44, 44, 45));
        tbTraba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Trabajador", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Tipo de Trabajo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTraba.setColorBackgoundHead(new java.awt.Color(44, 44, 45));
        tbTraba.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbTraba.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tbTraba.setColorFilasBackgound2(new java.awt.Color(153, 153, 153));
        tbTraba.setColorFilasForeground1(new java.awt.Color(237, 31, 36));
        tbTraba.setColorFilasForeground2(new java.awt.Color(237, 31, 36));
        tbTraba.setColorSelBackgound(new java.awt.Color(237, 31, 36));
        tbTraba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTrabaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTraba);
        if (tbTraba.getColumnModel().getColumnCount() > 0) {
            tbTraba.getColumnModel().getColumn(0).setResizable(false);
            tbTraba.getColumnModel().getColumn(1).setResizable(false);
            tbTraba.getColumnModel().getColumn(2).setResizable(false);
            tbTraba.getColumnModel().getColumn(3).setResizable(false);
            tbTraba.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRABAJADOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTrabajo2.setForeground(new java.awt.Color(0, 0, 0));
        txtTrabajo2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtTrabajo2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtTrabajo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTrabajo2.setPhColor(new java.awt.Color(102, 102, 102));
        txtTrabajo2.setPlaceholder("TIPO TRABAJO");
        txtTrabajo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrabajo2KeyTyped(evt);
            }
        });

        txtPaterno2.setForeground(new java.awt.Color(0, 0, 0));
        txtPaterno2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtPaterno2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPaterno2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPaterno2.setPhColor(new java.awt.Color(102, 102, 102));
        txtPaterno2.setPlaceholder("APELLIDO PATERNO");
        txtPaterno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaterno2KeyTyped(evt);
            }
        });

        txtMaterno2.setForeground(new java.awt.Color(0, 0, 0));
        txtMaterno2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtMaterno2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtMaterno2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMaterno2.setPhColor(new java.awt.Color(102, 102, 102));
        txtMaterno2.setPlaceholder("APELLIDO MATERNO");
        txtMaterno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaterno2KeyTyped(evt);
            }
        });

        txtNombre2.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNombre2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre2.setPhColor(new java.awt.Color(102, 102, 102));
        txtNombre2.setPlaceholder("NOMBRE(S)");
        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre2KeyTyped(evt);
            }
        });

        txtEdad2.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtEdad2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtEdad2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEdad2.setPhColor(new java.awt.Color(102, 102, 102));
        txtEdad2.setPlaceholder("EDAD");
        txtEdad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdad2KeyTyped(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(237, 31, 36));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtPass2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        txtPass2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTrabajo2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaterno2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtPass2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTrabajo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editarLayout = new javax.swing.GroupLayout(editar);
        editar.setLayout(editarLayout);
        editarLayout.setHorizontalGroup(
            editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE))
                .addContainerGap())
        );
        editarLayout.setVerticalGroup(
            editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        rSPanelsSlider1.add(editar, "card3");

        borrar.setName("barrar"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Eliminar Usuario:");

        tbTrabajo.setForeground(new java.awt.Color(44, 44, 45));
        tbTrabajo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Trabajador", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Tipo de Trabajo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTrabajo.setColorBackgoundHead(new java.awt.Color(44, 44, 45));
        tbTrabajo.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbTrabajo.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tbTrabajo.setColorFilasBackgound2(new java.awt.Color(153, 153, 153));
        tbTrabajo.setColorFilasForeground1(new java.awt.Color(237, 31, 36));
        tbTrabajo.setColorFilasForeground2(new java.awt.Color(237, 31, 36));
        tbTrabajo.setColorSelBackgound(new java.awt.Color(237, 31, 36));
        tbTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTrabajoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbTrabajo);
        if (tbTrabajo.getColumnModel().getColumnCount() > 0) {
            tbTrabajo.getColumnModel().getColumn(0).setResizable(false);
            tbTrabajo.getColumnModel().getColumn(1).setResizable(false);
            tbTrabajo.getColumnModel().getColumn(2).setResizable(false);
            tbTrabajo.getColumnModel().getColumn(3).setResizable(false);
            tbTrabajo.getColumnModel().getColumn(5).setResizable(false);
        }

        btnBorrar.setBackground(new java.awt.Color(237, 31, 36));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("ELIMINAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnActua.setBackground(new java.awt.Color(237, 31, 36));
        btnActua.setForeground(new java.awt.Color(255, 255, 255));
        btnActua.setText("ACTUALIZAR");
        btnActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borrarLayout = new javax.swing.GroupLayout(borrar);
        borrar.setLayout(borrarLayout);
        borrarLayout.setHorizontalGroup(
            borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borrarLayout.createSequentialGroup()
                        .addGap(0, 474, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(0, 435, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(borrarLayout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(btnActua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        borrarLayout.setVerticalGroup(
            borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(borrar, "card4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        if (!this.btnborrar.isSelected()) {
            this.btnagregar.setSelected(false);
            this.btnborrar.setSelected(true);
            this.btneditar.setSelected(false);
            rSPanelsSlider1.slidPanel(borrar, RSPanelsSlider.direct.Right);
            limpiarTabla2();
            llenarTablaTrabajo();
        }
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (!this.btnagregar.isSelected()) {
            this.btnagregar.setSelected(true);
            this.btnborrar.setSelected(false);
            this.btneditar.setSelected(false);
            rSPanelsSlider1.slidPanel(agregar, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        if (!this.btneditar.isSelected()) {
            this.btnagregar.setSelected(false);
            this.btnborrar.setSelected(false);
            this.btneditar.setSelected(true);
            rSPanelsSlider1.slidPanel(editar, RSPanelsSlider.direct.Right);
            limpiarTabla(); 
            llenarTablaTrabajadores();
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtNombre3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre3KeyTyped
        int longitud = txtNombre3.getText().length();
        if (longitud > 30) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtNombre3KeyTyped

    private void txtPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyTyped
int longitud = txtPaterno.getText().length();
        if (longitud > 20) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtPaternoKeyTyped

    private void txtMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyTyped
int longitud = txtMaterno.getText().length();
        if (longitud > 20) {
            getToolkit().beep();

            evt.consume();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaternoKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
int longitud = txtEdad.getText().length();
        if (longitud > 2) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtTrabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrabajoKeyTyped
int longitud = txtTrabajo.getText().length();
        if (longitud > 30) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtTrabajoKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
int longitud = txtPass.getText().length();
        if (longitud > 20) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

if(txtNombre3.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() || txtEdad.getText().isEmpty()
        || txtTrabajo.getText().isEmpty() || txtPass.getText().isEmpty()){
JOptionPane.showMessageDialog(null, "Llenar todos los campos disponibles", "Información incompleta", JOptionPane.WARNING_MESSAGE);
}
else{

trabajadorVo vo = new trabajadorVo();

vo.setNombre(txtNombre3.getText());
vo.setApaterno(txtPaterno.getText());
vo.setAmaterno(txtMaterno.getText());
vo.setEdad(Integer.parseInt(txtEdad.getText()));
vo.setTipo_trabajo(txtTrabajo.getText());
vo.setId_admin(1);
vo.setPassword(txtPass.getText());

miCoordinador.addTrabajador(vo);
JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
limpiarCampos();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTrabajo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrabajo2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrabajo2KeyTyped

    private void txtPaterno2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaterno2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaterno2KeyTyped

    private void txtMaterno2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaterno2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterno2KeyTyped

    private void txtNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2KeyTyped

    private void txtEdad2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdad2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdad2KeyTyped

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
trabajadorVo actualizado = new trabajadorVo();
        if(txtNombre2.getText().isEmpty() && txtPaterno2.getText().isEmpty() && txtMaterno.getText().isEmpty() && txtEdad2.getText().isEmpty()
        && txtTrabajo2.getText().isEmpty() && txtPass2.getText().isEmpty()){
   JOptionPane.showMessageDialog(null, "Llenar todos los campos disponibles", "Información incompleta", JOptionPane.WARNING_MESSAGE);
}
else{
        String myPass = new String(txtPass2.getPassword());
actualizado.setIdtrabajador(id_empleado);
actualizado.setNombre(txtNombre2.getText());
actualizado.setApaterno(txtPaterno2.getText());
actualizado.setAmaterno(txtMaterno2.getText());
actualizado.setEdad(Integer.parseInt(txtEdad2.getText()));
actualizado.setTipo_trabajo(txtTrabajo2.getText());
actualizado.setPassword(myPass);

int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar el registro?", "Actualización!", JOptionPane.YES_NO_OPTION);
if(resp == 0){
Coordinador.updateTrabajador(actualizado);
JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
limpiarTabla();
llenarTablaTrabajadores();

}

}
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tbTrabaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTrabaMouseClicked
int seleccion = tbTraba.getSelectedRow();

int ide = (int) tbTraba.getValueAt(seleccion, 0);
id_empleado = ide;

llenarCamposTrabajador(ide);
    }//GEN-LAST:event_tbTrabaMouseClicked

    private void tbTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTrabajoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTrabajoMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        trabajadorVo v = new trabajadorVo();
        int fila = tbTrabajo.getSelectedRow();
        int id_trabajador = (int)tbTrabajo.getValueAt(fila, 0);
        String nombre = (String)tbTrabajo.getValueAt(fila, 1);
        String paterno = (String)tbTrabajo.getValueAt(fila, 2);
        String materno = (String)tbTrabajo.getValueAt(fila, 3);
        String completo = nombre + " " +paterno + " "+ materno;
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de Eliminar el registro de: "+completo+"?");
        
        if(resp == 0 ){
        v.setIdtrabajador(id_trabajador);
        Coordinador.BorrarTrabajador(v);
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        limpiarTabla2();
        llenarTablaTrabajo();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuaActionPerformed
llenarTablaTrabajo();
    }//GEN-LAST:event_btnActuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregar;
    private javax.swing.JPanel borrar;
    private javax.swing.JButton btnActua;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JPanel editar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSTableMetro tbTraba;
    private rojerusan.RSTableMetro tbTrabajo;
    private rojerusan.RSMetroTextFullPlaceHolder txtEdad;
    private rojerusan.RSMetroTextFullPlaceHolder txtEdad2;
    private rojerusan.RSMetroTextFullPlaceHolder txtMaterno;
    private rojerusan.RSMetroTextFullPlaceHolder txtMaterno2;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombre2;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombre3;
    private rojerusan.RSMetroTextFullPlaceHolder txtPass;
    private rojerusan.RSPasswordTextPlaceHolder txtPass2;
    private rojerusan.RSMetroTextFullPlaceHolder txtPaterno;
    private rojerusan.RSMetroTextFullPlaceHolder txtPaterno2;
    private rojerusan.RSMetroTextFullPlaceHolder txtTrabajo;
    private rojerusan.RSMetroTextFullPlaceHolder txtTrabajo2;
    // End of variables declaration//GEN-END:variables
}
