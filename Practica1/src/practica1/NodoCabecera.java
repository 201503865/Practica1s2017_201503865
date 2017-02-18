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
public class NodoCabecera {
    private int Columna;
    private int Fila;
    private NodoCabecera siguienteColumna;
    private NodoCabecera siguienteFila;
    private NodoCabecera anteriorColumna;
    private NodoCabecera anteriorFila;
    private NodoMatriz Dato;
    
    public NodoCabecera(int Fila,int Columna){
        this.Fila=Fila;
        this.Columna=Columna;
        setSiguienteColumna(null);
        setAnteriorColumna(null);
        setSiguienteFila(null);
        setAnteriorFila(null);
        setDato(null);
    }

    /**
     * @return the Columna
     */
    public int getColumna() {
        return Columna;
    }

    /**
     * @param Columna the Columna to set
     */
    public void setColumna(int Columna) {
        this.Columna = Columna;
    }

    /**
     * @return the Fila
     */
    public int getFila() {
        return Fila;
    }

    /**
     * @param Fila the Fila to set
     */
    public void setFila(int Fila) {
        this.Fila = Fila;
    }

    /**
     * @return the siguienteColumna
     */
    public NodoCabecera getSiguienteColumna() {
        return siguienteColumna;
    }

    /**
     * @param siguienteColumna the siguienteColumna to set
     */
    public void setSiguienteColumna(NodoCabecera siguienteColumna) {
        this.siguienteColumna = siguienteColumna;
    }

    /**
     * @return the siguienteFila
     */
    public NodoCabecera getSiguienteFila() {
        return siguienteFila;
    }

    /**
     * @param siguienteFila the siguienteFila to set
     */
    public void setSiguienteFila(NodoCabecera siguienteFila) {
        this.siguienteFila = siguienteFila;
    }

    /**
     * @return the anteriorColumna
     */
    public NodoCabecera getAnteriorColumna() {
        return anteriorColumna;
    }

    /**
     * @param anteriorColumna the anteriorColumna to set
     */
    public void setAnteriorColumna(NodoCabecera anteriorColumna) {
        this.anteriorColumna = anteriorColumna;
    }

    /**
     * @return the anteriorFila
     */
    public NodoCabecera getAnteriorFila() {
        return anteriorFila;
    }

    /**
     * @param anteriorFila the anteriorFila to set
     */
    public void setAnteriorFila(NodoCabecera anteriorFila) {
        this.anteriorFila = anteriorFila;
    }

    /**
     * @return the Dato
     */
    public NodoMatriz getDato() {
        return Dato;
    }

    /**
     * @param Dato the Dato to set
     */
    public void setDato(NodoMatriz Dato) {
        this.Dato = Dato;
    }
}
