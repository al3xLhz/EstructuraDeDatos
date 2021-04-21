
package Estructuras;

public class Pila<E> {
    //Atributos
    int longitud;
    Nodo<E> cima;
    
    
    public Pila() {
        this.longitud = 0; //por defecto tiene que ser 0
        this.cima = null; //por defecto null
    }

    public int getLongitud() {
        return longitud;
    }

    public E getCima() {//Retorna la direccion del objeto que está primero o en la cima
        return cima.objeto;
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
    
    public void Recorrido(){//Corroborar la existencia y los valores que tiene
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
    
    public void copiarDatos(Pila p){// Lo usamos para copiar en una Pila auxiliar para que no afecte a la principal
        Nodo<E> aux = p.cima;
        while(aux !=null){
            Apilar(aux.objeto);
            aux = aux.siguiente;
        }
        
    }
    
    public void agregarPilaDebajoDeLaPila(Pila e){ //Cuando quieres concatenar una Pila a otra Pila
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
    
    public String ConvertirAString(){//Convierte la pila en un string conectado por guiones
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