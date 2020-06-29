/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.Button;
import javax.swing.JButton;

/**
 *
 * @author ivan
 */
public class Casillero {
    private int posicionX;
    private int posicionY;
    private boolean esPregunta;
    private Pregunta pregunta;
    private boolean usado;

    public Casillero(int posicionX, int posicionY, Pregunta pregunta, boolean esPregunta) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.esPregunta = esPregunta;
        this.pregunta = pregunta;
        this.usado = false;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public boolean getEsPregunta() {
        return esPregunta;
    }

    public void setEsPregunta(boolean esPregunta) {
        this.esPregunta = esPregunta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
    
}
