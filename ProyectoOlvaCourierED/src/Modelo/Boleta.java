
package Modelo;

import Estructuras.Pila;
import Estructuras.Lista;
import Estructuras.Nodo;
import Sistema.OlvaCourier;
import java.util.Calendar;

public class Boleta {
    private int codigoBoleta;
    private Calendar fechadeEntrega=null;
    private Calendar fechaEmision;
    private Agencia agenciaInicial;
    private Agencia agenciaFinal;
    private double importeTotal;
    private double IGV;
    private double total;
    private static int codigoBoletaGeneral = (int) Math.floor(Math.random()*10000+1);
    private String propietarioCodigo;
    private int estado;//1=Sin entregar 2=En camino 3= Llego
    private Lista<Pedido> listaPedidos;
    private String camino = "";

    
    public Boleta(Agencia agenciaInicial, Agencia agenciaFinal,String propietarioCodigo) {
        OlvaCourier.horaActual = Calendar.getInstance();
        this.codigoBoleta = codigoBoletaGeneral;
        codigoBoletaGeneral++;
        this.propietarioCodigo=propietarioCodigo;
        this.fechaEmision=OlvaCourier.horaActual;
        this.fechadeEntrega=fechaEmision;
        this.estado= 1;
        listaPedidos = new Lista<>();
    }
    

    public Boleta(int codigo ,String fechaEmision, String FechaEntrega , String AgenciaI , String AgenciaFinal , double importeTotal , double IGV , double total , int estado , String propietarioCodigo , String camino){
       this.codigoBoleta = codigo;

        Calendar cal = Calendar.getInstance();
        cal.set(Integer.valueOf(fechaEmision.substring(24, 28)), getIntMes(fechaEmision.substring(4, 7)), Integer.valueOf(fechaEmision.substring(8, 10)), Integer.valueOf(fechaEmision.substring(11, 13)), Integer.valueOf(fechaEmision.substring(14, 16)), Integer.valueOf(fechaEmision.substring(17, 19)));
        this.fechaEmision = cal;
        cal.set(Integer.valueOf(FechaEntrega.substring(24, 28)), getIntMes(FechaEntrega.substring(4, 7)), Integer.valueOf(FechaEntrega.substring(8, 10)), Integer.valueOf(FechaEntrega.substring(11, 13)), Integer.valueOf(FechaEntrega.substring(14, 16)), Integer.valueOf(FechaEntrega.substring(17, 19))); 
        this.fechadeEntrega = cal;
        this.agenciaInicial = new Agencia(AgenciaI);
        this.agenciaFinal = new Agencia(AgenciaFinal);
        this.importeTotal = importeTotal;
        this.IGV = IGV;
        this.total = total;
        this.estado = estado;
        this.propietarioCodigo = propietarioCodigo;
        this.camino = camino;
    }

    public String getPropietarioCodigo() {
        return propietarioCodigo;
    }

    public void setPropietarioCodigo(String propietarioCodigo) {
        this.propietarioCodigo = propietarioCodigo;
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
    
    
    
    public void setPrecioTotal(){//Los precios en realidad son randoms por el hecho de no tener una area especializada 
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
    
    public int getCodigoBoleta() {
        return codigoBoleta;
    }

    public void setCodigoBoleta(int codigoBoleta) {
        this.codigoBoleta = codigoBoleta;
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

    public static int getCodigoBoletaGeneral() {
        return codigoBoletaGeneral;
    }

    public static void setCodigoBoletaGeneral(int codigoBoletaGeneral) {
        Boleta.codigoBoletaGeneral = codigoBoletaGeneral;
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
        Nodo aux = listaPedidos.getInicioNodo();
        
        while(aux!=null){
            Pedido pe = (Pedido) aux.objeto;
            sumaTotalPedido+=pe.getValor();
            aux=aux.siguiente;
        }
        return sumaTotalPedido;
    }

    private double montoAgenciaAgencia() {
        return 0;
    }
    
    public void actualizarDatos(Boleta b){
        codigoBoleta=b.getCodigoBoleta();
        fechadeEntrega=b.getFechadeEntrega();
        fechaEmision=b.getFechaEmision();
        agenciaInicial=b.getAgenciaInicial();
        agenciaFinal=b.getAgenciaFinal();
        importeTotal=b.getImporteTotal();
        IGV=b.getIGV();
        total=b.getTotal();
        propietarioCodigo=b.getPropietarioCodigo();
        listaPedidos=b.getListaPedidos();
    }
    
    
      private int getIntMes(String mes){
        int nMes=0;
        
        switch (mes){
            case "Apr" : nMes = 3;break;
            case "May" : nMes = 4;break;
            case "Jun" : nMes = 5;break;
            
        }
        return nMes;
    }

    public void setPedidos(Lista Pedidos) {//Usamos la lista general de de Pedidos para filtrar y colocar en su respectiva Boleta
        
        if(!Pedidos.listaVacia()){
            Nodo aux = Pedidos.getInicioNodo();
            while(aux!=null){
                Pedido pe = (Pedido) aux.objeto;
                if(codigoBoleta==pe.getCodigoBoleta()){
                    listaPedidos.insertarNodoPorFinal(pe);
            }
            
            aux=aux.siguiente;
            }
        }
        
        
    }
    
    

    
    
    
}
