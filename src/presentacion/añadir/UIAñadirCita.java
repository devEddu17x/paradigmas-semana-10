/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.añadir;

import control.CitasControlador;
import control.MascotasControlador;
import control.ProductosControlador;
import control.UsuariosControlador;
import entidades.Mascota;
import entidades.Personal;
import entidades.Producto;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edu
 */
public class UIAñadirCita extends javax.swing.JFrame {

    private Mascota mascotaX;
    private boolean stockValido = false;
    private Personal p;
    private Producto productoX;
    private HashMap<Producto, Integer> productos = new HashMap<>();
    private List<Personal> personal = new LinkedList<>();
    DefaultTableModel tmMascota = new DefaultTableModel();
    DefaultTableModel tmPersonal = new DefaultTableModel();
    DefaultTableModel tmProducto = new DefaultTableModel();

    public UIAñadirCita() {
        initComponents();

        String columnas1[] = new String[]{"Nombre", "Apellido", "Cargo"};
        String columnas2[] = new String[]{"Nro. Expediente", "Mascota"};
        String columnas3[] = new String[]{"Nombre", "P. Unitario", "Stock"};
        tmPersonal.setColumnIdentifiers(columnas1);
        tmMascota.setColumnIdentifiers(columnas2);
        tmProducto.setColumnIdentifiers(columnas3);

        tbProducto.setModel(tmProducto);
        tbMascota.setModel(tmMascota);
        tbPersonal.setModel(tmPersonal);

        campo1.setVisible(false);
        campo2.setVisible(false);
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        panelContenedor = new javax.swing.JPanel();
        imgTitulo = new javax.swing.JLabel();
        tfTalla = new javax.swing.JTextField();
        tfCondicion = new javax.swing.JTextField();
        btnAñadirProducto = new javax.swing.JButton();
        jblResultado = new javax.swing.JLabel();
        tfMascota = new javax.swing.JTextField();
        tfTemperatura = new javax.swing.JTextField();
        tfPeso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tarDiagnostico = new javax.swing.JTextArea();
        btnRegular = new javax.swing.JRadioButton();
        btnEmergencia = new javax.swing.JRadioButton();
        btnQuiru = new javax.swing.JRadioButton();
        tfMotivo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tarTratamiento = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        campo1 = new javax.swing.JTextArea();
        tfApellidoPersonal = new javax.swing.JTextField();
        tfNombreProducto = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbMascota = new javax.swing.JTable();
        btnAñadirCita = new javax.swing.JButton();
        btnAñadirPersonal = new javax.swing.JButton();
        tfNombrePersonal = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbPersonal = new javax.swing.JTable();
        tfCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(760, 640));
        setResizable(false);

        panelContenedor.setBackground(new java.awt.Color(51, 51, 51));

        imgTitulo.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        imgTitulo.setForeground(new java.awt.Color(187, 187, 186));
        imgTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTitulo.setText("AÑADIR CITA");

        tfTalla.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfTalla.setForeground(new java.awt.Color(187, 187, 186));
        tfTalla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTalla.setText("Talla");
        tfTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTallaActionPerformed(evt);
            }
        });

        tfCondicion.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfCondicion.setForeground(new java.awt.Color(187, 187, 186));
        tfCondicion.setText("Condicion");
        tfCondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCondicionActionPerformed(evt);
            }
        });

        btnAñadirProducto.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnAñadirProducto.setText("Añadir Producto");
        btnAñadirProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirProductoMouseClicked(evt);
            }
        });
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });

        jblResultado.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jblResultado.setForeground(new java.awt.Color(255, 0, 0));

        tfMascota.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfMascota.setForeground(new java.awt.Color(187, 187, 186));
        tfMascota.setText("Nro. de Mascota");
        tfMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMascotaActionPerformed(evt);
            }
        });

        tfTemperatura.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfTemperatura.setForeground(new java.awt.Color(187, 187, 186));
        tfTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTemperatura.setText("Temperatura");
        tfTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTemperaturaActionPerformed(evt);
            }
        });

        tfPeso.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfPeso.setForeground(new java.awt.Color(187, 187, 186));
        tfPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPeso.setText("Peso");
        tfPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesoActionPerformed(evt);
            }
        });

        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbProducto);

        campo2.setColumns(20);
        campo2.setRows(5);
        campo2.setText("Instrucciones Post Operatorias");
        jScrollPane2.setViewportView(campo2);

        tarDiagnostico.setColumns(20);
        tarDiagnostico.setRows(5);
        tarDiagnostico.setText("Diagnostico");
        jScrollPane3.setViewportView(tarDiagnostico);

        botones.add(btnRegular);
        btnRegular.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        btnRegular.setSelected(true);
        btnRegular.setText("Regular");
        btnRegular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnRegularFocusGained(evt);
            }
        });

        botones.add(btnEmergencia);
        btnEmergencia.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        btnEmergencia.setText("Emergencia");
        btnEmergencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnEmergenciaFocusGained(evt);
            }
        });
        btnEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergenciaActionPerformed(evt);
            }
        });

        botones.add(btnQuiru);
        btnQuiru.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        btnQuiru.setText("Quirurjica");
        btnQuiru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnQuiruFocusGained(evt);
            }
        });

        tfMotivo.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfMotivo.setForeground(new java.awt.Color(187, 187, 186));
        tfMotivo.setText("Motivo");
        tfMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMotivoActionPerformed(evt);
            }
        });

        tarTratamiento.setColumns(20);
        tarTratamiento.setRows(5);
        tarTratamiento.setText("Tratamiento");
        tarTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarTratamientoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tarTratamiento);

        campo1.setColumns(20);
        campo1.setRows(5);
        campo1.setText("Instrucciones Pre Operatorias");
        jScrollPane5.setViewportView(campo1);

        tfApellidoPersonal.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfApellidoPersonal.setForeground(new java.awt.Color(187, 187, 186));
        tfApellidoPersonal.setText("A. Paterno Personal");
        tfApellidoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoPersonalActionPerformed(evt);
            }
        });

        tfNombreProducto.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfNombreProducto.setForeground(new java.awt.Color(187, 187, 186));
        tfNombreProducto.setText("Nombre Producto");
        tfNombreProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNombreProductoMouseClicked(evt);
            }
        });
        tfNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreProductoActionPerformed(evt);
            }
        });

        tbMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tbMascota);

        btnAñadirCita.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnAñadirCita.setText("Añadir Cita");
        btnAñadirCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirCitaMouseClicked(evt);
            }
        });
        btnAñadirCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCitaActionPerformed(evt);
            }
        });

        btnAñadirPersonal.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnAñadirPersonal.setText("Añadir Personal");
        btnAñadirPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirPersonalMouseClicked(evt);
            }
        });
        btnAñadirPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPersonalActionPerformed(evt);
            }
        });

        tfNombrePersonal.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfNombrePersonal.setForeground(new java.awt.Color(187, 187, 186));
        tfNombrePersonal.setText("Nombre Personal");
        tfNombrePersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNombrePersonalMouseClicked(evt);
            }
        });
        tfNombrePersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombrePersonalActionPerformed(evt);
            }
        });

        tbPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tbPersonal);

        tfCantidad.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfCantidad.setForeground(new java.awt.Color(187, 187, 186));
        tfCantidad.setText("Cantidad");
        tfCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCantidadMouseClicked(evt);
            }
        });
        tfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(imgTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAñadirPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContenedorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAñadirCita, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelContenedorLayout.createSequentialGroup()
                                        .addComponent(tfMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfCondicion)
                                    .addComponent(tfMotivo)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                                        .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelContenedorLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                                .addComponent(tfNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfApellidoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                                .addComponent(tfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                                                    .addGap(20, 20, 20)
                                                    .addComponent(btnRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(55, 55, 55)
                                                    .addComponent(btnQuiru, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(70, 70, 70)
                                                    .addComponent(btnEmergencia))
                                                .addGroup(panelContenedorLayout.createSequentialGroup()
                                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(btnAñadirProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(31, 31, 31))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(imgTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMascota)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addComponent(tfApellidoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tfNombrePersonal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAñadirPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegular)
                            .addComponent(btnQuiru)
                            .addComponent(btnEmergencia))
                        .addGap(18, 18, 18)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tfCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAñadirCita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirCitaActionPerformed

    private void btnAñadirCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirCitaMouseClicked
        boolean resultado = false;
        if (!stockValido) {
            jblResultado.setText("Stock invalido. No es posible añadir la cita");
        }
        if (btnRegular.isSelected()) {
            resultado = CitasControlador.insertarCita(tfMotivo.getText(), tfCondicion.getText(), tfTemperatura.getText(), tfPeso.getText(), tfTalla.getText(), tarDiagnostico.getText(), tarTratamiento.getText(), mascotaX, productos);
        } else if (btnEmergencia.isSelected()) {
            resultado = CitasControlador.insertarCita(tfMotivo.getText(), tfCondicion.getText(), tfTemperatura.getText(), tfPeso.getText(), tfTalla.getText(), tarDiagnostico.getText(), tarTratamiento.getText(), mascotaX, productos, campo1.getText());
        } else if (btnQuiru.isSelected()) {
            resultado = CitasControlador.insertarCita(tfMotivo.getText(), tfCondicion.getText(), tfTemperatura.getText(), tfPeso.getText(), tfTalla.getText(), tarDiagnostico.getText(), tarTratamiento.getText(), mascotaX, productos, campo1.getText(), campo2.getText());
        }

        if (resultado) {
            this.dispose();
        } else {
            jblResultado.setText("No se pudo añadir la cita");
        }

        descontarStock();
    }//GEN-LAST:event_btnAñadirCitaMouseClicked

    private void descontarStock() {
        Producto productoDescontar;
        for (Map.Entry<Producto, Integer> kv : productos.entrySet()) {
            productoDescontar = kv.getKey();
            productoDescontar.reducirStock(kv.getValue());
        }
    }
    private void tfNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreProductoActionPerformed

        productoX = ProductosControlador.getProducto(tfNombreProducto.getText());
        if (productoX != null) {
            if (tmProducto.getRowCount() > 0) {
                tmProducto.removeRow(0);
            }

            tmProducto.addRow(new Object[]{productoX.getNombre(), productoX.getPrecioUnitario(), productoX.getStock()});
            tfCantidad.setText("");
            tfCantidad.requestFocus();
        }
    }//GEN-LAST:event_tfNombreProductoActionPerformed

    private void tfNombreProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombreProductoMouseClicked
        tfNombreProducto.requestFocus();
        tfNombreProducto.setText("");
    }//GEN-LAST:event_tfNombreProductoMouseClicked

    private void tfApellidoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoPersonalActionPerformed
        p = UsuariosControlador.getPersonal(tfNombrePersonal.getText(), tfApellidoPersonal.getText());
        if (p != null) {
            tmPersonal.addRow(new Object[]{p.getNombre(), p.getApellidoP(), p.getCargo()});
        }
    }//GEN-LAST:event_tfApellidoPersonalActionPerformed

    private void tarTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarTratamientoMouseClicked
        tarTratamiento.requestFocus();
        tarTratamiento.setText("");
    }//GEN-LAST:event_tarTratamientoMouseClicked

    private void tfMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMotivoActionPerformed
        tfCondicion.requestFocus();
        tfCondicion.setText("");
    }//GEN-LAST:event_tfMotivoActionPerformed

    private void btnQuiruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnQuiruFocusGained
        campo1.setVisible(true);
        campo1.setText("Instrucciones Pre-Operatorias");
        campo2.setVisible(true);
        campo2.setText("Instrucciones Post-Operatorias");
    }//GEN-LAST:event_btnQuiruFocusGained

    private void btnEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmergenciaActionPerformed

    private void btnEmergenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEmergenciaFocusGained
        campo1.setVisible(true);
        campo1.setText("Procedimientos adicionales");
        campo2.setVisible(false);
    }//GEN-LAST:event_btnEmergenciaFocusGained

    private void btnRegularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRegularFocusGained
        campo1.setVisible(false);
        campo2.setVisible(false);
    }//GEN-LAST:event_btnRegularFocusGained

    private void tfPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesoActionPerformed
        tfTalla.requestFocus();
        tfTalla.setText("");
    }//GEN-LAST:event_tfPesoActionPerformed

    private void tfTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTemperaturaActionPerformed
        tfPeso.requestFocus();
        tfPeso.setText("");
    }//GEN-LAST:event_tfTemperaturaActionPerformed

    private void tfMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMascotaActionPerformed
        mascotaX = MascotasControlador.getMascotaNumeroExp(tfMascota.getText());
        if (mascotaX != null) {
            tmMascota.addRow(new Object[]{mascotaX.getNumeroExpediente(), mascotaX.getNombre()});
            tfMotivo.requestFocus();
            tfMotivo.setText("");
        }
    }//GEN-LAST:event_tfMascotaActionPerformed

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
        // aqui no va nada, era mouse clicked no action permormed
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void btnAñadirProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirProductoMouseClicked
        int consumo = Integer.parseInt(tfCantidad.getText());
        if (consumo > productoX.getStock()) {
            jblResultado.setText("La cantidad sobrepasa el stock del producto");
            stockValido = false;
            return;
        }
        if (consumo > productoX.getStock()) {
            jblResultado.setText("La cantidad sobrepasa el stock del producto");
        }
        if (productoX == null) {
            jblResultado.setText("Producto no encontrado");

        }

        stockValido = true;
        productos.put(productoX, consumo);
        jblResultado.setText("Producto añadido");
        productoX = null;
    }//GEN-LAST:event_btnAñadirProductoMouseClicked

    private void tfCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCondicionActionPerformed
        tfTemperatura.requestFocus();
        tfTemperatura.setText("");
    }//GEN-LAST:event_tfCondicionActionPerformed

    private void tfTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTallaActionPerformed
        tarDiagnostico.requestFocus();
        tarDiagnostico.setText("");
    }//GEN-LAST:event_tfTallaActionPerformed

    private void btnAñadirPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirPersonalMouseClicked
        if (p != null) {
            personal.add(p);
            jblResultado.setText("Personal añadido");
            tmPersonal.removeRow(0);
            tfNombreProducto.setText("");
            tfApellidoPersonal.setText("");
            tfNombrePersonal.setText("");

        }
        p = null;

    }//GEN-LAST:event_btnAñadirPersonalMouseClicked

    private void btnAñadirPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirPersonalActionPerformed

    private void tfNombrePersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombrePersonalMouseClicked
        tfNombrePersonal.requestFocus();
        tfNombrePersonal.setText("");
    }//GEN-LAST:event_tfNombrePersonalMouseClicked

    private void tfNombrePersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombrePersonalActionPerformed
        tfApellidoPersonal.requestFocus();
        tfApellidoPersonal.setText("");
    }//GEN-LAST:event_tfNombrePersonalActionPerformed

    private void tfCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCantidadMouseClicked

    private void tfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCantidadActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton btnAñadirCita;
    private javax.swing.JButton btnAñadirPersonal;
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JRadioButton btnEmergencia;
    private javax.swing.JRadioButton btnQuiru;
    private javax.swing.JRadioButton btnRegular;
    private javax.swing.JTextArea campo1;
    private javax.swing.JTextArea campo2;
    private javax.swing.JLabel imgTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel jblResultado;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JTextArea tarDiagnostico;
    private javax.swing.JTextArea tarTratamiento;
    private javax.swing.JTable tbMascota;
    private javax.swing.JTable tbPersonal;
    private javax.swing.JTable tbProducto;
    private javax.swing.JTextField tfApellidoPersonal;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfCondicion;
    private javax.swing.JTextField tfMascota;
    private javax.swing.JTextField tfMotivo;
    private javax.swing.JTextField tfNombrePersonal;
    private javax.swing.JTextField tfNombreProducto;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfTalla;
    private javax.swing.JTextField tfTemperatura;
    // End of variables declaration//GEN-END:variables
}
