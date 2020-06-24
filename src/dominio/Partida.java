
package dominio;

import java.util.ArrayList;



public class Partida {
    
    private ArrayList<Tema> listaTemasElegidos;
    private ArrayList<Pregunta> listaPreguntasElegidas;
    private int puntajeJugador1;
    private int puntajeJugador2;
    private int turno;

    public Partida(ArrayList<Tema> listaTemasElegidos, ArrayList<Pregunta> listaPreguntasElegidas, int puntajeJugador1, int puntajeJugador2, int turno) {
        this.listaTemasElegidos = listaTemasElegidos;
        this.listaPreguntasElegidas = listaPreguntasElegidas;
        this.puntajeJugador1 = puntajeJugador1;
        this.puntajeJugador2 = puntajeJugador2;
        this.turno = turno;
    }

    /*public boolean nombreIgual(String nombre) {
        boolean igual = false;
            if (listaPreguntasElegidas.get(i).getNombre().equals(nombre)) {
                igual = true;
        }
        return igual;
    }  */
    
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
        return puntajeJugador1;
    }

    public void setPuntajeJugador1(int puntajeJugador1) {
        this.puntajeJugador1 = puntajeJugador1;
    }

    public int getPuntajeJugador2() {
        return puntajeJugador2;
    }

    public void setPuntajeJugador2(int puntajeJugador2) {
        this.puntajeJugador2 = puntajeJugador2;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

}
