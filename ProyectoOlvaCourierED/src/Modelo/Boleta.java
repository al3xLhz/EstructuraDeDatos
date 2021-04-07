
package Modelo;

import Estructuras.Lista;
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
    private String estado;
    private Lista<Pedido> listaPedidos = new Lista<>();

    public Boleta(Agencia agenciaInicial, Agencia agenciaFinal,String propietarioDNI) {
        this.codigo = codigoM;
        codigoM++;
        this.propietarioDNI=propietarioDNI;
        this.fechaEmision=Calendar.getInstance();
        this.fechadeEntrega=fechaEmision;
        this.estado= "Sin entregar";
    }

    public String getPropietarioDNI() {
        return propietarioDNI;
    }

    public void setPropietarioDNI(String propietarioDNI) {
        this.propietarioDNI = propietarioDNI;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
