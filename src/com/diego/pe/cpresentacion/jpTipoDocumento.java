/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.diego.pe.cpresentacion;

import com.diego.pe.cmodelo.TipoDocumento;
import com.diego.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Soporte
 */
public class jpTipoDocumento extends javax.swing.JPanel {
    TipoDocumentoBO tdbo = new  TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    String idTipoDocumento;
    
    public jpTipoDocumento() {
        initComponents();
        listarTipoDocumento();
    }
    
    public void listarTipoDocumento(){
        tdbo.listarTipoDocumento(tablaTipoDocumento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoDocumento = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtSigla = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtOrden = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtEstado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtFechaRegistro = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtFechaActializacion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        jLabel1.setText("CRUD Tipo Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 377, 50));

        tablaTipoDocumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaTipoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTipoDocumentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTipoDocumento);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 530, 390));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 360, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 360, 0));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 380, 10));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Sigla");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        txtSigla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSigla.setBorder(null);
        jPanel1.add(txtSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 360, -1));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 380, 10));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Orden");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        txtOrden.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtOrden.setBorder(null);
        jPanel1.add(txtOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 360, -1));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 380, 10));

        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEstado.setBorder(null);
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 360, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/fecha.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 380, 10));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Fecha Registro");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        txtFechaRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFechaRegistro.setBorder(null);
        jPanel1.add(txtFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 360, -1));

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 380, 10));

        txtFechaActializacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFechaActializacion.setBorder(null);
        jPanel1.add(txtFechaActializacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 360, -1));

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 380, 10));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Fecha Actualización");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(51, 204, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 100, 40));

        btnLimpiar.setBackground(new java.awt.Color(51, 204, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/icons8-limpiar-18.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 90, 40));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Estado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/card.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/recibo.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/fecha.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/recibo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/recibo.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(51, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/icons8-guardar-18.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 100, 40));

        btnEditar.setBackground(new java.awt.Color(51, 204, 0));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/pe/cpresentacion/icon/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 490, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            td.setIdTipoDocumento(Integer.parseInt(idTipoDocumento));
            tdbo.eliminarTipoDocomento(td);
            listarTipoDocumento();
        } catch (Exception diego) {
            JOptionPane.showMessageDialog(null, "Error" + diego.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
            txtNombre.setText("");
            txtEstado.setText("");
            txtOrden.setText("");
            txtSigla.setText("");
            txtFechaRegistro.setText("");
            txtFechaActializacion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                
        try {
            td.setNombre(txtNombre.getText());
            td.setEstado(txtEstado.getText());
            td.setOrden(Integer.parseInt(txtEstado.getText()));
            td.setSigla(txtSigla.getText());
            td.setFecha(txtFechaRegistro.getText());
            td.setFechaActuliza(txtFechaActializacion.getText());
            tdbo.agregarTipoDocomento(td);
            listarTipoDocumento();
            JOptionPane.showMessageDialog(null, ":) se guardo corectamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: al guardar Tipo documento ");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public boolean valida(){
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nombre es requerido");
            return false;
        }else if(txtSigla.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Sigla es requerido");
            return false;
        }
        return true;
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            if(valida()){
                td.setIdTipoDocumento(Integer.parseInt(idTipoDocumento));
                td.setNombre(txtNombre.getText());
                td.setEstado(txtEstado.getText());
                td.setOrden(Integer.parseInt(txtEstado.getText()));
                td.setSigla(txtSigla.getText());
                td.setFecha(txtFechaRegistro.getText());
                td.setFechaActuliza(txtFechaActializacion.getText());
                tdbo.modificarTipoDocumento(td);
                listarTipoDocumento();
                JOptionPane.showMessageDialog(null, ":) se actualizó corectamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: al actualizar Tipo documento ");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tablaTipoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTipoDocumentoMouseClicked
        int seleccion = tablaTipoDocumento.rowAtPoint(evt.getPoint());
        idTipoDocumento = tablaTipoDocumento.getValueAt(seleccion, 0)+"";
        txtNombre.setText(tablaTipoDocumento.getValueAt(seleccion, 1)+"");
        txtSigla.setText(tablaTipoDocumento.getValueAt(seleccion, 2)+"");
        txtOrden.setText(tablaTipoDocumento.getValueAt(seleccion, 3)+"");
        txtEstado.setText(tablaTipoDocumento.getValueAt(seleccion, 4)+"");
        txtFechaRegistro.setText(tablaTipoDocumento.getValueAt(seleccion, 5)+"");
        txtFechaActializacion.setText(tablaTipoDocumento.getValueAt(seleccion, 5)+"");
        System.out.println(idTipoDocumento);
    }//GEN-LAST:event_tablaTipoDocumentoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tablaTipoDocumento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaActializacion;
    private javax.swing.JTextField txtFechaRegistro;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrden;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
