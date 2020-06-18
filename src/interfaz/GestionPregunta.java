
package interfaz;

import dominio.Pregunta;
import dominio.Tema;
import java.util.ArrayList;


public class GestionPregunta extends javax.swing.JFrame {

    ArrayList<Tema> temas;
    ArrayList<Pregunta> preguntas = new ArrayList<>();

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

        cmbTemas = new javax.swing.JComboBox();
        volverAMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pregunta = new javax.swing.JTextField();
        respuesta = new javax.swing.JTextField();
        guardarPregunta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbTemas.setToolTipText("");
        cmbTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemasActionPerformed(evt);
            }
        });

        volverAMenu.setText("Volver a menu principal");
        volverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar Tema");

        jLabel2.setText("Ingresar pregunta");

        jLabel3.setText("Ingresar respuesta");

        pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntaActionPerformed(evt);
            }
        });

        guardarPregunta.setText("Guardar Pregunta");
        guardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPreguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(guardarPregunta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbTemas, 0, 254, Short.MAX_VALUE)
                        .addComponent(respuesta)
                        .addComponent(pregunta))
                    .addComponent(volverAMenu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverAMenu)
                    .addComponent(guardarPregunta))
                .addGap(49, 49, 49))
        );

        pack();
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
