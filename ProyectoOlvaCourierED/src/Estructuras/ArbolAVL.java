/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Junior Jose
 */
import Modelo.*;

public class ArbolAVL<E> {
    //Atributos
    NodoArbol<E> raiz;
    int numNodos = 0;
    
    public void insertar(E objeto,int valor){
       raiz = insertar(raiz,objeto,valor);
    }
    private NodoArbol<E> insertar(NodoArbol<E> nodo,E objeto,int valor){
        
        if(nodo == null){
            nodo = new NodoArbol<>(objeto, valor);
        }

        if(valor>nodo.valor){
            nodo.der = insertar(nodo.der,objeto,valor);
        }
        else{
            if(valor<nodo.valor){
                nodo.izq = insertar(nodo.izq,objeto,valor);
            }
        }
        nodo.FE = Math.max(FE(nodo.izq),FE(nodo.der))+1;
        int bf = BF(nodo);
        //Caso LL
        if(bf>1 && valor<nodo.izq.valor){
            return rotacionDerecha(nodo);
        }
        //Caso RR
        if(bf<-1 && valor>nodo.der.valor){
            return rotacionIzquierda(nodo);
        }
        //Caso LR
        if(bf>1 && valor>nodo.der.valor){
            nodo.izq = rotacionIzquierda(nodo.izq);
            return rotacionDerecha(nodo);
        }
        //Caso RL
        if(bf<-1 && valor<nodo.izq.valor){
            nodo.der = rotacionDerecha(nodo.der);
            return rotacionIzquierda(nodo);
        }
        return nodo;
    }
    public void mostrar(){
        mostrar(raiz);
    }
    private void mostrar(NodoArbol<E> nodo){
        if(nodo.izq == null){
            
        }
    }
    private int FE(NodoArbol<E> nodo){
        if(nodo == null){
            return 0;
        }
        return nodo.FE;
    }
    private int BF(NodoArbol<E> nodo){
        if(nodo == null) {
            return 0;
        }
        return FE(nodo.izq) - FE(nodo.der);
    }
    private NodoArbol<E> rotacionDerecha(NodoArbol<E> c){
        NodoArbol<E> b = c.izq;
        NodoArbol<E> T3 = b.der;
        //RotaciÃ³n
        b.der = c;
        c.izq = T3;
        //actualizando FE
        c.FE = Math.max(FE(c.izq),FE(c.der))+1;
        b.FE = Math.max(FE(b.izq),FE(b.der))+1;
        return b;
    }
    private NodoArbol<E> rotacionIzquierda(NodoArbol<E> c){
        NodoArbol<E> b = c.der;
        NodoArbol<E> T2 = b.izq;
        //RotaciÃ³n
        b.izq = c;
        c.der = T2;
        //actualizando FE
        c.FE = Math.max(FE(c.izq),FE(c.der))+1;
        b.FE = Math.max(FE(b.izq),FE(b.der))+1;
        return b;
    }
    
    public void busquedaArbol(NodoArbol<E> nodo,int valor){
        if(nodo!= null){
            if(valor< nodo.valor){
                busquedaArbol(nodo.izq, valor);
            }else{
                if(valor>nodo.valor){
                busquedaArbol(nodo.der, valor);
                }
                else{
                    System.out.println("El cliente SI se encuentra en el arbol");
                }
            }
        }
    }
    
    public void mostrarArbol (NodoArbol<E> nodo,int n){
        if(nodo== null)
          return;
        mostrarArbol(nodo.der, n+1);

     for(int i=0; i<n; i++)
	  System.out.println("     ");
           numNodos++;
        System.out.println(nodo.valor);
   	System.out.println("");

     mostrarArbol(nodo.izq, n+1);
    }
    /*
    public void mostrarArbolOtracosa(NodoArbol<E> nodo,int n){
        if(nodo== null)
          return;
        mostrarArbol(nodo.der, n+1);

     for(int i=0; i<n; i++)
	  System.out.println("     ");
           numNodos++;
           Boleta bolAux = (Boleta) nodo.objeto;
        System.out.println(bolAux.ge);
   	System.out.println("");

     mostrarArbol(nodo.izq, n+1);
    }
    */
    public void creacionArbolXLista(Lista Boletas){ 
        
        Nodo<E> aux = Boletas.inicio;
        Boleta boletaAux;
        while(aux!=null){
            boletaAux = (Boleta) aux.objeto;
            insertar((E) boletaAux, boletaAux.getCodigoBoleta());
            aux=aux.siguiente;
        }
        
    }

    public NodoArbol<E> getRaiz() {
        return raiz;
    }
    
    
}
