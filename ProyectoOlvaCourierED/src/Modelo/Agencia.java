
package Modelo;

import Estructuras.Lista;

public class Agencia {
    
    private final String ubicacion; //Departamento
    private final int telefono;
    //private final Empleado empleado;
    private Lista<Boleta> listaBoletas = new Lista<>();

    public Agencia(String ubicacion, int telefono) {
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        //this.empleado = empleado;
    }

    public Lista<Boleta> getListaBolestas() {
        return listaBoletas;
    }

    public void setListaBolestas(Lista<Boleta> listaBolestas) {
        this.listaBoletas = listaBolestas;
    }
    
    
    

    public String getUbicacion() {
        return ubicacion;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
    
}
