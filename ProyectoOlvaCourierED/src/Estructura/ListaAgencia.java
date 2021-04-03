
package Estructura;

import Modelo.Agencia;
import Modelo.Producto;


public class ListaAgencia {
    NodoAgencia primero = new NodoAgencia();
    NodoAgencia ultimo = new NodoAgencia();
    
    public ListaAgencia(){
        primero=null;
        ultimo=null;
        InsertarNodo(new Agencia("Amazonas", 1));
        InsertarNodo(new Agencia("Ancash", 2));
        InsertarNodo(new Agencia("Apurimac", 3));
        InsertarNodo(new Agencia("Arequipa", 4));
        InsertarNodo(new Agencia("Ayacucho", 5));
        InsertarNodo(new Agencia("Cajamarca", 6));
        InsertarNodo(new Agencia("Callao", 7));
        InsertarNodo(new Agencia("Cusco", 8));
        InsertarNodo(new Agencia("Huancavelica", 9));
        InsertarNodo(new Agencia("Huanuco", 10));
        InsertarNodo(new Agencia("Ica", 11));
        InsertarNodo(new Agencia("Junín", 12));
        InsertarNodo(new Agencia("La Libertad", 13));
        InsertarNodo(new Agencia("Lambayeque", 14));
        InsertarNodo(new Agencia("Lima", 15));
        InsertarNodo(new Agencia("Loreto", 16));
        InsertarNodo(new Agencia("Madre de Dios", 17));
        InsertarNodo(new Agencia("Moquegua", 18));
        InsertarNodo(new Agencia("Pasco", 19));
        InsertarNodo(new Agencia("Piura", 20));
        InsertarNodo(new Agencia("Puno", 21));
        InsertarNodo(new Agencia("San Martín", 22));
        InsertarNodo(new Agencia("Tacna", 23));
        InsertarNodo(new Agencia("Tumbes", 24));
        InsertarNodo(new Agencia("Ucayali", 25));

        
        
    }
    
    
    public void InsertarNodo(Agencia a){
        NodoAgencia nuevo = new NodoAgencia();
        nuevo.a = a;
        if(primero==null){
            primero=nuevo;
            primero.siguiente=null;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=null;
            ultimo = nuevo;
            
        }
    }
    
    
    public Agencia getAgencia(String name){
        NodoAgencia aux=primero;
        Agencia aR=null;
        
        while(aux!=null){
            if(name.equals(aux.a.getUbicacion())){
                aR = aux.a;
            }
            aux = aux.siguiente;
        }
        return aR;
    }
    
    public void mostrarAgencias(){
        NodoAgencia aux=primero;
        
        while(aux!=null){
            System.out.println(aux.a.getUbicacion());
            aux=aux.siguiente;
        }
    }
    
}

class NodoAgencia{
    Agencia a; 
    NodoAgencia siguiente;
    
}