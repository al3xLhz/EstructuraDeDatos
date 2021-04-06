/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasPlantillas;


public class Nodo<E> {
    //Atributos
    public int objeto;
    public Nodo<E> siguiente;
    public Nodo<E> anterior; //Pertenece al NodoDoble para ListaDoble
    
    //NodoSimple
    //Para LISTA,PILA,COLA
    //Constructor para insertar al final
    public Nodo(int objeto){
        this.objeto = objeto;
        this.siguiente = null;
        this.anterior = null; //Constructores para NodoSimple,siempre null a "anterior"
    }
    
}
    
    
    
    
    
    
    
    
    
   