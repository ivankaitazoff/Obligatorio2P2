
package interfaz;

import dominio.Partida;
import dominio.Pregunta;
import dominio.Sistema;
import dominio.Tema;
import java.util.ArrayList;
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
         partida = new Partida(temasElegidosMenu, sistema.getListaPreguntas(), 0, 0, 1);
        
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("Selecciones el o los temas a utilizar ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(37, 12, 174, 15);

        jScrollPane1.setViewportView(jListaTemasElegidos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(378, 33, 200, 131);

        jLabel2.setText("Temas Seleccionados");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(428, 12, 106, 15);

        botonSeleccionarTema.setText("Seleccionar tema");
        botonSeleccionarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarTemaActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeleccionarTema);
        botonSeleccionarTema.setBounds(63, 180, 117, 25);

        comenzarPartida.setText("Jugar memory");
        comenzarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(comenzarPartida);
        comenzarPartida.setBounds(524, 265, 102, 25);

        modoFlashCard.setText("Jugar modo flash cards");
        modoFlashCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoFlashCardActionPerformed(evt);
            }
        });
        jPanel1.add(modoFlashCard);
        modoFlashCard.setBounds(312, 265, 148, 25);

        jScrollPane2.setViewportView(jListaEleccionTemas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(25, 33, 200, 131);

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
       Tema temaS = (Tema)jListaEleccionTemas.getSelectedValue();
        if (!partida.getListaTemasElegidos().contains(temaS)) {
             agregarTema(sist, temaS);
        }
        else{
            JOptionPane.showMessageDialog(null, "tema ya seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //jList1.addElement(jComboBox1.getSelectedObjects());
    }//GEN-LAST:event_botonSeleccionarTemaActionPerformed

    private void comenzarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarPartidaActionPerformed
        JugarMemory memory = new JugarMemory();
    }//GEN-LAST:event_comenzarPartidaActionPerformed

    private void modoFlashCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoFlashCardActionPerformed
        ArrayList<Tema> listaTemasElegidos;
        ArrayList<Pregunta> preguntasSeleccionadas;
          for (int i = 0; i < sist.getListaPreguntas().size(); i++) {
               if (rootPaneCheckingEnabled) {
                  
              }
         }        
//crearPartida(sistema, sistema.getListaTemas());
        ModoFlashCard flashCards = new ModoFlashCard(sist);
        flashCards.setVisible(true);
        
    }//GEN-LAST:event_modoFlashCardActionPerformed

   public Partida crearPartida(Sistema sist, ArrayList<Tema> listaTemasElegidos){
       
 
       Partida partida = new Partida(sist.getListaTemas(),
                sist.getListaPreguntas(),0,0,0);
        
        
        return partida;
    }

   
   public void agregarTema(Sistema sist, Tema tema){
       partida.getListaTemasElegidos().add(tema);
       
        jListaTemasElegidos.setListData(partida.getListaTemasElegidos().toArray());
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonSeleccionarTema;
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
