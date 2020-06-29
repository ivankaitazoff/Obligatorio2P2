//Nombres y numeros de estudiantes
//Ivan kaitazoff: 233940
//Sebastian Romelli: 222405
package dominio;

import java.util.ArrayList;

public class Partida {

    private ArrayList<Tema> listaTemasElegidos;
    private ArrayList<Pregunta> listaPreguntasElegidas;
    private ArrayList<Pregunta> listaPreguntasMezcladas;
    private int puntajeJugador;
    private int turno;
    ArrayList<Casillero> listaCasilleros;

    public Partida(ArrayList<Tema> listaTemasElegidos, int puntajeJugador, int turno) {
        this.listaTemasElegidos = listaTemasElegidos;
        this.listaPreguntasElegidas = new ArrayList();
        this.puntajeJugador = puntajeJugador;
        this.turno = turno;
        this.listaCasilleros = new ArrayList<>();
    }

    public ArrayList<Pregunta> getListaPreguntasMezcladas() {
        return listaPreguntasMezcladas;
    }

    public void setListaPreguntasMezcladas(ArrayList<Pregunta> listaPreguntasMezcladas) {
        this.listaPreguntasMezcladas = listaPreguntasMezcladas;
    }

    public int getPuntajeJugador() {
        return puntajeJugador;
    }

    public void setPuntajeJugador(int puntajeJugador) {
        this.puntajeJugador = puntajeJugador;
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

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public ArrayList<Casillero> getListaCasilleros() {
        return listaCasilleros;
    }

    public void setListaCasilleros(ArrayList<Casillero> listaCasilleros) {
        this.listaCasilleros = listaCasilleros;
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
    
    public Casillero devolverCasillero(int x, int y){
        Casillero c=null;
        for (int i = 0; i < listaCasilleros.size(); i++) {
            if (listaCasilleros.get(i).getPosicionX()== x && listaCasilleros.get(i).getPosicionY()== y) {
                c=listaCasilleros.get(i);
            }
        }
        return c;
    }
    
}
