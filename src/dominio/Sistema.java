/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class Sistema implements Serializable {

    private ArrayList<Tema> listaTemas;
    private ArrayList<Pregunta> listaPreguntas;

    public Sistema() {
        this.listaTemas = new ArrayList<>();
        this.listaPreguntas = new ArrayList<>();
    }

    public ArrayList<Tema> getListaTemas() {
        return listaTemas;
    }

    public void setListaTemas(ArrayList<Tema> listaTemas) {
        this.listaTemas = listaTemas;
    }

    public ArrayList<Pregunta> getListaPreguntas() {
        return listaPreguntas;
    }

    public void setListaPreguntas(ArrayList<Pregunta> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }

    public Tema CrearTema(String tema, String descripcion) {
        Tema t = new Tema(tema, descripcion);
        listaTemas.add(t);
        return t;
    }

    public Pregunta CrearPregunta(String pregunta, String respuesta, Tema t) {
        //Preguntas(String pregunta, String respuesta, String nombre, String descripcion)
        Pregunta p = new Pregunta(pregunta, respuesta, t.getNombre(), t.getDescripcion());
        listaPreguntas.add(p);
        return p;
    }

    public int tienePreguntas(Tema t){
        int contador=0;
        try{
        for (Pregunta p: listaPreguntas) {
            if (p.getNombre().equals(t.getNombre())) {
                contador++;
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error leyendo preguntas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return contador;
    }
    
}
