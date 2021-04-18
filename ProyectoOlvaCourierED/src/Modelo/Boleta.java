
package Modelo;

import Estructuras.Pila;
import Estructuras.Lista;
import Sistema.OlvaCourier;
import java.util.Calendar;

public class Boleta {
    private int codigo;
    private Calendar fechadeEntrega=null;
    private Calendar fechaEmision;
    private Agencia agenciaInicial;
    private Agencia agenciaFinal;
    private double importeTotal;
    private double IGV;
    private double total;
    private static int codigoM = 1000;
    private String propietarioDNI;
    private int estado;//1=Sin entregar 2=En camino 3= Llego
    private Lista<Pedido> listaPedidos = new Lista<>();
    private String camino = "";

    
    public Boleta(Agencia agenciaInicial, Agencia agenciaFinal,String propietarioDNI) {
        OlvaCourier.horaActual = Calendar.getInstance();
        this.codigo = codigoM;
        codigoM++;
        this.propietarioDNI=propietarioDNI;
        this.fechaEmision=OlvaCourier.horaActual;
        this.fechadeEntrega=fechaEmision;
        this.estado= 1;
    }

    public String getPropietarioDNI() {
        return propietarioDNI;
    }

    public void setPropietarioDNI(String propietarioDNI) {
        this.propietarioDNI = propietarioDNI;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getCamino() {
        return camino;
    }

    public void setCamino(String camino) {
        this.camino = camino;
    }
    
    
    
    public void setPrecioTotal(){
        importeTotal = montoAgenciaAgencia()+sumarPedido();
        IGV=importeTotal*0.18;
        //REDONDEO DE IGV E IMPORTE TOTAL//////////////
        IGV*=1000;
        IGV=Math.round(IGV);
        IGV=IGV/1000;
        
        importeTotal*=1000;
        importeTotal=Math.round(importeTotal);
        importeTotal=importeTotal/1000;
        ////////////////////////////////////////////
        total=importeTotal+IGV;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Calendar getFechadeEntrega() {
        return fechadeEntrega;
    }

    
    public void setFechadeEntrega(Calendar fechadeEntrega) {
        this.fechadeEntrega = fechadeEntrega;
    }

    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public static int getCodigoM() {
        return codigoM;
    }

    public static void setCodigoM(int codigoM) {
        Boleta.codigoM = codigoM;
    }

    public Agencia getAgenciaInicial() {
        return agenciaInicial;
    }

    public void setAgenciaInicial(Agencia agenciaInicial) {
        this.agenciaInicial = agenciaInicial;
    }

    public Agencia getAgenciaFinal() {
        return agenciaFinal;
    }

    public void setAgenciaFinal(Agencia agenciaFinal) {
        this.agenciaFinal = agenciaFinal;
    }

    public Lista<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(Lista<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    

    private double sumarPedido() {
        double sumaTotalPedido=0;
        for(int i=0;i<5;i++){
            Pedido pe = (Pedido) listaPedidos.getXPos(i);
            sumaTotalPedido+=pe.getValor();
        }
        
        return sumaTotalPedido;
    }

    private double montoAgenciaAgencia() {
        return 0;
    }
    
    public void actualizarDatos(Boleta b){
        codigo=b.getCodigo();
        fechadeEntrega=b.getFechadeEntrega();
        fechaEmision=b.getFechaEmision();
        agenciaInicial=b.getAgenciaInicial();
        agenciaFinal=b.getAgenciaFinal();
        importeTotal=b.getImporteTotal();
        IGV=b.getIGV();
        total=b.getTotal();
        propietarioDNI=b.getPropietarioDNI();
        listaPedidos=b.getListaPedidos();
    }
    
    
  
    
    
    
    
    
}
