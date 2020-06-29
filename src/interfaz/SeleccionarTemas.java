//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package interfaz;

import dominio.Partida;
import dominio.Pregunta;
import dominio.Sistema;
import dominio.Tema;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class SeleccionarTemas extends javax.swing.JFrame {

    private Sistema sist;
    private Partida partida;

    public SeleccionarTemas(Sistema sistema) {

        initComponents();
        this.sist = sistema;
        ArrayList<Tema> temas = sist.getListaTemas();
        jListaEleccionTemas.setListData(temas.toArray());
        ArrayList<Tema> temasElegidosMenu = new ArrayList<>();
        partida = new Partida(temasElegidosMenu, 0, 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaTemasElegidos = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        botonSeleccionarTema = new javax.swing.JToggleButton();
        comenzarPartida = new javax.swing.JToggleButton();
        modoFlashCard = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaEleccionTemas = new javax.swing.JList();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Selecciones el o los temas a utilizar ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(37, 12, 174, 15);

        jListaTemasElegidos.setBackground(new java.awt.Color(187, 83, 70));
        jScrollPane1.setViewportView(jListaTemasElegidos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(378, 33, 200, 230);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Temas Seleccionados");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(428, 12, 106, 15);

        botonSeleccionarTema.setBackground(new java.awt.Color(187, 83, 70));
        botonSeleccionarTema.setForeground(new java.awt.Color(0, 0, 0));
        botonSeleccionarTema.setText("Seleccionar tema");
        botonSeleccionarTema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        botonSeleccionarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarTemaActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeleccionarTema);
        botonSeleccionarTema.setBounds(30, 280, 170, 19);

        comenzarPartida.setBackground(new java.awt.Color(187, 83, 70));
        comenzarPartida.setForeground(new java.awt.Color(0, 0, 0));
        comenzarPartida.setText("Jugar memory");
        comenzarPartida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        comenzarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(comenzarPartida);
        comenzarPartida.setBounds(480, 349, 100, 30);

        modoFlashCard.setBackground(new java.awt.Color(187, 83, 70));
        modoFlashCard.setForeground(new java.awt.Color(0, 0, 0));
        modoFlashCard.setText("Jugar modo flash cards");
        modoFlashCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        modoFlashCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoFlashCardActionPerformed(evt);
            }
        });
        jPanel1.add(modoFlashCard);
        modoFlashCard.setBounds(270, 349, 190, 30);

        jListaEleccionTemas.setBackground(new java.awt.Color(187, 83, 70));
        jScrollPane2.setViewportView(jListaEleccionTemas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 200, 230);

        btnSalir.setBackground(new java.awt.Color(187, 83, 70));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(10, 349, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSeleccionarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarTemaActionPerformed
        Tema temaS = (Tema) jListaEleccionTemas.getSelectedValue();
        if (!partida.getListaTemasElegidos().contains(temaS)) {
            agregarTema(sist, temaS);
        } else {
            JOptionPane.showMessageDialog(null, "tema ya seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botonSeleccionarTemaActionPerformed

    private void comenzarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarPartidaActionPerformed
        partida.cargarPreguntasPartida(sist.getListaPreguntas());
        List<Pregunta> preguntasMezcladas = partida.getListaPreguntasElegidas();
        if (partida.getListaPreguntasElegidas().size() >= 6) {
            Collections.shuffle(preguntasMezcladas);
            partida.setListaPreguntasMezcladas((ArrayList<Pregunta>) preguntasMezcladas);
            JugarMemory memory = new JugarMemory(partida);
            memory.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe haber al menos 6 preguntas cargadas para que comience la partida", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_comenzarPartidaActionPerformed

    private void modoFlashCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoFlashCardActionPerformed
        partida.cargarPreguntasPartida(sist.getListaPreguntas());

        ModoFlashCard flashCards = new ModoFlashCard(partida);
        flashCards.setVisible(true);

    }//GEN-LAST:event_modoFlashCardActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public Partida crearPartida(Sistema sist, ArrayList<Tema> listaTemasElegidos) {

        Partida partida = new Partida(listaTemasElegidos, 0, 0);
        partida.cargarPreguntasPartida(sist.getListaPreguntas());

        return partida;
    }

    public void agregarTema(Sistema sist, Tema tema) {
        partida.getListaTemasElegidos().add(tema);

        jListaTemasElegidos.setListData(partida.getListaTemasElegidos().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonSeleccionarTema;
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton comenzarPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jListaEleccionTemas;
    private javax.swing.JList jListaTemasElegidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton modoFlashCard;
    // End of variables declaration//GEN-END:variables
}
