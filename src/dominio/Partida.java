package dominio;

import java.util.ArrayList;

public class Partida {

    private ArrayList<Tema> listaTemasElegidos;
    private ArrayList<Pregunta> listaPreguntasElegidas;
    private int puntajeJugador;
    private int turno;

    public Partida(ArrayList<Tema> listaTemasElegidos, int puntajeJugador, int turno) {
        this.listaTemasElegidos = listaTemasElegidos;
        this.listaPreguntasElegidas = new ArrayList();
        this.puntajeJugador = puntajeJugador;
       
        this.turno = turno;
    }

    public ArrayList<Tema> getListaTemasElegidos() {
        return listaTemasElegidos;
    }

    public void setListaTemasElegidos(ArrayList<Tema> listaTemasElegidos) {
        this.listaTemasElegidos = listaTemasElegidos;
    }

    public ArrayList<Pregunta> getListaPreguntasElegidas() {
        return listaPreguntasElegidas;
    }

    public void setListaPreguntasElegidas(ArrayList<Pregunta> listaPreguntasElegidas) {
        this.listaPreguntasElegidas = listaPreguntasElegidas;
    }

    public int getPuntajeJugador1() {
        return puntajeJugador;
    }

    public void setPuntajeJugador1(int puntajeJugador) {
        this.puntajeJugador = puntajeJugador;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void cargarPreguntasPartida(ArrayList<Pregunta> listaPreguntasSis) {
        if (!listaPreguntasSis.isEmpty() && !listaTemasElegidos.isEmpty()) {
            for (Tema t : listaTemasElegidos) {
                for (Pregunta p : listaPreguntasSis) {
                    if (t.getNombre() == (p.getNombre())) {
                        listaPreguntasElegidas.add(p);
                    }
                }
            }
        }
    }
}
