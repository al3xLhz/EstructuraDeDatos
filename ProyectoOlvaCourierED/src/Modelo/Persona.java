
package Modelo;

public class Persona {
    
    private final String nombres;
    private final String apellidos;
    private final String dni;
    private final String email;
    private final Login usuario;

    public Persona(String nombres, String apellidos, String dni, String email, Login usuario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.usuario = usuario;
    }

    
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public Login getUsuario() {
        return usuario;
    }
    
    
    
    
    
}
