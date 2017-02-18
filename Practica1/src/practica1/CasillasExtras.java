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
public class CasillasExtras {
    private Casilla Cabeza;

    public CasillasExtras(){
        setCabeza(null);
    }

    Casilla auxiliar;
    
    public void InsertarCasilla(int X,int Y){
        Casilla NuevaCasilla=new Casilla(X,Y);
        if(Cabeza==null){
            setCabeza(NuevaCasilla);
            Cabeza.setSiguiente(null);
        }else{
            auxiliar=Cabeza;
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(NuevaCasilla);
        }
    }
    
    public void RecorrerCasillas(){
        auxiliar=Cabeza;
        while(auxiliar!=null){
            System.out.println("X:"+auxiliar.getPosicionX());
            System.out.println("Y:"+auxiliar.getPosicionY());
            auxiliar=auxiliar.getSiguiente();
        }
    }
    
    /**
     * @return the Cabeza
     */
    public Casilla getCabeza() {
        return Cabeza;
    }

    /**
     * @param Cabeza the Cabeza to set
     */
    public void setCabeza(Casilla Cabeza) {
        this.Cabeza = Cabeza;
    }
    
}
