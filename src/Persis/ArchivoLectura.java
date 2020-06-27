package Persis;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArchivoLectura {
    private Scanner in;
    private String linea;

    public ArchivoLectura(String unNombre) {
        try {
            in = new Scanner(Paths.get(unNombre));
        } catch (IOException e) {
           JOptionPane.showMessageDialog(null, "No se pudo leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean hayMasLineas() {
        boolean hay = false;
        linea = null;
        if (in.hasNext()){
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }

    public String linea() {
        // devuelve la última linea leida
        return linea;
    }

    public void cerrar() {
        in.close();
    }
}

