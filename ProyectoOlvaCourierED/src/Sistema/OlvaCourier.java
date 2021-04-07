
package Sistema;

import Estructuras.Lista;
import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;



public class OlvaCourier {
    
    public static Lista<Cliente> clientes = new Lista<>();
    public static Cliente clienteActual;
    public static Lista<Boleta> boletas = new Lista<>();
    public static Boleta boletaActual;
    public static Login usuarioActual;
    public static Lista<Persona> personas = new Lista<>();
    public static Lista<Administrador> administradores = new Lista<>();
    public static Administrador administradorActual;
    public static Lista<Agencia> agencias = new Lista<>();
    
    
    
    
    static ResultSet res;
    /*
    public static void CargarListas(ListaUsuario l){
        
        res = Conexion.Conexion.Consulta("select * from Usuario");
        
        try{
            while(res.next()){
               l.insertarNodo(res.getString(1), res.getString(2));
            }
        }catch(SQLException e){
        }
    }
    */
    
        
}
