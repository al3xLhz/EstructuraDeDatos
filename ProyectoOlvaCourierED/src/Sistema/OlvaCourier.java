
package Sistema;

import Estructura.*;
import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;



public class OlvaCourier {
    
    public static ListaCliente clientes = new ListaCliente();
    public static Cliente clienteActual;
    public static ListaBoleta boletas = new ListaBoleta();
    public static Boleta boletaActual = new Boleta(null, null, 0, 0, null, null);
    public static Login usuarioActual;
    public static ListaPersonas personas = new ListaPersonas();
    public static ListaAdministrador administradores = new ListaAdministrador();
    public static Administrador administradorActual;
    public static ListaRRHH rrhhs = new ListaRRHH();
    public static RRHH rrhhActual;
    public static ListaAgencia agencias = new ListaAgencia();
    public static ListaPedidos pedidosActuales= new ListaPedidos();
    
    
    
    
    static ResultSet res;
    
    public static void CargarListas(ListaUsuario l){
        
        res = Conexion.Conexion.Consulta("select * from Usuario");
        
        try{
            while(res.next()){
               l.insertarNodo(res.getString(1), res.getString(2));
            }
        }catch(SQLException e){
        }
    }
   
    
        
}
