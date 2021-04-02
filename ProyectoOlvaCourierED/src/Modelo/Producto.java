
package Modelo;

public class Producto {
    private final String nombreProducto;
    private final double peso;
    private final double alto;
    private final double ancho;
    private final double largo;
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
    

    
    
   
    
}
