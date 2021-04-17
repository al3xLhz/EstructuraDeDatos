/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;
import Estructuras.*;


public class DijkstraMapa {
    private GrafoMapa grafo;
    private int subTope;
    private int auxAcumulado;
    private int subAcumulado;
    private NodoGrafo nodos[];
    private int tope;
    private int permanente;
    private int nodoFin;
    private int nodoInicio;
    private Pila pila;
    private Cola cola;
    
    public DijkstraMapa(GrafoMapa grafo){//Tope numero de vertices
        this.grafo = grafo;        
        this.tope = grafo.getCantidadMax();
        this.nodos= new NodoGrafo[tope];
        llenarNodos();
    }

    public GrafoMapa getGrafo() {
        return grafo;
    }

    public void setGrafo(GrafoMapa grafo) {
        this.grafo = grafo;
    }

    public int getNodoFin() {
        return nodoFin;
    }

    public void setNodoFin(int nodoFin) {
        this.nodoFin = nodoFin;
    }

    public int getNodoInicio() {
        return nodoInicio;
    }

    public void setNodoInicio(int nodoInicio) {
        this.permanente = nodoInicio;
        this.nodoInicio= nodoInicio;
    }

    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila pila) {
        this.pila = pila;
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }
    
    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }
  
    public void dijkstra(){
        subTope=0;
        
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
    
    public void empilar(){
        pila = new Pila();
        
        NodoGrafo auxL = nodos[nodoFin];
        
        do{
            //System.out.println(auxL.getNombre());
            
            pila.Apilar(auxL.getNombre());
            auxL=auxL.getPredecesor();  
        }while(auxL.getNombre()!=nodoInicio);
        //System.out.println(auxL.getNombre());
        pila.Apilar(nodoInicio);
        //System.out.println("n: "+pila.getLongitud());
        //pasarPilaACola();
        //cola.Recorrido();
    }
    
    public void llenarNodos(){
        for (int i = 0; i < tope; i++){  // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
            nodos[i]= new NodoGrafo();
        } 
    }
    
    private void pasarPilaACola(){
        
        Pila pilaaux= new Pila();
        pilaaux = pila;
        cola = new Cola();
        int c=0;
 
        while(c!=pilaaux.getLongitud()){
            cola.encolar(pilaaux.Desempilar());
            c++;
        }
        
        
    }
    
    
   
    
    
}
