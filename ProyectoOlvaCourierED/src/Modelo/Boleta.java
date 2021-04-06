
package Modelo;

import Estructura.*;
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
    private static int codigoM = 1000000000;
    private String propietarioDNI;
    private ListaPedidos listaPedidos;

    public Boleta(Agencia agenciaInicial, Agencia agenciaFinal,String propietarioDNI) {
        this.codigo = codigoM;
        codigoM++;
        this.propietarioDNI=propietarioDNI;
        this.fechaEmision=Calendar.getInstance();
        this.fechadeEntrega=fechaEmision;
    }

    public String getPropietarioDNI() {
        return propietarioDNI;
    }

    public void setPropietarioDNI(String propietarioDNI) {
        this.propietarioDNI = propietarioDNI;
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

    public ListaPedidos getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ListaPedidos listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    private double sumarPedido() {
        double total=0;
        for(int i=0;i<5;i++){
            total+=listaPedidos.getPedidoXPos(i).getValor();
        }
        
        return total;
    }

    private double montoAgenciaAgencia() {
        return 0;
    }
    
    
    
    
    
    
}
