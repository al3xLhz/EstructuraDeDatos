
package Sistema;

import Estructura.ListaUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;



public class OlvaCourier {
    
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
