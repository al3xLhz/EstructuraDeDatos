
package Modelo;

public class Agencia {
    
    private String ubicacion; //Departamento
    private int telefono;
    //private final Empleado empleado;

    public Agencia(String ubicacion, int telefono) {
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        //this.empleado = empleado;
    }

    public Agencia(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    

    public String getUbicacion() {
        return ubicacion;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
    
}
