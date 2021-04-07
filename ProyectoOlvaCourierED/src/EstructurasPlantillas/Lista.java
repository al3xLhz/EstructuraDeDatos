
package EstructurasPlantillas;

import Modelo.Login;
import Modelo.Persona;


public class Lista<E>{
    //Atributos
    int tamaño;
    Nodo<E> inicio;
    Nodo<E> fin;
    
    public Lista(){
    //Constructor
        this.tamaño = 0;
        this.inicio = null;
        this.fin = null;
    }
    //Métodos de Lista
    
    public boolean listaVacia(){
        return inicio == null;
    }
    
    public void insertarNodoPorInicio(E objeto){
        if(listaVacia()){ //No hay nodos
            inicio = fin = new Nodo<>(objeto);
        }
        else{
            inicio = new Nodo<>(objeto,inicio);
        }
        tamaño += 1;
    }
    
    public void insertarNodoPorFinal(E objeto){
        if(listaVacia()){ //No hay nodos
            inicio = fin = new Nodo<>(objeto);
        }
        else{
            fin.siguiente = new Nodo<>(objeto);
            fin = fin.siguiente;
        }
        tamaño += 1;
    }
    
    public void insertarNodoAntesDe(E objeto,E dato)throws NullPointerException{
        //"objeto" es el que irá en el nuevo Nodo que insertarás.
        //"dato" es el objeto que buscará dentro de la lista
        //Nodos Q, T y R son nodos auxiliares
        try{
            Nodo<E> Q = inicio;
            Nodo<E> T = new Nodo<>(null);
            int BAND = 1;
            while(Q.objeto != dato && BAND == 1){
                if(Q.siguiente != null){
                    T = Q;
                    Q = Q.siguiente;
                }
                else{
                    BAND = 0;
                }
            }
            if(BAND == 0){ 
                System.out.println("No existe el nodo que contiene el valor buscado");                
            }
            else{
                Nodo<E> R = new Nodo<>(objeto); //Creación del nuevo Nodo
                if(Q==inicio){ //Si solo hay un nodo
                    R.siguiente = inicio;
                    inicio = R;
                }
                else{
                    T.siguiente = R;
                    R.siguiente = Q;
                }
                tamaño += 1;
            }
        }
        catch(NullPointerException e){
                System.out.println("Error.Lista vacía");
        }
    }
    
    public void insertarNodoDespuesDe(E objeto, E dato)throws NullPointerException{
        //"objeto" es el que irá en el nuevo Nodo que insertarás.
        //"dato" es el objeto que buscará dentro de la lista
        //Nodos Q, T y R son nodos auxiliares
        try{
            Nodo<E> Q = inicio;
            int BAND = 1;
            while(Q.objeto != dato && BAND ==1){
                if(Q.siguiente != null){
                    Q = Q.siguiente;
                }
                else{
                    BAND = 0;
                }
            }
            if(BAND == 0){
                System.out.println("No existe el nodo que contiene el valor buscado");                                
            }
            else{
                Nodo<E> T = new Nodo<>(objeto); //Creación del nuevo Nodo
                T.siguiente = Q.siguiente;
                Q.siguiente = T;
                tamaño += 1;
            }
        }
        catch(NullPointerException e){
            System.out.println("Error.Lista vacía");
        }
    }
    
    public E extraerNodoPorInicio()throws NullPointerException{ //Agregar excepción NullPointer
        try{
            E objeto = inicio.objeto; //Enlace
            if(inicio == fin){ //Lista tiene un nodo 
                inicio = fin = null;
            }
            else{
                inicio = inicio.siguiente;
            }
            tamaño-=1;
            return objeto;//ExceptionNullPointer-Agregar
        }
        catch(NullPointerException e){
            System.out.println("Error.Lista Vacía");
        }
        return null;
    }
    
    public E extraerNodoPorFinal()throws NullPointerException{
        try{
            
            Nodo<E> Q = inicio;
            Nodo<E> T = null;
            for(int i=0;i<tamaño-1;i++){
                Q = Q.siguiente;
            }
            fin = Q;
            T = Q.siguiente; //T contiene la dirección del último nodo
            tamaño -= 1;
            return T.objeto;
            
        }
        catch(NullPointerException e){
            System.out.println("Error.Lista Vacía");
        }
        return null;
    }
    
    public E extraerNodo(E dato) throws NullPointerException{
        try{
            Nodo<E> Q = inicio;
            Nodo<E> T = new Nodo<>(null);
            int BAND = 1;
            while(Q.objeto!=dato && BAND == 1){
                if(Q.siguiente!=null){
                    T = Q;
                    Q=Q.siguiente;
                }
                else{
                    BAND = 0;
                }
            }
            if(BAND == 0){
                System.out.println("No existe el nodo que contiene el valor buscado");
            }
            else{
                if(inicio == Q){//Unico nodo
                    inicio = Q.siguiente;
                }
                else{
                    T.siguiente = Q.siguiente;
                }
                tamaño -= 1;
            }
            return Q.objeto;
        }
        catch(NullPointerException e){
             System.out.println("Error.Lista Vacia");
        }
        return null;
    }
    
    public void eliminarNodo(E dato) throws NullPointerException{
        try{
            Nodo<E> Q = inicio;
            Nodo<E> T = new Nodo<>(null);
            int BAND = 1;
            while(Q.objeto!=dato && BAND == 1){
                if(Q.siguiente!=null){
                    T = Q;
                    Q=Q.siguiente;
                }
                else{
                    BAND = 0;
                }
            }
            if(BAND == 0){
                System.out.println("No existe el nodo que contiene el valor buscado");                    
            }
            else{
                if(inicio == Q){//Unico nodo
                    inicio = Q.siguiente;
                }
                else{
                    T.siguiente = Q.siguiente;
                }
                tamaño -=1;
            }
        }
        catch(NullPointerException e){
            System.out.println("Error. Lista vacía");
        }
    }
    
    public void recorrido(){
        if(listaVacia()){
            System.out.println("Lista Vacia");
        }
        else{
            Nodo<E> aux = inicio;
            while(aux != null){
                //Agregar instrucciones
                System.out.println(aux.objeto.toString());
                aux = aux.siguiente;
            }
        }
    }

    public E buscar(E objeto) {
        if(listaVacia()){
            System.out.println("Error.Lista vacía");
        }
        else{
            Nodo<E> aux = inicio;
            int BAND = 0;
            while(aux != null){
                if(aux.objeto == objeto){
                    BAND = 1;
                    break;
                }
                aux = aux.siguiente;
            }
            if(BAND == 1){
                return aux.objeto;
            }else{
                System.out.println("No se encontró el nodo dentro de la lista");
            }
        }
        return null;
    }
    
    public int getTamaño() {
        return tamaño;
    }

    public E getInicio() {//Permite obtener el objeto inicial de la lista,sin eliminarlo de esta
        return inicio.objeto;
    }

    public E getFin() {//Permite obtener el objeto final de la lista,sin eliminarlo de esta
        return fin.objeto;
    }
    
    //Esto es para Personas
    public Login validar(String usuario, String contraseña){
        Login result = null;
        Nodo<E> aux = inicio;
        
        while(aux!=null){
            if(aux.objeto instanceof Persona){
                Persona p = (Persona) aux.objeto;
                
                if((p.getUsuario().getUsuario().equals(usuario)) && (p.getUsuario().getContraseña().equals(contraseña))){
                result=p.getUsuario();
                }
            }
            
            aux=aux.siguiente;
        }
        
        
        return result;
    
    }
    
    //public LogigetPersona(Login l){
        
    //}
    
    
    
    /*//Primera Forma con interfaz
    @Override
    public Cliente getFoco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Segunda Forna mediante instanceof
    //Si "Cliente" es padre ... debería ser Object
    public Cliente getHaceralgo(){
        
        if(inicio.objeto instanceof Cliente){
            Object r;
        }
        return null;
    }
    

    @Override
    public Cliente getFoco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}


