
package Estructura;

import Modelo.Login;
import Modelo.Persona;

public interface ListaPersonas {
    
    public abstract Login validar(String usuario, String contraseña);
    
}
