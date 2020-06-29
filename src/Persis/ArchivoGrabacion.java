//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package Persis;

import java.io.FileNotFoundException;
import java.util.Formatter;
import javax.swing.JOptionPane;

public class ArchivoGrabacion {

    private Formatter out;

    public ArchivoGrabacion(String unNombre) {
        try {
            out = new Formatter(unNombre);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SecurityException e) {
            JOptionPane.showMessageDialog(null, "No se tiene permiso", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void grabarLinea(String linea) {
        out.format(linea);
    }

    public void cerrar() {
        out.close();
    }
}
