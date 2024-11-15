/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import control.ProductosControlador;
import entidades.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import presentacion.añadir.UIAñadirProducto;

/**
 *
 * @author edu
 */
public class PanelProductos extends javax.swing.JPanel {

    DefaultTableModel tm = new DefaultTableModel();

    public PanelProductos() {
        initComponents();
        panelContenidoMascotas.setOpaque(false);
        String columnas[] = {"Nombre", "Categoria", "Presentacion", "P. Unitario", "Stock"};
        tm.setColumnIdentifiers(columnas);
        tbMascotas.setModel(tm);

        llenarTabla();
    }

    private void llenarTabla() { // este codigo es un asco pero es solo para saber como llenar el resto y como fucionan las tablas, sha bro ;v
        List<Producto> productos = ProductosControlador.getProductos();
        for (Producto p : productos) {
            tm.addRow(new Object[]{p.getNombre(), p.getCategoria(), p.getPresentacion(), p.getPrecioUnitario(), p.getStock()});
        }
    }

    /**
     *
     * private String nombre; private String categoria; private String
     * presentacion; private double precioUnitario; private int stock;
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelContenidoMascotas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMascotas = new javax.swing.JTable();
        btnAñadir = new javax.swing.JButton();
        jblFondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(790, 630));

        panelFondo.setLayout(null);

        panelContenidoMascotas.setBackground(new java.awt.Color(0, 0, 0));

        tbMascotas.setBackground(new java.awt.Color(51, 51, 51));
        tbMascotas.setFont(new java.awt.Font("Fira Code SemiBold", 0, 12)); // NOI18N
        tbMascotas.setForeground(new java.awt.Color(255, 255, 255));
        tbMascotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbMascotas);

        btnAñadir.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenidoMascotasLayout = new javax.swing.GroupLayout(panelContenidoMascotas);
        panelContenidoMascotas.setLayout(panelContenidoMascotasLayout);
        panelContenidoMascotasLayout.setHorizontalGroup(
            panelContenidoMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoMascotasLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(panelContenidoMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        panelContenidoMascotasLayout.setVerticalGroup(
            panelContenidoMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoMascotasLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        panelFondo.add(panelContenidoMascotas);
        panelContenidoMascotas.setBounds(0, 0, 790, 630);

        jblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/imagenes/fondo gris.jpg"))); // NOI18N
        panelFondo.add(jblFondo);
        jblFondo.setBounds(-330, 0, 1120, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        UIAñadirProducto añadirProducto = new UIAñadirProducto();
        añadirProducto.setVisible(true);
    }//GEN-LAST:event_btnAñadirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblFondo;
    private javax.swing.JPanel panelContenidoMascotas;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tbMascotas;
    // End of variables declaration//GEN-END:variables
}