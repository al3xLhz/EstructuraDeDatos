
package Estructuras;

public class Cola<E> {
    
    int tamaño;
    Nodo<E> primero,ultimo;
    
    public Cola(){
    //CrearCola()
        this.tamaño = 0;
        this.primero = null;
        this.ultimo = null;
    }
    
    public int getTamaño() {
        return tamaño;
    }

    public Nodo<E> getPrimero(){//Devuelve el nodo de la primera posicion
        return primero;
    }

    public E getUltimo() {//Devuelve el nodo de la ultima posicion
        return ultimo.objeto;
    }
    
    public boolean colaVacia(){ //Determina si la cola esta vacia
        return primero == null;
    }    
    
    public void encolar(E informacion){// Ingresa un nodo en la ultima posicion
       Nodo<E> nuevo = new Nodo<>(informacion); //Crea un nodo
        if(colaVacia()){
            primero = nuevo;
        }
        else{
            ultimo.siguiente = nuevo; //El ultimo elemento apunta al nuevo nodo creado
        }
        ultimo = nuevo;
        tamaño++;
    }
      
    public E desencolar()throws NullPointerException{ // Saca el nodo de la primera posicion
        try{    
            E objeto = null;
            objeto = primero.objeto;
            primero = primero.siguiente;
            tamaño--;
            return objeto;
        }
        catch(NullPointerException e){
            System.out.println("Error.Cola vacía");
        }
        return null;
    }
    
    public void Recorrido(){//NullPointerException
        if(colaVacia()){
            System.out.println("Error.Cola vacía");
        }
        else{
            Nodo<E> aux = primero;
            while(aux != null){
                System.out.println(aux.objeto.toString());//"aux.objeto"
                aux = aux.siguiente;
            }
        }
    }
    
    public void copiarDatosA(Cola c){// Lo usamos para copiar en una Cola auxiliar para que no afecte a la principal
        Nodo<E> aux = c.primero;
        while(aux !=null){
            encolar(aux.objeto);
            aux = aux.siguiente;
        }
        
    }
    
    public void eliminarUltimoIngreso(){// Se elimina el ultimo nodo ingresado
        Nodo<E> aux=ultimo;
        ultimo = ultimo.anterior;
        aux = null;
        
        tamaño--;
    }
    
    public void acumularCola(Cola c){ //Cuando quieres concatenar un cola a otra cola
        Nodo<E> aux = c.primero;
        while(aux !=null){
        encolar(aux.objeto);
        aux = aux.siguiente;
        }
    }
    
    
    
}
