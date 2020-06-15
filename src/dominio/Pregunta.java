/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author ivan
 */
public class Pregunta extends Tema{
    private String pregunta;
    private String respuesta;

    public Pregunta(String pregunta, String respuesta, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
    
}
