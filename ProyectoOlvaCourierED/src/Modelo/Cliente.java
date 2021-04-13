
package Modelo;

import Estructuras.Lista;

public class Cliente extends Persona{
    
    public Cliente(String nombres, String apellidos, String dni, String email, Login usuario) {
        super(nombres, apellidos, dni, email, usuario);
    }
    
    private Lista<Boleta> listaBoletas = new Lista<>();


    public Lista<Boleta> getListaBoletas() {
        return listaBoletas;
    }

    public void setListaBoletas(Lista<Boleta> listaBoletas) {
        this.listaBoletas = listaBoletas;
    }
    
    
}
