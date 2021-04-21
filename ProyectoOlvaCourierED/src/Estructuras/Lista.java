
package Estructuras;

import Modelo.*;


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
        tamaño++;
    }
    
    public void insertarNodoPorFinal(E objeto){
        if(listaVacia()){ //No hay nodos
            inicio = fin = new Nodo<>(objeto);
        }
        else{
            fin.siguiente = new Nodo<>(objeto);
            fin = fin.siguiente;
        }
        tamaño++;
    }
    //creando insertarnodo por "posicion"
   /* public void insertarPos(int pos, E nuevo ){
        //try{
            E ob=null;
            Nodo<E> aux = inicio;
            Nodo<E> aux2=new Nodo<>(nuevo);
            int contador = 0;
            while(aux!=null){
                if(contador==pos){
                    aux2.siguiente= aux.siguiente;
                    aux2.anterior=aux.anterior;
                    aux.anterior.siguiente=aux2;
                    aux.siguiente.anterior=aux2;
                    
                    break;
                   // ob=aux.objeto;
                }
                aux=aux.siguiente;
                contador++;
            }
            /*return ob;
        
        catch(NullPointerException e){
            System.out.println("Error.Lista vacía");
        }
    }
    public void insertarPos(int posicion, E valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y <= que el numero de elementos del la lista.
        if(posicion>=0 && posicion<=tamaño){
            Nodo<E> nuevo = new Nodo<>(null);
            nuevo.setInformacion(valor);
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
            if(posicion == 0){
                // Inserta el nuevo nodo al inicio de la lista.
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            else{
                // Si el nodo a inserta va al final de la lista.
                if(posicion == tamaño){
                    Nodo aux = inicio;
                    // Recorre la lista hasta llegar al ultimo nodo.
                    while(aux.siguiente != null){
                        aux = aux.siguiente;
                    }
                    // Inserta el nuevo nodo despues de del ultimo.
                    aux.objeto=nuevo;              
                }
                else{
                    // Si el nodo a insertar va en el medio de la lista.
                    Nodo aux = inicio;
                    // Recorre la lista hasta llegar al nodo anterior
                    // a la posicion en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo en la posición
                    // en la cual va a insertar el nevo nodo.
                    Nodo siguiente = aux.getSiguiente();
                    // Inserta el nuevo nodo en la posición indicada.
                    aux.setSiguiente(nuevo);
                    // Une el nuevo nodo con el resto de la lista.
                    nuevo.setSiguiente(siguiente);
                }
            }
            // Incrementa el contador de tamaño de la lista.
            tamaño++;
        }
    }
    */
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
                tamaño++;
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
            tamaño--;
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
    
    public E getXPos(int pos){
        E ob=null;
        Nodo<E> aux = inicio;
        int contador = 0;
        while(aux!=null){
            if(contador==pos){
                ob=aux.objeto;
            }
            aux=aux.siguiente;
            contador++;
        }
        return ob;
    }
    
    /*<<<Esto es para Personas*/
    public Login validar(String usuario, String contraseña){ //Nos permite hacer una busqueda si existe en las personas enlistadas
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
    
    public Persona getPersona(Login usuario){//Mediante el objeto Login se extrae los datos completo de la Persona
        Persona p = null;
        Nodo<E> aux=inicio;
        while(aux!=null){
            if(aux.objeto instanceof Persona){
                Persona np = (Persona) aux.objeto;
                
                if(np.getUsuario()==usuario){
                    p=np;
                }
            }
            aux=aux.siguiente;
        }
        return p;
    }
    
    /*>>>*/
    
    /*<<<Esto es para Agencias*/
    
    //Instanciar Agencias
    public void setAgencias(){
        
        insertarNodoPorFinal((E) new Agencia("Amazonas", 0));
        insertarNodoPorFinal((E) new Agencia("Ancash", 1));
        insertarNodoPorFinal((E) new Agencia("Apurimac", 2));
        insertarNodoPorFinal((E) new Agencia("Arequipa", 3));
        insertarNodoPorFinal((E) new Agencia("Ayacucho", 4));
        insertarNodoPorFinal((E) new Agencia("Cajamarca", 5));
        insertarNodoPorFinal((E) new Agencia("Cusco", 6));
        insertarNodoPorFinal((E) new Agencia("Huancavelica", 7));
        insertarNodoPorFinal((E) new Agencia("Huanuco", 8));
        insertarNodoPorFinal((E) new Agencia("Ica", 9));
        insertarNodoPorFinal((E) new Agencia("Junin", 10));
        insertarNodoPorFinal((E) new Agencia("La Libertad", 11));
        insertarNodoPorFinal((E) new Agencia("Lambayeque", 12));
        insertarNodoPorFinal((E) new Agencia("Lima", 13));
        insertarNodoPorFinal((E) new Agencia("Loreto", 14));
        insertarNodoPorFinal((E) new Agencia("Madre de Dios", 15));
        insertarNodoPorFinal((E) new Agencia("Moquegua", 16));
        insertarNodoPorFinal((E) new Agencia("Pasco", 17));
        insertarNodoPorFinal((E) new Agencia("Piura", 18));
        insertarNodoPorFinal((E) new Agencia("Puno", 19));
        insertarNodoPorFinal((E) new Agencia("San Martin", 20));
        insertarNodoPorFinal((E) new Agencia("Tacna", 21));
        insertarNodoPorFinal((E) new Agencia("Tumbes", 22));
        insertarNodoPorFinal((E) new Agencia("Ucayali", 23));
        
    }
    
    //Obtener agencias mediante su nombre
    public Agencia getAgencia(String name){
        Nodo<E> aux=inicio;
        Agencia aR=null;
        
        while(aux!=null){
            if(aux.objeto instanceof Agencia){
                Agencia a = (Agencia) aux.objeto;
                if(name.equals(a.getUbicacion())){
                    aR=a;
                }
            }
            aux=aux.siguiente;
        }
        
        return aR;
    }
    
    /*>>>*/
    
    
    /*<<<Esto es para Boleta*/
    
    //Obtener Boleta mediante su numero deboleta
    public Boleta getBoleta(int nroBoleta){
        Nodo<E> aux = inicio;
        Boleta boletaR = null;
        
        while(aux!=null){
            if(aux.objeto instanceof Boleta){
                Boleta b = (Boleta) aux.objeto;
                if(b.getCodigo()==nroBoleta){
                    boletaR=b;
                }
            }
            aux=aux.siguiente;
        }
        
        return boletaR;
    }
    
    public Pedido buscarBoletaxCodigoPedido(int codigo){
        Pedido pe = null;
        Nodo<E> aux=inicio;
        while(aux!=null){
            if(aux.objeto instanceof Pedido){
                Pedido peAux = (Pedido) aux.objeto;
                
                if(peAux.getCodigo()==codigo){
                    pe=peAux;
                }
            }
            aux=aux.siguiente;
        }
        return pe;
    }
    
    
    /*>>>*/
    
    
    /*<<<Esto es para Clientes*/
    
    public void actualizarCliente(Cliente c){
        Nodo<E> aux =inicio;
        while(aux!=null){
            if(aux.objeto instanceof Cliente){
                Cliente cl = (Cliente) aux.objeto;//Lo convierto en Cliente para que pueda compararlo con el argumento que reciba
                if(cl.getCodigo().equals(c.getCodigo())){
                    aux.objeto=(E) c;
                }
            }
            aux=aux.siguiente;
            
        }
    }
    
    public Cliente buscarXCodigoCliente(String codigo){
        Nodo<E> aux =inicio;
        Cliente claux = null;
        while(aux!=null){
            if(aux.objeto instanceof Cliente){
                Cliente cl = (Cliente) aux.objeto;//Lo convierto en Cliente para que pueda compararlo con el argumento que reciba
                if(cl.getCodigo().equals(codigo)){
                    claux = cl;
                }
            }
            aux=aux.siguiente;
            
        }
        return claux;
    }
    
    
    /*>>>*/
    
    /*<<<Esto es para Productos*/
    
    public Producto buscarProductoxCodigoPedido(int codigo){
        Producto p = null;
        Nodo<E> aux=inicio;
        while(aux!=null){
            if(aux.objeto instanceof Producto){
                Producto pAux = (Producto) aux.objeto;
                
                if(pAux.getCodigoPe()==codigo){
                    p=pAux;
                }
            }
            aux=aux.siguiente;
        }
        return p;
    }
    
    /*>>>*/
    
    
    
    
    
    /*ignora de aqui para abajo*/
    
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


