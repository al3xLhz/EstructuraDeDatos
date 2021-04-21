
package Estructuras;

public class NodoArbol<E> {
    E objeto;
    int valor; //Para ordenarlos de acuerdo a un AB
    int FE; //Factor de equilibrio;Usado para ArbolAVL
    NodoArbol padre; //Considerar si agregar o no
    NodoArbol izq;
    NodoArbol der;
    int altura;
    
    public NodoArbol(E objeto,int valor){
        this.objeto = objeto;
        this.valor = valor;
        this.FE = 1;
        int size; 
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
    public int nodosCompletos(NodoArbol n) {
        if (n == null)
            return 0;
        else {
            if (n.izq != null && n.der != null)
                return nodosCompletos(n.izq) + nodosCompletos(n.der) + 1;
            return nodosCompletos(n.izq) + nodosCompletos(n.der);
        }
    }

    public E getObjeto() {
        return objeto;
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
