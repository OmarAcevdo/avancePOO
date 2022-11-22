/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package misFormularios;

import controladores.conexionBD;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductosMantenedor extends javax.swing.JInternalFrame {

    DefaultTableModel model;

    public ProductosMantenedor() {
        initComponents();
        Llenar();

    }
    void Deshabilitar(){
        txtID.setEditable(false);
        txtCantidad.setEditable(false);
        txtCategoria.setEditable(false);
        txtDescripcion.setEditable(false);
        txtMarca.setEditable(false);
    }
    void Limpiar(){
        txtID.setEditable(true);
        txtCantidad.setEditable(true);
        txtCategoria.setEditable(true);
        txtDescripcion.setEditable(true);
        txtMarca.setEditable(true);
        txtID.setText("");
        txtCantidad.setText("");
        txtCategoria.setText("");
        txtDescripcion.setText("");
        txtMarca.setText("");
    }
    void Llenar(){
    try {
            String[] titulo = {"ID", "Cantidad", "Categoria", "Descripcion", "Marca"};
            model = new DefaultTableModel(null, titulo);
            ResultSet rs = null;
            conexionBD valor = new conexionBD();
            rs = valor.getConexion().executeQuery("select * from productos");
            String fila[] = new String[5];
            while (rs.next()) {
                fila[0] = rs.getString("idproductos");
                fila[1] = rs.getString("cantidad");
                fila[2] = rs.getString("categoria");
                fila[3] = rs.getString("descripcion");
                fila[4] = rs.getString("marca");
                model.addRow(fila);
            }
            jtListado.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Categoria:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Marca:");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jtListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cantidad", "Categoria", "Descripcion", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListado);

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel4))
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel5)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(177, 177, 177)
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        Limpiar();
        txtID.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        txtID.setEditable(true);
        txtCantidad.setEditable(true);
        txtCategoria.setEditable(true);
        txtDescripcion.setEditable(true);
        txtMarca.setEditable(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int fila = jtListado.getSelectedRow();
            conexionBD valor = new conexionBD();
            valor.getConexion().executeUpdate("delete from productos where idproductos =" + "'"+jtListado.getValueAt(fila,0)+"'");
            JOptionPane.showMessageDialog(null, "datos eliminados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
        }
        Llenar();
        Limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String id = txtID.getText();
        String cantidad = txtCantidad.getText();
        String categoria = txtCategoria.getText();
        String descripcion = txtDescripcion.getText();
        String marca = txtMarca.getText();
        
        String consulta;
        consulta = "INSERT INTO productos VALUES('"
                + id + "','" + cantidad + "','" + categoria + "','" + descripcion + "','" + marca + "')";
        try {
            conexionBD valor = new conexionBD();
            valor.getConexion().executeUpdate(consulta);
            JOptionPane.showMessageDialog(null, "datos guardados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
            System.out.println(e.getMessage());
        }
        Llenar();
        Limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Limpiar();
        Llenar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            conexionBD valor = new conexionBD();
            valor.getConexion().executeUpdate("Update productos set idproductos=" + "'" + txtID.getText() + "'"
                    + ", cantidad=" + "'" + txtCantidad.getText() + "'" + " , categoria=" + "'" + txtCategoria.getText() + "', descripcion='" + txtDescripcion.getText() + "', marca='"+txtMarca.getText()+"' where idproductos=" + "'" + txtID.getText() + "'");
            JOptionPane.showMessageDialog(null, "datos actualizados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
        }
        Llenar();
        Limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jtListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListadoMouseClicked

        if (evt.getButton() == 1) {
            try {
                int fila = jtListado.getSelectedRow();
                ResultSet rs = null;
                conexionBD valor = new conexionBD();
                rs = valor.getConexion().executeQuery("select * from productos where idproductos=" + jtListado.getValueAt(fila, 0));
                rs.next();
                txtID.setText(rs.getString("idproductos"));
                txtCantidad.setText(rs.getString("cantidad"));
                txtCategoria.setText(rs.getString("categoria"));
                txtDescripcion.setText(rs.getString("descripcion"));
                txtMarca.setText(rs.getString("marca"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Deshabilitar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jtListadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtListado;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
