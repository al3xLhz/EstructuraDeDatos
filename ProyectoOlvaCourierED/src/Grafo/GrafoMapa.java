
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
        llenadoCoordenadas();
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
    
    
    void crearMapa(){
        mAdyacencia=new int[][] {{0, 0, 0, 0, 0, 40, 0, 0, 0, 0, 0, 110, 0, 0, 140, 0, 0, 0, 0, 0, 70, 0, 0, 0},//0
                                {0, 0, 0, 0, 0, 0, 0, 0, 95, 0, 0, 50, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//1
                                {0, 0, 0, 67, 44, 0, 47, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//2
                                {0, 0, 67, 0, 82, 0, 105, 0, 0, 81, 0, 0, 0, 0, 0, 0, 60, 0, 0, 92, 0, 0, 0, 0},//3
                                {0, 0, 44, 82, 0, 0, 130, 55, 0, 63, 122, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//4
                                {40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 70, 46, 0, 0, 0, 0, 0, 80, 0, 0, 0, 0, 0},//5
                                {0, 0, 47, 105, 130, 0, 0, 0, 0, 0, 121, 0, 0, 0, 0, 98, 0, 0, 0, 91, 0, 0, 0, 96},//6
                                {0, 0, 0, 0, 55, 0, 0, 0, 0, 32, 59, 0, 0, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//7
                                {0, 95, 0, 0, 0, 0, 0, 0, 0, 0, 0, 70, 0, 70, 0, 0, 0, 42, 0, 0, 110, 0, 0, 75},//8
                                {0, 0, 0, 81, 63, 0, 0, 32, 0, 0, 0, 0, 0, 74, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//9
                                {0, 0, 0, 0, 122, 0, 121, 59, 0, 0, 0, 0, 0, 60, 0, 0, 0, 45, 0, 0, 0, 0, 0, 62},//10
                                {110, 50, 0, 0, 0, 70, 0, 0, 70, 0, 0, 0, 85, 0, 0, 0, 0, 0, 0, 0, 85, 0, 0, 0},//11
                                {0, 0, 0, 0, 0, 46, 0, 0, 0, 0, 0, 85, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0},//12
                                {0, 80, 0, 0, 0, 0, 0, 75, 70, 74, 60, 0, 0, 0, 0, 0, 0, 60, 0, 0, 0, 0, 0, 0},//13
                                {140, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 215},//14
                                {0, 0, 0, 0, 0, 0, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 101, 0, 0, 0, 122},//15
                                {0, 0, 0, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 72, 0, 26, 0, 0},//16
                                {0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 45, 0, 0, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 75},//17
                                {0, 0, 0, 0, 0, 80, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 55, 0},//18
                                {0, 0, 0, 92, 0, 0, 91, 0, 0, 0, 0, 0, 0, 0, 0, 101, 72, 0, 0, 0, 0, 89, 0, 0},//19
                                {70, 0, 0, 0, 0, 0, 0, 0, 110, 0, 0, 85, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0},//20
                                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 26, 0, 0, 89, 0, 0, 0, 0},//21
                                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 55, 0, 0, 0, 0, 0},//22
                                {0, 0, 0, 0, 0, 0, 96, 0, 75, 0, 62, 0, 0, 0, 215, 122, 0, 75, 0, 0, 0, 0, 0, 0}};//23
        this.coordeX = new int[mAdyacencia.length];
        this.coordeY = new int[mAdyacencia.length];
        this.nombre = new int[mAdyacencia.length];
        this.cantidadMax = mAdyacencia.length;
    }
    
    void llenadoCoordenadas(){
        coordeX[0]=172+54;coordeY[0]=199+89;
        coordeX[1]=197+54;coordeY[1]=340+89;
        coordeX[2]=350+54;coordeY[2]=495+89;
        coordeX[3]=371+54;coordeY[3]=569+89;
        coordeX[4]=316+54;coordeY[4]=515+89;
        coordeX[5]=153+54;coordeY[5]=248+89;
        coordeX[6]=385+54;coordeY[6]=469+89;
        coordeX[7]=272+54;coordeY[7]=466+89;
        coordeX[8]=236+54;coordeY[8]=340+89;
        coordeX[9]=269+54;coordeY[9]=511+89;
        coordeX[10]=293+54;coordeY[10]=405+89;
        coordeX[11]=160+54;coordeY[11]=287+89;
        coordeX[12]=115+54;coordeY[12]=215+89;
        coordeX[13]=230+54;coordeY[13]=411+89;
        coordeX[14]=304+54;coordeY[14]=165+89;
        coordeX[15]=441+54;coordeY[15]=432+89;
        coordeX[16]=415+54;coordeY[16]=595+89;
        coordeX[17]=260+54;coordeY[17]=362+89;
        coordeX[18]=96+54;coordeY[18]=190+89;
        coordeX[19]=445+54;coordeY[19]=527+89;
        coordeX[20]=230+54;coordeY[20]=236+89;
        coordeX[21]=444+54;coordeY[21]=609+89;
        coordeX[22]=85+54;coordeY[22]=136+89;
        coordeX[23]=350+54;coordeY[23]=369+89;
    }
}
