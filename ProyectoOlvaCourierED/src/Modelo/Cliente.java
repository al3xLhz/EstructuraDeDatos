
package Modelo;

import Estructuras.Lista;

public class Cliente extends Persona{
    
    
    private Lista<Boleta> listaBoletas = new Lista<>();

    public Cliente(String nombres, String apellidos, String codigo, String email, Login usuario) {
        super(nombres, apellidos, codigo, email, usuario);
    }


    public Lista<Boleta> getListaBoletas() {
        return listaBoletas;
    }

    public void setListaBoletas(Lista<Boleta> listaBoletas) {
        this.listaBoletas = listaBoletas;
    }
    
    
}
