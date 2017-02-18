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
public class NodoCircular {

    private String nombre;
    private NodoCircular siguiente;
    private ListaSimpleLetras letras;

    public NodoCircular(String nombre,ListaSimpleLetras letras) {
        this.nombre = nombre;
        this.letras=letras;
        setSiguiente(null);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the siguiente
     */
    public NodoCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the letras
     */
    public ListaSimpleLetras getLetras() {
        return letras;
    }

    /**
     * @param letras the letras to set
     */
    public void setLetras(ListaSimpleLetras letras) {
        this.letras = letras;
    }
}
