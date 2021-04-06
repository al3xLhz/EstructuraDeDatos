
package Estructura;

import Modelo.*;

public class ListaCliente { //implements Lista
    
    NodoCliente primero = new NodoCliente();
    NodoCliente ultimo = new NodoCliente();
    public ListaCliente(){
        primero=null;
        ultimo=null;
    }
    
    
    public void InsertarNodo(Cliente c){
        NodoCliente nuevo = new NodoCliente();
        nuevo.c = c;
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
        NodoCliente aux=primero;
        if(aux!=null){
            while(aux!=null){
                System.out.println(aux.c.getNombres());
                aux = aux.siguiente;
            }
            
        }
        
    }
    
    
}

class NodoCliente{
    Cliente c; 
    NodoCliente siguiente;
    
}

    
    



