
package App;

import Modelo.*;
import Sistema.OlvaCourier;
import Vista.FrmIniciarSesion;
import javax.swing.JFrame;


public class App {
    
    public static void main(String[] args) {
        
        //Conexion.Conexion.getConexion();
        
        Cliente c1 = new Cliente("Alex", "Lizarazo", "72182942", "alex@gmail.com", new Login("a", "a", 1));
        Cliente c2 = new Cliente("Ricardo", "Gonzales", "18200061", "ricardo@gmail.com", new Login("r", "r", 1));
        
        Administrador a1 = new Administrador("Laura", "Gozme", "18200012", "laura@gmail.com", new Login("l", "l", 2));
        Administrador a2 = new Administrador("Bruno", "Principe", "18200045", "bruno@gmail.com", new Login("b", "b", 2));
        
        
        //RRHH rh1 = new RRHH("Junior", "Palomino", "18200045", "junior@gmail.com", new Login("j", "j", 3));
        
        
        OlvaCourier.clientes.InsertarNodo(c1);
        OlvaCourier.clientes.InsertarNodo(c2);
        
        OlvaCourier.administradores.InsertarNodo(a1);
        OlvaCourier.administradores.InsertarNodo(a2);
        
        //OlvaCourier.rrhhs.InsertarNodo(rh1);
        
        
        OlvaCourier.personas.InsertarNodo(c1);
        OlvaCourier.personas.InsertarNodo(c2);
        OlvaCourier.personas.InsertarNodo(a1);
        OlvaCourier.personas.InsertarNodo(a2);
        //OlvaCourier.personas.InsertarNodo(rh1);
        
        FrmIniciarSesion login = new FrmIniciarSesion();
        
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
