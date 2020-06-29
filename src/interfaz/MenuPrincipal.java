package interfaz;

import Persis.ArchivoLectura;
import dominio.Pregunta;
import dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        btnCargaPrueba = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
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
        CargaColectiva.setText("Carga De Preguntas Desde TXT");
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

        btnSalir.setBackground(new java.awt.Color(187, 83, 70));
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
        guardarDatos.setText("Guardar");
        guardarDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        guardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(guardarDatos);
        guardarDatos.setBounds(10, 250, 130, 60);

        btnCargaPrueba.setBackground(new java.awt.Color(187, 83, 70));
        btnCargaPrueba.setText("Carga datos de prueba");
        btnCargaPrueba.setPreferredSize(new java.awt.Dimension(169, 19));
        btnCargaPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaPruebaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargaPrueba);
        btnCargaPrueba.setBounds(460, 20, 210, 60);

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
        GestionTema gestionT = new GestionTema(sistema.getListaTemas(), sistema);
        gestionT.setVisible(true);
    }//GEN-LAST:event_GestionarTemasActionPerformed

    private void GestionarPreguntasManualmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarPreguntasManualmenteActionPerformed
        GestionPregunta gestionP = new GestionPregunta(sistema);
        gestionP.setVisible(true);
    }//GEN-LAST:event_GestionarPreguntasManualmenteActionPerformed

    private void CargaColectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaColectivaActionPerformed
        BuscarDocumento busqueda = new BuscarDocumento();
        busqueda.setVisible(true);
        String pathAUsar = busqueda.getPath();
        
        while (!busqueda.isShowing()) {
        ArchivoLectura arch = new ArchivoLectura(pathAUsar);
        int contador = 1;
        ArrayList<String> listaCargados = new ArrayList<>();
        while (arch.hayMasLineas()) {
            listaCargados.add(arch.linea());
        }
        arch.cerrar();
        boolean sePuedeAgregar = false;
        for (int i = 0; i < listaCargados.size(); i += 3) {
            System.out.println(listaCargados.get(i));
            System.out.println(listaCargados.get(i+1));
            System.out.println(listaCargados.get(i+2));
            for (int j = 0; j < sistema.getListaTemas().size(); j++) {
                if (listaCargados.get(i+1)!= "" && listaCargados.get(i+2)!="") {
                    if (sistema.getListaTemas().get(j).getNombre() == listaCargados.get(i).toString() && i / 3 == 0) {
                        System.out.println("entro");
                        Pregunta p = new Pregunta(listaCargados.get(i + 1).toString(), listaCargados.get(i + 2).toString(),
                            sistema.getListaTemas().get(j).getNombre(), sistema.getListaTemas().get(j).getDescripcion());
                    sistema.getListaPreguntas().add(p);
                    System.out.println(p.toString());
                }
                }
                
            }

        }
        JOptionPane.showMessageDialog(null, "Termino la carga", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void guardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosActionPerformed
        BuscarDocumento busqueda = new BuscarDocumento();
        busqueda.setVisible(true);
        //Hay que seleccionar en esa ventana el documento
        String path = busqueda.getPath().toString();
        //usar este path
    }//GEN-LAST:event_guardarDatosActionPerformed

    private void btnCargaPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaPruebaActionPerformed
        CargaDatosPrueba c = new CargaDatosPrueba(sistema);
        c.setVisible(true);
    }//GEN-LAST:event_btnCargaPruebaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargaColectiva;
    private javax.swing.JButton GestionarPreguntasManualmente;
    private javax.swing.JButton GestionarTemas;
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton btnCargaPrueba;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton guardarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
