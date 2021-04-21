
package Modelo;

public class Persona {
    
    private String nombres;
    private String apellidos;
    private String codigo;
    private String email;
    private Login login;

    public Persona(String nombres, String apellidos, String codigo, String email, Login login) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.email = email;
        this.login = login;
        
    }
    
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public String getEmail() {
        return email;
    }

    public Login getLogin() {
        return login;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    
    
    
    
    
    
}
