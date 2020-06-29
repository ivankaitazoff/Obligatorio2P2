package interfaz;

import dominio.Sistema;
import dominio.Tema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestionTema extends javax.swing.JFrame {

    Sistema sistema;
    ArrayList<Tema> lista = new ArrayList();

    public GestionTema(ArrayList<Tema> listaTemas, Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        this.setLocationRelativeTo(null);
        lista = listaTemas;
        setJListTema();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        VolverAMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTema = new javax.swing.JList();
        botonEliminarTema = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(187, 83, 70));
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 10, 188, 19);

        jTextField2.setBackground(new java.awt.Color(187, 83, 70));
        jTextField2.setForeground(new java.awt.Color(187, 83, 70));
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(190, 90, 188, 60);

        jLabel1.setBackground(new java.awt.Color(187, 83, 70));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del tema");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 14, 120, 15);

        jLabel2.setBackground(new java.awt.Color(187, 83, 70));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 112, 90, 15);

        jButton1.setBackground(new java.awt.Color(187, 83, 70));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Guardar tema");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(12, 287, 130, 19);

        VolverAMenu.setBackground(new java.awt.Color(187, 83, 70));
        VolverAMenu.setForeground(new java.awt.Color(0, 0, 0));
        VolverAMenu.setText("Volver a menu principal");
        VolverAMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        VolverAMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VolverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAMenuActionPerformed(evt);
            }
        });
        jPanel1.add(VolverAMenu);
        VolverAMenu.setBounds(240, 287, 192, 19);

        jListTema.setBackground(new java.awt.Color(187, 83, 70));
        jListTema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jListTema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jListTema);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 40, 110, 131);

        botonEliminarTema.setBackground(new java.awt.Color(187, 83, 70));
        botonEliminarTema.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminarTema.setText("Eliminar Tema");
        botonEliminarTema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        botonEliminarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarTemaActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminarTema);
        botonEliminarTema.setBounds(440, 180, 150, 19);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Elija tema para eliminar");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, 20, 150, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombreTema = jTextField1.getText().toUpperCase();
        String descripcionTema = jTextField2.getText();
        Tema t = new Tema(nombreTema, descripcionTema);
        boolean temaExiste = existeTema(t);
        if (!temaExiste) {
            lista.add(t);
        } else {
            for (Tema tema : lista) {
                if (tema.getNombre().equals(t.getNombre())) {
                    tema.setDescripcion(t.getDescripcion());
                    jTextField1.setText("");
                    jTextField2.setText("");
                    break;

                }
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }
        setJListTema();
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VolverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_VolverAMenuActionPerformed

    private void botonEliminarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarTemaActionPerformed
        if (sistema.tienePreguntas((Tema) jListTema.getSelectedValue()) > 0) {
            JOptionPane.showMessageDialog(null, "Este tema no se puede eliminar, tiene preguntas", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            lista.remove(jListTema.getSelectedValue());
            setJListTema();
        }
    }//GEN-LAST:event_botonEliminarTemaActionPerformed

    public boolean existeTema(Tema t) {
        boolean yaExiste = false;
        for (Tema tema : lista) {
            if (tema.getNombre().equals(t.getNombre())) {
                yaExiste = true;
                break;
            }
        }
        return yaExiste;
    }

    public void setJListTema() {
        jListTema.setListData(lista.toArray());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VolverAMenu;
    private javax.swing.JButton botonEliminarTema;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListTema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
