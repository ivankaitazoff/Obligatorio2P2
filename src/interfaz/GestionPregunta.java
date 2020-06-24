
package interfaz;

import dominio.Pregunta;
import dominio.Tema;
import java.util.ArrayList;


public class GestionPregunta extends javax.swing.JFrame {

    ArrayList<Tema> temas;
    ArrayList<Pregunta> preguntas;

    /**
     * Creates new form GestionPreguntas
     */
    public GestionPregunta(ArrayList<Tema> listaTemas, ArrayList<Pregunta> listaPreguntas) {
        initComponents();
        temas = listaTemas;
        cargarTemas();
        preguntas=listaPreguntas;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);

        cmbTemas.setToolTipText("");
        cmbTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemasActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTemas);
        cmbTemas.setBounds(338, 12, 254, 24);

        volverAMenu.setText("Volver a menu principal");
        volverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuActionPerformed(evt);
            }
        });
        jPanel1.add(volverAMenu);
        volverAMenu.setBounds(440, 310, 147, 25);

        jLabel1.setText("Seleccionar Tema");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(41, 17, 86, 15);

        jLabel2.setText("Ingresar pregunta");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(41, 94, 86, 15);

        jLabel3.setText("Ingresar respuesta");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(41, 184, 92, 15);

        pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntaActionPerformed(evt);
            }
        });
        jPanel1.add(pregunta);
        pregunta.setBounds(338, 92, 254, 19);
        jPanel1.add(respuesta);
        respuesta.setBounds(338, 182, 254, 19);

        guardarPregunta.setText("Guardar Pregunta");
        guardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPreguntaActionPerformed(evt);
            }
        });
        jPanel1.add(guardarPregunta);
        guardarPregunta.setBounds(20, 310, 120, 25);

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
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbTemasActionPerformed

    private void volverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_volverAMenuActionPerformed

    private void preguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preguntaActionPerformed

    private void guardarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPreguntaActionPerformed
        if (pregunta.getText()!=""&&respuesta.getText()!="") {
           String textoPregunta = pregunta.getText();
           String textoRespuesta = respuesta.getText();
           Tema t = (Tema) cmbTemas.getSelectedItem();
           Pregunta p = new Pregunta( textoPregunta, textoRespuesta, t.getNombre(), t.getDescripcion() );
           preguntas.add(p);
            for (int i = 0; i < preguntas.size(); i++) {
                System.out.println(preguntas.get(i));
            }
        }
        
        
        
    }//GEN-LAST:event_guardarPreguntaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbTemas;
    private javax.swing.JButton guardarPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
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
