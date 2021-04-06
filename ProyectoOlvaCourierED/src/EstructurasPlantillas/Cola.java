/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasPlantillas;


public class Cola<E> {
    //Atributos
    int tamaño;
    Nodo primero,ultimo;
    
    public Cola(){
        this.primero = null;
        this.ultimo = null;
    }
   
    public Nodo getPrimero() {
        return primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }
    
    public boolean colaVacia(){
        return primero == null;
    }    
    
    public void encolar(int informacion){
       Nodo nuevo = new Nodo(informacion);
        if(colaVacia()){
            primero = nuevo; //c.prim=nuevoNodo
        }
        else{
            ultimo.siguiente = nuevo; //Hace que el ultimo elemento apunte al nuevo creado
        }
        ultimo = nuevo;
    }
      
    public Nodo desencolar(){
        
        Nodo aux = primero;
        primero=primero.siguiente;
        
        return aux;
    }
   
}
