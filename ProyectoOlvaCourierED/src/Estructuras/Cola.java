
package Estructuras;

public class Cola<E> {
    //Atributos
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

    public Nodo<E> getPrimero() {//Devuelven un objeto tipo NODO.
        //Cambiando Nodo por "E"
        //Cambiando "primero" por "primero.objeto"
        //Se cambia el objeto de retorno
        return primero;
    }

    public E getUltimo() {
        return ultimo.objeto;
    }
    
    public boolean colaVacia(){
        return primero == null;
    }    
    
    public void encolar(E informacion){
       Nodo<E> nuevo = new Nodo<>(informacion);
        if(colaVacia()){
            primero = nuevo; //c.prim=nuevoNodo
        }
        else{
            ultimo.siguiente = nuevo; //Hace que el ultimo elemento apunte al nuevo creado
        }
        ultimo = nuevo;
        tamaño+=1; 
    }
      
    public E desencolar()throws NullPointerException{//NullPointerException
        try{    
            E objeto = null;
            objeto = primero.objeto;
            primero = primero.siguiente;

            return objeto;
        }
        catch(NullPointerException e){
            System.out.println("Error.Cola vacía");
        }
        return null;
    }
    
    public void borrar(){//NullPointerException
    //Elimina el nodo de primera posición.Sin retornar
        Nodo<E> auxiliar;
        if(colaVacia()){
            System.out.println("Error.Cola vacía");
        }
        else{
            auxiliar = primero;
            primero = primero.siguiente;
            auxiliar.siguiente = null;
            auxiliar = null;
        }
    }
    
    public void Recorrido(){//NullPointerException
        if(colaVacia()){
            System.out.println("Error.Cola vacía");
        }
        else{
            Nodo<E> aux = primero;
            while(aux != null){
            //Se pueden agregar instrucciones
                System.out.println(aux.objeto.toString());//"aux.objeto"
            //es la dirección que se puede retornar a cada momento.
            //Modificando la cantidad de llamadas usando variable "tamaño"
                aux = aux.siguiente;
            }
        }
    }
    
    public void copiarDatos(Cola c){
        Nodo<E> aux = c.primero;
        while(aux !=null){
            encolar(aux.objeto);
            aux = aux.siguiente;
        }
        
    }
    
    public void eliminarUltimoIngreso(){
        Nodo<E> aux=ultimo;
        ultimo = ultimo.anterior;
        aux = null;
        
        tamaño--;
    }
    
    public void acumularCola(Cola c){
        Nodo<E> aux = c.primero;
        while(aux !=null){
        encolar(aux.objeto);
        aux = aux.siguiente;
        }
    }
    
}
