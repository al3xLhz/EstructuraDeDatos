
package EstructurasPlantillas;

public class ArbolBinario {
    NodoArbol raiz;
    int tamaño = 0;
    
    public ArbolBinario() {//crearArbol()
        this.raiz = null;
        tamaño = 0;
    }
    
    public boolean arbolVacio(){
        return raiz == null;
    }
    
    public NodoArbol getRaiz() {
        return raiz;
    }
    //Probado
    

    //Sin probar
    public NodoArbol extraer(int valor) {
        NodoArbol padre; //Almacenará el nodo padre de cada sub arbol
        NodoArbol aux; //Almacenará los nodos hijos de cada sub arbol
        padre = aux = raiz;
        boolean BAND = true; //True si viaja al nodo izquierda,false si viaja al derecho
        while(aux.valor != valor){
            padre = aux;
            if(valor < aux.valor){
                aux = aux.izq;
                BAND = true;
            }else{
                aux = aux.der;
                BAND = false;
            }
            if(aux == null){
                System.out.println("No se encontró el valor");
                return null;
            }
        }
        if(aux.izq == null && aux.der == null){ //Si es hoja
            if(aux == raiz){
                raiz = null;
            }else if(BAND){
                padre.izq = null;
            }else{
                padre.der = null;
            }
        }else{
            if(aux.der == null){
                if(aux == raiz){
                    raiz = aux.izq;
                }else{ 
                    if(BAND){
                        padre.izq = aux.izq;
                    }
                    else{
                        padre.der = aux.izq;
                    }  
                }
            }
            else{ 
                if(aux.izq == null){
                    if(aux == raiz){
                        raiz = aux.der;
                    }else{ 
                        if(BAND){
                            padre.izq = aux.der;
                        }
                        else{
                            padre.der = aux.izq;
                        }            
                    }
                }
                else{
                    NodoArbol reePadre=aux;
                    NodoArbol reeAux=aux;
                    NodoArbol reeaux=aux.der;
                    while(reeaux!=null){
                        reePadre = reeAux;
                        reeAux = reeaux;
                        reeaux = reeaux.izq;
                    }
                    if(reeAux != aux.der){
                        reePadre.izq = reeAux.der;
                        reeAux.der = aux.der;
                    }
                    NodoArbol reemplazo=reeAux;
                    //Fin
                    if(aux == raiz){
                        raiz=reemplazo;
                    }else{ 
                        if(BAND){
                            padre.izq = reemplazo;
                        }
                        else{
                            padre.der = reemplazo;
                        }
                        reemplazo.izq = aux.izq;
                    }
                }
            }
            
        }   
        return aux;
    }
    public void recorridoPreorden(NodoArbol nodo){
        if(!arbolVacio()){
            if(nodo == null){
                //Evita que se mande un nodo vacío como parametro
            }else{
                System.out.println(nodo.valor+": "+nodo.objeto.toString());
                recorridoPreorden(nodo.izq);
                recorridoPreorden(nodo.der);
            }
        }    
        else{
            System.out.println("Error.Árbol vacío");
        }
        
    }
    public void recorridoInorden(NodoArbol nodo){
        if(!arbolVacio()){
            if(nodo == null){
                //Evita que se mande un nodo vacío como parametro
            }
            else{
                recorridoInorden(nodo.izq);
                System.out.println(nodo.valor+": "+nodo.objeto.toString());
                recorridoInorden(nodo.der);
            }
        }
        else{
            System.out.println("Error.Árbol vacío");
        }
    }
    public void recorridoPostorden(NodoArbol nodo){
        if(!arbolVacio()){
            if(nodo == null){
                //Evita que se mande un nodo vacío como parametro
            }else{
                recorridoPostorden(nodo.izq);
                recorridoPostorden(nodo.der);
                System.out.println(nodo.valor+": "+nodo.objeto.toString());
            }
        }
        else{
            System.out.println("Error.Árbol vacío");
        }
    }
    
    
    
}
