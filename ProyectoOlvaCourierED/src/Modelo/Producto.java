
package Modelo;

public class Producto {
    private String nombreProducto;
    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private int codigoPro;
    private int codigoPe;
    
    public Producto(String nombreProducto, double peso, double alto, double ancho, double largo, int valor) {
        this.nombreProducto = nombreProducto;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Producto(int codigoPro, String nombreProducto, double peso, double alto, double ancho, double largo, int codigoPe) {
        this.codigoPro = codigoPro;
        this.nombreProducto = nombreProducto;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.codigoPe = codigoPe;
    }
        
    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPeso() {
        return peso;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCodigoPe() {
        return codigoPe;
    }

    public void setCodigoPe(int codigoPe) {
        this.codigoPe = codigoPe;
    }

    public int getCodigoPro() {
        return codigoPro;
    }

    
    
    
    
    

    
    
   
    
}
