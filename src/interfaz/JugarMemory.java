
package interfaz;
//import sun.audio.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class JugarMemory extends javax.swing.JFrame {

    /**
     * Creates new form Jugar
     */
    public JugarMemory() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPreg4 = new javax.swing.JButton();
        btnResp2 = new javax.swing.JButton();
        btnPreg2 = new javax.swing.JButton();
        btnResp4 = new javax.swing.JButton();
        btnPreg6 = new javax.swing.JButton();
        btnResp1 = new javax.swing.JButton();
        btnPreg3 = new javax.swing.JButton();
        btnResp5 = new javax.swing.JButton();
        btnPreg1 = new javax.swing.JButton();
        btnResp3 = new javax.swing.JButton();
        btnPreg5 = new javax.swing.JButton();
        btnResp6 = new javax.swing.JButton();
        btnAyudaParcial = new javax.swing.JButton();
        btnAyudaTotal = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSonido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);

        btnPreg4.setForeground(new java.awt.Color(255, 51, 51));
        btnPreg4.setText("Pregunta");
        btnPreg4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnPreg4);
        btnPreg4.setBounds(450, 240, 150, 78);

        btnResp2.setForeground(new java.awt.Color(0, 0, 255));
        btnResp2.setText("Respuesta");
        btnResp2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnResp2);
        btnResp2.setBounds(450, 160, 150, 78);

        btnPreg2.setForeground(new java.awt.Color(255, 51, 51));
        btnPreg2.setText("Pregunta");
        btnPreg2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPreg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreg2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPreg2);
        btnPreg2.setBounds(300, 160, 150, 78);

        btnResp4.setForeground(new java.awt.Color(0, 0, 255));
        btnResp4.setText("Respuesta");
        btnResp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnResp4);
        btnResp4.setBounds(300, 240, 150, 78);

        btnPreg6.setForeground(new java.awt.Color(255, 51, 51));
        btnPreg6.setText("Pregunta");
        btnPreg6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPreg6.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel1.add(btnPreg6);
        btnPreg6.setBounds(300, 320, 150, 78);

        btnResp1.setForeground(new java.awt.Color(0, 0, 255));
        btnResp1.setText("Respuesta");
        btnResp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnResp1);
        btnResp1.setBounds(150, 160, 150, 78);

        btnPreg3.setForeground(new java.awt.Color(255, 51, 51));
        btnPreg3.setText("Pregunta");
        btnPreg3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnPreg3);
        btnPreg3.setBounds(150, 240, 150, 78);

        btnResp5.setForeground(new java.awt.Color(0, 0, 255));
        btnResp5.setText("Respuesta");
        btnResp5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnResp5);
        btnResp5.setBounds(150, 320, 150, 78);

        btnPreg1.setForeground(new java.awt.Color(255, 51, 51));
        btnPreg1.setText("Prgunta");
        btnPreg1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnPreg1);
        btnPreg1.setBounds(0, 160, 150, 78);

        btnResp3.setForeground(new java.awt.Color(0, 0, 255));
        btnResp3.setText("Respuesta");
        btnResp3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResp3.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel1.add(btnResp3);
        btnResp3.setBounds(0, 240, 150, 78);

        btnPreg5.setForeground(new java.awt.Color(255, 51, 51));
        btnPreg5.setText("Pregunta");
        btnPreg5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnPreg5);
        btnPreg5.setBounds(0, 320, 150, 78);

        btnResp6.setForeground(new java.awt.Color(0, 0, 255));
        btnResp6.setText("Respuesta");
        btnResp6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResp6);
        btnResp6.setBounds(450, 320, 150, 78);

        btnAyudaParcial.setText("Ayuda Parcial");
        btnAyudaParcial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnAyudaParcial);
        btnAyudaParcial.setBounds(90, 0, 80, 30);

        btnAyudaTotal.setText("Ayuda Total");
        btnAyudaTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnAyudaTotal);
        btnAyudaTotal.setBounds(170, 0, 80, 30);

        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnReset);
        btnReset.setBounds(250, 0, 80, 30);

        btnSonido.setText("Sonido");
        btnSonido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSonido);
        btnSonido.setBounds(330, 0, 80, 30);

        jLabel1.setText("Puntos:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 0, 40, 30);

        jLabel2.setText("------");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 10, 50, 20);

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnResp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp6ActionPerformed
        
    }//GEN-LAST:event_btnResp6ActionPerformed

    private void btnPreg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreg2ActionPerformed

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSonidoActionPerformed

    
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
    private javax.swing.JButton btnPreg1;
    private javax.swing.JButton btnPreg2;
    private javax.swing.JButton btnPreg3;
    private javax.swing.JButton btnPreg4;
    private javax.swing.JButton btnPreg5;
    private javax.swing.JButton btnPreg6;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResp1;
    private javax.swing.JButton btnResp2;
    private javax.swing.JButton btnResp3;
    private javax.swing.JButton btnResp4;
    private javax.swing.JButton btnResp5;
    private javax.swing.JButton btnResp6;
    private javax.swing.JButton btnSonido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
