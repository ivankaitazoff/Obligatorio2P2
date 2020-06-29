//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sistema implements Serializable {

    private ArrayList<Tema> listaTemas;
    private ArrayList<Pregunta> listaPreguntas;
    private String path;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public void setearNumeroDePreguntas(Tema t) {
        int indexTema = 0;
        for (int i = 0; i < listaTemas.size(); i++) {
            if (t.getNombre().equals(listaTemas.get(i).getNombre())) {
                indexTema = i;
                break;
            }
        }
        int preguntas = tienePreguntas(t);
        listaPreguntas.get(indexTema).setCantidadPreguntas(preguntas);
    }

    public int tienePreguntas(Tema t) {
        int contador = 0;
        try {
            for (Pregunta p : listaPreguntas) {
                if (p.getNombre().equals(t.getNombre())) {
                    contador++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error leyendo preguntas", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return contador;
    }

}
