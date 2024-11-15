/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.añadir;

import control.ProductosControlador;

/**
 *
 * @author edu
 */
public class UIAñadirProducto extends javax.swing.JFrame {

    public UIAñadirProducto() {
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
        tfPresentacion = new javax.swing.JTextField();
        tfPrecioUnitario = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        jblResultado = new javax.swing.JLabel();
        tfStock = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        panelContenedor.setBackground(new java.awt.Color(51, 51, 51));

        imgTitulo.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        imgTitulo.setForeground(new java.awt.Color(187, 187, 186));
        imgTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTitulo.setText("AÑADIR PRODUCTO");

        tfNombre.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(187, 187, 186));
        tfNombre.setText("Nombre");
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfPresentacion.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfPresentacion.setForeground(new java.awt.Color(187, 187, 186));
        tfPresentacion.setText("Presentacion");
        tfPresentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPresentacionMouseClicked(evt);
            }
        });
        tfPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPresentacionActionPerformed(evt);
            }
        });

        tfPrecioUnitario.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfPrecioUnitario.setForeground(new java.awt.Color(187, 187, 186));
        tfPrecioUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPrecioUnitario.setText("Precio Unitario");
        tfPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioUnitarioActionPerformed(evt);
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

        tfStock.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tfStock.setForeground(new java.awt.Color(187, 187, 186));
        tfStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfStock.setText("Stock");
        tfStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStockActionPerformed(evt);
            }
        });

        cmbCategoria.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comida", "Antiparasitario", "Accesorio", "Cuidado", "Snack", "Comportamiento" }));

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContenedorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombre)
                            .addComponent(tfPresentacion)
                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(imgTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                                            .addComponent(tfPrecioUnitario)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tfPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
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

    private void tfPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioUnitarioActionPerformed
        tfStock.requestFocus();
        tfStock.setText("");
    }//GEN-LAST:event_tfPrecioUnitarioActionPerformed

    private void tfPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPresentacionActionPerformed
        tfPrecioUnitario.requestFocus();
        tfPrecioUnitario.setText("");
    }//GEN-LAST:event_tfPresentacionActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed

    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStockActionPerformed

    }//GEN-LAST:event_tfStockActionPerformed

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        boolean exito = ProductosControlador.insertarProducto(tfNombre.getText(), tfPresentacion.getText(), cmbCategoria.getItemAt(cmbCategoria.getSelectedIndex()), tfPrecioUnitario.getText(), tfStock.getText());
        if (exito) {
            System.out.println("Se añadio el producto");
            this.dispose();
        } else {
            jblResultado.setText("No se pudo añadir el producto");
        }
    }//GEN-LAST:event_btnAñadirMouseClicked

    private void tfPresentacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPresentacionMouseClicked
        tfPresentacion.setText("");
    }//GEN-LAST:event_tfPresentacionMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel imgTitulo;
    private javax.swing.JLabel jblResultado;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecioUnitario;
    private javax.swing.JTextField tfPresentacion;
    private javax.swing.JTextField tfStock;
    // End of variables declaration//GEN-END:variables
}
