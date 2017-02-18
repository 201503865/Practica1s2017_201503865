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
public class NodoLetra {
    
    private char Letra;
    private NodoLetra siguiente;
    
   public NodoLetra(char Letra){
       this.Letra=Letra;
       setSiguiente(null);
   } 

    /**
     * @return the Letra
     */
    public char getLetra() {
        return Letra;
    }

    /**
     * @param Letra the Letra to set
     */
    public void setLetra(char Letra) {
        this.Letra = Letra;
    }

    /**
     * @return the siguiente
     */
    public NodoLetra getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLetra siguiente) {
        this.siguiente = siguiente;
    }
}
