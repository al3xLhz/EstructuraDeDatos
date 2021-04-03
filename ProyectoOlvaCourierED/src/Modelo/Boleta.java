
package Modelo;

import Estructura.ListaProducto;
import java.util.Calendar;

public class Boleta {
    private int codigo;
    private Calendar fechaEmision;
    private Calendar fechadeEntrega;
    private double importeTotal;
    private double IGV=importeTotal*0.18;
    private double total;
    private Agencia agenciaInicial;
    private Agencia agenciaFinal;
    private static int codigoM = 1000000000;
    private ListaProducto listaProductos = new ListaProducto();

    public Boleta(Calendar fechaEmision, Calendar fechadeEntrega, double importeTotal, double total, Agencia agenciaInicial, Agencia agenciaFinal) {
        this.codigo = codigoM;
        codigoM++;
        this.fechaEmision = fechaEmision;
        this.fechadeEntrega = fechadeEntrega;
        this.importeTotal = importeTotal;
        this.total = total;
        this.agenciaInicial = agenciaInicial;
        this.agenciaFinal = agenciaFinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
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

    public static int getCodigoM() {
        return codigoM;
    }

    public static void setCodigoM(int codigoM) {
        Boleta.codigoM = codigoM;
    }

    public ListaProducto getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ListaProducto listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    
    
    
}
