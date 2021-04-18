
package Modelo;

import Estructuras.Lista;

public class Agencia {
    
    private String ubicacion; //Departamento
    private int numero;
    //private final Empleado empleado;
    private Lista<Boleta> listaBoletas = new Lista<>();

    public Agencia(String ubicacion,int numero ) {
        this.ubicacion = ubicacion;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Lista<Boleta> getListaBoletas() {
        return listaBoletas;
    }

    public void setListaBoletas(Lista<Boleta> listaBoletas) {
        this.listaBoletas = listaBoletas;
    }

    
    
    
    
}
