
package Estructura;

import Modelo.*;

public class ListaRRHH {
    
    NodoRRHH primero = new NodoRRHH();
    NodoRRHH ultimo = new NodoRRHH();
    public ListaRRHH(){
        primero=null;
        ultimo=null;
    }
    
    
    public void InsertarNodo(RRHH rh){
        NodoRRHH nuevo = new NodoRRHH();
        nuevo.rh = rh;
        if(primero==null){
            primero=nuevo;
            primero.siguiente=null;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=null;
            ultimo = nuevo;
            
        }
    }
    
    public void MostrarLista(){
        NodoRRHH aux=primero;
        if(aux!=null){
            while(aux!=null){
                System.out.println(aux.rh.getNombres());
                aux = aux.siguiente;
            }
            
        }
        
    }
}

class NodoRRHH{
    RRHH rh; 
    NodoRRHH siguiente;
    
}

    
    



