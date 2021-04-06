/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasPlantillas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**

 * @author Miguel
 */
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
        for(int i = 0;i < E;i++){
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
    //Revisar
    public void BFS(int nodo){
        boolean visitado[] = new boolean[V];
        LinkedList<Integer> lista = new LinkedList();
        visitado[nodo] = true;
        lista.add(nodo);
        while(lista.size() != 0){
            nodo = lista.poll();
            System.out.println(nodo + " ");
            Iterator<Node> i = listaAdyacencias.get(nodo).listIterator();
            while(i.hasNext()){
                Node n = i.next();
                if(!visitado[n.destino]){
                    visitado[n.destino]=true;
                    lista.add(n.destino);
                }
            }
        }
    }
    public void BFSpruebita(int nodo){
        boolean estado[] = new boolean[V];
        int distancia[] = new int[V] ;
        int padre[] = new int[V];
        for (int i=0;i<V;i+=i){
            estado[i] = false; //No visitado
            distancia[i] = 1<<30; //Infinito
            padre[i] = -1; //null
        }
        estado[nodo] = true;
        distancia[nodo] = 0;
        padre[nodo] = -1;
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(nodo);
        while(!cola.isEmpty()){
            nodo = cola.poll();
            //obtenemos el enlace a los
            //nodos adyacentes del "nodo"
            for(int v=0;v<listaAdyacencias.get(nodo).size();v+=1){
                if(estado[v] == false){
                    estado[v] = true;
                    distancia[v] = distancia[nodo]+1;
                    padre[v] = nodo;
                    cola.offer(v);
                }
            }
        }
    }
    //Revisar
    public void DFS(int nodo){
        boolean visitado[] = new boolean[V+1];
        visitado[nodo] = true;
        System.out.print(nodo + " ");

        Iterator<Node> i = listaAdyacencias.get(nodo).listIterator();
        while(i.hasNext()) {
            Node adj = i.next();
            if (!visitado[adj.destino]){
                DFS(adj.destino);
            }
        }
    }
}
