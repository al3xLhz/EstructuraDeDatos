
package Estructuras;

public class Nodo<E> {
    //Atributos
    public E objeto;
    public Nodo<E> siguiente;
    public Nodo<E> anterior; //Pertenece al NodoDoble para ListaDoble
    
    //NodoSimple
    //Para LISTA,PILA,COLA
    //Constructor para insertar al final
    public Nodo(E objeto){
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
    //NodoDoble
    //Para LISTADOBLE
    //Constructor para nodo si no hay nodos previos
    /*public Nodo(E objeto){
        this.objeto = objeto;
        this.siguiente = null;
        this.anterior = null;
    */
    //Es igual al constructor para insertar al final.Usar ese
    //Constructor para nodoDoble si no hay nodos previos
    //             izquierda       objeto       derecha
    public Nodo(Nodo anterior,E objeto,Nodo siguiente){
        this.objeto = objeto;
        this.siguiente = siguiente;
        this.anterior = anterior;   
    }
    //objeto,derecha,izquierda
    public E getInformacion() {
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