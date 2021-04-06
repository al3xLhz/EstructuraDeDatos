
package EstructurasPlantillas;

public class ListaDoble<E> {
    //Atributos
    int tamaño;
    Nodo<E> inicio;
    Nodo<E> fin;
    
    //Método ListaDoble
    
    //CrearListaDoble
    public ListaDoble(){
        this.tamaño = 0;
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean listaVacia(){
    //"return tamaño == 0"
        return inicio == null;
    }
    
    public void insertarNodoPorInicio(int objeto){
        if(listaVacia()){
            inicio = fin = new Nodo(objeto);
        }
        else{
            inicio.siguiente.anterior=inicio;
        }
    }
    
    public void recorrerListaInicio(){
        if(listaVacia()){
            System.out.println("Lista Vacia");
        }
        else{
            Nodo aux = inicio;
            while(aux != null){
                //Agregar instrucciones
                System.out.println(aux.objeto);
                aux = aux.siguiente;
            }
        }
    }
    
      
}
