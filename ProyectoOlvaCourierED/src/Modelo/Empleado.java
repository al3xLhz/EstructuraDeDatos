
package Modelo;

public class Empleado extends Persona{
    
    public Empleado(String nombres, String apellidos, String dni, String email, Login usuario) {
        super(nombres, apellidos, dni, email, usuario);
    }
    
    private int codTrabajo;
    private String cargo; //Admin(2) - RRHH(3)

    public Empleado(int codTrabajo, String cargo, String nombres, String apellidos, String dni, String email, Login usuario) {
        super(nombres, apellidos, dni, email, usuario);
        this.codTrabajo = codTrabajo;
        this.cargo = cargo;
    }
    
    
}
