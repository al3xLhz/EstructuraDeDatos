
package App;

import Estructuras.ArbolAVL;
import Modelo.*;
import Sistema.OlvaCourier;
import Vista.FrmIniciarSesion;
import java.util.Calendar;
import javax.swing.JFrame;


public class App {
    
    public static void main(String[] args) {
        
        Conexion.Conexion.getConexion();
        /*Primero Ingresemos a la carpeta Sistema-OlvaCourier.java*/
        
        //Guarda todas las agencias existentes en el objeto agencias
        OlvaCourier.agencias.setAgencias();
        //Conexion.Conexion.getConexion();

        
        //Cargar los datos de la base de datos, es necesario ese orden porque depende uno del otro, en cadena
        OlvaCourier.CargarProducto();
        //OlvaCourier.productos.recorrido();
        OlvaCourier.CargarPedido();
        OlvaCourier.pedidos.recorrido();
        OlvaCourier.CargarBoleta();
        OlvaCourier.boletas.recorrido();
        OlvaCourier.CargarClientes();
        OlvaCourier.clientes.recorrido();
        OlvaCourier.CargarAdministrador();
        System.out.println(OlvaCourier.clientes.getXPos(0).getListaBoletas().getTamaño());
        OlvaCourier.clientes.getXPos(0).getListaBoletas().getXPos(0).getListaPedidos().recorrido();
        OlvaCourier.clientes.getXPos(0).getListaBoletas().getXPos(1).getListaPedidos().recorrido();
        OlvaCourier.clientes.getXPos(0).getListaBoletas().getXPos(2).getListaPedidos().recorrido();
        OlvaCourier.clientes.getXPos(0).getListaBoletas().getXPos(3).getListaPedidos().recorrido();
        OlvaCourier.clientes.getXPos(0).getListaBoletas().getXPos(4).getListaPedidos().recorrido();
        
        //De esta forma ingresa Formulario Iniciar sesion
        FrmIniciarSesion login = new FrmIniciarSesion();
        
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
     
    
    
    
    
    
    
    
    
    
    
    
}


