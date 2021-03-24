
package Modelo;

public class Login {
    
    private String usuario;
    private String contraseña;
    private int tipoFuncion; //1=Cliente 2= Administrador 3 = RRHH
    private boolean logueado;

    public Login(String usuario, String contraseña, int tipoFuncion) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipoFuncion = tipoFuncion;
        this.logueado = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getTipoFuncion() {
        return tipoFuncion;
    }

    public boolean isLogueado() {
        return logueado;
    }
    
    
    public boolean entrar(String usuario, String contraseña){
        
        boolean result = false;
        if(getUsuario().equals(usuario)&& getContraseña().equals(contraseña)){
            this.logueado = true;
            result = true;
        }

        return result;
        
    } 
    
    public boolean salir(){
        boolean result = false;
        if(isLogueado()){
            this.logueado = false;
            result = true;
        }
        return result;
    }
    
    
    
    
    
}
