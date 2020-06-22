
package interfaz;

import Persis.ArchivoLectura;
import dominio.Sistema;
import obligatorio2p2.Obligatorio2P2;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private Sistema sistema;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Sistema unSistema) {
        initComponents();
        this.sistema= unSistema;
        setTitle("Bienvenido");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GestionarTemas = new javax.swing.JButton();
        GestionarPreguntasManualmente = new javax.swing.JButton();
        CargaColectiva = new javax.swing.JButton();
        botonJugar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GestionarTemas.setText("Gestionar Temas");
        GestionarTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarTemasActionPerformed(evt);
            }
        });

        GestionarPreguntasManualmente.setText("Gestionar Preguntas Manualmente");
        GestionarPreguntasManualmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarPreguntasManualmenteActionPerformed(evt);
            }
        });

        CargaColectiva.setText("Carga De Preguntas En Forma Colectiva");
        CargaColectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaColectivaActionPerformed(evt);
            }
        });

        botonJugar.setText("Jugar");
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonJugar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CargaColectiva)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(GestionarPreguntasManualmente)
                                .addGap(13, 13, 13)))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GestionarTemas)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(GestionarPreguntasManualmente)
                .addGap(28, 28, 28)
                .addComponent(GestionarTemas)
                .addGap(30, 30, 30)
                .addComponent(CargaColectiva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonJugar)
                    .addComponent(jButton1))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionarTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarTemasActionPerformed
        GestionTema gestionT = new GestionTema(sistema.getListaTemas());
        gestionT.setVisible(true);
    }//GEN-LAST:event_GestionarTemasActionPerformed

    private void GestionarPreguntasManualmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarPreguntasManualmenteActionPerformed
        GestionPregunta gestionP = new GestionPregunta(sistema.getListaTemas(),sistema.getListaPreguntas());
        gestionP.setVisible(true);
    }//GEN-LAST:event_GestionarPreguntasManualmenteActionPerformed

    private void CargaColectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaColectivaActionPerformed
        ArchivoLectura arch = new ArchivoLectura("CargaDatos.txt");
        int contador = 1;
        while (arch.hayMasLineas()){
           /* String[] datos = arch.linea();
            String tema = datos[0];
            System.out.println(tema);
            String pregunta = datos;
            if (contador%3 == ) {
                String respuesta = datos;
            }
            
            
            System.out.println(pregunta);
            System.out.println(respuesta);
            
            contador++;  */
        }
        arch.cerrar(); 
    }//GEN-LAST:event_CargaColectivaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Obligatorio2P2.guardarSistema(this.sistema);
      this.dispose();//cierra vetana
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        SeleccionarTemas select = new SeleccionarTemas(sistema);
        select.setVisible(true);
    }//GEN-LAST:event_botonJugarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargaColectiva;
    private javax.swing.JButton GestionarPreguntasManualmente;
    private javax.swing.JButton GestionarTemas;
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
