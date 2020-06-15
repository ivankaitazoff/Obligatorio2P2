/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import interfaz.GestionTema;
import java.util.ArrayList;

/**
 *
 * @author ivan
 */
public class Sistema {
    
    
    private ArrayList<Tema> listaTemas;
    private ArrayList<Pregunta> listaPreguntas;
    
    public Tema CrearTema(String tema, String descripcion){
    Tema t = new Tema(tema, descripcion);
    listaTemas.add(t);
    return t;
    }
    
    public Pregunta CrearPregunta(String pregunta, String respuesta, Tema t){
        //Preguntas(String pregunta, String respuesta, String nombre, String descripcion)
    Pregunta p = new Pregunta(pregunta, respuesta, t.getNombre(), t.getDescripcion());
    listaPreguntas.add(p);
    return p;
    }
    
}
