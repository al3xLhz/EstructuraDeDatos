
package Estructura;

import Modelo.Boleta;


public class ListaBoleta {
    
    NodoBoleta primero = new NodoBoleta();
    NodoBoleta ultimo = new NodoBoleta();
    
    public ListaBoleta(){
        primero=null;
        ultimo=null;
    }
    
    
    public void InsertarNodo(Boleta b){
        NodoBoleta nuevo = new NodoBoleta();
        nuevo.b = b;
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
    
    public Boleta getBoleta(int nroBoleta){
        NodoBoleta aux=primero;
        Boleta boletaR = null;
        
        while(aux!=null){
            if(aux.b.getCodigo()==nroBoleta){
                boletaR=aux.b;
            }
            aux=aux.siguiente;
        }
        
        return boletaR;
        
    }
    
}

class NodoBoleta{
    Boleta b; //saber si puedo hacerlo general 
    NodoBoleta siguiente;//para comenzar en usarlo en cualquier clase
    
}

    
    

