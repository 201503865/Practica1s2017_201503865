/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Julia
 */
public class Casilla {
    private int posicionX;
    private int posicionY;
    private Casilla siguiente;

    public Casilla(int posicionX, int posicionY){
        this.posicionX=posicionX;
        this.posicionY=posicionY;
        setSiguiente(null);
    }
    
    /**
     * @return the posicionX
     */
    public int getPosicionX() {
        return posicionX;
    }

    /**
     * @param posicionX the posicionX to set
     */
    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    /**
     * @return the posicionY
     */
    public int getPosicionY() {
        return posicionY;
    }

    /**
     * @param posicionY the posicionY to set
     */
    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    /**
     * @return the siguiente
     */
    public Casilla getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Casilla siguiente) {
        this.siguiente = siguiente;
    }
    
}
