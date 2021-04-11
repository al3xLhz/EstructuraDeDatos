
package App;

import Estructuras.Grafo;
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
        
        
        //<Es un respaldode creacion de los clientes,administradores */Todo debería ser un sql pero en este caso por terminos de rapidez se hace de esta manera*/
        Cliente c1 = new Cliente("Alex", "Lizarazo", "72182942", "alex@gmail.com", new Login("a", "a", 1));
        Cliente c2 = new Cliente("Ricardo", "Gonzales", "18200061", "ricardo@gmail.com", new Login("r", "r", 1));
        
        Administrador a1 = new Administrador("Laura", "Gozme", "18200012", "laura@gmail.com", new Login("l", "l", 2));
        Administrador a2 = new Administrador("Bruno", "Principe", "18200045", "bruno@gmail.com", new Login("b", "b", 2));
        
        //>
        
        
        //Inserta los objetos creados en sus respectivas listas : clientes, administradores y personas
        OlvaCourier.clientes.insertarNodoPorFinal(c1);
        OlvaCourier.clientes.insertarNodoPorFinal(c2);
        
        OlvaCourier.administradores.insertarNodoPorFinal(a1);
        OlvaCourier.administradores.insertarNodoPorFinal(a2);
        
        OlvaCourier.personas.insertarNodoPorFinal(c1);
        OlvaCourier.personas.insertarNodoPorFinal(c2);
        OlvaCourier.personas.insertarNodoPorFinal(a1);
        OlvaCourier.personas.insertarNodoPorFinal(a2);
        //int[][] mAdyacencia = new int[][]{{0,1,20},{0,2,30},{1,2,20}};
        //Grafo miGrafo= new Grafo(2, 3, mAdyacencia);
        
       // miGrafo.Dijkstra(0, 1);
        
        //De esta forma ingresa Formulario Iniciar sesion
        FrmIniciarSesion login = new FrmIniciarSesion();
        
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
     
    
    
    
    
    
    
    
    
    
    
    
}


