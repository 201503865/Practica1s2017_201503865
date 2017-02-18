/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JButton;

/**
 *
 * @author Julia
 */
public class NodoMatriz {
    private int posicionX;
    private int posicionY;
    private NodoMatriz siguiente;
    private NodoMatriz anterior;
    private NodoMatriz abajo;
    private NodoMatriz arriba;
    private JButton boton;
    
    public NodoMatriz(int posicionX, int posicionY){
        this.posicionX=posicionX;
        this.posicionY=posicionY;
        setSiguiente(null);
        setAnterior(null);
        setAbajo(null);
        setArriba(null);
        boton=new JButton();
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
    public NodoMatriz getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoMatriz siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoMatriz getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoMatriz anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the abajo
     */
    public NodoMatriz getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoMatriz abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the arriba
     */
    public NodoMatriz getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(NodoMatriz arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the boton
     */
    public JButton getBoton() {
        return boton;
    }

    /**
     * @param boton the boton to set
     */
    public void setBoton(JButton boton) {
        this.boton = boton;
    }
}
