
package Modelo;

import Estructura.*;

public class Cliente extends Persona{
    
    public Cliente(String nombres, String apellidos, String dni, String email, Login usuario) {
        super(nombres, apellidos, dni, email, usuario);
    }
    
    private ListaBoleta listaBoletas;

    public ListaBoleta getListaBoletas() {
        return listaBoletas;
    }

    public void setListaBoletas(ListaBoleta listaBoletas) {
        this.listaBoletas = listaBoletas;
    }
    
    
    
}
