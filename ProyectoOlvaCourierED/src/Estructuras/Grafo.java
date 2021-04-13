/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class Grafo {
    
    final int MAX = 100; //máximo numero de vértices
    final int INFINITO = 1<<30; //definimos un valor grande que represente 
    //la distancia infinita inicial, basta conque sea superior al maximo valor del peso en alguna de las aristas
    int V; //n° de vertices
    List<List<Node>> listaAdyacencias = new ArrayList<>(); //Lista de adyacencia  
    public Grafo(int V,int E,int relacionAristas[][]){
        //n° de aristas(origen,destino,peso)
        this.V = V;
        for(int i = 0;i <= V;i++){
            listaAdyacencias.add(new ArrayList<>());
        }
        for(int i = 0;i < E;i++){//49=E
            agregarArista(relacionAristas[i][0],relacionAristas[i][1],relacionAristas[i][2]);
        }
    }

    void agregarArista(int origen,int destino,int peso){
        listaAdyacencias.get(origen).add(new Node(destino,peso));//grafo diridigo
        //get(origen):Obtiene la dirección del vertice 
        //add(new Node(destino,peso)):Se le agrega al nodo una arista
    }
    
    class Node implements Comparable<Node>{
        //se puede agregar objetos
        int destino, peso;
        Node(int destino,int peso ){                          
        //constructor
            this.destino = destino;
            this.peso = peso;
        }
        Node(int destino){
        //constructor sin peso
            this.destino = destino;
            this.peso = 0;
        }
        @Override
        public int compareTo(Node otro){              
        //definición de un comparador para garantizar el funcionamiento 
        //de la PriorityQueue
            if(peso > otro.peso) return 1;
            if(peso == otro.peso) return 0;
            return -1;
        }

        int getDestino() {
            return destino;
        }

       int getPeso() {
            return peso;
        }
    }
    
    public void Dijkstra(int inicio,int fin){
        int distancia[ ] = new int[ MAX ];//distancia[ u ] distancia de vértice inicial a vértice con ID = u
        boolean visitado[ ] = new boolean[ MAX ];//para vértices visitados
        int previo[] = new int[ MAX ];//para la impresion de caminos
        PriorityQueue< Node > ColaPrioritaria = new PriorityQueue<>();
        
        for( int i = 0 ; i <= V ; ++i ){
            distancia[i] = INFINITO;  //inicializamos todas las distancias con valor infinito
            visitado[i] = false; //inicializamos todos los vértices como no visitados
            previo[i] = -1;      //inicializamos el previo del vertice i con -1
        }
        ColaPrioritaria.add(new Node(inicio,0));//Insertamos el vértice inicial en la Cola de Prioridad
        distancia[inicio] = 0;      //Este paso es importante, inicializamos la distancia del inicial como 0
        int actual , adyacente , peso;
        while(!ColaPrioritaria.isEmpty()){//Mientras cola no este vacia
            actual = ColaPrioritaria.element().destino;//Obtengo de la cola el nodo con menor peso, en un comienzo será el inicial
            ColaPrioritaria.remove();//Sacamos el elemento de la cola
            if(visitado[actual]) {
        //Si el vértice actual ya fue visitado entonces sigo sacando elementos de la cola
                continue;
            }
            visitado[actual] = true;//Marco como visitado el vértice actual
            
            for(int i = 0;i < listaAdyacencias.get(actual).size();++i){//reviso sus adyacentes del vertice actual
                adyacente = listaAdyacencias.get(actual).get(i).destino;//id del vertice adyacente
                peso = listaAdyacencias.get(actual).get(i).peso;//peso de la arista que une actual con adyacente:(actual,adyacente)
                if(!visitado[adyacente]){//si el vertice adyacente no fue visitado
                    //realizamos el paso de relajacion
                    //Si la distancia del origen al vertice actual + peso de su arista es menor a la distancia del origen al vertice adyacente
                    if(distancia[actual] + peso < distancia[adyacente]){
                        distancia[adyacente] = distancia[actual] + peso;  //proceso de relajación del vertice, al actualizar la distancia
                        previo[adyacente] = actual;                         //a su vez se actualiza el vertice previo
                        ColaPrioritaria.add(new Node(adyacente,distancia[adyacente])); //se agrega adyacente a la cola de prioridad
                    }
                }
            }
        }
        //Distancias mas cortas iniciando en el vertice inicial
        /*
        for( int i = 1 ; i <= V ; ++i ){
            System.out.printf("Vertice %d , distancia mas corta = %d\n" , i , distancia[ i ] );
        }*/

        imprimirRuta(fin,previo);
    }
    void imprimirRuta(int destino,int previo[]){
            if( previo[destino]!= -1)    //si aun poseo un vertice previo
                imprimirRuta(previo[destino],previo);  //recursivamente sigo explorando
            System.out.printf("%d " , destino ); 
        }
    /*
    public int llenarAdyacencia(){
        int[] linea1 = new int[]{0, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea2 = new int[]{55, 0, 32, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea3 = new int[]{0, 32, 0, 0, 0, 46, 85, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea4 = new int[]{0, 0, 0, 0, 140, 40, 110, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea5 = new int[]{0, 0, 0, 140, 0, 0, 0, 100, 0, 0, 0, 215, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] linea6 = new int[]{0, 80, 46, 40, 0, 0, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea7 = new int[]{0, 0, 85, 110, 0, 70, 0, 85, 50, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea8 = new int[]{0, 0, 0, 70, 100, 0, 85, 0, 0, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea9 = new int[]{0, 0, 0, 0, 0, 0, 50, 0, 0, 95, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] linea10 = new int[]{0, 0, 0, 0, 0, 0, 70, 110, 95, 0, 42, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea11 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 75, 60, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea12 = new int[]{0, 0, 0, 0, 215, 0, 0, 0, 0, 75, 75, 0, 0, 62, 0, 0, 96, 112, 0, 0, 0, 0, 0, 0};
        int[] linea13 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 80, 0, 60, 0, 0, 60, 74, 75, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] linea14 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 45, 62, 60, 0, 0, 59, 121, 0, 0, 122, 0, 0, 0, 0};
        int[] linea15 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 74, 0, 0, 32, 0, 0, 0, 63, 81, 0, 0, 0};
        int[] linea16 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 75, 59, 32, 0, 0, 0, 0, 55, 0, 0, 0, 0};
        int[] linea17 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 96, 0, 121, 0, 0, 0, 98, 47, 130, 105, 91, 0, 0};
        int[] linea18 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 112, 0, 0, 0, 0, 98, 0, 0, 0, 0, 101, 0, 0};
        int[] linea19 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 47, 0, 0, 44, 67, 0, 0, 0};
        int[] linea20 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 122, 63, 55, 130, 0, 44, 0, 82, 0, 0, 0};
        int[] linea21 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 81, 0, 105, 0, 67, 82, 0, 92, 60, 0};
        int[] linea22 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 91, 101, 0, 0, 92, 0, 72, 89};
        int[] linea23 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 60, 72, 0, 26};
        int[] linea24 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 89, 26, 0};
        int[][] lineaVertical = new int[][]{linea1, linea2, linea3, linea4, linea5, linea6, linea7, linea8, linea9, linea10, linea11, linea12, linea13, linea14, linea15, linea16, linea17, linea18, linea19, linea20, linea21,linea22,linea23,linea24};
    }
    */
    
}



