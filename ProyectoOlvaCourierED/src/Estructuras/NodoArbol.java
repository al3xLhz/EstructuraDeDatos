
package Estructuras;

public class NodoArbol<E> {
    E objeto;
    int valor; //Para ordenarlos de acuerdo a un AB
    int FE; //Factor de equilibrio;Usado para ArbolAVL
    NodoArbol padre; //Considerar si agregar o no
    NodoArbol izq;
    NodoArbol der;
    
    public NodoArbol(E objeto,int valor){
        this.objeto = objeto;
        this.valor = valor;
        this.FE = 1;
        this.padre = null;
        this.izq = null;
        this.der = null; //Constructores para NodoSimple,siempre null a "anterior"
    }

    public NodoArbol(E objeto, int FE, NodoArbol padre, NodoArbol izq, NodoArbol der) {
        this.objeto = objeto;
        this.FE = FE;
        this.padre = padre;
        this.izq = izq;
        this.der = der;
    }
    
    
    public NodoArbol<E> getIzq(){
        return izq; 
    }

    public NodoArbol<E> getDer() {
        return der;
    }

    public NodoArbol<E> getPadre() {
        return padre;
    }
    
}
