/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

/**
 *
 * @author Alex
 */
public class OrdenamientoDeInserccion {
    
    
    public OrdenamientoDeInserccion(){
        
    int numeros[] = {5,4,3,2,1,4,2,5,15,7};
    int aux,pos;
    int longitud = numeros.length; //tamaño de un vector
    
    for(int i=0;i<longitud;i++){
        
	pos=i;
	aux=numeros[i];
		
	while((pos>0) && (numeros[pos-1] > aux)){
            numeros[pos] = numeros[pos-1];
            pos--;
	}
	numeros[pos]=aux;
    }
    
    System.out.println("Orden ascendente: \n");
        
    for(int i=0;i<longitud;i++){
                System.out.println(numeros[i]+" ");
    }  
    
    }
}
    	

