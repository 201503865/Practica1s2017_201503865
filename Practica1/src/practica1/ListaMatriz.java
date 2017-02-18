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
public class ListaMatriz {
    private NodoCabecera Inicio;
    
    public ListaMatriz(){
        setInicio(null);
    }
    
    public void InsertarDatos(int X, int Y){
        NodoCabecera Fila = BuscarFila(X);
        NodoCabecera Columna= BuscarColumna(Y);
        if(Fila==null){
            InsertarFila(X);
            Fila = BuscarFila(X);
        }
        if(Columna==null){
            InsertarColumna(Y);
            Columna= BuscarColumna(Y);
        }
        NodoMatriz nuevo= new NodoMatriz(X,Y);
        InsertarX(nuevo,Fila);
        InsertarY(nuevo,Columna);
    }
    
    NodoMatriz auxiliarDato;
    
    public void InsertarX(NodoMatriz nuevo,NodoCabecera Fila){
        auxiliarDato=Fila.getDato();
        if(auxiliarDato==null){
            Fila.setDato(nuevo);
        }else{
            if(auxiliarDato.getPosicionY()>nuevo.getPosicionY()){
                auxiliarDato.setAnterior(nuevo);
                auxiliarDato.setSiguiente(null);
                Fila.setDato(nuevo);
                nuevo.setSiguiente(auxiliarDato);
            }else{
                while(auxiliarDato.getSiguiente()!=null){
                    if(auxiliarDato.getSiguiente().getPosicionY()>nuevo.getPosicionY()){
                        nuevo.setSiguiente(auxiliarDato.getSiguiente());
                        nuevo.setAnterior(auxiliarDato);
                        auxiliarDato.getSiguiente().setAnterior(nuevo);
                        auxiliarDato.setSiguiente(nuevo);
                        break;
                    }
                    auxiliarDato=auxiliarDato.getSiguiente();
                }
                if(auxiliarDato.getSiguiente()==null){
                    auxiliarDato.setSiguiente(nuevo);
                    nuevo.setAnterior(auxiliarDato);
                }
            }
        }
    }
    
    public void InsertarY(NodoMatriz nuevo,NodoCabecera Columna){
        auxiliarDato=Columna.getDato();
        if(auxiliarDato==null){
            Columna.setDato(nuevo);
        }else{
            if(auxiliarDato.getPosicionX()>nuevo.getPosicionX()){
                auxiliarDato.setArriba(nuevo);
                auxiliarDato.setAbajo(null);
                Columna.setDato(nuevo);
                nuevo.setAbajo(auxiliarDato);
            }else{
                while(auxiliarDato.getAbajo()!=null){
                    if(auxiliarDato.getAbajo().getPosicionX()>nuevo.getPosicionX()){
                        nuevo.setAbajo(auxiliarDato.getAbajo());
                        nuevo.setArriba(auxiliarDato);
                        auxiliarDato.getAbajo().setArriba(nuevo);
                        auxiliarDato.setAbajo(nuevo);
                        break;
                    }
                    auxiliarDato=auxiliarDato.getAbajo();
                }
                if(auxiliarDato.getAbajo()==null){
                    auxiliarDato.setAbajo(nuevo);
                    nuevo.setArriba(auxiliarDato);
                }
            }
        }
    }
    
    NodoCabecera auxiliar;
    
    public NodoCabecera BuscarColumna(int Y){
        auxiliar=Inicio.getSiguienteColumna();
        while(auxiliar!=null){
            if(auxiliar.getColumna()==Y){
                return auxiliar;
            }
            auxiliar=auxiliar.getSiguienteColumna();
        }
        return null;
    }
    
    public NodoCabecera BuscarFila(int Y){
        auxiliar=Inicio.getSiguienteFila();
        while(auxiliar!=null){
            if(auxiliar.getFila()==Y){
                return auxiliar;
            }
            auxiliar=auxiliar.getSiguienteFila();
        }
        return null;
    }
    
    public void InsertarFila(int X){
        auxiliar=Inicio.getSiguienteFila();
        NodoCabecera nuevo=new NodoCabecera(X,0);
        if(auxiliar==null){
            Inicio.setSiguienteFila(nuevo);
            nuevo.setAnteriorFila(Inicio);
        }else{
            if(auxiliar.getFila()>X){
                auxiliar.setAnteriorFila(nuevo);
                nuevo.setAnteriorFila(Inicio);
                nuevo.setSiguienteFila(auxiliar);
                Inicio.setSiguienteFila(nuevo);
            }else{
                while(auxiliar.getSiguienteFila()!=null){
                    if(auxiliar.getSiguienteFila().getFila()>X){
                        nuevo.setAnteriorFila(auxiliar);
                        nuevo.setSiguienteFila(auxiliar.getSiguienteFila());
                        auxiliar.getSiguienteFila().setAnteriorFila(nuevo);
                        auxiliar.setSiguienteFila(nuevo);
                        break;
                    }
                    auxiliar=auxiliar.getSiguienteFila();
                }
                if(auxiliar.getSiguienteFila()==null){
                    auxiliar.setSiguienteFila(nuevo);
                    nuevo.setAnteriorFila(auxiliar);
                }
            }
        }
    }

        public void InsertarColumna(int Y){
        auxiliar=Inicio.getSiguienteColumna();
        NodoCabecera nuevo=new NodoCabecera(0,Y);
        if(auxiliar==null){
            Inicio.setSiguienteColumna(nuevo);
            nuevo.setAnteriorColumna(Inicio);
        }else{
            if(auxiliar.getColumna()>Y){
                auxiliar.setAnteriorColumna(nuevo);
                nuevo.setAnteriorColumna(Inicio);
                nuevo.setSiguienteColumna(auxiliar);
                Inicio.setSiguienteColumna(nuevo);
            }else{
                while(auxiliar.getSiguienteColumna()!=null){
                    if(auxiliar.getSiguienteColumna().getColumna()>Y){
                        nuevo.setAnteriorColumna(auxiliar);
                        nuevo.setSiguienteColumna(auxiliar.getSiguienteColumna());
                        auxiliar.getSiguienteColumna().setAnteriorColumna(nuevo);
                        auxiliar.setSiguienteColumna(nuevo);
                        break;
                    }
                    auxiliar=auxiliar.getSiguienteColumna();
                }
                if(auxiliar.getSiguienteColumna()==null){
                    auxiliar.setSiguienteColumna(nuevo);
                    nuevo.setAnteriorColumna(auxiliar);
                }
            }
        }
    }
    /**
     * @return the Inicio
     */
    public NodoCabecera getInicio() {
        return Inicio;
    }

    /**
     * @param Inicio the Inicio to set
     */
    public void setInicio(NodoCabecera Inicio) {
        this.Inicio = Inicio;
    }
}
