
package Modelo;

public class Persona {
    
    private String nombres;
    private String apellidos;
    private String codigo;
    private String email;
    private Login usuario;

    public Persona(String nombres, String apellidos, String codigo, String email, Login usuario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.email = email;
        this.usuario = usuario;
        
    }
   /* public String RetornAtrib(int n){
	String Atrib =null;
	switch(n){
	   case 0 : Atrib= getDni();break;
	   case 1 : Atrib= getNombres();break;
	   case 2 : Atrib= getApellidos();break;
	   case 3 : Atrib= getEmail();break;
        }
        return Atrib;
}*/
    
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

    public Login getUsuario() {
        return usuario;
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

    public void setUsuario(Login usuario) {
        this.usuario = usuario;
    }
    
    
    
    
    
}
