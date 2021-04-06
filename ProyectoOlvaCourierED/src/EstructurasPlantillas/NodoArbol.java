/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasPlantillas;

/**
 *
 * @author Miguel
 * @param <E>
 */
public class NodoArbol<E>{
    E objeto;
    int valor; //Para ordenarlos de acuerdo a un AB
    int FE; //Factor de equilibrio;Usado para ArbolAVL
    NodoArbol padre; //Considerar si agregar o no
    NodoArbol izq;
    NodoArbol der;

    public NodoArbol(E objeto,int valor){
        //Constructor de NodoArbol para ArbolBinario
        this.objeto = objeto;
        this.valor = valor;
        this.FE = 1;
        this.padre = null;
        this.izq = null;
        this.der = null;
        
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
