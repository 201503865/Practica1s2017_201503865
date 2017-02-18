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
public class ListaSimpleLetras {
    private NodoLetra Cabeza;

    public ListaSimpleLetras(){
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
    
    public void CambiarLetra(char Letra, char LetraNueva){
        auxiliar=Cabeza;
        while(auxiliar!=null){
            if(auxiliar.getLetra()==Letra){
                auxiliar.setLetra(LetraNueva);
                break;
            }
            auxiliar=auxiliar.getSiguiente();
        }
    }
    
    NodoLetra auxiliar2;
    NodoLetra auxiliar3;
    
    //Comprobar
    public void SacarLetra(char Letra){
        auxiliar=Cabeza;
        while(auxiliar.getSiguiente()!=null){
            if(auxiliar.getSiguiente().getLetra()==Letra){
                auxiliar3=auxiliar.getSiguiente();
                auxiliar2=auxiliar3.getSiguiente();
                auxiliar3=null;
                auxiliar.setSiguiente(auxiliar2);
                break;
            }
            auxiliar=auxiliar.getSiguiente();
        }
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
