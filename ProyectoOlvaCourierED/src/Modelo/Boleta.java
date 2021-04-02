
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
    
    
    
    
}
