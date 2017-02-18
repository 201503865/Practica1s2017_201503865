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
public class ColaDeLetras {
    
    private NodoLetra Cabeza;

    public ColaDeLetras(){
        setCabeza(null);
    }
    
    NodoLetra auxiliar;
    
    public void InsertarLetra(char Letra){
       NodoLetra nuevo=new NodoLetra(Letra);
       if(Cabeza==null){
           Cabeza=nuevo;
       }else{
           auxiliar=Cabeza;
           while(auxiliar.getSiguiente()!=null){
               auxiliar=auxiliar.getSiguiente();
           }
           auxiliar.setSiguiente(nuevo);
       }
    }
    
    public void MostrarLetras(){
        auxiliar=Cabeza;
        while(auxiliar!=null){
            System.out.println(auxiliar.getLetra());
            auxiliar=auxiliar.getSiguiente();
        }
    }
    
    public void SacarLetra(){
        auxiliar=Cabeza;
        System.out.println(auxiliar.getLetra());
        setCabeza(auxiliar.getSiguiente());
        auxiliar=null;
    }
    
    /**
     * @return the Cabeza
     */
    public NodoLetra getCabeza() {
        return Cabeza;
    }

    /**
     * @param Cabeza the Cabeza to set
     */
    public void setCabeza(NodoLetra Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    
    
}
