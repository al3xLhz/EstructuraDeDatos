
package Modelo;

public class Lista {
    
    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    
    public Lista(){
        primero=null;
        ultimo=null;
    }
}

class Nodo{
    private Object objeto; //saber si puedo hacerlo general 
    private Nodo siguiente;//para comenzar en usarlo en cualquier clase
}