//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package interfaz;

import Persis.ArchivoGrabacion;
import Persis.ArchivoLectura;
import dominio.Pregunta;
import dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CargaDatosVentanaAuxiliar extends javax.swing.JFrame {

    Sistema sistema;

    public CargaDatosVentanaAuxiliar(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        cargaDatos = new javax.swing.JButton();
        mostrarRuta = new javax.swing.JButton();
        abrirNavegador = new javax.swing.JButton();
        labelPath = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        cargaPrueba = new javax.swing.JButton();
        guardarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        panel1.setLayout(null);

        cargaDatos.setBackground(new java.awt.Color(187, 83, 70));
        cargaDatos.setText("Cargar datos desde txt");
        cargaDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        cargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaDatosActionPerformed(evt);
            }
        });
        panel1.add(cargaDatos);
        cargaDatos.setBounds(30, 170, 150, 19);

        mostrarRuta.setBackground(new java.awt.Color(187, 83, 70));
        mostrarRuta.setText("Mostrar ruta seleccionada");
        mostrarRuta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        mostrarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarRutaActionPerformed(evt);
            }
        });
        panel1.add(mostrarRuta);
        mostrarRuta.setBounds(70, 70, 250, 19);

        abrirNavegador.setBackground(new java.awt.Color(187, 83, 70));
        abrirNavegador.setText("Abrir navegador");
        abrirNavegador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        abrirNavegador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirNavegadorActionPerformed(evt);
            }
        });
        panel1.add(abrirNavegador);
        abrirNavegador.setBounds(70, 40, 250, 19);

        labelPath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPath.setText("Path");
        panel1.add(labelPath);
        labelPath.setBounds(10, 10, 380, 14);

        btnSalir.setBackground(new java.awt.Color(187, 83, 70));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel1.add(btnSalir);
        btnSalir.setBounds(150, 260, 100, 19);

        cargaPrueba.setBackground(new java.awt.Color(187, 83, 70));
        cargaPrueba.setText("Carga facil de datos de prueba");
        cargaPrueba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        cargaPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaPruebaActionPerformed(evt);
            }
        });
        panel1.add(cargaPrueba);
        cargaPrueba.setBounds(60, 220, 290, 19);

        guardarDatos.setBackground(new java.awt.Color(187, 83, 70));
        guardarDatos.setText("Guardar datos a txt");
        guardarDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        guardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosActionPerformed(evt);
            }
        });
        panel1.add(guardarDatos);
        guardarDatos.setBounds(220, 170, 170, 19);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirNavegadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirNavegadorActionPerformed
        BuscarDocumento b = new BuscarDocumento(sistema);
        b.setVisible(true);
    }//GEN-LAST:event_abrirNavegadorActionPerformed

    private void mostrarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarRutaActionPerformed
        labelPath.setText(sistema.getPath());
    }//GEN-LAST:event_mostrarRutaActionPerformed

    private void cargaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaDatosActionPerformed
        try{ArchivoLectura arch = new ArchivoLectura(sistema.getPath());
        ArrayList<String> listaCargados = new ArrayList<>();
        while (arch.hayMasLineas()) {
            listaCargados.add(arch.linea());
        }
        arch.cerrar();
        boolean sePuedeAgregar = false;
        for (int i = 0; i < listaCargados.size(); i += 3) {
            if (listaCargados.get(i) == "" || listaCargados.get(i + 1) == "" || listaCargados.get(i + 2) == "") {
                JOptionPane.showMessageDialog(null, "Hay espacios en blanco, no se pudo agregar la pregunta", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                for (int j = 0; j < sistema.getListaTemas().size(); j++) {
                    if (listaCargados.get(i + 1) != "" && listaCargados.get(i + 2) != "") {
                        if (sistema.getListaTemas().get(j).getNombre().equals(listaCargados.get(i).toUpperCase())) {
                            Pregunta p = new Pregunta(listaCargados.get(i + 1).toString(), listaCargados.get(i + 2).toString(),
                                    sistema.getListaTemas().get(j).getNombre(), sistema.getListaTemas().get(j).getDescripcion());
                            sistema.getListaPreguntas().add(p);
                            sistema.getListaTemas().get(j).setCantidadPreguntas(sistema.getListaTemas().get(j).getCantidadPreguntas() + 1);
                            System.out.println(p.toString());
                        }
                    }

                }

            }
        }}
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "No se pude encontrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cargaDatosActionPerformed

    private void guardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosActionPerformed
        try{ 
            ArchivoGrabacion out = new ArchivoGrabacion(sistema.getPath()); 
            for (int i = 0; i < sistema.getListaTemas().size(); i++) {
                    out.grabarLinea("Tema "+(i+1)+":"+sistema.getListaTemas().get(i).getNombre() +"\n");
                for (int j = 0; j < sistema.getListaPreguntas().size(); j++) {
                    if (sistema.getListaPreguntas().get(j).getNombre().equals(sistema.getListaTemas().get(i).getNombre())) {
                        out.grabarLinea("Pregunta: " + sistema.getListaPreguntas().get(j).getPregunta()+"\n");
                        out.grabarLinea("Respuesta: " + sistema.getListaPreguntas().get(j).getRespuesta()+"\n");
                    }
                }
            }
            
            out.cerrar();
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, "No se pude encontrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_guardarDatosActionPerformed

    private void cargaPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaPruebaActionPerformed
        CargaDatosPrueba c = new CargaDatosPrueba(sistema);
        c.setVisible(true);
    }//GEN-LAST:event_cargaPruebaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
            this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirNavegador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton cargaDatos;
    private javax.swing.JButton cargaPrueba;
    private javax.swing.JButton guardarDatos;
    private javax.swing.JLabel labelPath;
    private javax.swing.JButton mostrarRuta;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
