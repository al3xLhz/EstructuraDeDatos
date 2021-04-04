
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
    
    public Producto getProductoXPos(int i){
        Producto pr=null;
        NodoProducto aux= primero;
        int contador=0;
        while(aux!=null){
            if(contador==i){
                pr = aux.p;
            }
            aux=aux.siguiente;
            contador++;
        }
        return pr;
    }
    
    public void vaciarLista(){
        primero=null;
        ultimo=null;
    }
    
}

class NodoProducto{
    Producto p; 
    NodoProducto siguiente;
    
}