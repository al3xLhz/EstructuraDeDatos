
package Estructuras;

public class Pila<E> {
    //Atributos
    int longitud;
    Nodo<E> cima;
    
    
    public Pila() {
    //Constructor = Método CrearPila()
        this.longitud = 0; //por defecto tiene que ser 0
        this.cima = null; //por defecto null
    }

    public int getLongitud() {
    //Obtiene el tamaño actual de la pila
        return longitud;
    }

    public E getCima() {
    //Devuelve la dirección del objeto dentro del NODO que se encuentre en la cima
        return cima.objeto;
    }
    
    //Métodos de Pila
    
    public void vaciarPila(){ //Borrará la conexión con los nodos.Asegurarse de usar 
    //algún similar a destructor para eliminar posible uso de memoria principal.
        cima = null;
        longitud = 0;
    }
    
    public boolean pilaVacia(){//También "return longitud == 0;"
        return cima == null;
    }
    
    public void Apilar(E objeto){
        Nodo<E> nuevo = new Nodo<>(objeto);
        if(longitud == 0){ //Si no hay nodos
            cima = nuevo;
        }
        else{ //Caso contrario
            nuevo.siguiente = cima; //nuevo apunta al nodo de cima
            cima = nuevo; //cima apunta a nuevo
        }
        longitud += 1;
    }
    
    public E Desempilar()throws NullPointerException{//NullPointerException
        try{
            E objeto = cima.objeto;
            cima = cima.siguiente;
            longitud -= 1;
            return objeto;
        }
        catch(NullPointerException e){
            System.out.println("Error.Pila vacía");
        }
        return null;
    }
    
    public void Recorrido(){
        if(pilaVacia()){
            System.out.println("Error.Pila vacía");
        }
        else{
            Nodo<E> aux = cima;
            while(aux != null){
                System.out.println(aux.objeto.toString());
                aux = aux.siguiente;
            }
        }
    }
    
    public void copiarDatos(Pila p){
        Nodo<E> aux = p.cima;
        while(aux !=null){
            Apilar(aux.objeto);
            aux = aux.siguiente;
        }
        
    }
    
    public void agregarPilaDebajoDeLaPila(Pila e){
        Nodo<E> aux = this.cima;
        Nodo<E> aux2 = aux;
        if(pilaVacia()){
            cima=e.cima;
        }else{
            while(aux!=null){
            aux2 = aux;
            aux = aux.siguiente;
            }
        
            aux2.siguiente=e.cima.siguiente;
            e.cima.siguiente.anterior=aux2;
        }
        
    }
    
    public String ConvertirAString(){
        String ruta = "";
        
        if(pilaVacia()){
            System.out.println("Error.Pila vacía");
        }
        else{
            Nodo<E> aux = cima;
            while(aux != null){
                ruta+=aux.objeto.toString()+"-";
                aux = aux.siguiente;
            }
        }        
        
        return ruta;
    }
    
    
}
/*
class ExcepcionListaVacia extends RuntimeException {

    ExcepcionListaVacia() {
        this ("La Pila está vacía");
    }

    ExcepcionListaVacia(String excepcion) {
        super (excepcion);
    }
}*/