/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;
import Estructuras.*;
import java.io.Serializable;


public class DijkstraMapa implements Serializable {
    private final GrafoMapa grafo;
    private int subTope;
    private int auxAcumulado;
    private int subAcumulado;
    private NodoGrafo nodos[];
    private int tope;
    private int permanente;
    private int nodoFin;
    private int nodoInicio;
    
    public DijkstraMapa(GrafoMapa grafo,int nodoInicio, int nodoFin){//Tope numero de vertices
        this.grafo = grafo;        
        this.tope = grafo.getCantidadMax();
        this.nodos= new NodoGrafo[tope]; 
        this.permanente = nodoInicio;
        this.nodoInicio = nodoInicio;
        this.nodoFin = nodoFin; 
    }
    
    public void dijkstra(){
        for (int i = 0; i < tope; i++){  // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
            nodos[i]= new NodoGrafo();
        } 
        if(permanente != nodoFin){
            nodos[permanente].setVisitado(true);        
            nodos[permanente].setNombre(permanente);
            do{            
                subAcumulado=0;
                auxAcumulado=9999; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
                nodos[permanente].setEtiqueta(true); 
                for (int j = 0; j < tope; j++) {
                    if(grafo.getmAdyacencia(permanente, j)>=1){
                        subAcumulado= nodos[permanente].getAcumulado()+grafo.getmAdyacencia(permanente,j);                                
                        if(subAcumulado <= nodos[j].getAcumulado() && nodos[j].isVisitado()==true && nodos[j].isEtiqueta()== false){
                            nodos[j].setAcumulado(subAcumulado);
                            nodos[j].setVisitado(true);
                            nodos[j].setNombre(j);
                            nodos[j].setPredecesor(nodos[permanente]);
                        }
                        else if( nodos[j].isVisitado()==false){
                            nodos[j].setAcumulado(subAcumulado);
                            nodos[j].setVisitado(true);
                            nodos[j].setNombre(j);
                            nodos[j].setPredecesor(nodos[permanente]); 
                        }
                    }
                }
                for (int i = 0; i <tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                    if(nodos[i].isVisitado()== true && nodos[i].isEtiqueta()== false){
                        if(nodos[i].getAcumulado()<=auxAcumulado){
                            permanente= nodos[i].getNombre();
                            auxAcumulado= nodos[i].getAcumulado();
                        }
                    }               
                }
                    subTope++;                
            }while(subTope<tope+1);
        }
            
        
    }
    
    public void imprimirRuta(){
        
        Pila<NodoGrafo> pila= new Pila<>();
        NodoGrafo auxL = nodos[nodoFin];
        
        do{
           // System.out.println(auxL.getNombre());
            pila.Apilar(auxL);; 
            auxL=auxL.getPredecesor();
           
        }while(auxL.getNombre()!=nodoInicio);
        System.out.println(nodoInicio);
        while(!pila.pilaVacia()){
            
            System.out.println(pila.Desempilar().getNombre());
            
        }
    }
    
    
}
