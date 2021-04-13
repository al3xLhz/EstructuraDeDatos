/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.io.Serializable;

/**
 *
 * @author Miguel
 */
public class Union implements Serializable{
    int distancia;
    String direccion;

    public Union(int distancia, String direccion) {
        this.distancia = distancia;
        this.direccion = direccion;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
