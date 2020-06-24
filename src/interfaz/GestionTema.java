package interfaz;

import dominio.Sistema;
import dominio.Tema;
import java.util.ArrayList;

public class GestionTema extends javax.swing.JFrame {

    ArrayList<Tema> lista = new ArrayList();

    /**
     * Creates new form GestionTemas
     */
    public GestionTema(ArrayList<Tema> listaTemas) {
        initComponents();
        lista = listaTemas;
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

        jPanel1.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 10, 188, 19);

        jTextField2.setText("Descripcion");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(190, 90, 188, 60);

        jLabel1.setText("Nombre del tema");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 14, 80, 15);

        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 112, 57, 15);

        jButton1.setText("Guardar tema");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(12, 287, 100, 25);

        VolverAMenu.setText("Volver a menu principal");
        VolverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAMenuActionPerformed(evt);
            }
        });
        jPanel1.add(VolverAMenu);
        VolverAMenu.setBounds(240, 287, 192, 25);

        jScrollPane1.setViewportView(jListTema);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 40, 110, 131);

        botonEliminarTema.setText("Eliminar Tema");
        botonEliminarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarTemaActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminarTema);
        botonEliminarTema.setBounds(460, 180, 110, 25);

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 10, 34, 15);

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
        String nombreTema = jTextField1.getText();
        String descripcionTema = jTextField2.getText();
        Tema t = new Tema(nombreTema, descripcionTema);
        boolean temaExiste = existeTema(t);
        if (!temaExiste) {
            lista.add(t);
        }else{
            for (Tema tema : lista) {
            if (tema.getNombre().equals(t.getNombre())) {
                tema.setDescripcion(t.getDescripcion());
                break;
            }
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VolverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_VolverAMenuActionPerformed

    private void botonEliminarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarTemaActionPerformed
        // TODO add your handling code here:
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
     public void setJListTema(){
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
