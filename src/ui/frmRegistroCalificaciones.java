/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Armas.Util;
import bll.GestionMatricula;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author labctr
 */
public class frmRegistroCalificaciones extends javax.swing.JInternalFrame {

    private final String titulo = "Registrar Calificaciones";
    private GestionMatricula matriculaBll = new GestionMatricula();

    private void ConsultarMatricula() throws IOException {
        String numero = this.txtNMatricula.getText();
        matriculaBll.consultar(numero);
        this.txtDatosMatricula.setText(matriculaBll.imprimir());
    }

    private String Calificar() throws IOException {
        float nota = (float) this.snnValor.getValue();
        String mensaje = matriculaBll.calificar(nota);
        matriculaBll.archivar();
        return mensaje;
    }

    private boolean Validar() {
        float nota = (float) this.snnValor.getValue();
        if (nota == 0.01f) {
            vtnPrincipal.vermensaje("Calificacion no valida", titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public frmRegistroCalificaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRgistroCalificaciones = new javax.swing.JLabel();
        lblNMatricula = new javax.swing.JLabel();
        txtNMatricula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatosMatricula = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        snnValor = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Calificaciones");

        lblRgistroCalificaciones.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        lblRgistroCalificaciones.setForeground(new java.awt.Color(182, 88, 55));
        lblRgistroCalificaciones.setText("Registro de Calificaciones");

        lblNMatricula.setFont(new java.awt.Font("Waree", 3, 14)); // NOI18N
        lblNMatricula.setText("N° Matricula :");

        btnBuscar.setIcon(new javax.swing.ImageIcon("/home/labctr/iconos/search.png")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtDatosMatricula.setColumns(20);
        txtDatosMatricula.setRows(5);
        jScrollPane1.setViewportView(txtDatosMatricula);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(182, 88, 55), 2), "Calificacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Waree", 3, 14))); // NOI18N

        jLabel1.setText("Valor :");

        snnValor.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(20.0f), Float.valueOf(1.0f)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(snnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(snnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(182, 88, 55));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(lblRgistroCalificaciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblRgistroCalificaciones)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNMatricula)
                            .addComponent(txtNMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnBuscar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (Validar()) {
                String mensaje = this.Calificar();
                vtnPrincipal.vermensaje(mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            Util.imprimir("Error:" + e.toString());
            vtnPrincipal.vermensaje("Error al crear matricula ", titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            ConsultarMatricula();
        } catch (Exception e) {

            Util.imprimir("Error:" + e.toString());
            vtnPrincipal.vermensaje("Error al buscar"
                    + " matriculas ", titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNMatricula;
    private javax.swing.JLabel lblRgistroCalificaciones;
    private javax.swing.JSpinner snnValor;
    private javax.swing.JTextArea txtDatosMatricula;
    private javax.swing.JTextField txtNMatricula;
    // End of variables declaration//GEN-END:variables
}
