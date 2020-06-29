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

        labelPath = new javax.swing.JLabel();
        abrirNavegador = new javax.swing.JButton();
        mostrarRuta = new javax.swing.JButton();
        cargaDatos = new javax.swing.JButton();
        guardarDatos = new javax.swing.JButton();
        cargaPrueba = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        labelPath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPath.setText("Path");
        getContentPane().add(labelPath);
        labelPath.setBounds(10, 10, 380, 14);

        abrirNavegador.setText("Abrir navegador");
        abrirNavegador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirNavegadorActionPerformed(evt);
            }
        });
        getContentPane().add(abrirNavegador);
        abrirNavegador.setBounds(70, 40, 250, 23);

        mostrarRuta.setText("Mostrar ruta seleccionada");
        mostrarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarRutaActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarRuta);
        mostrarRuta.setBounds(70, 70, 250, 23);

        cargaDatos.setText("Cargar datos desde txt");
        cargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaDatosActionPerformed(evt);
            }
        });
        getContentPane().add(cargaDatos);
        cargaDatos.setBounds(30, 170, 150, 23);

        guardarDatos.setText("Guardar datos a txt");
        guardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(guardarDatos);
        guardarDatos.setBounds(220, 170, 170, 23);

        cargaPrueba.setText("Carga facil de datos de prueba");
        cargaPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaPruebaActionPerformed(evt);
            }
        });
        getContentPane().add(cargaPrueba);
        cargaPrueba.setBounds(60, 220, 290, 23);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(150, 260, 100, 23);

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
        ArchivoLectura arch = new ArchivoLectura(sistema.getPath());
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
            System.out.println("error");
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
    // End of variables declaration//GEN-END:variables
}
