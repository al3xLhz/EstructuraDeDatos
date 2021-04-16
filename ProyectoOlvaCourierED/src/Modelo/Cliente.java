
package Modelo;

import Estructuras.Lista;

public class Cliente extends Persona{
    
    
    
    private Lista<Boleta> listaBoletas = new Lista<>();
    private int versionPagada; // 1=activado 0= noactivado

   
    public Cliente(int versionPagada, String nombres, String apellidos, String dni, String email, Login usuario) {
        super(nombres, apellidos, dni, email, usuario);
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
    
    
    
}
