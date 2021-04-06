
package Ordenamiento;

public class OrdenamientoDeSeleccion {
    
    
    public OrdenamientoDeSeleccion(){
        
	int numeros[] = {1,4,3,2,5};
	int longitud = numeros.length; //tamaño de un vector
	int min,pos;
	
	for(int j=0;j<numeros.length;j++){
		min=1000;
		for(int i=j;i<numeros.length;i++){
			if(min>numeros[i]){
				min=numeros[i];
				pos=i;
				numeros[pos]=numeros[j];
				numeros[j]=min;
				
			}
		}
		
	}
	       System.out.println("Ordenamiento ascendente\n");
               
	for(int i=0;i<5;i++){
                System.out.println(numeros[i]+" ");
	}
		
	
    }
}
