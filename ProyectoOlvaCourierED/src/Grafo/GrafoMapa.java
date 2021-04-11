
package Grafo;


public class GrafoMapa{
    private int cantidadMax;
    private int mAdyacencia[][];
    private int coordeX[];
    private int coordeY[];
    private int nombre[];
    private int enGrafo[];
    
    public GrafoMapa(){
        crearMapa();
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }
    
    public int getmAdyacencia(int i,int j) {
        return mAdyacencia[i][j];
    }

    public int getCoordeX(int i) {
        return coordeX[i];
    }

    public int getCoordeY(int i) {
        return coordeY[i];
    }

    public int getNombre(int i) {
        return nombre[i];
    }
    
    public int getDireccion(int i) {
        return nombre[i];
    }
    public int getEnGrafo(int i) {
        return enGrafo[i];
    }


    public void setmAdyacencia(int i,int j ,int mAdyacencia) {
        this.mAdyacencia[i][j] = mAdyacencia;
    }

    public void setCoordeX(int i,int cordeX) {
        this.coordeX[i] = cordeX;
    }

    public void setCoordeY(int i, int cordeY) {
        this.coordeY[i] = cordeY;
    }

    public void setNombre(int i,int nombre) {
        this.nombre[i] = nombre;
    }
    
    public void setEnGrafo(int i,int enArbol) {
        this.enGrafo[i] = enArbol;
    }
    public void crearEnGrafo(int i){
       enGrafo = new int [i]; 
    }  
    
    
    void crearMapa(){
        mAdyacencia=new int[][]{{0, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {55, 0, 32, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 32, 0, 0, 0, 46, 85, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 140, 40, 110, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 140, 0, 0, 0, 100, 0, 0, 0, 215, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 80, 46, 40, 0, 0, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 85, 110, 0, 70, 0, 85, 50, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 70, 100, 0, 85, 0, 0, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 50, 0, 0, 95, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 70, 110, 95, 0, 42, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 75, 60, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 215, 0, 0, 0, 0, 75, 75, 0, 0, 62, 0, 0, 96, 112, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 80, 0, 60, 0, 0, 60, 74, 75, 0, 0, 0, 0, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 45, 62, 60, 0, 0, 59, 121, 0, 0, 122, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 74, 0, 0, 32, 0, 0, 0, 63, 81, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 75, 59, 32, 0, 0, 0, 0, 55, 0, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 96, 0, 121, 0, 0, 0, 98, 47, 130, 105, 91, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 112, 0, 0, 0, 0, 98, 0, 0, 0, 0, 101, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 47, 0, 0, 44, 67, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 122, 63, 55, 130, 0, 44, 0, 82, 0, 0, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 81, 0, 105, 0, 67, 82, 0, 92, 60, 0},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 91, 101, 0, 0, 92, 0, 72, 89},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 60, 72, 0, 26},
                                                   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 89, 26, 0}};
        
        this.coordeX = new int[mAdyacencia.length];
        this.coordeY = new int[mAdyacencia.length];
        this.nombre = new int[mAdyacencia.length];
        this.cantidadMax = mAdyacencia.length;
    }
}
