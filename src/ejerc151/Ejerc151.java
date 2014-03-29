package ejerc151;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Ejerc151 extends javax.swing.JFrame {
    public Connection connection = null;
    public int idUsuario = 0;
    public String nomUsuario = "";
    public String logUsuario= "";
    public String password = "";
    boolean añadirUsuario = false;
    String accion = "";
    public ArrayList<Enlace> encontrados = new ArrayList<Enlace>();

    public Ejerc151() {
        initComponents();
        jDialog1.setVisible( false );
        jDialog2.setVisible( false );
        jDialog3.setVisible( false );
        nomUser.setVisible( false );
        out.setEnabled( false );
        nuevo.setEnabled( false );
        modificar.setEnabled( false );
        eliminar.setEnabled( false );
        menuVer.setEnabled( false );
        modificarUsuario.setEnabled( false );
        labelPublic.setVisible( false );
        labelPrivate.setVisible( false );
        sliderPublic.setVisible( false );
        sliderPublic.setValue( 1 );
        encontrados = Funciones.leerEnlaces( idUsuario );
        mostrar( encontrados );
        filtro.setText( "Tags: Todos" );
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        clave = new javax.swing.JPasswordField();
        incorrecto = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        label1 = new javax.swing.JLabel();
        textoBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        buscarEnlaces = new javax.swing.JRadioButton();
        buscarEtiq = new javax.swing.JRadioButton();
        buscarAmbos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog3 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        modUsuario = new javax.swing.JTextField();
        modClave = new javax.swing.JPasswordField();
        botonModificar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        modNombre = new javax.swing.JTextField();
        mensaje = new javax.swing.JLabel();
        jDialog4 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        radioPublico = new javax.swing.JRadioButton();
        radioPrivado = new javax.swing.JRadioButton();
        modEnlace = new javax.swing.JTextField();
        modDescri = new javax.swing.JTextField();
        aceptarEnlace = new javax.swing.JButton();
        cancelarEnlace = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        modEtiqueta = new javax.swing.JTextField();
        comboEnlaces = new javax.swing.JComboBox();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        nomUser = new javax.swing.JLabel();
        filtro = new javax.swing.JLabel();
        sliderPublic = new javax.swing.JSlider();
        labelPublic = new javax.swing.JLabel();
        labelPrivate = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        identificar = new javax.swing.JMenu();
        log = new javax.swing.JMenuItem();
        out = new javax.swing.JMenuItem();
        nuevoUsuario = new javax.swing.JMenuItem();
        modificarUsuario = new javax.swing.JMenuItem();
        menuEnlace = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        buscar = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        jMenuTodos = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenuItem();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Identificación");
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setModal(true);

        jLabel4.setText("Password:");

        jLabel5.setText("Usuario:");

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        incorrecto.setText("jLabel1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clave, 0, 1, Short.MAX_VALUE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(incorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(login)
                .addGap(18, 18, 18)
                .addComponent(incorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog2.setTitle("Buscar en Enlaces");
        jDialog2.setAlwaysOnTop(true);
        jDialog2.setModal(true);
        jDialog2.setName("dialog2"); // NOI18N

        label1.setText("Buscar");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(buscarEnlaces);
        buscarEnlaces.setSelected(true);
        buscarEnlaces.setText("Descripción");

        buttonGroup1.add(buscarEtiq);
        buscarEtiq.setText("Etiquetas");

        buttonGroup1.add(buscarAmbos);
        buscarAmbos.setText("Ambos");

        jLabel1.setText("Buscar en: ");

        jLabel2.setText("Buscar: Separados por coma. En blanco -> Todos");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jDialog2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buscarEnlaces)
                                .addComponent(buscarAmbos)
                                .addGroup(jDialog2Layout.createSequentialGroup()
                                    .addComponent(buscarEtiq)
                                    .addGap(28, 28, 28)
                                    .addComponent(botonBuscar))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                            .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jDialog2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buscarAmbos, buscarEnlaces, buscarEtiq});

        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarEnlaces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarEtiq)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarAmbos)
                .addGap(33, 33, 33))
        );

        jDialog2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buscarAmbos, buscarEnlaces, buscarEtiq});

        jDialog3.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog3.setAlwaysOnTop(true);
        jDialog3.setModal(true);

        jLabel6.setText("Password:");

        jLabel7.setText("Usuario:");

        botonModificar.setText("Aceptar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre:");

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(botonModificar)
                .addGap(37, 37, 37)
                .addComponent(botonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog3Layout.createSequentialGroup()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addContainerGap(72, Short.MAX_VALUE)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(modClave)
                            .addComponent(modUsuario))))
                .addGap(41, 41, 41))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(modNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar)
                    .addComponent(botonCancelar))
                .addGap(19, 19, 19))
        );

        jLabel9.setText("Enlace:");

        jLabel10.setText("Descripción:");

        jLabel11.setText("Acceso:");

        buttonGroup2.add(radioPublico);
        radioPublico.setText("Público");

        buttonGroup2.add(radioPrivado);
        radioPrivado.setText("Privado");

        aceptarEnlace.setText("Aceptar");
        aceptarEnlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarEnlaceActionPerformed(evt);
            }
        });

        cancelarEnlace.setText("Cancelar");
        cancelarEnlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEnlaceActionPerformed(evt);
            }
        });

        jLabel12.setText("Etiquetas:");

        comboEnlaces.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEnlacesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEnlaces, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modDescri, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDialog4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioPublico)
                            .addComponent(radioPrivado))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptarEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cancelarEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(comboEnlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(modEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(modDescri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(modEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(radioPublico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioPrivado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarEnlace)
                    .addComponent(cancelarEnlace))
                .addGap(24, 24, 24))
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setBackground(new java.awt.Color(227, 227, 227));

        jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ENLACES DE INTERÉS");
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nomUser.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        nomUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomUser.setForeground(new java.awt.Color(0, 0, 204));

        filtro.setBackground(new java.awt.Color(227, 227, 227));

        sliderPublic.setMaximum(2);
        sliderPublic.setValue(1);
        sliderPublic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPublicStateChanged(evt);
            }
        });

        labelPublic.setText("Públicos");

        labelPrivate.setText("Privados");

        identificar.setText("Login");

        log.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, 0));
        log.setText("Login");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        identificar.add(log);

        out.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0));
        out.setText("Logout");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });
        identificar.add(out);

        nuevoUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0));
        nuevoUsuario.setText("Nuevo Usuario");
        nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoUsuarioActionPerformed(evt);
            }
        });
        identificar.add(nuevoUsuario);

        modificarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, 0));
        modificarUsuario.setText("Modificar Usuario");
        modificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarUsuarioActionPerformed(evt);
            }
        });
        identificar.add(modificarUsuario);

        jMenuBar1.add(identificar);

        menuEnlace.setText("Enlaces");

        nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        menuEnlace.add(nuevo);

        modificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        menuEnlace.add(modificar);

        eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        menuEnlace.add(eliminar);

        buscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        menuEnlace.add(buscar);

        jMenuBar1.add(menuEnlace);

        menuVer.setText("Ver");

        jMenuTodos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, 0));
        jMenuTodos.setText("Todos");
        jMenuTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTodosActionPerformed(evt);
            }
        });
        menuVer.add(jMenuTodos);

        jMenuUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0));
        jMenuUsuario.setText("Usuario");
        jMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioActionPerformed(evt);
            }
        });
        menuVer.add(jMenuUsuario);

        jMenuBar1.add(menuVer);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelPublic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sliderPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPrivate)
                                .addGap(91, 91, 91))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(nomUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPublic)
                            .addComponent(sliderPublic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPrivate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void mostrar( ArrayList<Enlace> encontrados ) {
        jTextArea1.setText( "" );
        int sliderSelected = sliderPublic.getValue();
        if ( sliderSelected == 2 ) {
            sliderSelected = 1;
        }
        for ( Enlace e : encontrados ) {
           int tipoAcceso = e.getAcceso();
           if( sliderPublic.getValue() == 1 || sliderSelected == tipoAcceso ) {
               jTextArea1.append( e.getUrl() + "\n" );
               jTextArea1.append( e.getDescripcion() + "\n" );
               String etiquetas = "Etiquetas: ";
               for ( int i=0; i<e.getEtiquetados().size(); i++ ) {
                   etiquetas += e.getEtiquetados().get( i );
                   if( i<e.getEtiquetados().size()-1 ) {
                       etiquetas += ", ";
                   }
               }
               jTextArea1.append( etiquetas + "\n" + "\n");
           }
        }
        if ( encontrados.isEmpty() ) {
            modificar.setEnabled( false );
            eliminar.setEnabled( false );
        }
    }
    
    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        jDialog1.setLocation( 100, 100 );
        jDialog1.setSize( 320, 270 );
        incorrecto.setVisible( false );
        jDialog1.setVisible( true );
        jDialog1.setAlwaysOnTop( true );
    }//GEN-LAST:event_logActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        logUsuario = "";
        password = "";
        idUsuario = 0;
        nomUsuario = "";
        usuario.setText( "" );
        clave.setText( "" );
        nomUser.setText( "" );
        sliderPublic.setValue( 1 );
        nomUser.setVisible( false );
        out.setEnabled( false );
        log.setEnabled( true );
        nuevo.setEnabled( false );
        modificar.setEnabled( false );
        eliminar.setEnabled( false );
        menuVer.setEnabled( false );
        labelPublic.setVisible( false );
        labelPrivate.setVisible( false );
        sliderPublic.setVisible( false );
        modificarUsuario.setEnabled( false );
        nuevoUsuario.setEnabled( true );
        jTextArea1.setText( "" );
        encontrados = Funciones.leerEnlaces( idUsuario );
        mostrar( encontrados );
    }//GEN-LAST:event_outActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        Statement consulta = null;
        String passw = "";
        for ( char s : clave.getPassword() ){
            passw += s;
        }
        String[] datosUser = Funciones.leerLogin( usuario.getText(), passw, "L" );
        if ( !datosUser[0].equals( "0" ) ) {
            idUsuario = Integer.parseInt( datosUser[0] );
            logUsuario = datosUser[1];
            password = datosUser[2];
            nomUsuario = datosUser[3];
            Usuario u = new Usuario( idUsuario, logUsuario, password, nomUsuario );
            nomUser.setText( "Usuario: " + nomUsuario.trim() );
            nomUser.setVisible( true );
            jDialog1.setVisible( false );
            out.setEnabled( true );
            log.setEnabled( false );
            nuevo.setEnabled( true );
            modificar.setEnabled( true );
            eliminar.setEnabled( true );
            menuVer.setEnabled( true );
            modificarUsuario.setEnabled( true );
            nuevoUsuario.setEnabled( false );
            labelPublic.setVisible( true );
            labelPrivate.setVisible( true );
            sliderPublic.setVisible( true );
            sliderPublic.setValue( 1 );
            jTextArea1.setText( "" );
            if ( Funciones.leerEnlacesUsuario( idUsuario ).isEmpty() ) {
                modificar.setEnabled( false );
                eliminar.setEnabled( false );
            }
            encontrados = Funciones.leerEnlaces( idUsuario );
            mostrar( encontrados );
            jMenuTodos.setEnabled( false );
            jMenuUsuario.setEnabled( true );
        }
        else {
            incorrecto.setVisible( true );
            incorrecto.setText( " Usuario o password incorrectos " );
        }
    }//GEN-LAST:event_loginActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        jDialog2.setLocation( 200, 200 );
        jDialog2.setSize( 320, 270 );
        jDialog2.setAlwaysOnTop( true );
        jDialog2.setVisible( true );
    }//GEN-LAST:event_buscarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        int tipo = 0;
        jTextArea1.setText( "" );
        if ( !textoBuscar.getText().isEmpty() ) {
            if ( buscarEnlaces.isSelected() ) {
                tipo = 0;
            }
            else if ( buscarEtiq.isSelected() ) {
                tipo = 1;
            }
            else if ( buscarAmbos.isSelected() ) {
                tipo = 2;
            }
            String[] lin = textoBuscar.getText().toUpperCase().split(",");
            String linea ="";
            for ( int i=0; i<lin.length; i++ ) {
                linea += "'" + lin[i] + "'";
                if ( i < lin.length-1 ) {
                    linea += ", ";
                }
            }
            encontrados = Enlace.Etiquetados( tipo, idUsuario, lin );
            filtro.setText( "Tags: " + textoBuscar.getText() );
        }
        else {
            String[] lin = new String[0];
            encontrados = Enlace.Etiquetados( tipo, idUsuario, lin );
            filtro.setText( "Tags: Todos"  );
        }
        mostrar( encontrados );
        jDialog2.setVisible( false );
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoUsuarioActionPerformed
        jDialog3.setLocation( 200, 200 );
        jDialog3.setSize( 380, 290 );
        jDialog3.setAlwaysOnTop( true );
        jDialog3.setTitle( "Nuevo Usuario" );
        modUsuario.setText( "" );
        modClave.setText( "" );
        modNombre.setText( "" );
        añadirUsuario = true;
        jDialog3.setVisible( true );
    }//GEN-LAST:event_nuevoUsuarioActionPerformed

    private void modificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarUsuarioActionPerformed
        jDialog3.setLocation( 200, 200 );
        jDialog3.setSize( 380, 290 );
        jDialog3.setAlwaysOnTop( true );
        jDialog3.setTitle( "Modificar Usuario" );
        modUsuario.setText( logUsuario );
        modUsuario.setEditable( false );
        modClave.setText( password );
        modNombre.setText( nomUsuario );
        añadirUsuario = false;
        jDialog3.setVisible( true );
    }//GEN-LAST:event_modificarUsuarioActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        jDialog3.setVisible( false );
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        String passw = "";
        for ( char s : modClave.getPassword() ){
            passw += s;
        }
        String nuevoLogin = modUsuario.getText();
        String nuevaClave = passw;
        if ( añadirUsuario && Usuario.Existe( nuevoLogin, passw, "M" ) ) {
            mensaje.setText( "Usuario ya existe" );
        }
        else {
            if ( !nuevoLogin.isEmpty() && !passw.isEmpty() ) {
                String nuevoNombre = modNombre.getText();
                String[] datosUser = Usuario.GuardarUsuario( idUsuario, nuevoLogin, passw, nuevoNombre );
                idUsuario = Integer.parseInt( datosUser[0] );
                logUsuario = datosUser[1];
                password =  datosUser[2];
                nomUsuario =  datosUser[3];
                nomUser.setText( "Usuario: " + nomUsuario.trim() );
                nomUser.setVisible( true );
                jDialog3.setVisible( false );
                }
            else {
                mensaje.setText( "Usuario o Clave no pueden estar en blanco" );
            }
            if ( añadirUsuario ) {
                Usuario u = new Usuario( idUsuario, logUsuario, password, nomUsuario );
                out.setEnabled( true );
                log.setEnabled( false );
                nuevo.setEnabled( true );
                eliminar.setEnabled( true );
                modificar.setEnabled( true );
                menuVer.setEnabled( true );
                modificarUsuario.setEnabled( true );
                nuevoUsuario.setEnabled( false );
                labelPublic.setVisible( true );
                labelPrivate.setVisible( true );
                sliderPublic.setVisible( true );
                sliderPublic.setValue( 1 );
                jTextArea1.setText( "" );
                jMenuTodos.setEnabled( false );
                jMenuUsuario.setEnabled( true );
                if ( Funciones.leerEnlacesUsuario( idUsuario ).isEmpty() ) {
                    modificar.setEnabled( false );
                    eliminar.setEnabled( false );
                }
                encontrados = Funciones.leerEnlaces( idUsuario );
                mostrar( encontrados );
            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void jMenuTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTodosActionPerformed
        encontrados = Funciones.leerEnlacesUsuario( 0 );
        mostrar( encontrados );
        jMenuTodos.setEnabled( false );
        jMenuUsuario.setEnabled( true );
    }//GEN-LAST:event_jMenuTodosActionPerformed

    private void jMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioActionPerformed
        encontrados = Funciones.leerEnlacesUsuario( idUsuario );
        mostrar( encontrados );
        jMenuTodos.setEnabled( true );
        jMenuUsuario.setEnabled( false );
    }//GEN-LAST:event_jMenuUsuarioActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        jDialog4.setLocation( 100, 200 );
        jDialog4.setSize( 420, 340 );
        jDialog4.setAlwaysOnTop( true );
        radioPublico.setSelected( true );
        comboEnlaces.setVisible( false );
        modEnlace.setText( "" );
        modDescri.setText( "" );
        modEnlace.setVisible( true );
        jLabel9.setVisible( true );
        modEtiqueta.setText( "" );
        aceptarEnlace.setText( "Añadir" );
        jDialog4.setVisible( true );
        jDialog4.setTitle( "Añadir Enlace" );
        accion = "A";
    }//GEN-LAST:event_nuevoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        modEnlace.setVisible( false );
        jLabel9.setVisible( false );
        comboEnlaces.setVisible( true );
        comboEnlaces.removeAllItems();
        for( Enlace e : encontrados ) {
            if ( e.getUsuario() == idUsuario ) {
                comboEnlaces.addItem( e );
            }
        }
        jDialog4.setLocation( 100, 200 );
        jDialog4.setSize( 420, 340 );
        jDialog4.setAlwaysOnTop( true );
        jDialog4.setVisible( true );
        aceptarEnlace.setText( "Modificar" );
        jDialog4.setTitle( "Modificar Enlace" );
        accion = "M";
    }//GEN-LAST:event_modificarActionPerformed

    private void cancelarEnlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEnlaceActionPerformed
        jDialog4.setVisible( false );
    }//GEN-LAST:event_cancelarEnlaceActionPerformed

    private void aceptarEnlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarEnlaceActionPerformed
        boolean esPublico = true;
        String url = "";
        int idenl = 0;
        if ( accion.equals( "A" ) ) {
            url = modEnlace.getText();
        }
        else {
            url = comboEnlaces.getSelectedItem().toString();
            idenl = ( (Enlace) comboEnlaces.getSelectedItem() ).getId();
        }
        if ( !url.isEmpty() ) {
            if ( radioPublico.isSelected() ) {
                esPublico = true;
            }
            else {
                esPublico = false;
            }
            Funciones.añadirEnlace( idUsuario, url, modDescri.getText(), esPublico, modEtiqueta.getText(), accion, idenl );
            encontrados = Funciones.leerEnlacesUsuario( 0 );
            mostrar( encontrados );
        }
        filtro.setText( "Tags: Todos"  );
        jDialog4.setVisible( false );
    }//GEN-LAST:event_aceptarEnlaceActionPerformed

    private void comboEnlacesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEnlacesItemStateChanged
        String tags = "";
        if( comboEnlaces.getSelectedIndex() >= 0  ) {
            Enlace e = (Enlace) comboEnlaces.getSelectedItem();
            modDescri.setText( e.getDescripcion() );
            for ( int i=0; i<e.getEtiquetados().size(); i++ ) {
                tags += e.getEtiquetados().get( i );
                if ( i<e.getEtiquetados().size()-1 ) {
                    tags += ",";
                }
            }
            modEtiqueta.setText( tags );
            if( e.getAcceso() == 0 ) {
                radioPublico.setSelected( true );
            }
            else {
                radioPrivado.setSelected( true );
            }
        }
    }//GEN-LAST:event_comboEnlacesItemStateChanged

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        modEnlace.setVisible( false );
        jLabel9.setVisible( false );
        comboEnlaces.setVisible( true );
        comboEnlaces.removeAllItems();
        for( Enlace e : encontrados ) {
            if ( e.getUsuario() == idUsuario ) {
                comboEnlaces.addItem( e );
            }
        }
        jDialog4.setLocation( 100, 200 );
        jDialog4.setSize( 420, 340 );
        jDialog4.setAlwaysOnTop( true );
        jDialog4.setVisible( true );
        aceptarEnlace.setText( "Eliminar" );
        jDialog4.setTitle( "Eliminar Enlace" );
        accion = "E";
    }//GEN-LAST:event_eliminarActionPerformed

    private void sliderPublicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPublicStateChanged
        mostrar( encontrados );
    }//GEN-LAST:event_sliderPublicStateChanged

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
            java.util.logging.Logger.getLogger(Ejerc151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejerc151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejerc151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejerc151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Ejerc151().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarEnlace;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JMenuItem buscar;
    private javax.swing.JRadioButton buscarAmbos;
    private javax.swing.JRadioButton buscarEnlaces;
    private javax.swing.JRadioButton buscarEtiq;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelarEnlace;
    private javax.swing.JPasswordField clave;
    private javax.swing.JComboBox comboEnlaces;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JLabel filtro;
    private javax.swing.JMenu identificar;
    private javax.swing.JLabel incorrecto;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuTodos;
    private javax.swing.JMenuItem jMenuUsuario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel labelPrivate;
    private javax.swing.JLabel labelPublic;
    private javax.swing.JMenuItem log;
    private javax.swing.JButton login;
    private javax.swing.JLabel mensaje;
    private javax.swing.JMenu menuEnlace;
    private javax.swing.JMenu menuVer;
    private javax.swing.JPasswordField modClave;
    private javax.swing.JTextField modDescri;
    private javax.swing.JTextField modEnlace;
    private javax.swing.JTextField modEtiqueta;
    private javax.swing.JTextField modNombre;
    private javax.swing.JTextField modUsuario;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JMenuItem modificarUsuario;
    private javax.swing.JLabel nomUser;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JMenuItem nuevoUsuario;
    private javax.swing.JMenuItem out;
    private javax.swing.JRadioButton radioPrivado;
    private javax.swing.JRadioButton radioPublico;
    private javax.swing.JSlider sliderPublic;
    private javax.swing.JTextField textoBuscar;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
