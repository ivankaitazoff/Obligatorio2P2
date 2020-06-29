//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package interfaz;

import dominio.Sistema;
import java.awt.event.WindowEvent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class BuscarDocumento extends javax.swing.JFrame {

    private String path;
    private Sistema sistema;

    public BuscarDocumento(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JToggleButton();
        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(730, 450));
        getContentPane().setLayout(null);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(430, 360, 90, 30);

        jFileChooser1.setBackground(new java.awt.Color(187, 83, 70));
        jFileChooser1.setDialogTitle("");
        jFileChooser1.setFileFilter(null);
        jFileChooser1.setForeground(new java.awt.Color(187, 83, 70));
        jFileChooser1.setMinimumSize(new java.awt.Dimension(600, 400));
        jFileChooser1.setPreferredSize(new java.awt.Dimension(600, 400));
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFileChooser1);
        jFileChooser1.setBounds(0, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        try {
                this.setPath(jFileChooser1.getSelectedFile().toString());
                System.out.println(path);
                sistema.setPath(this.getPath());
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error cargando el path", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public JFileChooser getjFileChooser1() {
        return jFileChooser1;
    }

    public void setjFileChooser1(JFileChooser jFileChooser1) {
        this.jFileChooser1 = jFileChooser1;
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("cerro la ventana");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
