
package Estructura;

import Modelo.Login;
import Modelo.Persona;

public class ListaPersonas {
    
    NodoPersona primero = new NodoPersona();
    NodoPersona ultimo = new NodoPersona();
    public ListaPersonas(){
        primero=null;
        ultimo=null;
    }
    
    public void InsertarNodo(Persona p){
        NodoPersona nuevo = new NodoPersona();
        nuevo.p = p;
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
    
    public Persona getPersona(Login usuario){
        Persona p = null;
        NodoPersona np=primero;
        while(np!=null){
            if(np.p.getUsuario()== usuario){
                p=np.p;
                break;
            }
        }
        return p;
        
    }
    
    
    public Login validar(String usuario, String contraseña){
        Login result = null;
        
        NodoPersona aux = primero;
        
        while(aux!=null){
            if((aux.p.getUsuario().getUsuario().equals(usuario)) && (aux.p.getUsuario().getContraseña().equals(contraseña))){
                result=aux.p.getUsuario();
            }
            aux=aux.siguiente;
        }
        
        return result;
        
    }
}


class NodoPersona{
    Persona p; 
    NodoPersona siguiente;
}
