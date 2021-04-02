
package Estructura;

import Modelo.Producto;


public class ListaProducto {
    NodoProducto primero = new NodoProducto();
    NodoProducto ultimo = new NodoProducto();
    
    public ListaProducto(){
        primero=null;
        ultimo=null;
    }
    
    
    public void InsertarNodo(Producto p){
        NodoProducto nuevo = new NodoProducto();
        nuevo.p = p;
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
    
}

class NodoProducto{
    Producto p; 
    NodoProducto siguiente;
    
}