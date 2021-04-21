
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
    
    public void recorrido(){//Nos sirve para cuando queremos comprobar de la existencia de la lista
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
    
    public Nodo<E> getInicioNodo(){
        return inicio;
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
            if(aux.objeto instanceof Persona){//Necesario para ser exclusivo a las clases personas
                Persona p = (Persona) aux.objeto;
                
                if((p.getLogin().getUsuario().equals(usuario)) && (p.getLogin().getContraseña().equals(contraseña))){
                result=p.getLogin();
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
            if(aux.objeto instanceof Persona){//Necesario para ser exclusivo a las clases personas
                Persona np = (Persona) aux.objeto;
                
                if(np.getLogin()==usuario){
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
            if(aux.objeto instanceof Agencia){//Necesario para ser exclusivo a las clases Agencia
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
            if(aux.objeto instanceof Boleta){//Necesario para ser exclusivo a las clases Boleta
                Boleta b = (Boleta) aux.objeto;
                if(b.getCodigoBoleta()==nroBoleta){
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
            if(aux.objeto instanceof Pedido){//Necesario para ser exclusivo a las clases Pedido
                Pedido peAux = (Pedido) aux.objeto;
                
                if(peAux.getCodigoPedido()==codigo){
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
            if(aux.objeto instanceof Cliente ){
                if(aux.objeto instanceof Persona){
                                                    //Necesario para ser exclusivo a las clases Cliente
                    Cliente cl = (Cliente) aux.objeto;//Lo convierto en Cliente para que pueda compararlo con el argumento que reciba
                    if(cl.getCodigo().equals(c.getCodigo())){
                        aux.objeto=(E) c;
                    }
                }
            }
            aux=aux.siguiente;
            
        }
    }
    
    public Cliente buscarXCodigoCliente(String codigo){
        Nodo<E> aux =inicio;
        Cliente claux = null;
        while(aux!=null){
            if(aux.objeto instanceof Cliente){//Necesario para ser exclusivo a las clases Cliente
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
            if(aux.objeto instanceof Producto){//Necesario para ser exclusivo a las clases Producto
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
    
    
}


