
package Modelo;

import Estructura.ListaProducto;
import java.util.Calendar;

public class Pedido {
    private int codigo;
    private String estado;
    private int valor;
    private Producto producto;
    public static int codigoPedido=1000000000;
    

    public Pedido(Producto producto) {
        this.codigo = codigoPedido;
        this.producto=producto;
        this.estado="SinEntregar";
        codigoPedido++;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
    
    
    
    
    
}
