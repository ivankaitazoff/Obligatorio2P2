//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package interfaz;

import dominio.Pregunta;
import dominio.Sistema;
import dominio.Tema;

public class GestionPregunta extends javax.swing.JFrame {

    Sistema sistema;

    public GestionPregunta(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        cargarTemas();
        jListaPreguntas.setListData(sistema.getListaPreguntas().toArray());
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
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);

        cmbTemas.setBackground(new java.awt.Color(187, 83, 70));
        cmbTemas.setToolTipText("");
        cmbTemas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cmbTemas);
        cmbTemas.setBounds(140, 10, 254, 22);

        volverAMenu.setBackground(new java.awt.Color(187, 83, 70));
        volverAMenu.setText("Volver a menu principal");
        volverAMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        volverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuActionPerformed(evt);
            }
        });
        jPanel1.add(volverAMenu);
        volverAMenu.setBounds(440, 310, 140, 19);

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Seleccionar Tema");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 110, 30);

        jLabel2.setBackground(new java.awt.Color(187, 83, 70));
        jLabel2.setText("Ingresar pregunta");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 110, 40);

        jLabel3.setText("Ingresar respuesta");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 190, 92, 14);

        pregunta.setBackground(new java.awt.Color(187, 83, 70));
        pregunta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(pregunta);
        pregunta.setBounds(140, 90, 254, 18);

        respuesta.setBackground(new java.awt.Color(187, 83, 70));
        respuesta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(respuesta);
        respuesta.setBounds(140, 190, 254, 18);

        guardarPregunta.setBackground(new java.awt.Color(187, 83, 70));
        guardarPregunta.setText("Guardar Pregunta");
        guardarPregunta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        guardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPreguntaActionPerformed(evt);
            }
        });
        jPanel1.add(guardarPregunta);
        guardarPregunta.setBounds(20, 310, 140, 19);

        jListaPreguntas.setBackground(new java.awt.Color(187, 83, 70));
        jScrollPane1.setViewportView(jListaPreguntas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 20, 110, 200);

        jButton1.setBackground(new java.awt.Color(187, 83, 70));
        jButton1.setText("Eliminar tema seleccionado");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 240, 170, 19);

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

    private void volverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_volverAMenuActionPerformed

    private void guardarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPreguntaActionPerformed
        String textoPregunta = pregunta.getText();
        String textoRespuesta = respuesta.getText();
        Tema t = (Tema) cmbTemas.getSelectedItem();
        boolean repetido = false;
        if (!pregunta.getText().equals("") && !respuesta.getText().equals("")) {
            for (int i = 0; i < sistema.getListaPreguntas().size(); i++) {
                if (sistema.getListaPreguntas().get(i).getPregunta().equals(textoPregunta) && sistema.getListaPreguntas().get(i).getNombre().equals(t.getNombre())) {
                    sistema.getListaPreguntas().get(i).setRespuesta(textoRespuesta);
                    repetido = true;
                }
            }
            if (!repetido) {
                Pregunta p = new Pregunta(textoPregunta, textoRespuesta, t.getNombre(), t.getDescripcion());
                sistema.getListaPreguntas().add(p);
                t.setCantidadPreguntas(t.getCantidadPreguntas() + 1);
            }
        }

        jListaPreguntas.setListData(sistema.getListaPreguntas().toArray());
        pregunta.setText("");
        respuesta.setText("");
        cargarTemas();
    }//GEN-LAST:event_guardarPreguntaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tema t = sistema.getListaTemas().get(0);
        for (int i = 0; i < sistema.getListaTemas().size(); i++) {
            if (sistema.getListaTemas().get(i).getNombre().equals(sistema.getListaPreguntas().get(jListaPreguntas.getSelectedIndex()).getNombre())) {
                t = sistema.getListaTemas().get(i);
            }
        }
        t.setCantidadPreguntas(t.getCantidadPreguntas() - 1);
        sistema.getListaPreguntas().remove(jListaPreguntas.getSelectedIndex());
        jListaPreguntas.setListData(sistema.getListaPreguntas().toArray());
        cargarTemas();
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
        cmbTemas.removeAllItems();
        if (!sistema.getListaTemas().isEmpty()) {
            for (Tema tema : sistema.getListaTemas()) {
                cmbTemas.addItem(tema);
            }
        }
    }
}
