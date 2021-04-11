/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;
import java.awt.Color;
import java.io.Serializable;
import javax.swing.JOptionPane;


public class DijkstraMapa implements Serializable {
    private final GrafoMapa grafo;
    private int subTope;
    private NodoGrafo aux = null;
    private int auxAcumulado;
    private int subAcumulado;
    private NodoGrafo nodos[];
    private int tope;
    private int permanente;
    private int nodoFin;
    
    public DijkstraMapa(GrafoMapa grafo, int tope,int nodoInicio, int nodoFin){//Tope numero de vertices
        this.grafo = grafo;        
        this.tope = tope;
        this.nodos= new NodoGrafo[tope]; 
        this.permanente = nodoInicio;
        this.nodoFin = nodoFin; 
    }
    
    public void dijkstra(){
        for (int i = 0; i < tope; i++){  // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
            nodos[i]= new NodoGrafo();
        } 
        if(permanente != nodoFin){
            //panelRuta.paint(panelRuta.getGraphics());
            //R_repaint(tope, grafo);   
            //Pintar.clickSobreNodo(panelRuta.getGraphics(), grafo.getCoordeX(permanente), grafo.getCoordeY(permanente), null,Color.GREEN); // pinta de color GREEN los nodos
            nodos[permanente].setVisitado(true);        
            nodos[permanente].setNombre(permanente);
            do{            
                subAcumulado=0;
                auxAcumulado=9999; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
                nodos[permanente].setEtiqueta(true); 
                for (int j = 0; j < tope; j++) {
                    if(grafo.getmAdyacencia(j, permanente)==1){
                        subAcumulado= (nodos[permanente].getAcumulado()+grafo.getmAdyacencia(j,permanente));                                
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
            aux= nodos[nodoFin]; 
            //if(aux.getPredecesor() == null )JOptionPane.showMessageDialog(null,"No se Pudo LLegar Al Nodo "+nodoFin);          
            //while(aux.getPredecesor() != null){           
            //    Pintar.pintarCamino(panelRuta.getGraphics(), grafo.getCoordeX(aux.getNombre()), grafo.getCoordeY(aux.getNombre()), grafo.getCoordeX(aux.getPredecesor().getNombre()), grafo.getCoordeY(aux.getPredecesor().getNombre()),Color.GREEN);
             //   Pintar.clickSobreNodo(panelRuta.getGraphics(), grafo.getCoordeX(aux.getNombre()), grafo.getCoordeY(aux.getNombre()), null,Color.GREEN);
            //    aux=aux.getPredecesor();              
            //}  
            //Pintar.clickSobreNodo(panelRuta.getGraphics(), grafo.getCoordeX(nodoFin), grafo.getCoordeY(nodoFin), null,Color.GREEN);     
        }
            //else{Pintar.clickSobreNodo(panelRuta.getGraphics(), grafo.getCoordeX(nodoFin), grafo.getCoordeY(nodoFin), null,Color.GREEN);}
        
    }
    
    
    
    public int getAcumulado(){
        return nodos[nodoFin].getAcumulado(); 
    }
    public NodoGrafo[] getNodos(){
        return this.nodos;
    }
}
