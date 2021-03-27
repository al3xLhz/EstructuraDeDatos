/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;
import java.util.Scanner;
/**
 *
 * @author ricar
 */
public class ListaUsuario {
    NodoUsuario primero = new NodoUsuario();
    NodoUsuario ultimo = new NodoUsuario();
    Scanner teclado = new Scanner(System.in);
    
    public ListaUsuario(){
        primero = null;
        ultimo = null;
    }
    
    public void insertarNodo(String Usuario,String contr ){
        NodoUsuario nuevo = new NodoUsuario(); 
        nuevo.usuario = Usuario;
        nuevo.contraseña = contr;
        if (primero == null){
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
    }
    
    public void desplegarLista(){
        NodoUsuario actual = new NodoUsuario();
        actual = primero;
        if(primero != null){
            while(actual!= null){
                System.out.println(" " + actual.usuario + " -> " + actual.contraseña);
                actual = actual.siguiente;
            }
        }else{
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    
    public int BuscarElemeto(String Usuario, String contr){
        NodoUsuario actual = new NodoUsuario();
	actual = primero;
	int encontrado = 0;
	if(primero != null){
            while(actual!= null && encontrado != 1){
		if (actual.contraseña.equals(contr) && actual.usuario.equals(Usuario)){
                    encontrado = 1; 
		}
		actual = actual.siguiente;
            }
            if (encontrado == 0){
		System.out.println(" Usuario y contraseña incorrectos"); 
            }
	}
	else{
            System.out.println(" No hay usuarios en la lista");
	}
        return encontrado;
    }
    
}
