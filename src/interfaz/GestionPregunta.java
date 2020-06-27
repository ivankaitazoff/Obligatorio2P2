package interfaz;

import dominio.Pregunta;
import dominio.Tema;
import java.util.ArrayList;

public class GestionPregunta extends javax.swing.JFrame {

    ArrayList<Tema> temas;
    ArrayList<Pregunta> preguntas;

    public GestionPregunta(ArrayList<Tema> listaTemas, ArrayList<Pregunta> listaPreguntas) {
        initComponents();
        temas = listaTemas;
        cargarTemas();
        preguntas = listaPreguntas;
        jListaPreguntas.setListData(preguntas.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbTemas = new javax.swing.JComboBox();
        volverAMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pregunta = new javax.swing.JTextField();
        respuesta = new javax.swing.JTextField();
        guardarPregunta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaPreguntas = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);

        cmbTemas.setBackground(new java.awt.Color(187, 83, 70));
        cmbTemas.setToolTipText("");
        cmbTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemasActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTemas);
        cmbTemas.setBounds(140, 10, 254, 22);

        volverAMenu.setBackground(new java.awt.Color(187, 83, 70));
        volverAMenu.setText("Volver a menu principal");
        volverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuActionPerformed(evt);
            }
        });
        jPanel1.add(volverAMenu);
        volverAMenu.setBounds(440, 310, 145, 23);

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setForeground(new java.awt.Color(187, 83, 70));
        jLabel1.setText("Seleccionar Tema");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 110, 30);

        jLabel2.setBackground(new java.awt.Color(187, 83, 70));
        jLabel2.setForeground(new java.awt.Color(187, 83, 70));
        jLabel2.setText("Ingresar pregunta");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 110, 40);

        jLabel3.setForeground(new java.awt.Color(187, 83, 70));
        jLabel3.setText("Ingresar respuesta");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 190, 92, 14);

        pregunta.setBackground(new java.awt.Color(187, 83, 70));
        pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntaActionPerformed(evt);
            }
        });
        jPanel1.add(pregunta);
        pregunta.setBounds(140, 90, 254, 20);

        respuesta.setBackground(new java.awt.Color(187, 83, 70));
        jPanel1.add(respuesta);
        respuesta.setBounds(140, 190, 254, 20);

        guardarPregunta.setBackground(new java.awt.Color(187, 83, 70));
        guardarPregunta.setText("Guardar Pregunta");
        guardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPreguntaActionPerformed(evt);
            }
        });
        jPanel1.add(guardarPregunta);
        guardarPregunta.setBounds(20, 310, 121, 23);

        jScrollPane1.setViewportView(jListaPreguntas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 20, 110, 200);

        jButton1.setText("Eliminar tema seleccionado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 240, 170, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemasActionPerformed

    }//GEN-LAST:event_cmbTemasActionPerformed

    private void volverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_volverAMenuActionPerformed

    private void preguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preguntaActionPerformed

    private void guardarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPreguntaActionPerformed
        if (pregunta.getText() != "" && respuesta.getText() != "") {
            String textoPregunta = pregunta.getText();
            String textoRespuesta = respuesta.getText();
            Tema t = (Tema) cmbTemas.getSelectedItem();
            Pregunta p = new Pregunta(textoPregunta, textoRespuesta, t.getNombre(), t.getDescripcion());
            preguntas.add(p);
        }
        jListaPreguntas.setListData(preguntas.toArray());
        pregunta.setText("");
        respuesta.setText("");
    }//GEN-LAST:event_guardarPreguntaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preguntas.remove(jListaPreguntas.getSelectedIndex());
        jListaPreguntas.setListData(preguntas.toArray());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbTemas;
    private javax.swing.JButton guardarPregunta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListaPreguntas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pregunta;
    private javax.swing.JTextField respuesta;
    private javax.swing.JButton volverAMenu;
    // End of variables declaration//GEN-END:variables

    private void cargarTemas() {
        if (!temas.isEmpty()) {
            for (Tema tema : temas) {
                cmbTemas.addItem(tema);
            }
        }
    }
}
