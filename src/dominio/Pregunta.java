//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package dominio;

import java.util.Objects;

public class Pregunta extends Tema {

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

    @Override
    public String toString() {
        return pregunta + ", respuesta=" + respuesta + ", tema=" + this.getNombre();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pregunta other = (Pregunta) obj;
        if (!Objects.equals(this.pregunta, other.pregunta)) {
            return false;
        }
        return true;
    }

}
