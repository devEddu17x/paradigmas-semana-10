/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.añadir;

import control.UsuariosControlador;

/**
 *
 * @author edu
 */
public class UIAñadirDueño extends javax.swing.JFrame {

    public UIAñadirDueño() {
        initComponents();

    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        imgTitulo = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfMaterno = new javax.swing.JTextField();
        tfDNI = new javax.swing.JTextField();
        tfPaterno = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        jblResultado = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        panelContenedor.setBackground(new java.awt.Color(51, 51, 51));

        imgTitulo.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        imgTitulo.setForeground(new java.awt.Color(187, 187, 186));
        imgTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTitulo.setText("AÑADIR DUEÑO");

        tfNombre.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(187, 187, 186));
        tfNombre.setText("Nombre");
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfMaterno.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfMaterno.setForeground(new java.awt.Color(187, 187, 186));
        tfMaterno.setText("Apellido Materno");
        tfMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaternoActionPerformed(evt);
            }
        });

        tfDNI.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfDNI.setForeground(new java.awt.Color(187, 187, 186));
        tfDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDNI.setText("DNI");
        tfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIActionPerformed(evt);
            }
        });

        tfPaterno.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfPaterno.setForeground(new java.awt.Color(187, 187, 186));
        tfPaterno.setText("Apellido Paterno");
        tfPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaternoActionPerformed(evt);
            }
        });

        btnAñadir.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirMouseClicked(evt);
            }
        });
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jblResultado.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jblResultado.setForeground(new java.awt.Color(255, 0, 0));

        tfDireccion.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfDireccion.setForeground(new java.awt.Color(187, 187, 186));
        tfDireccion.setText("Direccion");
        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        tfTelefono.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfTelefono.setForeground(new java.awt.Color(187, 187, 186));
        tfTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelefono.setText("Telefono");
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNombre)
                            .addComponent(tfMaterno)
                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imgTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelContenedorLayout.createSequentialGroup()
                                        .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfTelefono)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfDireccion, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(imgTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tfPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tfMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDNIActionPerformed

        tfTelefono.requestFocus();
        tfTelefono.setText("");
    }//GEN-LAST:event_tfDNIActionPerformed

    private void tfMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaternoActionPerformed

        tfDNI.requestFocus();
        tfDNI.setText("");
    }//GEN-LAST:event_tfMaternoActionPerformed

    private void tfPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaternoActionPerformed
        tfMaterno.requestFocus();
        tfMaterno.setText("");
    }//GEN-LAST:event_tfPaternoActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        tfPaterno.requestFocus();
        tfPaterno.setText("");
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDireccionActionPerformed

    }//GEN-LAST:event_tfDireccionActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        tfDireccion.requestFocus();
        tfDireccion.setText("");
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        boolean exito = UsuariosControlador.insertarDueño(tfNombre.getText(), tfPaterno.getText(), tfMaterno.getText(), tfDNI.getText(), tfTelefono.getText(), tfDireccion.getText());
        if (exito) {
            System.out.println("Se añadio al dueño");
            this.dispose();
        } else {
            jblResultado.setText("No se pudo añadir al dueño");
        }
    }//GEN-LAST:event_btnAñadirMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JLabel imgTitulo;
    private javax.swing.JLabel jblResultado;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfMaterno;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPaterno;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
