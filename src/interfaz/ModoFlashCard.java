
package interfaz;

import dominio.Sistema;


public class ModoFlashCard extends javax.swing.JFrame {

        private Sistema sistema;
        int numero = 0;
    /**
     * Creates new form ModoFlashCard
     */
    public ModoFlashCard(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        btnTexto.setText(sistema.getListaPreguntas().get(numero).getPregunta());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPreguntaAnterior = new javax.swing.JButton();
        btnSiguientePregunta = new javax.swing.JButton();
        btnTexto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnPreguntaAnterior.setText("Anterior");
        btnPreguntaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreguntaAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btnPreguntaAnterior);
        btnPreguntaAnterior.setBounds(12, 66, 73, 25);

        btnSiguientePregunta.setText("Siguiente");
        btnSiguientePregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePreguntaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguientePregunta);
        btnSiguientePregunta.setBounds(323, 66, 78, 25);

        btnTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTexto);
        btnTexto.setBounds(99, 27, 213, 128);

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
        if (btnTexto.getText()== sistema.getListaPreguntas().get(numero).getRespuesta()) {
            btnTexto.setText(sistema.getListaPreguntas().get(numero).getPregunta());
        }else {
            btnTexto.setText(sistema.getListaPreguntas().get(numero).getRespuesta());
        }
    }//GEN-LAST:event_btnTextoActionPerformed

    private void btnSiguientePreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePreguntaActionPerformed
       if (numero == sistema.getListaPreguntas().size()-1) {
           numero = 0;
        }else{
           numero++;
       }
       btnTexto.setText(sistema.getListaPreguntas().get(numero).getPregunta());
    }//GEN-LAST:event_btnSiguientePreguntaActionPerformed

    private void btnPreguntaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreguntaAnteriorActionPerformed
        if (numero == 0) {
            numero = sistema.getListaPreguntas().size()-1;
        }else{
            numero--;
        }
        btnTexto.setText(sistema.getListaPreguntas().get(numero).getPregunta());
    }//GEN-LAST:event_btnPreguntaAnteriorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPreguntaAnterior;
    private javax.swing.JButton btnSiguientePregunta;
    private javax.swing.JButton btnTexto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
