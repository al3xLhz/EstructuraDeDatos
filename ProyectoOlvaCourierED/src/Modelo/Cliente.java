
package Modelo;

import Estructuras.Lista;
import Estructuras.Nodo;

public class Cliente extends Persona{
    
    private Lista<Boleta> listaBoletas = new Lista<>();
    private int versionPagada; // 1=activado 0= noactivado

   
    public Cliente(int versionPagada, String nombres, String apellidos, String codigo, String email, Login usuario) {
        super(nombres, apellidos, codigo, email, usuario);
        this.versionPagada = versionPagada;
    }
    
    public Lista<Boleta> getListaBoletas() {
        return listaBoletas;
    }

    public void setListaBoletas(Lista<Boleta> listaBoletas) {
        this.listaBoletas = listaBoletas;
    }

    public int getVersionPagada() {
        return versionPagada;
    }
    
    
    
    public void setVersionPagada(int versionPagada) {
        this.versionPagada = versionPagada;
    }
    
    public void setBoletas(Lista Boletas) {
        if(!Boletas.listaVacia()){
            Nodo aux=Boletas.getInicioNodo();
            while(aux!=null){
                
                Boleta bo = (Boleta) aux.objeto;
                if(getCodigo().equals(bo.getPropietarioDNI())){
                    listaBoletas.insertarNodoPorFinal(bo);
                    
            }
            
            aux=aux.siguiente;
            }
        }
        
        
    }
    
    
}
