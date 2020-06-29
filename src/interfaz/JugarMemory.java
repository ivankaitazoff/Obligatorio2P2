package interfaz;
//import sun.audio.*;

import dominio.Casillero;
import dominio.Partida;
import dominio.Pregunta;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class JugarMemory extends javax.swing.JFrame {

    private Casillero casillero;
    private Partida partida;
    private JButton[][] botones;
    private ArrayList<Pregunta> lista;
    private Casillero c1;
    private Casillero c2;
    private int[] preguntasUsadas = new int[12];

    public JugarMemory(Partida partida) {
        this.partida = partida;
        initComponents();
        this.setLocationRelativeTo(null);
        int cantColumnas = 4;
        int cantFilas = 3;
        botones = new JButton[cantFilas][cantColumnas];

        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
                JButton jButton = new JButton();
                jButton.addActionListener(new ListenerBoton(i, j));
                panelInferior.add(jButton);
                botones[i][j] = jButton;
                if (j % 2 == 0) {
                    Casillero casillero = new Casillero(i, j, partida.getListaPreguntasMezcladas().get(0), true);
                    partida.getListaCasilleros().add(casillero);
                } else {
                    Casillero casillero = new Casillero(i, j, partida.getListaPreguntasMezcladas().get(0), false);
                    partida.getListaCasilleros().add(casillero);
                    partida.getListaPreguntasMezcladas().remove(0);
                }

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        btnAyudaParcial = new javax.swing.JButton();
        btnAyudaTotal = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSonido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        muestroPuntaje = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.setPreferredSize(new java.awt.Dimension(600, 400));
        panelSuperior.setLayout(null);

        btnAyudaParcial.setText("Ayuda Parcial");
        btnAyudaParcial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAyudaParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaParcialActionPerformed(evt);
            }
        });
        panelSuperior.add(btnAyudaParcial);
        btnAyudaParcial.setBounds(90, 0, 80, 30);

        btnAyudaTotal.setText("Ayuda Total");
        btnAyudaTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAyudaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaTotalActionPerformed(evt);
            }
        });
        panelSuperior.add(btnAyudaTotal);
        btnAyudaTotal.setBounds(170, 0, 80, 30);

        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelSuperior.add(btnReset);
        btnReset.setBounds(250, 0, 80, 30);

        btnSonido.setText("Sonido");
        btnSonido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonidoActionPerformed(evt);
            }
        });
        panelSuperior.add(btnSonido);
        btnSonido.setBounds(330, 0, 80, 30);

        jLabel1.setText("Puntos:");
        panelSuperior.add(jLabel1);
        jLabel1.setBounds(430, 0, 50, 30);

        muestroPuntaje.setText("------");
        muestroPuntaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelSuperior.add(muestroPuntaje);
        muestroPuntaje.setBounds(490, 10, 50, 30);

        getContentPane().add(panelSuperior);

        panelInferior.setPreferredSize(new java.awt.Dimension(500, 400));
        panelInferior.setLayout(new java.awt.GridLayout(3, 4));
        getContentPane().add(panelInferior);

        setBounds(0, 0, 600, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSonidoActionPerformed

    private void btnAyudaParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaParcialActionPerformed
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < partida.getListaCasilleros().size(); k++) {
                    Casillero c=partida.getListaCasilleros().get(k);
                    if (c.getPosicionX() == i && c.getPosicionY() == j && c.getEsPregunta() && !c.isUsado()) {
                        botones[i][j].setText("Pregunta");
                    }
                    else if (c.getPosicionX() == i && c.getPosicionY() == j && !c.getEsPregunta() && !c.isUsado()) {
                        botones[i][j].setText("Respuesta");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAyudaParcialActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < partida.getListaCasilleros().size(); k++) {
                    Casillero c=partida.getListaCasilleros().get(k);
                    if (c.getPosicionX() == i && c.getPosicionY() == j && !c.isUsado()) {
                        botones[i][j].setText("");
                    }
                }
            }
        }

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAyudaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaTotalActionPerformed
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < partida.getListaCasilleros().size(); k++) {
                    Casillero c=partida.getListaCasilleros().get(k);
                    if (c.getPosicionX() == i && c.getPosicionY() == j && c.getEsPregunta() && !c.isUsado()) {
                        botones[i][j].setText(c.getPregunta().getPregunta());
                    }
                    else if (c.getPosicionX() == i && c.getPosicionY() == j && !c.getEsPregunta() && !c.isUsado()) {
                        botones[i][j].setText(c.getPregunta().getRespuesta());
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAyudaTotalActionPerformed

    private class ListenerBoton implements ActionListener {

        private int x;
        private int y;

        public ListenerBoton(int i, int j) {
            // en el constructor se almacena la fila y columna que se presionó 
            x = i;
            y = j;
        }

        public void actionPerformed(ActionEvent e) {
            // cuando se presiona un botón, se ejecutará este método 
            clickBoton(x, y);
        }
    }

    private void clickBoton(int fila, int columna) {
        // Método a completar!. // En fila y columna se reciben las coordenas donde presionó el usuario, relativas al comienzo de la grilla
        // fila 0 y columna 0 corresponden a la posición de arriba a la izquierda.
        // Debe indicarse cómo responder al click de ese botón. 
        if (!preguntaYaUsada(fila, columna)) {
            if (partida.getTurno() % 2 == 0) {
                partida.setTurno(partida.getTurno() + 1);
                for (int i = 0; i < partida.getListaCasilleros().size(); i++) {
                    if (fila == partida.getListaCasilleros().get(i).getPosicionX() && columna == partida.getListaCasilleros().get(i).getPosicionY()) {
                        c1 = partida.getListaCasilleros().get(i);
                        break;
                    }
                }
                if (c1.getEsPregunta()) {
                    botones[fila][columna].setText(c1.getPregunta().getPregunta());
                } else if (!c1.getEsPregunta()) {
                    botones[fila][columna].setText(c1.getPregunta().getRespuesta());
                }
            } else if (partida.getTurno() % 2 == 1) {
                partida.setTurno(partida.getTurno() + 1);

                if (partida.getTurno() % 2 == 0) {
                    for (int i = 0; i < partida.getListaCasilleros().size(); i++) {
                        if (fila == partida.getListaCasilleros().get(i).getPosicionX() && columna == partida.getListaCasilleros().get(i).getPosicionY()) {
                            c2 = partida.getListaCasilleros().get(i);
                            break;
                        }
                    }
                    if (c2.getEsPregunta()) {
                        botones[fila][columna].setText(c2.getPregunta().getPregunta());
                    } else if (!c2.getEsPregunta()) {
                        botones[fila][columna].setText(c2.getPregunta().getRespuesta());
                    }
                    if (c1.getPregunta().getPregunta() == c2.getPregunta().getPregunta() && c1 != c2) {
                        JOptionPane.showMessageDialog(null, "le embocaste", "Error", JOptionPane.ERROR_MESSAGE);
                        partida.setPuntajeJugador(partida.getPuntajeJugador() + 50);
                        muestroPuntaje.setText(String.valueOf(partida.getPuntajeJugador()));
                        c1.setUsado(true);
                        c2.setUsado(true);
                    } else {
                        partida.setPuntajeJugador(partida.getPuntajeJugador() - 10);
                        muestroPuntaje.setText(String.valueOf(partida.getPuntajeJugador()));
                        JOptionPane.showMessageDialog(null, "le erraste", "Error", JOptionPane.ERROR_MESSAGE);
                        botones[c1.getPosicionX()][c1.getPosicionY()].setText("");
                        botones[c2.getPosicionX()][c2.getPosicionY()].setText("");

                    }
                }

            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya usaste este boton", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean preguntaYaUsada(int fila, int columna) {
        boolean usado = false;
        for (int i = 0; i < partida.getListaCasilleros().size(); i++) {
            if (fila == partida.getListaCasilleros().get(i).getPosicionX() && columna == partida.getListaCasilleros().get(i).getPosicionY()) {
                usado = partida.getListaCasilleros().get(i).isUsado();
            }
        }
        return usado;
    }
    //PARA AGREGARLE AUDIO
    /* public static void music() 
    {       
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            InputStream test = new FileInputStream("musica.mp3");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            //MD = BGM.getData();
            //loop = new ContinuousAudioDataStream(MD);

        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaParcial;
    private javax.swing.JButton btnAyudaTotal;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSonido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel muestroPuntaje;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
