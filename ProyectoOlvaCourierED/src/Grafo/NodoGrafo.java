
package Grafo;



public class NodoGrafo{
    private int nombre;
    private boolean visitado;
    private boolean etiqueta;
    private int acumulado;
    private NodoGrafo predecesor;
    
    public NodoGrafo(){
       this.nombre =-1;
       this.visitado = false;
       this.predecesor  = null;
       this.acumulado =0;       
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
    public boolean isEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public NodoGrafo getPredecesor() {
        return predecesor;
    }

    public void setPredecesor(NodoGrafo predecesor) {
        this.predecesor = predecesor;
    }
    
}
