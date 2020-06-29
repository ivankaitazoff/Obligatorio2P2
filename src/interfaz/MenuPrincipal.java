package interfaz;

import Persis.ArchivoLectura;
import dominio.Sistema;
import java.util.ArrayList;
import obligatorio2p2.Obligatorio2P2;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private Sistema sistema;
    
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
        btnSalir = new javax.swing.JButton();
        guardarDatos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CargaColectiva1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(null);

        GestionarTemas.setBackground(new java.awt.Color(187, 83, 70));
        GestionarTemas.setForeground(new java.awt.Color(0, 0, 0));
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
        GestionarPreguntasManualmente.setForeground(new java.awt.Color(0, 0, 0));
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
        CargaColectiva.setForeground(new java.awt.Color(0, 0, 0));
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
        botonJugar.setForeground(new java.awt.Color(0, 0, 0));
        botonJugar.setText("Jugar");
        botonJugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });
        jPanel1.add(botonJugar);
        botonJugar.setBounds(540, 350, 90, 19);

        btnSalir.setBackground(new java.awt.Color(187, 83, 70));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(230, 350, 90, 19);

        guardarDatos.setBackground(new java.awt.Color(187, 83, 70));
        guardarDatos.setForeground(new java.awt.Color(0, 0, 0));
        guardarDatos.setText("jButton2");
        guardarDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        guardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(guardarDatos);
        guardarDatos.setBounds(10, 250, 130, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerebro.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 760, 460);

        CargaColectiva1.setBackground(new java.awt.Color(187, 83, 70));
        CargaColectiva1.setText("Carga De Preguntas En Forma Colectiva");
        CargaColectiva1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        CargaColectiva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaColectiva1ActionPerformed(evt);
            }
        });
        jPanel1.add(CargaColectiva1);
        CargaColectiva1.setBounds(10, 170, 210, 60);

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
        GestionTema gestionT = new GestionTema(sistema.getListaTemas(), sistema);
        gestionT.setVisible(true);
    }//GEN-LAST:event_GestionarTemasActionPerformed

    private void GestionarPreguntasManualmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarPreguntasManualmenteActionPerformed
        GestionPregunta gestionP = new GestionPregunta(sistema);
        gestionP.setVisible(true);
    }//GEN-LAST:event_GestionarPreguntasManualmenteActionPerformed

    private void CargaColectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaColectivaActionPerformed
        ArchivoLectura arch = new ArchivoLectura("CargaDatos.txt");
        int contador = 1;
        int contadorpos = 0;
        ArrayList<String> listaCargados = new ArrayList<>();
        while (arch.hayMasLineas()) {
            
            listaCargados.add(arch.linea());
        }
        arch.cerrar();
        for (int i = 0; i < listaCargados.size(); i++) {
            
        }
    }//GEN-LAST:event_CargaColectivaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Obligatorio2P2.guardarSistema(this.sistema);
        this.dispose();//cierra vetana
    }//GEN-LAST:event_btnSalirActionPerformed

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        SeleccionarTemas select = new SeleccionarTemas(sistema);
        select.setVisible(true);
    }//GEN-LAST:event_botonJugarActionPerformed

    private void CargaColectiva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaColectiva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargaColectiva1ActionPerformed

    private void guardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosActionPerformed
        GuardarTxt guardarTxt = new GuardarTxt();
        guardarTxt.setVisible(true);
    }//GEN-LAST:event_guardarDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargaColectiva;
    private javax.swing.JButton CargaColectiva1;
    private javax.swing.JButton GestionarPreguntasManualmente;
    private javax.swing.JButton GestionarTemas;
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton guardarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
