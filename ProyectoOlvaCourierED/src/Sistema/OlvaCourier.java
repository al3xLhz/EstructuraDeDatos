
package Sistema;

import Estructuras.Lista;
import Grafo.*;
import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;



public class OlvaCourier {
                                        //Representa como una base de datos donde se maneja la información de todo el sistema
    
    //Aquí están las listas generales que abarcaran tales y como dice su clase Lista<>
    public static Lista<Cliente> clientes = new Lista<>();
    public static Lista<Boleta> boletas = new Lista<>();
    public static Lista<Persona> personas = new Lista<>();
    public static Lista<Administrador> administradores = new Lista<>();
    public static Lista<Agencia> agencias = new Lista<>();
    public static Lista<Pedido> pedidos = new Lista<>();
    public static Lista<Producto> productos = new Lista<>();
    
    //Estos objetos auxiliares nos ayuda a trabajar en casos de creacion o uso de los objetos dados
    public static Cliente clienteActual;
    public static Boleta boletaActual;
    public static Login usuarioActual;
    public static Administrador administradorActual;
    public static GrafoMapa miGrafo = new GrafoMapa();
    public static DijkstraMapa miDijkstra = new DijkstraMapa(miGrafo);
    public static Calendar horaActual=Calendar.getInstance();
    
    

    private static ResultSet res;
    
    public static void CargarClientes(){
        
        res = Conexion.Conexion.Consulta("select * from Clientes");
        
        try{
            while(res.next()){
                Cliente cAux = new Cliente(res.getInt(8), res.getString(2), res.getString(3),res.getString(1), res.getString(4), new Login(res.getString(5),res.getString(6),res.getInt(7)));
                cAux.setBoletas(OlvaCourier.boletas);
                
                OlvaCourier.clientes.insertarNodoPorFinal(cAux);
                OlvaCourier.personas.insertarNodoPorFinal(cAux);
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
    
    public static void CargarBoleta(){
        res = Conexion.Conexion.Consulta("select * from Boleta");
        
        try{
           while(res.next()){
                Boleta aux = new Boleta(res.getInt(1), res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getDouble(6),res.getDouble(7),res.getDouble(8),res.getInt(9),res.getString(10));
                aux.setPedidos(OlvaCourier.pedidos);
               
                OlvaCourier.boletas.insertarNodoPorFinal(aux);         
                
            }  
        }catch(SQLException e){
        }
    }
    
        public static void CargarPedido(){
        res = Conexion.Conexion.Consulta("select * from Pedido");
        
        try{
           while(res.next()){
                Pedido aux = new Pedido(res.getInt(1), res.getDouble(2),res.getInt(3));
                Producto auxP = OlvaCourier.productos.buscarProductoxCodigoPedido(aux.getCodigoPedido());
                aux.setProducto(auxP);
                OlvaCourier.pedidos.insertarNodoPorFinal(aux);
                
            }  
        }catch(SQLException e){
        }
    }
    
        public static void CargarProducto(){
        res = Conexion.Conexion.Consulta("select * from Producto");
        
        try{
            while(res.next()){
                Producto auxP = new Producto(res.getInt(1), res.getString(2),res.getDouble(3),res.getDouble(4),res.getDouble(5),res.getDouble(6),res.getInt(7));
                
                
                OlvaCourier.productos.insertarNodoPorFinal(auxP);
                
                
            }  
        }catch(SQLException e){
        }
    }
}   
    
    
    
    
    
    
            

