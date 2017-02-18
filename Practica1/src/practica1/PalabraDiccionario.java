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
public class PalabraDiccionario {
    private String palabra;
    private PalabraDiccionario siguiente;
    
    PalabraDiccionario(String palabra){
        this.palabra=palabra;
        setSiguiente(null);
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the siguiente
     */
    public PalabraDiccionario getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(PalabraDiccionario siguiente) {
        this.siguiente = siguiente;
    }
}
