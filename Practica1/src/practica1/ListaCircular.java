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
public class ListaCircular {
    private NodoCircular Cabeza;
    
    public ListaCircular(){
        setCabeza(null);
    }
    
    NodoCircular auxiliar;
    
    public void Insertar(String nombre,ListaSimpleLetras letras){
        NodoCircular nuevo = new NodoCircular(nombre,letras);
        if(Cabeza==null){
            setCabeza(nuevo);
            Cabeza.setSiguiente(Cabeza);
        }else{
            auxiliar=Cabeza;
            while(auxiliar.getSiguiente()!=Cabeza){
                auxiliar=auxiliar.getSiguiente();
            }
            nuevo.setSiguiente(Cabeza);
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    NodoCircular Buscado;
    
    public NodoCircular BuscarExiste(String nombre){
        Buscado=null;
        if(Cabeza!=null){
            auxiliar=Cabeza;
            if(auxiliar.getNombre().equalsIgnoreCase(nombre)){
                Buscado=auxiliar;
            }else{
                while(auxiliar.getSiguiente()!=Cabeza){
                    if(auxiliar.getNombre().equalsIgnoreCase(nombre)){
                        Buscado=auxiliar;
                        break;
                    }
                    auxiliar=auxiliar.getSiguiente();
                }
            }
        }
        return Buscado;
    }
    
    public void Imprimir(){
        System.out.println(Cabeza.getNombre());
        auxiliar=Cabeza.getSiguiente();
        while(auxiliar.getSiguiente()!=Cabeza){
            System.out.println(auxiliar.getNombre());
            auxiliar=auxiliar.getSiguiente();
        }
    }
    
    public void Graphviz(){
        
    }
    /**
     * @return the Cabeza
     */
    public NodoCircular getCabeza() {
        return Cabeza;
    }

    /**
     * @param Cabeza the Cabeza to set
     */
    public void setCabeza(NodoCircular Cabeza) {
        this.Cabeza = Cabeza;
    }
}
