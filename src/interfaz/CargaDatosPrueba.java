/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Pregunta;
import dominio.Sistema;
import dominio.Tema;

/**
 *
 * @author ivan
 */
public class CargaDatosPrueba extends javax.swing.JFrame {

    private Sistema sistema;
    private int cantPreguntas;
    private int cantTemas;
    
    public CargaDatosPrueba(Sistema sistema) {
        initComponents();
        this.sistema=sistema;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextCantTemas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCantPreguntas = new javax.swing.JTextField();
        btnCrearDatos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 300));
        getContentPane().setLayout(null);
        getContentPane().add(jTextCantTemas);
        jTextCantTemas.setBounds(215, 35, 167, 20);

        jLabel1.setText("Cantidad de temas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(43, 38, 90, 14);

        jLabel2.setText("Cantidad de preguntas en cada tema");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 82, 178, 14);
        getContentPane().add(jTextCantPreguntas);
        jTextCantPreguntas.setBounds(215, 79, 167, 20);

        btnCrearDatos.setText("Crear Datos");
        btnCrearDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearDatos);
        btnCrearDatos.setBounds(215, 194, 93, 23);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(40, 200, 55, 23);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDatosActionPerformed
        cantTemas=Integer.parseInt(jTextCantTemas.getText());
        cantPreguntas=Integer.parseInt(jTextCantPreguntas.getText());
        for (int i = 0; i < cantTemas; i++) {
            Tema t = new Tema("TEMA"+(i+1),", Descripcion de T"+(i+1));
            sistema.getListaTemas().add(t);
            for (int j = 0; j < cantPreguntas; j++) {
                Pregunta p = new Pregunta("P"+(j+1)+"TEMA"+(i+1), "Respuesta P"+(j+1)+"TEMA"+(i+1), t.getNombre(), t.getDescripcion());
                sistema.getListaPreguntas().add(p);
                t.setCantidadPreguntas(t.getCantidadPreguntas()+1);
            }
        }
    }//GEN-LAST:event_btnCrearDatosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearDatos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCantPreguntas;
    private javax.swing.JTextField jTextCantTemas;
    // End of variables declaration//GEN-END:variables
}
