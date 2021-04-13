
package EstructurasPlantillas;


public class Lista {
    int tamaño;
    Nodo inicio;
    Nodo fin;
    
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean listaVacia(){
        return inicio == null;
    }
    
    public void insertarNodoPorInicio(int valor){
        if(listaVacia()){ //No hay nodos
            inicio = fin = new Nodo(valor);
        }
        else{
            fin.siguiente = new Nodo(valor);
        }
    }
}
