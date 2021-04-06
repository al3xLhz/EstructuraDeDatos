
package Estructura;

import Modelo.*;

public class ListaPedidos {
    NodoPedido primero = new NodoPedido();
    NodoPedido ultimo = new NodoPedido();
    
    public ListaPedidos(){
        primero=null;
        ultimo=null;
    }
    
    
    public void InsertarNodo(Pedido p){
        NodoPedido nuevo = new NodoPedido();
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
    
    public Pedido getPedidoXPos(int pos){
        Pedido pe=null;
        NodoPedido aux= primero;
        int contador=0;
        while(aux!=null){
            if(contador==pos){
                pe = aux.p;
            }
            aux=aux.siguiente;
            contador++;
        }
        return pe;
    }
    
    public void vaciarLista(){
        primero=null;
        ultimo=null;
    }
    
}

class NodoPedido{
    Pedido p; 
    NodoPedido siguiente;
    
}