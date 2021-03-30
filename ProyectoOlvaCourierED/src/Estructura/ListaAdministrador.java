
package Estructura;

import Modelo.*;

public class ListaAdministrador {
    
    NodoAdministrador primero = new NodoAdministrador();
    NodoAdministrador ultimo = new NodoAdministrador();
    public ListaAdministrador(){
        primero=null;
        ultimo=null;
    }
    
    
    public void InsertarNodo(Administrador a){
        NodoAdministrador nuevo = new NodoAdministrador();
        nuevo.a = a;
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
        NodoAdministrador aux=primero;
        if(aux!=null){
            while(aux!=null){
                System.out.println(aux.a.getNombres());
                aux = aux.siguiente;
            }
            
        }
        
    }
}

class NodoAdministrador{
    Administrador a; 
    NodoAdministrador siguiente;
    
}

    
    



