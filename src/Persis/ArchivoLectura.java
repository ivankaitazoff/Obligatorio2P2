package Persis;

import dominio.Tema;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArchivoLectura {
    private int contador=1;
    private Scanner in;
    private String linea;

    public ArchivoLectura(String unNombre) {
        try {
            in = new Scanner(Paths.get(unNombre));
           //JOptionPane.showMessageDialog(null, "Creo que anda bien", "Error", JOptionPane.ERROR_MESSAGE);
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

    public String getLinea() {
        // devuelve la última linea leida
        return linea;
    }

    public void cerrar() {
        in.close();
    }
    
    /* public boolean verificarQueExistaTema(ArrayList<Tema> listaTemas, String temaEnArchivo){
        boolean existe = false;
        for (int i = 0; i < listaTemas.size(); i++) {
        if (listaTemas.get(i).getNombre()== temaEnArchivo) {
            existe = true;
            break;
        }
        }
        return existe;
    }*/
    public int devolverIndiceTema(ArrayList<Tema> listaTemas, String temaEnArchivo){
        temaEnArchivo = temaEnArchivo.toUpperCase();
        int index=-1;
        for (int i = 0; i < listaTemas.size(); i++) {
            if (listaTemas.get(i).getNombre()== temaEnArchivo) {
            index = i;
            break;
            }
        }
        return index;
    }
}

