package interfaz;

import Persis.ArchivoLectura;
import dominio.Pregunta;
import dominio.Sistema;
import dominio.Tema;
import obligatorio2p2.Obligatorio2P2;

public class MenuPrincipal extends javax.swing.JFrame {

    private Sistema sistema;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Sistema unSistema) {
        initComponents();
        this.sistema = unSistema;
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(null);

        GestionarTemas.setBackground(new java.awt.Color(187, 83, 70));
        GestionarTemas.setText("Gestionar Temas");
        GestionarTemas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        GestionarTemas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GestionarTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarTemasActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarTemas);
        GestionarTemas.setBounds(10, 100, 210, 60);

        GestionarPreguntasManualmente.setBackground(new java.awt.Color(187, 83, 70));
        GestionarPreguntasManualmente.setText("Gestionar Preguntas Manualmente");
        GestionarPreguntasManualmente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        GestionarPreguntasManualmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarPreguntasManualmenteActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarPreguntasManualmente);
        GestionarPreguntasManualmente.setBounds(10, 30, 210, 60);

        CargaColectiva.setBackground(new java.awt.Color(187, 83, 70));
        CargaColectiva.setText("Carga De Preguntas En Forma Colectiva");
        CargaColectiva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        CargaColectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaColectivaActionPerformed(evt);
            }
        });
        jPanel1.add(CargaColectiva);
        CargaColectiva.setBounds(10, 170, 210, 60);

        botonJugar.setBackground(new java.awt.Color(187, 83, 70));
        botonJugar.setText("Jugar");
        botonJugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });
        jPanel1.add(botonJugar);
        botonJugar.setBounds(540, 350, 90, 19);

        jButton1.setBackground(new java.awt.Color(187, 83, 70));
        jButton1.setText("salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 350, 90, 19);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerebro.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 760, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GestionarTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarTemasActionPerformed
        GestionTema gestionT = new GestionTema(sistema.getListaTemas());
        gestionT.setVisible(true);
    }//GEN-LAST:event_GestionarTemasActionPerformed

    private void GestionarPreguntasManualmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarPreguntasManualmenteActionPerformed
        GestionPregunta gestionP = new GestionPregunta(sistema.getListaTemas(), sistema.getListaPreguntas());
        gestionP.setVisible(true);
    }//GEN-LAST:event_GestionarPreguntasManualmenteActionPerformed

    private void CargaColectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaColectivaActionPerformed
        String temaTXT = "";
        String pregunta = "";
        String respuesta;
        ArchivoLectura arch = new ArchivoLectura("CargaDatos.txt");
        int contador = 1;
        while (arch.hayMasLineas()) {
            if (contador % 3 == 1) {
                temaTXT = arch.getLinea().toUpperCase();
            }
            if (contador % 3 == 2) {
                pregunta = arch.getLinea();
            }
            if (contador % 3 == 0) {
                respuesta = arch.getLinea();
                if (arch.devolverIndiceTema(sistema.getListaTemas(), temaTXT) >= 0) {
                    Pregunta p = new Pregunta(pregunta, respuesta,
                            sistema.getListaTemas().get(arch.devolverIndiceTema(sistema.getListaTemas(), temaTXT)).getNombre(),
                            sistema.getListaTemas().get(arch.devolverIndiceTema(sistema.getListaTemas(), temaTXT)).getDescripcion());
                    sistema.getListaPreguntas().add(p);
                }else{
                    System.out.println("El tema del TXT no coincide con ningun tema del sistema");}

            }
            contador++;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
