
package Modelo;

import java.util.Calendar;

public class Pedido {
    private int codigo;
    private double valor;
    private Producto producto;
    public static int codigoPedido=1000;
    

    public Pedido(Producto producto) {
        this.codigo = codigoPedido;
        this.producto=producto;
        codigoPedido++;
        setPrecioPedido(producto);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getCodigoPedido() {
        return codigoPedido;
    }

    public static void setCodigoPedido(int codigoPedido) {
        Pedido.codigoPedido = codigoPedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void setPrecioPedido(Producto p){
       double pesoVolumen;
       pesoVolumen = (p.getAlto()*p.getAncho()*p.getLargo())/6000;
       
       if(pesoVolumen>p.getPeso()){
          valor=pesoVolumen;
       }else{
           valor=p.getPeso();
       }
       
       valor*=1000;
       valor=Math.round(valor);
       valor=valor/1000;
       
    }
    
    
    
    
    
    
    
    
}
