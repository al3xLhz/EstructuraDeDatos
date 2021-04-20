
package App;

import Estructuras.ArbolAVL;
import Modelo.*;
import Sistema.OlvaCourier;
import Vista.FrmIniciarSesion;
import javax.swing.JFrame;


public class App {
    
    public static void main(String[] args) {
        
        //Conexion.Conexion.getConexion();
        /*Primero Ingresemos a la carpeta Sistema-OlvaCourier.java*/
        
        //Guarda todas las agencias existentes en el objeto agencias
        OlvaCourier.agencias.setAgencias();
        Conexion.Conexion.getConexion();
        OlvaCourier.CargarProducto();
        OlvaCourier.CargarPedido();
        OlvaCourier.CargarBoleta();
        OlvaCourier.CargarClientes();
        OlvaCourier.CargarAdministrador();
        
       // System.out.println(OlvaCourier.boletas.getTamaño());
        
        //<Es un respaldode creacion de los clientes,administradores Todo debería ser un sql pero en este caso por terminos de rapidez se hace de esta manera
        
        //>
 
        //Inserta los objetos creados en sus respectivas listas : clientes, administradores y personas
        
        //De esta forma ingresa Formulario Iniciar sesion
        FrmIniciarSesion login = new FrmIniciarSesion();
        
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
     
    
    
    
    
    
    
    
    
    
    
    
}


