
package Modelo;

public class Producto {
    private String nombreProducto;
    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private String codigo;
    private String estado;
    private static int codigoProductos= 1000000000;
    
    public Producto(String nombreProducto, double peso, double alto, double ancho, double largo) {
        this.nombreProducto = nombreProducto;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.codigo = String.valueOf(codigoProductos);
        codigoProductos++;
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

    public String getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado;
    }

    public static int getCodigoProductos() {
        return codigoProductos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void setCodigoProductos(int codigoProductos) {
        Producto.codigoProductos = codigoProductos;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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
    
    
    
    

    
    
   
    
}
