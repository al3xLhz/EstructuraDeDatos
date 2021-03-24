
package Modelo;

public class Boleta {
    private String nBoleta;
    private Cliente datosCliente;
    //private Date fechaEmision;
    //private Date fechaVencimiento;
    //private ListaProductoxCliente lista;
    private double importeTotal;
    private double IGV=importeTotal*0.18;
    private double total;
    private Agencia agenciaInicial;
    private Agencia agenciaFinal;
    
}
