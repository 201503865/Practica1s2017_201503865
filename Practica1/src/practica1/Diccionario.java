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
public class Diccionario {
    
    private PalabraDiccionario Cabeza;
    
    public Diccionario(){
        setCabeza(null);
    }
    
    PalabraDiccionario auxiliar;
    
    public void InsertarPalabra(String palabra){
        PalabraDiccionario nuevaPalabra= new PalabraDiccionario(palabra);
        if(Cabeza==null){
            setCabeza(nuevaPalabra);
            Cabeza.setSiguiente(null);
        }else{
            auxiliar=Cabeza;
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevaPalabra);
        }
    }
    
    public void mostrarPalabras(){
        auxiliar=Cabeza;
        while(auxiliar != null){
            System.out.println(auxiliar.getPalabra());
            auxiliar=auxiliar.getSiguiente();
        }
    }
    
    PalabraDiccionario PalabraBuscada;
    
    public PalabraDiccionario BuscarPalabra(String palabra){
        PalabraBuscada=null;
        auxiliar=Cabeza;
        while(auxiliar!=null){
            if(palabra.equalsIgnoreCase(auxiliar.getPalabra())){
                PalabraBuscada=auxiliar;
                break;
            }
            auxiliar=auxiliar.getSiguiente();
        }
        return PalabraBuscada;
    }

    /**
     * @return the Cabeza
     */
    public PalabraDiccionario getCabeza() {
        return Cabeza;
    }

    /**
     * @param Cabeza the Cabeza to set
     */
    public void setCabeza(PalabraDiccionario Cabeza) {
        this.Cabeza = Cabeza;
    }
    
}
