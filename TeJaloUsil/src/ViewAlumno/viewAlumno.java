/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewAlumno;

import java.util.ArrayList;
import model.conductor;
import model.pedido;

/**
 *
 * @author PC_Valeria
 */
public class viewAlumno extends javax.swing.JFrame {

    public viewAlumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameVer = new javax.swing.JFrame();
        gradientPanelVer = new keeptoo.KGradientPanel();
        labCelCond = new javax.swing.JLabel();
        labTituloCond = new javax.swing.JLabel();
        labDniCond = new javax.swing.JLabel();
        labMarcaCond = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        tfDniCond = new javax.swing.JTextField();
        tfMarcaCond = new javax.swing.JTextField();
        tfCelularCond = new javax.swing.JTextField();
        labRutasCond = new javax.swing.JLabel();
        cbRutasCond = new javax.swing.JComboBox<>();
        jFrameVer2 = new javax.swing.JFrame();
        gradientPanelVer1 = new keeptoo.KGradientPanel();
        labCelCond1 = new javax.swing.JLabel();
        labTituloCond1 = new javax.swing.JLabel();
        labMarcaCond1 = new javax.swing.JLabel();
        btnOk1 = new javax.swing.JButton();
        tfMarcaCond1 = new javax.swing.JTextField();
        tfCelularCond1 = new javax.swing.JTextField();
        labRutasCond1 = new javax.swing.JLabel();
        cbRutasCond1 = new javax.swing.JComboBox<>();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        gradientPanel1 = new keeptoo.KGradientPanel();
        labTitulo = new javax.swing.JLabel();
        labBuscar = new javax.swing.JLabel();
        labHoras = new javax.swing.JLabel();
        cbParadero = new javax.swing.JComboBox<>();
        cbHoras = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        labParadero = new javax.swing.JLabel();
        gradientPanel2 = new keeptoo.KGradientPanel();
        labResultados = new javax.swing.JLabel();
        sPaneResultados = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();
        btnVerConductor = new javax.swing.JButton();
        btnElegir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        gradientPanel3 = new keeptoo.KGradientPanel();
        labTituloPerfil = new javax.swing.JLabel();
        labNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        labApellido = new javax.swing.JLabel();
        labUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        btnCerrarSesion = new javax.swing.JButton();
        labContrasena = new javax.swing.JLabel();
        tfContrasena = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        labCelular = new javax.swing.JLabel();
        labDni = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        tfDni = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        gradientPanel4 = new keeptoo.KGradientPanel();
        labTusMov = new javax.swing.JLabel();
        sPaneMov = new javax.swing.JScrollPane();
        tbMovilidad = new javax.swing.JTable();
        btnVerCond = new javax.swing.JButton();

        gradientPanelVer.setkEndColor(new java.awt.Color(0, 102, 255));
        gradientPanelVer.setkStartColor(new java.awt.Color(153, 204, 255));

        labCelCond.setText("Celular");

        labTituloCond.setText("Datos del Conductor");

        labDniCond.setText("DNI");

        labMarcaCond.setText("Marca de vehículo");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        tfDniCond.setEditable(false);

        tfMarcaCond.setEditable(false);
        tfMarcaCond.setText("Toyota Van Hiace 2021");

        tfCelularCond.setEditable(false);
        tfCelularCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularCondActionPerformed(evt);
            }
        });

        labRutasCond.setText("Rutas");

        javax.swing.GroupLayout gradientPanelVerLayout = new javax.swing.GroupLayout(gradientPanelVer);
        gradientPanelVer.setLayout(gradientPanelVerLayout);
        gradientPanelVerLayout.setHorizontalGroup(
            gradientPanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelVerLayout.createSequentialGroup()
                .addGroup(gradientPanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelVerLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(gradientPanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labMarcaCond)
                            .addComponent(labDniCond)
                            .addComponent(labCelCond)
                            .addComponent(labRutasCond)))
                    .addGroup(gradientPanelVerLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(labTituloCond)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelVerLayout.createSequentialGroup()
                .addGap(0, 164, Short.MAX_VALUE)
                .addGroup(gradientPanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOk)
                    .addComponent(tfCelularCond, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(tfDniCond, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(tfMarcaCond, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(cbRutasCond, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        gradientPanelVerLayout.setVerticalGroup(
            gradientPanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelVerLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labTituloCond)
                .addGap(43, 43, 43)
                .addComponent(labDniCond)
                .addGap(3, 3, 3)
                .addComponent(tfDniCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(labMarcaCond)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMarcaCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(labCelCond)
                .addGap(2, 2, 2)
                .addComponent(tfCelularCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(labRutasCond)
                .addGap(4, 4, 4)
                .addComponent(cbRutasCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnOk)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jFrameVerLayout = new javax.swing.GroupLayout(jFrameVer.getContentPane());
        jFrameVer.getContentPane().setLayout(jFrameVerLayout);
        jFrameVerLayout.setHorizontalGroup(
            jFrameVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameVerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanelVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrameVerLayout.setVerticalGroup(
            jFrameVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameVerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanelVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gradientPanelVer1.setkEndColor(new java.awt.Color(0, 102, 255));
        gradientPanelVer1.setkStartColor(new java.awt.Color(153, 204, 255));

        labCelCond1.setText("Celular");

        labTituloCond1.setText("Datos del Conductor");

        labMarcaCond1.setText("Marca de vehículo");

        btnOk1.setText("Ok");
        btnOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk1ActionPerformed(evt);
            }
        });

        tfMarcaCond1.setEditable(false);
        tfMarcaCond1.setText("Toyota Van Hiace 2021");

        tfCelularCond1.setEditable(false);
        tfCelularCond1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularCond1ActionPerformed(evt);
            }
        });

        labRutasCond1.setText("Rutas");

        javax.swing.GroupLayout gradientPanelVer1Layout = new javax.swing.GroupLayout(gradientPanelVer1);
        gradientPanelVer1.setLayout(gradientPanelVer1Layout);
        gradientPanelVer1Layout.setHorizontalGroup(
            gradientPanelVer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelVer1Layout.createSequentialGroup()
                .addGroup(gradientPanelVer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelVer1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(gradientPanelVer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labMarcaCond1)
                            .addComponent(labCelCond1)
                            .addComponent(labRutasCond1)))
                    .addGroup(gradientPanelVer1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(labTituloCond1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelVer1Layout.createSequentialGroup()
                .addGap(0, 164, Short.MAX_VALUE)
                .addGroup(gradientPanelVer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbRutasCond1, 0, 219, Short.MAX_VALUE)
                    .addComponent(btnOk1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCelularCond1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(tfMarcaCond1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        gradientPanelVer1Layout.setVerticalGroup(
            gradientPanelVer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelVer1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labTituloCond1)
                .addGap(36, 36, 36)
                .addComponent(labMarcaCond1)
                .addGap(17, 17, 17)
                .addComponent(tfMarcaCond1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labCelCond1)
                .addGap(7, 7, 7)
                .addComponent(tfCelularCond1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labRutasCond1)
                .addGap(7, 7, 7)
                .addComponent(cbRutasCond1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnOk1)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jFrameVer2Layout = new javax.swing.GroupLayout(jFrameVer2.getContentPane());
        jFrameVer2.getContentPane().setLayout(jFrameVer2Layout);
        jFrameVer2Layout.setHorizontalGroup(
            jFrameVer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameVer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanelVer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrameVer2Layout.setVerticalGroup(
            jFrameVer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameVer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanelVer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gradientPanel1.setkEndColor(new java.awt.Color(0, 102, 255));
        gradientPanel1.setkStartColor(new java.awt.Color(153, 204, 255));

        labTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labTitulo.setFont(new java.awt.Font("Forte", 1, 30)); // NOI18N
        labTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setToolTipText("");

        labBuscar.setText("Busca tu movilidad");

        labHoras.setText("Horas");

        cbParadero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Naranjal", "Izaguirre", "Pacífico", "Independencia", "Los Jazmines", "Tomás Valle", "El milagro", "Honorio Delgado", "UNI", "Parque del trabajo", "Caquetá", "Ramón Castilla", "Tacna", "Jirón de la unión", "Colmena", "Dos de mayo", "Quilca", "España", "Estación central", "Estadio nacional", "México", "Canadá", "Javier Prado", "Carnaval Moreyra", "Aramburú", "Domingo Orué", "Angamos", "Ricardo Palma", "Benavides", "28 de julio", "Plaza de flores", "Balta", "Bulevar", "Estadio Unión", "Escuela militar", "Terán", "Rosario de villa", "Mantellini" }));

        cbHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00-7:05", "7:30-7:35", "8:00-8:05", "8:30-8:35", "9:00-9:05", "9:30-9:35", "10:00-10:05", "10:30-10:35", "11:00-11:05", "11:30-11:35", "12:00-12:05", "12:30-12:35", "13:00-13:05", "13:30-13:35", "14:00-14:05", "14:30-14:35", "15:00-15:05", "15:30-15:35", "16:00-16:05", "16:30-16:35", "17:00-17:05", "17:30-17:35", "18:00-18:05", "18:30-18:35", "19:00-19:05", "19:30-19:35" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labParadero.setText("Paradero");

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gradientPanel1Layout.createSequentialGroup()
                                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbParadero, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labParadero))
                                .addGap(93, 93, 93)
                                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labHoras)
                                    .addComponent(cbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnBuscar)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(labBuscar)
                .addGap(26, 26, 26)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labHoras)
                    .addComponent(labParadero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbParadero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(btnBuscar)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        gradientPanel2.setkEndColor(new java.awt.Color(0, 102, 255));
        gradientPanel2.setkStartColor(new java.awt.Color(153, 204, 255));

        labResultados.setText("Resultados: nomHoras + nomParadero");

        tabResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sPaneResultados.setViewportView(tabResultados);

        btnVerConductor.setText("Ver Conductor");
        btnVerConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConductorActionPerformed(evt);
            }
        });

        btnElegir.setText("Elegir");
        btnElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addComponent(labResultados)
                        .addContainerGap(379, Short.MAX_VALUE))
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addComponent(sPaneResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElegir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(labResultados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sPaneResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnVerConductor)
                        .addGap(18, 18, 18)
                        .addComponent(btnElegir)
                        .addGap(26, 26, 26)
                        .addComponent(btnRegresar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane.addTab("Principal", jPanel1);

        gradientPanel3.setkEndColor(new java.awt.Color(0, 102, 255));
        gradientPanel3.setkStartColor(new java.awt.Color(153, 204, 255));
        gradientPanel3.setkTransparentControls(false);

        labTituloPerfil.setText("Tu Perfil");

        labNombre.setText("Nombre:");

        tfNombre.setEditable(false);

        labApellido.setText("Apellido:");

        labUsuario.setText("Usuario");

        tfUsuario.setEditable(false);

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        labContrasena.setText("Contraseña");

        tfContrasena.setEditable(false);

        tfApellido.setEditable(false);

        labCelular.setText("Celular");

        labDni.setText("Dni");

        tfCelular.setEditable(false);

        tfDni.setEditable(false);

        javax.swing.GroupLayout gradientPanel3Layout = new javax.swing.GroupLayout(gradientPanel3);
        gradientPanel3.setLayout(gradientPanel3Layout);
        gradientPanel3Layout.setHorizontalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(labTituloPerfil))
                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradientPanel3Layout.createSequentialGroup()
                                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                                        .addComponent(labCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(194, 194, 194))
                                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                                        .addComponent(tfCelular)
                                        .addGap(39, 39, 39)))
                                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDni, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(labDni, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(gradientPanel3Layout.createSequentialGroup()
                                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                                        .addComponent(labUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(194, 194, 194)
                                        .addComponent(labContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                                        .addComponent(labNombre)
                                        .addGap(206, 206, 206)
                                        .addComponent(labApellido)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(gradientPanel3Layout.createSequentialGroup()
                                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tfContrasena))
                            .addGroup(gradientPanel3Layout.createSequentialGroup()
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tfApellido)))))
                .addGap(105, 105, 105))
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(btnCerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanel3Layout.setVerticalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labTituloPerfil)
                .addGap(27, 27, 27)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNombre)
                    .addComponent(labApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labUsuario)
                    .addComponent(labContrasena, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCelular)
                    .addComponent(labDni))
                .addGap(18, 18, 18)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Perfil", jPanel2);

        gradientPanel4.setkEndColor(new java.awt.Color(0, 102, 255));
        gradientPanel4.setkStartColor(new java.awt.Color(153, 204, 255));
        gradientPanel4.setkTransparentControls(false);
        gradientPanel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                gradientPanel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labTusMov.setText("Tus Movilidades");

        tbMovilidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hora", "Paradero", "Dni Conductor"
            }
        ));
        sPaneMov.setViewportView(tbMovilidad);

        btnVerCond.setText("Ver Conductor");
        btnVerCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCondActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel4Layout = new javax.swing.GroupLayout(gradientPanel4);
        gradientPanel4.setLayout(gradientPanel4Layout);
        gradientPanel4Layout.setHorizontalGroup(
            gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(sPaneMov, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnVerCond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
            .addGroup(gradientPanel4Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(labTusMov)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanel4Layout.setVerticalGroup(
            gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel4Layout.createSequentialGroup()
                .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labTusMov)
                        .addGap(30, 30, 30)
                        .addComponent(sPaneMov, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnVerCond)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Tus Movilidades", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String opcion = cbParadero.getSelectedItem().toString();
        String opcion2 = cbHoras.getSelectedItem().toString();
        
        labResultados.setText("Resultados:" + opcion + " " + opcion2);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnVerCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCondActionPerformed
        jFrameVer2.setSize(444, 518);
        jFrameVer2.setVisible(true);
    }//GEN-LAST:event_btnVerCondActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        jFrameVer.setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnVerConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConductorActionPerformed
        jFrameVer.setSize(444, 518);
        jFrameVer.setVisible(true);
    }//GEN-LAST:event_btnVerConductorActionPerformed

    private void btnElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElegirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tfCelularCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCelularCondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCelularCondActionPerformed

    private void btnOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk1ActionPerformed
        jFrameVer2.setVisible(false);
    }//GEN-LAST:event_btnOk1ActionPerformed

    private void tfCelularCond1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCelularCond1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCelularCond1ActionPerformed

    private void gradientPanel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_gradientPanel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_gradientPanel4AncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnElegir;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnOk1;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnVerCond;
    public javax.swing.JButton btnVerConductor;
    public javax.swing.JComboBox<String> cbHoras;
    public javax.swing.JComboBox<String> cbParadero;
    public javax.swing.JComboBox<String> cbRutasCond;
    public javax.swing.JComboBox<String> cbRutasCond1;
    public keeptoo.KGradientPanel gradientPanel1;
    public keeptoo.KGradientPanel gradientPanel2;
    private keeptoo.KGradientPanel gradientPanel3;
    private keeptoo.KGradientPanel gradientPanel4;
    private keeptoo.KGradientPanel gradientPanelVer;
    private keeptoo.KGradientPanel gradientPanelVer1;
    private javax.swing.JFrame jFrameVer;
    private javax.swing.JFrame jFrameVer2;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel labApellido;
    private javax.swing.JLabel labBuscar;
    private javax.swing.JLabel labCelCond;
    public javax.swing.JLabel labCelCond1;
    private javax.swing.JLabel labCelular;
    private javax.swing.JLabel labContrasena;
    private javax.swing.JLabel labDni;
    private javax.swing.JLabel labDniCond;
    private javax.swing.JLabel labHoras;
    private javax.swing.JLabel labMarcaCond;
    private javax.swing.JLabel labMarcaCond1;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labParadero;
    public javax.swing.JLabel labResultados;
    public javax.swing.JLabel labRutasCond;
    public javax.swing.JLabel labRutasCond1;
    public javax.swing.JLabel labTitulo;
    private javax.swing.JLabel labTituloCond;
    private javax.swing.JLabel labTituloCond1;
    private javax.swing.JLabel labTituloPerfil;
    private javax.swing.JLabel labTusMov;
    private javax.swing.JLabel labUsuario;
    public javax.swing.JScrollPane sPaneMov;
    public javax.swing.JScrollPane sPaneResultados;
    public javax.swing.JTable tabResultados;
    public javax.swing.JTable tbMovilidad;
    public javax.swing.JTextField tfApellido;
    public javax.swing.JTextField tfCelular;
    public javax.swing.JTextField tfCelularCond;
    public javax.swing.JTextField tfCelularCond1;
    public javax.swing.JTextField tfContrasena;
    public javax.swing.JTextField tfDni;
    public javax.swing.JTextField tfDniCond;
    public javax.swing.JTextField tfMarcaCond;
    public javax.swing.JTextField tfMarcaCond1;
    public javax.swing.JTextField tfNombre;
    public javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
