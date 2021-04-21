
package Estructuras;

public class Nodo<E> {
    //Atributos
    public E objeto;
    public Nodo<E> siguiente;
    public Nodo<E> anterior;
    
    public Nodo(E objeto){//Constructr
        this.objeto = objeto;
        this.siguiente = null;
        this.anterior = null; //Constructores para NodoSimple,siempre null a "anterior"
    }
    //Constructor para insertar al inicio
    public Nodo(E objeto, Nodo<E> siguiente) {
        this.objeto = objeto;
        this.siguiente = siguiente;
        this.anterior = null; //Constructores para NodoSimple,siempre null a "anterior"
    }
    
    public Nodo(){
        this.siguiente = null;
        this.anterior = null; //Constructores para NodoSimple,siempre null a "anterior"
    }
    
    
    public E getInformacion() {//Devuelve el objeto, luego con cast podras acceder a las funcion de la clase casteada
        return objeto;
    }

    public void setInformacion(E objeto) {
        this.objeto = objeto;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}