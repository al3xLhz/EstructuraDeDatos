
package Sistema;

import Estructuras.Lista;
import Grafo.*;
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
    public static GrafoMapa miGrafo = new GrafoMapa();
    

    
    
    static ResultSet res;
    public static void CargarClientes(){
        
        res = Conexion.Conexion.Consulta("select * from Clientes");
        
        try{
            while(res.next()){
                OlvaCourier.clientes.insertarNodoPorFinal(new Cliente(res.getString(2), res.getString(3),res.getString(1), res.getString(4), new Login(res.getString(5),res.getString(6),res.getInt(7))));
                OlvaCourier.personas.insertarNodoPorFinal(new Cliente(res.getString(2), res.getString(3),res.getString(1), res.getString(4), new Login(res.getString(5),res.getString(6),res.getInt(7))));
            }  
        }catch(SQLException e){
        }
    }
    
    public static void CargarAdministrador(){
        
        res = Conexion.Conexion.Consulta("select * from Administrador");
        
        try{
            while(res.next()){
                OlvaCourier.administradores.insertarNodoPorFinal(new Administrador(res.getString(2), res.getString(3),res.getString(1), res.getString(4), new Login(res.getString(6),res.getString(7),res.getInt(8))));
                OlvaCourier.personas.insertarNodoPorFinal(new Administrador(res.getString(2), res.getString(3),res.getString(1), res.getString(4), new Login(res.getString(6),res.getString(7),res.getInt(8))));
            }  
        }catch(SQLException e){
        }
    }
    
    
}   
    
    
    
    
    
    
            

