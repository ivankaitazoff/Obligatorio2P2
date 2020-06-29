//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package interfaz;

import dominio.Partida;
import java.util.Collection;
import javax.swing.JOptionPane;

public class ModoFlashCard extends javax.swing.JFrame {

    private Partida partida;
    int numero = 0;
    public ModoFlashCard(Partida partida) {
        this.partida = partida;
        initComponents();
        if (partida.getListaPreguntasElegidas().size() > 0) {
            btnTexto.setText(partida.getListaPreguntasElegidas().get(numero).getPregunta());
        } else {
            JOptionPane.showMessageDialog(null, "No hay preguntas cargadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPreguntaAnterior = new javax.swing.JButton();
        btnSiguientePregunta = new javax.swing.JButton();
        btnTexto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(415, 200));
        jPanel1.setLayout(null);

        btnPreguntaAnterior.setBackground(new java.awt.Color(187, 83, 70));
        btnPreguntaAnterior.setForeground(new java.awt.Color(0, 0, 0));
        btnPreguntaAnterior.setText("Anterior");
        btnPreguntaAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        btnPreguntaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreguntaAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btnPreguntaAnterior);
        btnPreguntaAnterior.setBounds(12, 66, 43, 19);

        btnSiguientePregunta.setBackground(new java.awt.Color(187, 83, 70));
        btnSiguientePregunta.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguientePregunta.setText("Siguiente");
        btnSiguientePregunta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnSiguientePregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePreguntaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguientePregunta);
        btnSiguientePregunta.setBounds(323, 66, 48, 19);

        btnTexto.setBackground(new java.awt.Color(187, 83, 70));
        btnTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTexto);
        btnTexto.setBounds(99, 27, 213, 128);

        btnSalir.setBackground(new java.awt.Color(187, 83, 70));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(0, 170, 90, 19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextoActionPerformed
        if (partida.getListaPreguntasElegidas().size() > 0) {
            if (btnTexto.getText() == partida.getListaPreguntasElegidas().get(numero).getRespuesta()) {
                btnTexto.setText(partida.getListaPreguntasElegidas().get(numero).getPregunta());
            } else {
                btnTexto.setText(partida.getListaPreguntasElegidas().get(numero).getRespuesta());
            }
    }//GEN-LAST:event_btnTextoActionPerformed
    }
    private void btnSiguientePreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePreguntaActionPerformed
        if (partida.getListaPreguntasElegidas().size() > 1) {
            if (numero == partida.getListaPreguntasElegidas().size() - 1) {
                numero = 0;
            } else {
                numero++;
            }
            btnTexto.setText(partida.getListaPreguntasElegidas().get(numero).getPregunta());
    }//GEN-LAST:event_btnSiguientePreguntaActionPerformed
    }
    private void btnPreguntaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreguntaAnteriorActionPerformed
        if (partida.getListaPreguntasElegidas().size() > 1) {
            if (numero == 0) {
                numero = partida.getListaPreguntasElegidas().size() - 1;
            } else {
                numero--;
            }
            btnTexto.setText(partida.getListaPreguntasElegidas().get(numero).getPregunta());
    }//GEN-LAST:event_btnPreguntaAnteriorActionPerformed
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        partida.getListaPreguntasElegidas().clear();
        partida.getListaTemasElegidos().clear();
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPreguntaAnterior;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguientePregunta;
    private javax.swing.JButton btnTexto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
