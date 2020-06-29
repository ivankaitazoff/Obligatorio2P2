//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package interfaz;

import dominio.Pregunta;
import dominio.Sistema;
import dominio.Tema;

public class CargaDatosPrueba extends javax.swing.JFrame {

    private Sistema sistema;
    private int cantPreguntas;
    private int cantTemas;

    public CargaDatosPrueba(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextCantTemas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCantPreguntas = new javax.swing.JTextField();
        btnCrearDatos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 300));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.add(jTextCantTemas);
        jTextCantTemas.setBounds(215, 35, 167, 20);

        jLabel1.setText("Cantidad de temas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(43, 38, 90, 14);

        jLabel2.setText("Cantidad de preguntas en cada tema");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 82, 190, 14);
        jPanel1.add(jTextCantPreguntas);
        jTextCantPreguntas.setBounds(215, 79, 167, 20);

        btnCrearDatos.setText("Crear Datos");
        btnCrearDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearDatos);
        btnCrearDatos.setBounds(230, 140, 130, 23);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(40, 140, 120, 23);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AVISO, AL CREAR DATOS USANDO ESTA VENTANA SE BORRARAN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 190, 400, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" TODOS LOS DATOS QUE HAY EN EL SISTEMA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 220, 400, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDatosActionPerformed
        sistema.getListaPreguntas().clear();
        sistema.getListaTemas().clear();
        cantTemas = Integer.parseInt(jTextCantTemas.getText());
        cantPreguntas = Integer.parseInt(jTextCantPreguntas.getText());
        for (int i = 0; i < cantTemas; i++) {
            Tema t = new Tema("TEMA" + (i + 1), ", Descripcion de T" + (i + 1));
            sistema.getListaTemas().add(t);
            for (int j = 0; j < cantPreguntas; j++) {
                Pregunta p = new Pregunta("P" + (j + 1) + "TEMA" + (i + 1), "Respuesta P" + (j + 1) + "TEMA" + (i + 1), t.getNombre(), t.getDescripcion());
                sistema.getListaPreguntas().add(p);
                t.setCantidadPreguntas(t.getCantidadPreguntas() + 1);
            }

        }
        this.dispose();
    }//GEN-LAST:event_btnCrearDatosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearDatos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCantPreguntas;
    private javax.swing.JTextField jTextCantTemas;
    // End of variables declaration//GEN-END:variables
}
