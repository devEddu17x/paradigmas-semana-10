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
public class UIAñadirPersonal extends javax.swing.JFrame {

    public UIAñadirPersonal() {
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
        tfHorario = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        jblResultado = new javax.swing.JLabel();
        tfNomina = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        tfPaterno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        panelContenedor.setBackground(new java.awt.Color(51, 51, 51));

        imgTitulo.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        imgTitulo.setForeground(new java.awt.Color(187, 187, 186));
        imgTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTitulo.setText("AÑADIR PERSONAL");

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
        tfMaterno.setText("A. Materno");
        tfMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfMaternoMouseClicked(evt);
            }
        });
        tfMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaternoActionPerformed(evt);
            }
        });

        tfHorario.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfHorario.setForeground(new java.awt.Color(187, 187, 186));
        tfHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfHorario.setText("Horario");
        tfHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHorarioActionPerformed(evt);
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

        tfNomina.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfNomina.setForeground(new java.awt.Color(187, 187, 186));
        tfNomina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomina.setText("Nomina");
        tfNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNominaMouseClicked(evt);
            }
        });
        tfNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNominaActionPerformed(evt);
            }
        });

        cmbCargo.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veterinario", "Asistente", "LImpieza" }));

        tfPaterno.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfPaterno.setForeground(new java.awt.Color(187, 187, 186));
        tfPaterno.setText("A. Paterno");
        tfPaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPaternoMouseClicked(evt);
            }
        });
        tfPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaternoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContenedorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombre)
                            .addComponent(tfPaterno)
                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContenedorLayout.createSequentialGroup()
                                        .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(imgTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                    .addComponent(tfMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfHorario))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
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
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(tfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
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

    private void tfHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHorarioActionPerformed
        tfNomina.requestFocus();
        tfNomina.setText("");
    }//GEN-LAST:event_tfHorarioActionPerformed

    private void tfMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaternoActionPerformed

    }//GEN-LAST:event_tfMaternoActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        tfPaterno.requestFocus();
        tfPaterno.setText("");
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNominaActionPerformed
        tfHorario.requestFocus();
        tfHorario.setText("");
    }//GEN-LAST:event_tfNominaActionPerformed

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        boolean exito = UsuariosControlador.insertarPersonal(cmbCargo.getItemAt(cmbCargo.getSelectedIndex()), tfHorario.getText(), tfNomina.getText(), tfNombre.getText(), tfPaterno.getText(), tfMaterno.getText());
        if (exito) {
            System.out.println("Se añadio el producto");
            this.dispose();
        } else {
            jblResultado.setText("No se pudo añadir el personal");
        }
    }//GEN-LAST:event_btnAñadirMouseClicked

    private void tfMaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMaternoMouseClicked
        tfMaterno.setText("");
    }//GEN-LAST:event_tfMaternoMouseClicked

    private void tfPaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPaternoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPaternoMouseClicked

    private void tfPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaternoActionPerformed
        tfMaterno.requestFocus();
        tfMaterno.setText("");
    }//GEN-LAST:event_tfPaternoActionPerformed

    private void tfNominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNominaMouseClicked
        tfNomina.setText("");
    }//GEN-LAST:event_tfNominaMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel imgTitulo;
    private javax.swing.JLabel jblResultado;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JTextField tfHorario;
    private javax.swing.JTextField tfMaterno;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNomina;
    private javax.swing.JTextField tfPaterno;
    // End of variables declaration//GEN-END:variables
}
