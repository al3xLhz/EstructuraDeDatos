
package Sistema;

import Estructuras.Lista;
import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;



public class OlvaCourier {
    //Representa como una base de datos donde se maneja la información de todo el sistema
    
    //Aquí están las listas generales que abarcaran tales y como dice su clase Lista<>
    public static Lista<Cliente> clientes = new Lista<>();
    public static Lista<Boleta> boletas = new Lista<>();
    public static Lista<Persona> personas = new Lista<>();
    public static Lista<Administrador> administradores = new Lista<>();
    public static Lista<Agencia> agencias = new Lista<>();
    
    //Estos objetos auxiliares nos ayuda a trabajar en casos de creacion o uso de los objetos dados
    public static Cliente clienteActual;
    public static Boleta boletaActual;
    public static Login usuarioActual;
    public static Administrador administradorActual;
    
    
    
    
    
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
