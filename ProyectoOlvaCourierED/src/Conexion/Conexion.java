/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author ricar
 */
public class Conexion {
    
    static Connection contacto = null;
    
    public static Connection getConexion(){
        int error = 0;
        String url = "jdbc:sqlserver://localhost:1433;databaseName=OlvaCourier";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion , revisar driver" + e.getMessage(),
            "Error de Conexion ",JOptionPane.ERROR_MESSAGE);
        }
        try{
            contacto = DriverManager.getConnection(url,"sa","1234");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion ",JOptionPane.ERROR_MESSAGE);
            error = 1;
        }
        if(error == 0){
            System.out.println("La conexion fue exitosa");
        }
        
        return contacto;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion ",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
}
