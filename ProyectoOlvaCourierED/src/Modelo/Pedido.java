
package Modelo;

import Estructuras.Lista;
import Estructuras.Nodo;

public class Pedido {
    private int codigoPedido;
    private double valor;
    private int codigoBoleta;
    private Producto producto;
    public static int codigoPedidoGeneral=(int) (Math.random()*10000+1);
    

    public Pedido(Producto producto) {
        this.codigoPedido = (int) (Math.random()*10000+1);
        this.producto=producto;
        codigoPedido++;
        setPrecioPedido(producto);
    }
    
    public Pedido(int codigo, double valor , int codigoB) {
        this.codigoPedido = codigo;
        this.valor = valor;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    

    public Producto getProducto() {
        return producto;
    }

    public int getCodigoBoleta() {
        return codigoBoleta;
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

    public void setProductos(Lista productos) {
        
        if(!productos.listaVacia()){
            
            Nodo aux = productos.getInicioNodo();
            
            while(aux!=null){
                Producto pro = (Producto) aux.objeto;
                
            if(pro.getCodigoPe()==codigoPedido){
                setProducto(pro);
            }
            
            aux=aux.siguiente;
            }
        }
        
    }
    
    
    
    
    
    
    
    
}
